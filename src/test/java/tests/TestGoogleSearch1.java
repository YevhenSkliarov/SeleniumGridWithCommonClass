package tests;

import helpers.App;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;


public class TestGoogleSearch1 extends BaseTest {

    public App setup(){
        return new App();
    }

    @Test
    public void shouldBeBlogTitle3() {
        App app = setup();
        app.login.open();
        app.login.login("yevhen.skliarov", "mn864652");
    }

    @Test
    public void shouldBeBlogTitle4() {
        App app = setup();
        app.login.open();
        app.login.login("yevhen.skliarov", "mn864652");
    }
}
