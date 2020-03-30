package Steps;

import Helpers.Driver;
import Pages.Homepage;
import Pages.Itempage;
import Pages.Loginpage;
import Pages.Searchpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Properties;

@RunWith(Cucumber.class)
public class SearchStepdef {

    private final Homepage homepage;
    private final Loginpage loginpage;
    private final Properties props;
    private final Searchpage searchpage;
    private final Itempage itempage;


    public WebDriver driver;


    public SearchStepdef() throws IOException {
        this.props = Driver.loadProperties();
        this.driver = Driver.getDriver();
        this.homepage = new Homepage(driver);
        this.loginpage = new Loginpage(driver);
        this.searchpage = new Searchpage(driver);
        this.itempage = new Itempage(driver);

    }

    @Given("^I load the website$")
    public void iLoadTheWebsite() {
        String url = props.getProperty("url");
        driver.get(url);
    }

    @And("^I login with email and password$")
    public void iLoginWithEmailAndPassword() {
        String email = props.getProperty("email");
        String password = props.getProperty("password");
        String username = props.getProperty("username");


        homepage.clickLoginButton();
        loginpage.Login(email, password, username);

    }

    @When("^I search for \"([^\"]*)\"$")
    public void iSearchFor(String arg0) {
        homepage.search(arg0);
        searchpage.verifySearchResults();
    }

    @And("^I add item from brand \"([^\"]*)\"$")
    public void iAddItemFromBrand(String arg0){
        searchpage.clickItem();
        itempage.clickAddToCart();

    }

    @Then("^I should see the item in my cart$")
    public void iShouldSeeTheItemInMyCart() {
        itempage.clickCart();
        searchpage.verifySearchResults();
    }
}
