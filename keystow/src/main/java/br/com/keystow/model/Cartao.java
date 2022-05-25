package br.com.keystow.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity
@Data
@Table(name = "cartoes")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
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

	@JoinColumn(name = "item_id")
	@OneToOne // (mappedBy = "cartao")
	private Item item;
}
