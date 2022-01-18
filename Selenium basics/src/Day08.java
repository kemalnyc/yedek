import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Day08 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/alert");

        driver.findElement(By.id("generate-password")).click();
        Alert alert= driver.switchTo().alert();
        Thread.sleep(2000);
       // System.out.println(alert.getText());
        alert.sendKeys("123456");
        Thread.sleep(2000);

        alert.accept();
        alert.accept();
        alert.accept();
        alert.dismiss();
        System.out.println(alert.getText());
    }
}

//        driver.close();