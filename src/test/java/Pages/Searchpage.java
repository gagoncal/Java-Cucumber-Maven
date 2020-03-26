package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertTrue;

public class Searchpage {

    @FindBy(css = "img[alt *= 'AUELEK']")
    private WebElement searchResult;

    @FindBy(id = "add-to-cart-button")
    private WebElement addCartButton;

    @FindBy(id = "nav-cart-count")
    private WebElement cartCountNumber;

    private WebDriverWait wait;


    public Searchpage(WebDriver driver) {

        wait = new WebDriverWait(driver, 15, 50);
        PageFactory.initElements(driver, this);
    }

    public void verifySearchResults(){
        assert searchResult.isDisplayed() : "Expected search result was not found on the search page";
    }

    public void clickItem(){
        searchResult.click();
        //Verify Item page is displayed
        wait.until(ExpectedConditions.visibilityOf(addCartButton));
        assert addCartButton.isDisplayed();
    }
}
