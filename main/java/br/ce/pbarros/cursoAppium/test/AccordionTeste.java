package br.ce.pbarros.cursoAppium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.pbarros.cursoAppium.core.BaseTest;
import br.ce.pbarros.cursoAppium.page.AccordionPage;
import br.ce.pbarros.cursoAppium.page.menuPage;

public class AccordionTeste extends BaseTest {
	
	private menuPage menu = new menuPage();
	private AccordionPage page = new AccordionPage();
	
	@Test
	public void deveInteragirComAccordion() {
		
		//deve acessar menu
		menu.acessarAccordion();
		
		//clicar op��o 1
		page.selecionarOp1();		
		
		//verificar texto op��o 1
		esperar(2000);
		Assert.assertEquals("Esta � a descri��o da op��o 1", page.obterValorOp1());
		
	}

}
