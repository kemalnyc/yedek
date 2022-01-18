import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day12_task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Actions action=new Actions(driver);
        driver.get("http://automation.techleadacademy.io/#/selectclass");
        Thread.sleep(2000);

        WebElement frontEnd= driver.findElement(By.linkText("WordPress Development"));
        action.moveToElement(frontEnd).perform();
        action.moveToElement(driver.findElement(By.linkText("Custom Post Types"))).perform();

        WebElement portfolio= driver.findElement(By.linkText("Portfolios"));
        action.moveToElement(portfolio).perform();
        portfolio.click();
        String correct= driver.findElement(By.xpath("//h4")).getText();
        System.out.println(correct.equalsIgnoreCase(portfolio.getText()));

        }
    }
