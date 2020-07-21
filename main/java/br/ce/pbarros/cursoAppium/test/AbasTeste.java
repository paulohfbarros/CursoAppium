package br.ce.pbarros.cursoAppium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.pbarros.cursoAppium.core.BaseTest;
import br.ce.pbarros.cursoAppium.page.AbasPage;
import br.ce.pbarros.cursoAppium.page.menuPage;

public class AbasTeste extends BaseTest {
	
	private menuPage menu = new menuPage();
	private AbasPage page = new AbasPage();
	
	@Test
	public void deveinteragirComabas() {
		
		//acessar menu abas
		menu.acessarAbas();
		
		//verificar que esta na aba 1
		Assert.assertTrue(page.isAba1());
		
		//acessar aba 2
		page.acessarAba2();		
		
		//verificar que esta na aba 2
		Assert.assertTrue(page.isAba2());
	}

}
