package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage extends Basepage{
    @FindBy(className = "nav-line-1")
    private WebElement loginButton;

    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchBar;

    @FindBy(xpath = "//a[@href='{}']")
    private WebElement searchResult;

    public Homepage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void clickLoginButton() {
        click(loginButton);
    }

    public void search(String searchTerm){
        writeText(searchBar, searchTerm);
        searchBar.sendKeys(Keys.ENTER);
    }

}
