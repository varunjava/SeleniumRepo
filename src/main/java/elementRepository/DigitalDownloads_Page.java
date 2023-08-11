package elementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.dockerjava.api.model.Driver;

public class DigitalDownloads_Page {
	
	public DigitalDownloads_Page(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	@FindBy(id = "products-orderby")
	private WebElement productsOrderby;
	
	@FindBy(id = "products-pagesize")
	private WebElement productsPagesize;

	@FindBy(id = "products-viewmode")
	private WebElement productsViewmode;
	
	@FindBy(linkText = "3rd Album")
	private WebElement thirdAlbum;
	
	@FindBy(xpath = "//a[text()='3rd Album']/../..//input[@value='Add to cart']")
	private WebElement thirdAlbumAddtocart;
	
	@FindBy(xpath = "//a[text()='Music 2' and @href='/music-album-1']")
	private WebElement music2;
	
	@FindBy(xpath = "//a[text()='Music 2' and @href='/music-album-1']/../..//input[@value='Add to cart']")
	private WebElement music2Addtocart;
	
	@FindBy(xpath = "//a[text()='Music 2' and @href='/music-2']")
	private WebElement secondMusic2;
	
	@FindBy(xpath = "//a[text()='Music 2' and @href='/music-2']/../..//input[@value='Add to cart']")
	WebElement secondMusic2Addtocart;

	public WebElement getProductsOrderby() {
		return productsOrderby;
	}

	public WebElement getProductsPagesize() {
		return productsPagesize;
	}

	public WebElement getProductsViewmode() {
		return productsViewmode;
	}

	public WebElement getThirdAlbum() {
		return thirdAlbum;
	}

	public WebElement getThirdAlbumAddtocart() {
		return thirdAlbumAddtocart;
	}

	public WebElement getMusic2() {
		return music2;
	}

	public WebElement getMusic2Addtocart() {
		return music2Addtocart;
	}

	public WebElement getSecondMusic2() {
		return secondMusic2;
	}

	public WebElement getSecondMusic2Addtocart() {
		return secondMusic2Addtocart;
	}
	
	
}
