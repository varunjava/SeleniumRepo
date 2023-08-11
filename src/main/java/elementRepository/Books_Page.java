package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Books_Page {

	public Books_Page(WebDriver driver ) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "products-orderby")
	private WebElement productsOrderby;
	
	@FindBy(id = "products-pagesize")
	private WebElement display;
	
	@FindBy(id = "products-viewmode")
	private WebElement productsViewmode;
	
	@FindBy(linkText = "Computing and Internet")
	private WebElement computingAndInternet;
	
	@FindBy(xpath = "//a[text()='Computing and Internet']/../..//input[@value='Add to cart']")
	private WebElement addToCartComputingAndInternet;
	
	@FindBy(linkText = "copyofComputingAndInternetEX")
	private WebElement copyOfComputingAndInternetEX;
	
	@FindBy(linkText = "Fiction")
	private WebElement fiction;
	
	@FindBy(xpath = "//a[text()='Fiction']/../..//input[@value='Add to cart']")
	private WebElement addToCartFiction;
	
	@FindBy(linkText = "Fiction EX")
	private WebElement fictionEX;
	
	@FindBy(linkText = "Health Book")
	private WebElement healthBook;
	
	@FindBy(xpath = "//a[text()='Health Book']/../..//input[@value='Add to cart']")
	private WebElement addToCartHealthBook;
	
	@FindBy(linkText = "Science")
	private WebElement science;

	public WebElement getProductsOrderby() {
		return productsOrderby;
	}

	public WebElement getProductsPagesize() {
		return display;
	}

	public WebElement getProductsViewmode() {
		return productsViewmode;
	}

	public WebElement getComputingAndInternet() {
		return computingAndInternet;
	}

	public WebElement getAddToCartComputingAndInternet() {
		return addToCartComputingAndInternet;
	}

	public WebElement getCopyOfComputingAndInternetEX() {
		return copyOfComputingAndInternetEX;
	}

	public WebElement getFiction() {
		return fiction;
	}

	public WebElement getAddToCartFiction() {
		return addToCartFiction;
	}

	public WebElement getFictionEX() {
		return fictionEX;
	}

	public WebElement getHealthBook() {
		return healthBook;
	}

	public WebElement getAddToCartHealthBook() {
		return addToCartHealthBook;
	}

	public WebElement getScience() {
		return science;
	}
	
}
