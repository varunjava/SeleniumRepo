package TaskDemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertFrameWindow_Page {

	public AlertFrameWindow_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
	private WebElement alertsFrameWindows;
	
	@FindBy(xpath = "//span[text()='Browser Windows']")
	private WebElement browserWindows;
	
	@FindBy(id = "windowButton")
	private WebElement newWindow;

	public WebElement getAlertsFrameWindows() {
		return alertsFrameWindows;
	}

	public WebElement getBrowserWindows() {
		return browserWindows;
	}

	public WebElement getnewWindow() {
		return newWindow;
	}
	

}
