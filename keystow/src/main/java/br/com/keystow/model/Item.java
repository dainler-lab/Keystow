package br.com.keystow.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Entity
@Data
@Table(name = "itens")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id") //JACKSON – BIDIRECTIONAL RELATIONSHIPS INFINITE RECURSION EXCEPTION
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(nullable = false, length = 200)
    @Enumerated(EnumType.STRING)
    private TipoEnum tipo;

    private LocalDateTime dataDaOperacao;

    private Boolean favorito;
    private Boolean lixeira;

    @JoinColumn(name = "credencial_id")
    @OneToOne(cascade = CascadeType.ALL)
    private Credencial credencial;

    @JoinColumn(name = "cartao_id")
    @OneToOne(cascade = CascadeType.ALL)
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
