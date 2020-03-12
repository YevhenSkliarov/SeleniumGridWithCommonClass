package tests;

import org.testng.annotations.Test;


public class TestGoogleSearch1 extends BaseTest {

    @Test
    public void shouldBeBlogTitle3() {
        app().login.open();
        app().login.login("yevhen.skliarov", "mn864652");
    }

    @Test
    public void shouldBeBlogTitle4() {
        app().login.open();
        app().login.login("yevhen.skliarov", "mn864652");
    }
}
