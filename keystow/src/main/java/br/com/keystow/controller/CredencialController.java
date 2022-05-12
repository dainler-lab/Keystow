package br.com.keystow.controller;

import br.com.keystow.model.Credencial;
import br.com.keystow.repository.CredencialRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import java.util.List;

@RestController
@RequestMapping("/api/credenciais")
@AllArgsConstructor
public class CredencialController {

	private final CredencialRepository credencialRepository;

	// @RequestMapping(method = RequestMethod.GET)
	@GetMapping
	public @ResponseBody List<Credencial> list() {
		return credencialRepository.findAll();
	}

}
