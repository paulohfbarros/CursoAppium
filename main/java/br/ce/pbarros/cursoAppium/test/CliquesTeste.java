package br.ce.pbarros.cursoAppium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.pbarros.cursoAppium.core.BaseTest;
import br.ce.pbarros.cursoAppium.page.CliquesPage;
import br.ce.pbarros.cursoAppium.page.menuPage;

public class CliquesTeste extends BaseTest {
	
	menuPage menu = new menuPage();
	CliquesPage page = new CliquesPage();
	
	@Before
	public void setup() {
		menu.acessarCliques();
	}
	
	@Test
	public void deveRealizarCliqueLongo() {
				
		//clique longo
		esperar(2000);
		page.cliqueLongo();
		
		
		//verificar texto
		Assert.assertEquals("Clique Longo", page.obterTextoCampo());
	}
	
	@Test
	public void deveRealizarCliqueDuplo() {
		
		//clique duplo
		page.clicarPorTexto("Clique Duplo");
		page.clicarPorTexto("Clique Duplo");
		
		//verificar texto
		Assert.assertEquals("Duplo Clique", page.obterTextoCampo());
	}

}
