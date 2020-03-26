package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Itempage {

    @FindBy(id = "add-to-cart-button")
    private WebElement addCartButton;

    @FindBy(id = "nav-cart-count")
    private WebElement cartCountNumber;

//    private WebDriverWait wait;


    public Itempage(WebDriver driver) {

//        wait = new WebDriverWait(driver, 15, 50);
        PageFactory.initElements(driver, this);
    }

    public void clickCart() {
        cartCountNumber.click();
    }

    public void clickAddToCart() {
        String cartItemsBefore = cartCountNumber.getText();
//        wait.until(ExpectedConditions.elementToBeClickable(addCartButton));
        addCartButton.click();
        String cartItemsAfter = cartCountNumber.getText();

        assert Integer.parseInt(cartItemsAfter) == Integer.parseInt(cartItemsBefore) + 1 :
                "After clicking add cart button item count was not incremented. ";
    }
}
