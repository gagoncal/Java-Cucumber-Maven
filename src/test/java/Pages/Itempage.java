package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Itempage extends Basepage {

    @FindBy(id = "add-to-cart-button")
    private WebElement addCartButton;

    @FindBy(id = "nav-cart-count")
    private WebElement cartCountNumber;

    public Itempage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickCart() {
        click(cartCountNumber);
    }

    public void clickAddToCart() {
        String cartItemsBefore = readText(cartCountNumber);
        click(addCartButton);
        String cartItemsAfter = readText(cartCountNumber);

        assert Integer.parseInt(cartItemsAfter) == Integer.parseInt(cartItemsBefore) + 1 :
                "After clicking add cart button item count was not incremented. ";
    }
}
