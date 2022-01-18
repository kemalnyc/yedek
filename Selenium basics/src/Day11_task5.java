import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.Set;

public class Day11_task5 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions action=new Actions(driver);
        driver.get("https://www.etsy.com/");
        Thread.sleep(2000);

        WebElement cart= driver.findElement(By.className("etsy-icon"));
        System.out.println(cart.getAttribute("http://www.w3.org/2000/svg))"));



        }
    }
