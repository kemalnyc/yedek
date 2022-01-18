import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day05_Task2 {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe" );
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://automation.techleadacademy.io/#/notes");

        System.out.println(driver.findElement(By.cssSelector("p[id=first-list-item]")).getText());

        System.out.println(driver.findElement(By.cssSelector("p[class='sc-eCApnc iylGhi']")).getText());

        System.out.println(driver.findElement(By.cssSelector("p[title='attribute']")).getText());

        System.out.println(driver.findElement(By.cssSelector("p[title='chaining'][name='code-block']")).getText());

        System.out.println(driver.findElement(By.cssSelector("p[class^='sc-eCApnc iylGhi']")).getText());

        System.out.println(driver.findElement(By.cssSelector("p[class^='sc-eCApnc iylGhi']")).getText());

        //driver.close();

    }
    }

