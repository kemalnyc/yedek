import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Homework2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions action=new Actions(driver);


        JavascriptExecutor js=(JavascriptExecutor)driver;
        driver.get("https://weather.com");

        Thread.sleep(10000);

        driver.getWindowHandle();

       /* Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);*/
        driver.findElement(By.name("close")).click();
        driver.getWindowHandle();
        WebElement bottom= driver.findElement(By.name("facebook"));
        js.executeScript("arguments[0].scrollIntoView(true)",bottom);

        Thread.sleep(3000);
        driver.findElement(By.name("facebook")).click();
        driver.findElement(By.name("twitter")).click();
        driver.findElement(By.name("youtube")).click();



        }
    }
