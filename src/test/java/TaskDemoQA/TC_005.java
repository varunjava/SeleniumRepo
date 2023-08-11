package TaskDemoQA;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_005 extends Base_Test {

	@Test
	public void run() {
		 Widgets2 widgets=new Widgets2(driver);
		 JavascriptExecutor js=(JavascriptExecutor) driver;
		 js.executeScript("window.scrollBy(0,100)");
		 widgets.getWidgets().click();
		 js.executeScript("arguments[0].scrollIntoView(true)",widgets.getSelectMenu());
		 widgets.getSelectMenu().click();
		 js.executeScript("window.scrollBy(0,100)");
		WebElement cars = widgets.getCars();
		 Select select=new Select(cars);
		 select.selectByVisibleText("Volvo");
		 select.selectByVisibleText("Audi");
		 List<WebElement> txt = select.getAllSelectedOptions();
		 for(WebElement selected : txt) {
			 System.out.println(selected.getText());
		 }
	
		 
	}
}
