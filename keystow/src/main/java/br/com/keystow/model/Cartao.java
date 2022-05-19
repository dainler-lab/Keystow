package br.com.keystow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "cartoes")
public class Cartao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titularDoCartao;
	private String numero;
	private String bandeira;
	private String mesDoVencimento;
	private String anoDoVencimento;
	private String codigoDeSeguranca;
}
