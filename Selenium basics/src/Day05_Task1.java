import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day05_Task1 {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://automation.techleadacademy.io/#/notes");

            driver.findElement(By.cssSelector("#shopping-cart")).click();
         List<WebElement> prod= driver.findElements(By.cssSelector("div[class='shelf-item__buy-btn']"));
        System.out.println(prod.get(0).getText());
     /*   prod.get(4).click();
        prod.get(8).click();*/

    }
    }

