package Steps;

import Helpers.Driver;
import io.cucumber.java.After;

public class Hooks extends Driver{

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
