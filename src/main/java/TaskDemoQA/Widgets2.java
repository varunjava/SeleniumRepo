package TaskDemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widgets2 {

	public Widgets2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h5[text()='Widgets']")
	private WebElement widgets;
	
	@FindBy(xpath = "//span[text()='Select Menu']")
	private WebElement selectMenu;
	
	@FindBy(id = "cars")
	private WebElement cars;

	public WebElement getWidgets() {
		return widgets;
	}

	public WebElement getSelectMenu() {
		return selectMenu;
	}

	public WebElement getCars() {
		return cars;
	}
}
