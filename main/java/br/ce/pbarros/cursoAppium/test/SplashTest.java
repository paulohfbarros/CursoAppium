package br.ce.pbarros.cursoAppium.test;

import org.junit.Assert;
import org.junit.Test;

import br.ce.pbarros.cursoAppium.core.BaseTest;
import br.ce.pbarros.cursoAppium.page.SplashPage;
import br.ce.pbarros.cursoAppium.page.menuPage;

public class SplashTest extends BaseTest {
	
	private menuPage menu = new menuPage();
	private SplashPage page = new SplashPage();
	
	@Test 
	public void deveAguardaSplashSumir() {
		//acessa meu splash
		menu.acessarSplash();
		
		//verificar se o splash est� sendo exibido
		page.isTelaSpashVisivel();
		
		//aguardar sa�da do splash
		page.aguardarSplashSumir();	
		
		
		//verificar se o formul�rio est� aparecendo 
		Assert.assertTrue(page.existeElementoPorTexto("Formul�rio"));
	}

}
