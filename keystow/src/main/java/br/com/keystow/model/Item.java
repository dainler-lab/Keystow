package br.com.keystow.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@Data
@Entity
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
    private LocalDateTime dataDaOperação;

    private Boolean favorito;
    private Boolean lixeira;

    @OneToOne
    @JoinColumn(name = "credencial_id")
    private Credencial credencial;

    @OneToOne
    @JoinColumn(name = "cartao_id")
    private Cartao cartao;

    public Item(String nome, TipoEnum tipo, Credencial credencial) {
        this.nome = nome;
        this.tipo = tipo;
        this.credencial = credencial;
        this.dataDaOperação = LocalDateTime.now();
        this.favorito = false;
        this.lixeira = false;
    }
}
