package br.com.keystow.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "credenciais")
public class Credencial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 200)
	private String campoDeUsuario;

	@Column(length = 200)
	private String senha;

	private String uri;

	public Credencial(String campoDeUsuario, String senha, String uri) {
		this.campoDeUsuario = campoDeUsuario;
		this.senha = senha;
		this.uri = uri;
	}
}
