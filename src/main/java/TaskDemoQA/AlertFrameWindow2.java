package TaskDemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertFrameWindow2 {

	public AlertFrameWindow2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
	private WebElement alertaFrameWindows;
	
	@FindBy(xpath = "//span[text()='Alerts']")
	private WebElement alerts;
	
	@FindBy(id = "promtButton")
	private WebElement promtButton;
	
	@FindBy(id = "promptResult")
	private WebElement promptResult;
	
	
	public WebElement getPromptResult() {
		return promptResult;
	}

	public WebElement getAlertaFrameWindows() {
		return alertaFrameWindows;
	}

	public WebElement getAlerts() {
		return alerts;
	}

	public WebElement getPromtButton() {
		return promtButton;
	}
	
}
