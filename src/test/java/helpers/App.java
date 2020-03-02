package helpers;

public class App {
    public CommonHelper common;
    public LoginPageHelper login;

    public App() {
        this.common = new CommonHelper();
        this.login = new LoginPageHelper();
    }
}
