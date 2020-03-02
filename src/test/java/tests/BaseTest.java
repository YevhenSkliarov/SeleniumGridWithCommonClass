package tests;
import helpers.App;
import org.testng.ITestContext;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
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

    @AfterClass
    public void tearDown(){
       WebDriverInstansiator.getDriver().quit();
    }
}
