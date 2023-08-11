package demoWebShop;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.deser.Deserializers.Base;

import elementRepository.Base_Page;
import elementRepository.Books_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_DWS_003 {

	@Test
	public void addToCartFiction() throws InterruptedException {
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Base_Page basePage=new Base_Page(driver);
		basePage.getBooks().click();
		Books_Page books=new Books_Page(driver);
		books.getAddToCartFiction().click();
		
		Thread.sleep(3000);
	}
}
