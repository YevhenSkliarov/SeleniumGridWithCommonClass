package tests;

import org.testng.annotations.Test;
import pages.LoginPage;


public class TestGoogleSearch extends BaseTest {
    @Test
    public void shouldBeBlogTitle() {
        LoginPage login = new LoginPage();
        login.open();
        login.login("yevhen.skliarov", "mn864652");
    }

    @Test
    public void shouldBeBlogTitle1() {
        LoginPage login = new LoginPage();
        login.open();
        login.login("yevhen.skliarov", "mn864652");
    }

}
