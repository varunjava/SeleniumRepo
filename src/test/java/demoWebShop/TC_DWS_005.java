package demoWebShop;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import elementRepository.Base_Page;
import elementRepository.DigitalDownloads_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_DWS_005 {

	@Test
	public void launch() throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://demowebshop.tricentis.com/");
		
		Base_Page basePage=new Base_Page(driver);
		basePage.getDigitalDownloads().click();
		DigitalDownloads_Page digitalDownloadsPage=new DigitalDownloads_Page(driver);
		digitalDownloadsPage.getMusic2().click();
		
		Thread.sleep(3000);
	}
}
