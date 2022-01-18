import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Day07_Task22 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
        WebElement selectElement= driver.findElement(By.xpath("//select[@id='id_contact']"));
        Select select= new Select(selectElement);

        List <WebElement> list = driver.findElements(By.xpath("//select[@id='id_contact']"));
        list.forEach(opt -> System.out.println(opt.getText()));

        select.selectByVisibleText("Webmaster");



        System.out.println("------------");
        System.out.println(select.getFirstSelectedOption().getText());

    }
}
