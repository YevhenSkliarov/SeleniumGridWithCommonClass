package tests;

import helpers.App;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;


public class TestGoogleSearch extends BaseTest {

    public App setup(){
        return new App();
    }

       @Test
    public void shouldBeBlogTitle() {
        App app = setup();
        app.login.open();
        app.login.login("yevhen.skliarov", "mn864652");
    }

    @Test
    public void shouldBeBlogTitle1() {
        App app = setup();
        app.login.open();
        app.login.login("yevhen.skliarov", "mn864652");
    }

}
