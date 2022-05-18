package br.com.keystow.model;

import javax.persistence.*;


@Entity
@Table(name = "cartoes")
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String titularDoCartao;
	private String numero;
	private String bandeira;
	private String mesDoVencimento;
	private String anoDoVencimento;
	private String codigoDeSeguranca;

}
