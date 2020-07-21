package br.ce.pbarros.cursoAppium.page;

import br.ce.pbarros.cursoAppium.core.BasePage;

public class AbasPage extends BasePage {
	
	public boolean isAba1() {
		return existeElementoPorTexto("Este � o conte�do da Aba 1");
	}
	
	public boolean isAba2() {
		return existeElementoPorTexto("Este � o conte�do da Aba 2");
	}
	
	public void acessarAba2() {
		clicarPorTexto("ABA 2");
	}

}
