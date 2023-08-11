package demoWebShop;

import static org.testng.Assert.assertEquals;

import java.security.PublicKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import elementRepository.Base_Page;
import elementRepository.Register_Page;
import io.github.bonigarcia.wdm.WebDriverManager;

 

public class TC_DWS_001 {

	String url="https://demowebshop.tricentis.com/";
	String title="Demo Web Shop. Register";
	String firstName="varun";
	String lastName="M";
	String mailId="varunmmmm@gmail.com";
	String pwd="1234567";
	
	
	@Test
	public void register() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		Assert.assertEquals(driver.getCurrentUrl(), url , "Please Check The Url ");
		Reporter.log("Browser is Launched",true);
		
		Base_Page basePage=new Base_Page(driver);
		basePage.getRegisterLink().click();
		Assert.assertEquals(driver.getTitle(),title ,"Register page is not displaying");
		Reporter.log("Register page is Displayed",true);
		
		Register_Page register=new Register_Page(driver);
		register.getGenderMale().click();
		Assert.assertEquals(register.getGenderMale().isSelected(), true,"Gender is not selected");
		Reporter.log("Gender is selected as Male",true);
		
		register.getFirstName().sendKeys(firstName);
		Assert.assertEquals(register.getFirstName().getAttribute("value"), firstName,"FirstName Mismatch");
		Reporter.log("FirstName Enetered Successfully",true);
		
		register.getLastName().sendKeys(lastName);
		Assert.assertEquals(register.getLastName().getAttribute("value"), lastName,"LastName Mismatch");
		Reporter.log("LastName Enetered Sucessfully",true);
		
		register.getEmail().sendKeys(mailId);
		assertEquals(register.getEmail().getAttribute("value"),mailId, "Emails havent entered properly");
		Reporter.log("Email enetered sucessfully",true);
		
		register.getPassword().sendKeys(pwd);
		Assert.assertEquals(register.getPassword().getAttribute("value"), pwd ,"Password Mismatch");
		Reporter.log("Password Enetered Successfully",true);
		
		register.getConfirmPassword().sendKeys(pwd);
		Assert.assertEquals(register.getPassword().getAttribute("value"), pwd ,"Again Password Mismatch");
		Reporter.log("Confirm Password entered Successfully",true);
		
		register.getRegisterButton().click();
		Assert.assertEquals(register.getRegisterCompleted().isDisplayed(), true,"Register Incomplete ");
		Reporter.log("Successfully Registered",true);
		
		System.out.println("User successfully registered");
		
		Thread.sleep(4000);
		 driver.quit();
	}

}
