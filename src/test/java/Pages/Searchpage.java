package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchpage extends Basepage{

    @FindBy(css = "img[alt *= 'AUELEK']")
    private WebElement searchResult;

    @FindBy(id = "add-to-cart-button")
    private WebElement addCartButton;

    @FindBy(id = "nav-cart-count")
    private WebElement cartCountNumber;

    public Searchpage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void verifySearchResults(){
        assert searchResult.isDisplayed() : "Expected search result was not found on the search page";
    }

    public void clickItem(){
        click(searchResult);
        //Verify Item page is displayed
        assert addCartButton.isDisplayed();
    }
}
