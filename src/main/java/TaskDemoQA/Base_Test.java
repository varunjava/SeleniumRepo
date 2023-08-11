package TaskDemoQA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Test {
	
	WebDriver driver;

	@BeforeClass
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}
	
	@BeforeMethod
	public void launchUrl() {
		driver.get("https://demoqa.com/");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
}
