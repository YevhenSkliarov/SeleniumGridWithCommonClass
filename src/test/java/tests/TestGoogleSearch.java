package tests;

import org.testng.annotations.Test;


public class TestGoogleSearch extends BaseTest {

    @Test
    public void shouldBeBlogTitle() {
        app().login.open();
        app().login.login("yevhen.skliarov", "mn864652");
    }

    @Test
    public void shouldBeBlogTitle1() {
        app().login.open();
        app().login.login("yevhen.skliarov", "mn864652");
    }

}
