package br.com.clickfind.loja;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.com.clickfind.loja.controller.AcessoController;
import br.com.clickfind.loja.model.Acesso;
import br.com.clickfind.loja.repository.AcessoRepository;
import br.com.clickfind.loja.service.AcessoService;

@SpringBootTest(classes = EcommerceApplication.class )
public class EcommerceApplicationTests {
	
	@Autowired
	private AcessoService AcessoService;
	
	//@Autowired
	//private AcessoRepository AcessoRepository;
	
	@Autowired
	private AcessoController AcessoController;

	@Test
	public void testCadastraAcesso() {
		
		Acesso acesso = new Acesso();
		acesso.setDescricao("ROLE_ADMIN");
		
		//AcessoRepository.save(acesso);
		AcessoController.salvarAcesso(acesso);
	}

}
