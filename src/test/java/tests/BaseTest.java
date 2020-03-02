package tests;
import helpers.App;
import org.testng.ITestContext;
import org.testng.annotations.*;
import utils.WebDriverInstansiator;

import java.net.MalformedURLException;

public class BaseTest {
    App app;

    @BeforeClass
    public void initDriver(ITestContext context) throws MalformedURLException {
        WebDriverInstansiator.setDriver();
        app = new App();
    }

    @BeforeMethod
    public void setUp() {
        app.login.open();
    }

    @AfterMethod
    public void tearDown(){
       WebDriverInstansiator.getDriver().quit();
    }
}
