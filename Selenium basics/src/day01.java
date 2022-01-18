import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class day01 {
    public static void main(String[] args)throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\geckodriver.exe");
        //WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        System.out.println(driver.getCurrentUrl());


        Thread.sleep(3000);
        driver.close();
        driver.quit();
        driver.get("https://amazon.com");
    }
}
