import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_Task1 {
    public static void main(String[]args)throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automation.techleadacademy.io");
        driver.findElement(By.linkText("Inputs")).click();

driver.findElement(By.id("message")).sendKeys("Selenium");
driver.findElement(By.name("button1")).click();
        System.out.println(driver.findElement(By.name("message1")).equals(driver.findElement(By.id("message"))));
Thread.sleep(3000);
driver.close();

    }
}
