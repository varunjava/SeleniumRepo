package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Base_Page {

	public Base_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText = "Register")
	private WebElement registerLink;
	
	@FindBy(linkText = "Log in")
	private WebElement loginLink;
	
	@FindBy(xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCart;
	
	@FindBy(xpath = "//span[text()='Wishlist']")
	private WebElement wishList;
	
	@FindBy(id = "small-searchterms")
	private WebElement searchStore;
	
	@FindBy(xpath = "//input[contains(@class,'search-box-button')]")
	private WebElement searchButton;
	
	@FindBy(partialLinkText = "BOOKS")
	private WebElement books;
	
	@FindBy(partialLinkText = "COMPUTERS")
	private WebElement computers;
	
	@FindBy(partialLinkText =  "ELECTRONICS")
	private WebElement electronics;

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelAndShoes;
	
	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitalDownloads;
	
	@FindBy(partialLinkText = "Jewelry")
	private WebElement jewelry;
	
	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftCards;
	
	
	public WebElement getRegisterLink() {
		return registerLink;
	}

	public WebElement getLoginLink() {
		return loginLink;
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getWishList() {
		return wishList;
	}

	public WebElement getSearchStore() {
		return searchStore;
	}

	public WebElement getSearchButton() {
		return searchButton;
	}

	public WebElement getBooks() {
		return books;
	}

	public WebElement getComputers() {
		return computers;
	}

	public WebElement getElectronics() {
		return electronics;
	}

	public WebElement getApparelAndShoes() {
		return apparelAndShoes;
	}

	public WebElement getDigitalDownloads() {
		return digitalDownloads;
	}

	public WebElement getJewelry() {
		return jewelry;
	}

	public WebElement getGiftCards() {
		return giftCards;
	}
	
	
	
}
