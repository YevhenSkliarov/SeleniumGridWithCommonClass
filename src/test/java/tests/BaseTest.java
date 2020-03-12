package tests;

import helpers.App;
import org.testng.annotations.*;
import utils.WebDriverInstansiator;

import java.net.MalformedURLException;

public class BaseTest {
    protected ThreadLocal<App> app = new ThreadLocal<>();

    @BeforeMethod
    public void initDriver() throws MalformedURLException {
        WebDriverInstansiator.setDriver();
        app.set(new App());
    }

    protected App app() {
        return app.get();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverInstansiator.getDriver().quit();
    }
}
