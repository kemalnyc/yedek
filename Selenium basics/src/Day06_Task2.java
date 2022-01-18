import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day06_Task2 {
    public static void main(String[] args) throws InterruptedException {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://www.ebay.com/");

            driver.findElement(By.xpath("//div[@class='hl-cta__default hl-cta__default-js hl-mweb-text-banner__cta']")).click();

        driver.findElement(By.xpath("//*[@class='x-textrange__input x-textrange__input--from']")).sendKeys("50");
        driver.findElement(By.xpath("//*[@class='x-textrange__input x-textrange__input--to']")).sendKeys("60");
        driver.findElement(By.xpath("//button[@class='btn btn--small btn--states  x-textrange__block-button']")).click();

        Thread.sleep(2000);
       // driver.findElement(By.xpath("//h3[@class='s-item__title'"));
        List<WebElement> list= driver.findElements(By.xpath("//div[@class='s-item__info clearfix']"));
        for(int i=0; i<list.size();i++){
            System.out.println(list.get(i).getText());

        List<WebElement> list2=driver.findElements(By.xpath("//span[@class='s-item__shipping s-item__logisticsCost']"));
            list2.forEach(item -> System.out.println(item.getText()));

            //driver.findElement(By.xpath("//svg[@class='svg-icon icon-check']")).click();
            //driver.findElement(By.xpath("//div[@class='srp-controls--selected-value']")).click();

            List<WebElement> price = driver.findElements(By.xpath("//span[@class='s-item__price']"));
            price.forEach(item -> System.out.println(item.getText()));


            //driver.close();
        }
    }
    }

