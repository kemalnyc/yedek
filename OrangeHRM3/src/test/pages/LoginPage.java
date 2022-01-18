package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    WebDriver driver;

    public LoginPage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
        getText(driver.findElement(By.id("Tessa")));
    }
}
