import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02 {

    public static void main(String args[]) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.navigate().to("http://automation.techleadacademy.io/#/home");
        String title = driver.findElement(By.id("links-header")).getText();

        WebElement phpTravellink= driver.findElement(By.className("Link"));
        System.out.println(phpTravellink.getText());
        System.out.println(phpTravellink.getTagName());
        System.out.println(driver.getTitle());
        Thread.sleep(1000);
        // driver.close();
    }
}
