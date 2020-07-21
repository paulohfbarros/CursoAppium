package br.ce.pbarros.cursoAppium.page;

import org.openqa.selenium.By;

import br.ce.pbarros.cursoAppium.core.BasePage;

public class AlertPage extends BasePage {
	
	public void clicarAlertaConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}
	
	public void clicarAlertaSimples() {
		clicarPorTexto("ALERTA SIMPLES");
	}
	
	public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}
	
	public String obterTextoMensagem() {
		 return obterTexto(By.id("android:id/message"));
	}
	
	public void confirmar() {
		clicarPorTexto("CONFIRMAR");
	}
	
	public String obterTextoMensagemConfirmacao() {
		return obterTexto(By.id("android:id/message"));
	}
	
	public void clicarSair() {
		clicar(By.id("android:id/button1"));
	}
	
	public void  clicarForaCaixa() {
		tap(100, 150);
	}

}
