import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day04_HomeWork {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");
        //driver.findElement(By.cssSelector("a[class*=navbar-brand")).click();

        List<WebElement> pops = driver.findElements(By.cssSelector("a.product-name"));
        List<WebElement> popsPrices = driver.findElements(By.cssSelector("span[class='price product-price']"));
       for(int i = 0; i <pops.size(); i++){
            System.out.println(pops.get(i).getText() + popsPrices.get(i).getText());
        }
       driver.findElement(By.cssSelector("a[class='product_img_link']")).click();
    }
}
