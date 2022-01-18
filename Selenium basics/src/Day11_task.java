import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class Day11_task {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.amctheatres.com/");
        Thread.sleep(2000);

        System.out.println(driver.findElement(By.xpath("//h5[@class='onboarding-tour-modal__headline']")).getText());
        driver.findElement(By.xpath("//button[@class = 'Btn Btn--Primary']")).click();
        System.out.println(driver.findElement(By.className("tourtip__header")).getText());
        driver.findElement(By.id("icon_close")).click();


        List<WebElement> links = driver.findElements(By.xpath("//div[@class='SiteFooter-social']/ul/li"));
        links.forEach(a -> a.click());
        Thread.sleep(2000);

        String currentWindowID = driver.getWindowHandle();
        Set<String> windows = driver.getWindowHandles();
        for(String windowId: windows) {
            if (!windowId.equals(currentWindowID))
                driver.switchTo().window(windowId);
            Thread.sleep(2000);

            System.out.println(driver.getTitle());
            System.out.println(driver.findElement(By.className("TextBlock-copy")).getText());

        }
    }
}