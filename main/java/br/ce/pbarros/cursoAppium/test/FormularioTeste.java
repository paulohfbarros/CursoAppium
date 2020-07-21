package br.ce.pbarros.cursoAppium.test;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.ce.pbarros.cursoAppium.core.BaseTest;
import br.ce.pbarros.cursoAppium.core.DriverFactory;
import br.ce.pbarros.cursoAppium.page.FormularioPage;
import br.ce.pbarros.cursoAppium.page.menuPage;
import io.appium.java_client.MobileBy;

public class FormularioTeste extends BaseTest {

	private menuPage menu = new menuPage();

	private FormularioPage page = new FormularioPage();

	// TESTES PARA GIT

	@Before
	public void inicializarAppium() throws MalformedURLException {
		menu.acessarFormulario();

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

		Assert.assertEquals("Nome: Paulo", page.obterNomeCadastrado());
		Assert.assertEquals("Console: switch", page.obterConsoleCadastrado());
		Assert.assertTrue(page.obterCheckCadastrado().endsWith("Off"));
		Assert.assertTrue(page.obterSwitchcadastrado().endsWith("Marcado"));

	}
	
	@Test
	public void deveRealizarCadastroDemorado() throws MalformedURLException {
		
		page.escreverNome("Paulo");
		
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		page.clicarSalvarDemorado();
//		esperar(3000);
		
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='Nome: Paulo']")));

		Assert.assertEquals("Nome: Paulo", page.obterNomeCadastrado());
		
	}
	
	@Test
	public void deveAlterarData() {
		page.clicarPorTexto("01/01/2000");
		page.clicarPorTexto("20");
		page.clicarPorTexto("OK");
		Assert.assertTrue(page.existeElementoPorTexto("20/2/2000"));
	}
	
	@Test
	public void deveAlterarHorario() {
		page.clicarPorTexto("06:00");
		page.clicar(MobileBy.AccessibilityId("10"));
		page.clicar(MobileBy.AccessibilityId("40"));
		page.clicarPorTexto("OK");
		Assert.assertTrue(page.existeElementoPorTexto("10:40"));
	}

}
