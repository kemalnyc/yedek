import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;
public class Leave {
    WebDriver driver = null;

    @BeforeMethod
    public void SetUp(){
        String userName = "Admin";
        String password = "admin123";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails");
        driver.findElement(By.id("txtUsername")).sendKeys(userName);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();
    }

    @Test(description = "navigate to Leave section and verify you see a header \"Leave List\"")
    public void test02(){
        driver.findElement(By.xpath("//a//b[text()='Leave']")).click();
        String expText = "Leave List";
        String actText = driver.findElement(By.id("menu_leave_viewLeaveList")).getText();
        Assert.assertEquals(actText, expText);
    }

    @Test(description = "Verify you can see text \"No Leave Types with Leave Balance\"")
    public void test03(){
        driver.findElement(By.xpath("//a[@id='menu_leave_viewLeaveModule']")).click();
        driver.findElement(By.xpath("//a[@id='menu_leave_applyLeave']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@class='message warning']")).getText(), "No Leave Types with Leave Balance");
    }


    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
