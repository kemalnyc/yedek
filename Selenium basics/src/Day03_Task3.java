import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_Task3 {
    public static void main(String[] args) {

            System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("http://automationpractice.com");

            WebElement dresses = driver.findElement(By.linkText("DRESSES"));
            dresses.click();
        System.out.println(dresses.getAttribute(dresses.getText()));
       String actualTitle=driver.getTitle();
        System.out.println(actualTitle.equals("CASUAL DRESSES"));
driver.navigate().back();
driver.findElement(By.linkText("Evening Dresses")).click();
        }
    }
