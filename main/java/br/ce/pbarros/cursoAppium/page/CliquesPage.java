package br.ce.pbarros.cursoAppium.page;

import org.openqa.selenium.By;

import br.ce.pbarros.cursoAppium.core.BasePage;
import br.ce.pbarros.cursoAppium.core.DriverFactory;
import io.appium.java_client.TouchAction;

public class CliquesPage extends BasePage {
	
	public void cliqueLongo() {
		new TouchAction(DriverFactory.getDriver())
		.longPress(DriverFactory.getDriver().findElement(By.xpath("//*[@text='Clique Longo']"))).perform();
	}
	
	public String obterTextoCampo() {
		return DriverFactory.getDriver().findElement(By.xpath("(//android.widget.TextView)[3]")).getText();
	}

}
