package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverInstansiator;


public class BasePage {

    WebDriver driver = WebDriverInstansiator.getDriver();

    public BasePage() {
        PageFactory.initElements(driver,this);
    }
}
