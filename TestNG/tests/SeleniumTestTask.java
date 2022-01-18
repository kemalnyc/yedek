import data.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SeleniumTestTask {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test(testName = "login", dataProvider = "loginData", dataProviderClass = DataProvider.class)
    public void testTechLead(String username, String password, String res) {
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");

        driver.findElement(By.id("txtUsername")).sendKeys(username);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();

        if (res.equals("pass")) {
            Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
        } else {
            Assert.assertFalse(driver.getCurrentUrl().contains("dashboard"));
        }
    }
}