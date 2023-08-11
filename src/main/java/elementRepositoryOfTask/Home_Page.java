package elementRepositoryOfTask;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.bytebuddy.asm.Advice.This;

public class Home_Page {

	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "multiselect1")
	private WebElement multiselect1;
	
	@FindBy(xpath = "//option[contains(text(),'Volvo')]")
	private WebElement volvo;
	
	@FindBy(xpath = "//option[contains(text(),'Swift')]")
	private WebDriver swift;
	
	
}
