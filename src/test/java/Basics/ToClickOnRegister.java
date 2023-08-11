package Basics;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import elementRepository.Base_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ToClickOnRegister {

	@Test
	public void demo() {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		
		Base_Page base_page=new Base_Page(driver);
		base_page.getRegisterLink().click();
		
		
		
	}
}
