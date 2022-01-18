import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Day13_task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions action = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("http://automation.techleadacademy.io/#/synchronization");



        driver.findElement(By.className("btn btn-warning")).click();
        Alert alert = driver.switchTo().alert();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        alert.accept();

    }
}