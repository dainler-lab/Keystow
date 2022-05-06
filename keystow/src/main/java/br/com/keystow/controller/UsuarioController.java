package br.com.keystow.controller;

import br.com.keystow.model.Usuario;
import br.com.keystow.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@AllArgsConstructor
public class UsuarioController {

	private final UsuarioRepository usuarioRepository;

	//@RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public @ResponseBody List<Usuario> list() {
		return usuarioRepository.findAll();
	}


}
