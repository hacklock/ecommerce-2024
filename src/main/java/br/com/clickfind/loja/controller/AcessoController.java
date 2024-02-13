package br.com.clickfind.loja.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.com.clickfind.loja.model.Acesso;
import br.com.clickfind.loja.service.AcessoService;

@Controller
public class AcessoController {
	
	@Autowired
	private AcessoService acessoService;
	
	@PostMapping("/salvarAcesso")
	public Acesso salvarAcesso(Acesso acesso) {
		return acessoService.save(acesso);
	}

}
