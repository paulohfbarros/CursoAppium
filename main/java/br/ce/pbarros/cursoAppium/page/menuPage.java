package br.ce.pbarros.cursoAppium.page;

import br.ce.pbarros.cursoAppium.core.DSL;

public class menuPage {
	
	
	private DSL dsl = new DSL();
	
	public void acessarFormulario() {
		dsl.clicarPorTexto("Formulário");
	}
	
	

}
