package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
    @FindBy(className = "nav-line-1")
    private WebElement loginButton;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBar;

    @FindBy(xpath = "//a[@href='{}']")
    private WebElement searchResult;

    private WebDriverWait wait;


    public Homepage(WebDriver driver) {
        wait = new WebDriverWait(driver, 15, 50);
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() {
        wait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }

    public void search(String searchTerm){
        searchBar.sendKeys(searchTerm);
        searchBar.sendKeys(Keys.ENTER);
    }

}
