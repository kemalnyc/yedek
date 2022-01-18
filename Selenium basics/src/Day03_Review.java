import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Day03_Review {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe" );
        WebDriver driver=new ChromeDriver();

        driver.get("http://automation.techleadacademy.io/#/home");

        //WebElement element= driver.findElement(By.id(""));
        WebElement homeLink= driver.findElement(By.linkText("Home"));
        System.out.println(homeLink.getText());

        WebElement passionTeaLink = driver.findElement(By.partialLinkText("Passion"));
        System.out.println(passionTeaLink.getText());
driver.close();
    }
}
