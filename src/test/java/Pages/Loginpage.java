package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class Loginpage {

    @FindBy(className = "nav-line-1")
    private WebElement loginButton;

    @FindBy(name = "email")
    private WebElement emailField;

    @FindBy(name = "password")
    private WebElement passwordField;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "signInSubmit")
    private WebElement signInButton;

    public Loginpage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void fillEmail(String email) {
        emailField.sendKeys(email);
        continueButton.click();
    }

    public void fillPassword(String password) {
        passwordField.sendKeys(password);
        signInButton.click();
    }

    public void verifyUserLogged(String username) {
        assertTrue(loginButton.getText().contains(username));
    }

    public void Login(String email, String password, String username) {
        fillEmail(email);
        fillPassword(password);
        verifyUserLogged(username);
    }
}
