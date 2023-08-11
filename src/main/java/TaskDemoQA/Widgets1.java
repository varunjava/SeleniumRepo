package TaskDemoQA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Widgets1 {

	public Widgets1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h5[text()='Widgets']")
	private WebElement widgets;
	
	@FindBy(xpath = "//span[text()='Date Picker']")
	private WebElement selectMenu;
	
	@FindBy(id = "datePickerMonthYearInput")
	private WebElement datePickerMonthYearInput;
	
	@FindBy(xpath = "//button[text()='Previous Month']")
	private WebElement previousMonth;
	
	@FindBy(xpath = "//button[text()='Next Month']")
	private WebElement nextMonth;

	public WebElement getWidgets() {
		return widgets;
	}

	public WebElement getSelectMenu() {
		return selectMenu;
	}

	public WebElement getDatePickerMonthYearInput() {
		return datePickerMonthYearInput;
	}

	public WebElement getPreviousMonth() {
		return previousMonth;
	}

	public WebElement getNextMonth() {
		return nextMonth;
	}
	
	
}
