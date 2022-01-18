package pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountPage extends BasePage {
    private WebDriver driver;

    public AccountPage (WebDriver driver){
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy (className = "fas fa-user")
    public WebElement accountBtn;

    @FindBy(id = "username")
    public WebElement userName;

    @FindBy(id = "password")
    public WebElement passWord;

    @FindBy(name = "login")
    public WebElement logIn;

    @FindBy(className = "woocommerce-MyAccount-navigation")
    public List<WebElement> accountNav;


}
