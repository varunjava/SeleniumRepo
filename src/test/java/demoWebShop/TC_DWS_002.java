package demoWebShop;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import elementRepository.Base_Page;
import elementRepository.Books_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_DWS_002 {

	@Test
	public void toSortBooks() {
		
		String url="https://demowebshop.tricentis.com/";
		String bookTitle = "Demo Web Shop. Books";
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get(url);
		Assert.assertEquals(driver.getCurrentUrl(), url,"Url misMatch");
		Reporter.log("WebPage opened Successfully",true);
		Base_Page basePage=new Base_Page(driver);
		basePage.getBooks().click();
		assertEquals(driver.getTitle(), bookTitle,"Not Able to Click");
		Reporter.log("Clicked On Book Option",true);
		Books_Page books=new Books_Page(driver);
		WebElement sortby = books.getProductsOrderby();
		Select select=new Select(sortby);
		Assert.assertEquals(books.getProductsOrderby().isSelected(), true,"sortBy is not selected");
		Reporter.log("Sorting is done ",true);
		select.selectByVisibleText("Price: High to Low");

		 		
	}
}
