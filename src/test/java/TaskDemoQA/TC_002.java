package TaskDemoQA;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class TC_002 extends Base_Test {

	@Test
	public void run(){
		
		AlertFrameWindow_Page alertFrame=new AlertFrameWindow_Page(driver);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,100)");
		alertFrame.getAlertsFrameWindows().click();
		js.executeScript("window.scrollBy(0,100)");
		alertFrame.getBrowserWindows().click();
		String wid = driver.getWindowHandle();
		alertFrame.getnewWindow().click();
		Set<String> allWid = driver.getWindowHandles();
		allWid.remove(wid);
		for(String id:allWid)
		{
			driver.switchTo().window(id);
			driver.close();
		}
		
	}
}
