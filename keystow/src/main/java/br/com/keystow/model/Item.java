package br.com.keystow.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name = "itens")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    // @Column(nullable = false, length = 200)
    @Enumerated(EnumType.STRING)
    private TipoEnum tipo;

    // @Column(nullable = false)
    private LocalDateTime dataDaOperacao;

    private Boolean favorito;
    private Boolean lixeira;

    @OneToOne
    @JoinColumn(name = "credencial_id")
    private Credencial credencial;

    @OneToOne
    @JoinColumn(name = "cartao_id")
    private Cartao cartao;

    public Item(TipoEnum tipo, String nome, Boolean favorito, Boolean lixeira,
            Credencial credencial) {
        this.tipo = tipo;
        this.nome = nome;
        this.dataDaOperacao = LocalDateTime.now();
        this.favorito = favorito;
        this.lixeira = lixeira;
        this.credencial = credencial;
    }
}
