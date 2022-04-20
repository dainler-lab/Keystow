package br.com.keystow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {

	@GetMapping
	public String index() {
		return "index";
	}

	@GetMapping("/login")
	public String login() {
		return "login";
	}

	@GetMapping("/dica")
	public String dicaDeSenha() {
		return "/dica";
	}

	@GetMapping("/cadastro")
	public String cadastro() {
		return "/cadastro";
	}

	@GetMapping("/home")
	public String home() {
		return "/home";
	}

	@GetMapping("/cofre")
	public String cofre() {
		return "/cofre";
	}
}
