import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Day03_Task4s {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        List<WebElement> nameList = driver.findElements(By.cssSelector("div.inventory_item_name"));
        List<WebElement> priceList = driver.findElements(By.cssSelector("div.inventory_item_price"));
//        list.forEach(element -> System.out.println(element.getText()));

        for (int i = 0; i < nameList.size(); i++) {
            System.out.println("Name: " + nameList.get(i).getText() + " -- Price: " + priceList.get(i).getText());
        }


//        System.out.print(driver.findElement(By.className("inventory_item_name")).getText() + " : ");
//        System.out.println(driver.findElement(By.className("inventory_item_price")).getText());
//
        driver.findElement(By.cssSelector("div.inventory_item_name")).click();
//        nameList.get(0).click();

        System.out.println(driver.findElement(By.cssSelector("div.inventory_details_name")).getText());
        System.out.println(driver.findElement(By.cssSelector("div.inventory_details_desc")).getText());
        System.out.println(driver.findElement(By.cssSelector("div.inventory_details_price")).getText());

       // driver.close();
    }
}