package Steps;

import Helpers.Driver;
import cucumber.api.java.After;

public class Hooks extends Driver{

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
