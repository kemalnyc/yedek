import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_Task1 {
    public static void main(String args[])throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("amazon.com");
        driver.getTitle();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl().length());
        Thread.sleep(2000);
        driver.get("theinformation.com");
        driver.getTitle();
        driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl().length());
        driver.quit();
    }
}
