package br.ce.pbarros.cursoAppium.test;

import java.net.MalformedURLException;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.ce.pbarros.cursoAppium.core.DriverFactory;
import br.ce.pbarros.cursoAppium.page.FormularioPage;
import br.ce.pbarros.cursoAppium.page.menuPage;

public class FormularioTeste {

	private menuPage menu = new menuPage();

	private FormularioPage page = new FormularioPage();
	
	//TESTES PARA GIT

	@Before
	public void inicializarAppium() throws MalformedURLException {
		menu.acessarFormulario();

	}

	@After
	public void tearDown() {
		DriverFactory.killDriver();
	}

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {

		page.escreverNome("Paulo");
		Assert.assertEquals("Paulo", page.obterNome());

	}

	@Test
	public void deveInteragirCombo() throws MalformedURLException {

		page.selecionarCombo("Nintendo Switch");

		Assert.assertEquals("Nintendo Switch", page.obtervalorCombo());

	}

	@Test
	public void deveInteragirSwitchCheckBox() throws MalformedURLException {

		Assert.assertFalse(page.isCheckMarcado());
		Assert.assertTrue(page.isSwitchMarcado());

		page.clicarCheck();
		page.ClicarSwitch();

		Assert.assertTrue(page.isCheckMarcado());
		Assert.assertFalse(page.isSwitchMarcado());

	}

	@Test
	public void deveRealizarCadastro() throws MalformedURLException {

		page.escreverNome("Paulo");
		page.clicarCheck();
		page.ClicarSwitch();
		page.selecionarCombo("Nintendo Switch");

		page.clicarSalvar();

		Assert.assertEquals("Nome: Paulo", page.obterNome());

		Assert.assertEquals("Console: ps4", page.obterConsoleCadastrado());

		Assert.assertTrue(page.obterCheckCadastrado().endsWith("Off"));

		Assert.assertTrue(page.obterSwitchcadastrado().endsWith("Marcado"));

	}

}
