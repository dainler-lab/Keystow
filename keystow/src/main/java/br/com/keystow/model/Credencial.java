package br.com.keystow.model;

import javax.persistence.Column;
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
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "credenciais")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Credencial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 200)
	private String campoDeUsuario;

	@Column(length = 200)
	private String senha;

	private String uri;

	@JoinColumn(name = "item_id")
	@OneToOne // (mappedBy = "credencial_id")
	private Item item;

	public Credencial(String campoDeUsuario, String senha, String uri) {
		this.campoDeUsuario = campoDeUsuario;
		this.senha = senha;
		this.uri = uri;
	}
}
