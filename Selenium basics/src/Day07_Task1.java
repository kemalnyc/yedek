import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day07_Task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io/#/selectors");

        Thread.sleep(3000);

        List<WebElement> porsche = driver.findElements(By.xpath("//div[@id='porsche']/div/div/child::div"));
        for (WebElement res : porsche) {
            System.out.println(res.getText());


        }
    }
}
