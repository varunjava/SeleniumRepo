package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToLaunchBrowser {

	@Test
	public void launch() {
	
		WebDriver driver = WebDriverManager.firefoxdriver().create();
//		WebDriverManager.chromedriver().setup();
//		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
	}
}
