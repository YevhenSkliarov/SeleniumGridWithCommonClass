package tests;

import helpers.App;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import user.User;
import user.UserFactory;
import utils.WebDriverInstansiator;

import java.net.MalformedURLException;

public class BaseTest {
    private ThreadLocal<App> app = new ThreadLocal<>();
    static User user = UserFactory.getUser();

    @BeforeMethod
    public void initDriver() throws MalformedURLException {
        WebDriverInstansiator.setDriver();
        app.set(new App());
    }

    App app() {
        return app.get();
    }

    @AfterMethod
    public void tearDown() {
        WebDriverInstansiator.getDriver().quit();
    }
}
