package TaskDemoQA;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TC_001 extends Base_Test {

	@Test
	public void run() {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		Elements_Page elements = new Elements_Page(driver);
		js.executeScript("window.scrollBy(0,100)");
		elements.getElements().click();
		js.executeScript("arguments[0].scrollIntoView(true)", elements.getDynamicProperties());
		elements.getDynamicProperties().click();
		js.executeScript("arguments[0].scrollIntoView(true)", elements.getVisibleAfter());
		elements.getVisibleAfter().click();
	}
}
