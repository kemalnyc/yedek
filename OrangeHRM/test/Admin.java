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

public class Admin {
    WebDriver driver = null;

    @BeforeMethod
    public void SetUp(){
        String userName = "Admin";
        String password = "admin123";
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewMyDetails");
        driver.findElement(By.id("txtUsername")).sendKeys(userName);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();
    }

    @Test(description = "Verify new nationality is added to the table")
    public void test01(){
        driver.findElement(By.linkText("Admin")).click();
        driver.findElement(By.id("menu_admin_nationality")).click();
        driver.findElement(By.id("btnAdd")).click();

        driver.findElement(By.id("nationality_name")).sendKeys("aaaaTestNationality");
        driver.findElement(By.id("btnSave")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()='some people']")) != null);
    }

    @Test(testName = "add new Username")
    public void test02() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        String username = "aaaaTestUsername12";

        driver.findElement(By.xpath("//*[text()='Admin']")).click();
        driver.findElement(By.xpath("//*[text()='User Management']")).click();

        driver.findElement(By.id("btnAdd")).click();

        driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys("Alice Duval");
        driver.findElement(By.id("systemUser_userName")).sendKeys(username);
        driver.findElement(By.id("systemUser_password")).sendKeys("Abc+123+321");
        driver.findElement(By.id("systemUser_confirmPassword")).sendKeys("Abc+123+321");

        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("btnSave"))));
        driver.findElement(By.id("btnSave")).click();

        if (driver.findElements(By.xpath("//*[text()='System Users']")).size() < 1){
            driver.findElement(By.id("btnSave")).click();
        }

        Thread.sleep(3000);
//        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()=" + username + "]")));

        List<WebElement> users = driver.findElements(By.xpath("//tr/td/a"));
        int tableSizeBeforeDelete = users.size();

        driver.findElement(By.xpath("//*[text()='"+ username + "']/parent::td/preceding-sibling::td")).click();
        driver.findElement(By.id("btnDelete")).click();
        driver.findElement(By.id("dialogDeleteBtn")).click();

        Thread.sleep(2000);

        List <WebElement> users1 = driver.findElements(By.xpath("//tr/td/a"));
        int tableSizeAfterDelete = users1.size();

        Assert.assertNotEquals(tableSizeAfterDelete, tableSizeBeforeDelete);
    }

    @Test
    public void filterSearchTest(){
        driver.findElement(By.xpath("//*[text()='Admin']")).click();

        Select select = new Select(driver.findElement(By.id("searchSystemUser_userType")));
        select.selectByVisibleText("Admin");
        driver.findElement(By.id("searchBtn")).click();

        List<WebElement> userRoles = driver.findElements(By.xpath("//tbody/tr/td[3]"));
        for(WebElement role: userRoles){
            if (!role.getText().equals("Admin")){
                Assert.fail();
            }
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }
}
