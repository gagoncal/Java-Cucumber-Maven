package Pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basepage {
    public WebDriver driver;
    public WebDriverWait wait;

    //Constructor
    public Basepage (WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver, 15, 50);
    }

    //Wait Wrapper Method
    public void waitVisibility(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    //Click Method
    public void click (WebElement element) {
        waitVisibility(element);
        element.click();
    }

    //Write Text
    public void writeText (WebElement element, String text) {
        waitVisibility(element);
        element.sendKeys(text);
    }

    //Read Text
    public String readText (WebElement element) {
        waitVisibility(element);
        return element.getText();
    }

    //Assert
    public void assertEquals (WebElement element, String expectedText) {
        waitVisibility(element);
        Assert.assertEquals(readText(element), expectedText);

    }
}