package tests;

import helpers.App;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.BasePage;
import pages.LoginPage;
import sun.rmi.runtime.Log;
import utils.WebDriverInstansiator;

import java.net.MalformedURLException;

public class BaseTest {
    @BeforeMethod
    public void initDriver(ITestContext context) throws MalformedURLException {
        WebDriverInstansiator.setDriver();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverInstansiator.getDriver().quit();
    }
}
