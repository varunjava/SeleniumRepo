package TaskDemoQA;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_003 extends Base_Test {

	@Test
	public void run() {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		AlertFrameWindow2 alertFrame=new AlertFrameWindow2(driver);
		js.executeScript("window.scrollBy(0,100)");
		alertFrame.getAlertaFrameWindows().click();
		js.executeScript("window.scrollBy(0,100)");
		alertFrame.getAlerts().click();
		alertFrame.getPromtButton().click();
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		System.out.println(alertFrame.getPromptResult().getText());
	}
}
