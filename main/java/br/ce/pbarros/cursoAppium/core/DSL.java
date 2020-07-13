package br.ce.pbarros.cursoAppium.core;

import static br.ce.pbarros.cursoAppium.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class DSL {
	
	public void escrever(By by, String texto) {
	      getDriver().findElement(by).sendKeys(texto);		
	}
	
	public String obterTexto(By by) {
		 return getDriver().findElement(by).getText();	     
	}
	
	public void clicar(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clicarPorTexto(String texto) {
		getDriver().findElement(By.xpath("//*[@text='"+texto+"']"));
	}
	
	public void selecionarCombo(By by, String valor) {
		
		 getDriver().findElement(by).click();
	     clicarPorTexto(valor);	    
	     
	}
	
	public boolean isCheckMarcado(By by) {
		return getDriver().findElement(by).getAttribute("checked").equals("true");
	}
	
		
}
