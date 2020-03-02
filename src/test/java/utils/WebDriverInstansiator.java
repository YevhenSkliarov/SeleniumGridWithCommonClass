package utils;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class WebDriverInstansiator {
    private static ThreadLocal<WebDriver> webDriver = new ThreadLocal<WebDriver>();

    public static void setDriver() throws MalformedURLException {
        webDriver.set(WebDriverFactory.getWebDriver());
    }

    public static WebDriver getDriver(){
        return webDriver.get();
    }
}
