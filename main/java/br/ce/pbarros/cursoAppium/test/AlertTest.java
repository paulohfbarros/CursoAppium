package br.ce.pbarros.cursoAppium.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.pbarros.cursoAppium.core.BaseTest;
import br.ce.pbarros.cursoAppium.page.AlertPage;
import br.ce.pbarros.cursoAppium.page.menuPage;
import javafx.scene.control.Tab;

public class AlertTest extends BaseTest {
	
	private menuPage menu = new menuPage();
	private AlertPage page = new AlertPage();
	
	@Before
	public void setup() {
		menu.acessarAlertas();
	}
	
	@Test
	public void deveConfirmarAlert() {
		
		//clicar em alerta confirm
			page.clicarAlertaConfirm();
			
		//verificar os textos
			Assert.assertEquals("Info", page.obterTituloAlerta());
			Assert.assertEquals("Confirma a operação?", page.obterTextoMensagem());
		
		//confirmar alerta
			page.confirmar();
			
		//verificar nova mensagem
			Assert.assertEquals("Confirmado",page.obterTextoMensagemConfirmacao());
			
		//sair
			page.clicarSair();
			
				
	}
	
	@Test
	public void deveClicarForaAlert() {
				
		//deve clicar Alerta Simples
		page.clicarAlertaSimples();
		
		//deve clicar fora do alerta
		esperar(2000);
		page.clicarForaCaixa();
		
		//deve verificar mensagem não está presente 
		Assert.assertFalse(page.existeElementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
		
		//
	}
	
	

}
