package br.ce.pbarros.cursoAppium.page;

import static br.ce.pbarros.cursoAppium.core.DriverFactory.getDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import br.ce.pbarros.cursoAppium.core.BasePage;

public class SplashPage extends BasePage {
	
	public boolean isTelaSpashVisivel() {
		return existeElementoPorTexto("Splash!");
	}
	
	public void aguardarSplashSumir() {
		getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(getDriver(), 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@text='Splash!']")));
	}

}
