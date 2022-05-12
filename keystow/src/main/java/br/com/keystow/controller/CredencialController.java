package br.com.keystow.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.keystow.model.Credencial;
import br.com.keystow.repository.CredencialRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/credenciais")
@AllArgsConstructor
public class CredencialController {

	private final CredencialRepository credencialRepository;

	@GetMapping // @RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Credencial> list() {
		return credencialRepository.findAll();
	}
}
