package tests;

import org.testng.annotations.Test;
import pages.LoginPage;


public class TestGoogleSearch1 extends BaseTest {

    @Test
    public void shouldBeBlogTitle3() {
        LoginPage login = new LoginPage();
        login.open();
        login.login("yevhen.skliarov", "mn864652");
    }

    @Test
    public void shouldBeBlogTitle4() {
        LoginPage login = new LoginPage();
        login.open();
        login.login("yevhen.skliarov", "mn864652");
    }
}
