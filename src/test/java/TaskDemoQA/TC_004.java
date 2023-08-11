package TaskDemoQA;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_004 extends Base_Test{

	@Test
	public void run() {
		
	JavascriptExecutor js=(JavascriptExecutor) driver;
	LocalDateTime datePlus=LocalDateTime.now().plusMonths(10).plusDays(0);
	String month = datePlus.getMonth().toString();
	int year = datePlus.getYear();
	int day = datePlus.getDayOfMonth();
	month=month.charAt(0)+month.substring(1).toLowerCase();
	
//	LocalDateTime dateMinus=LocalDateTime.now().minusMonths(0).minusDays(0);
//	String monthMinus = dateMinus.getMonth().toString();
//	int yearMinus = dateMinus.getYear();
//	int dayMinus = dateMinus.getDayOfMonth();
//	monthMinus=month.charAt(0)+month.substring(1).toLowerCase();
	Widgets1 widget=new Widgets1(driver);
	js.executeScript("window.scrollBy(0,100)");
	widget.getWidgets().click();
	js.executeScript("window.scrollBy(0,100)");
	widget.getSelectMenu().click();
	widget.getDatePickerMonthYearInput().click();
	
	for(;;) {
		try {
			driver.findElement(By.xpath("//div[text()='"+month+" "+year+"']/../..//div[text()='"+day+"']")).click();
			break;
		}
		catch (Exception e) {
			widget.getNextMonth().click();
		}
	} 
	
	}
}
