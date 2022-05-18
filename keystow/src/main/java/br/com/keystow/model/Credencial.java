package br.com.keystow.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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
