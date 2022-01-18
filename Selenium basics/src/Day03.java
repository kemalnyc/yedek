import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03 {
    public static void main(String[]args) throws InterruptedException{
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe" );
       WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
      driver.get("https://google.com");

      driver.findElement(By.name("q")).sendKeys("Selenium");
Thread.sleep(2000);
      driver.findElement(By.name("btnK")).click();

      String expectedWikiLink= "https://en.wikipedia.org/wiki/Selenium_(software)";
      Thread.sleep(3000);

              String actualWikiLink=driver.findElement(By.xpath("ruhjFE NJLBac fl")).getAttribute("href");
        System.out.println(expectedWikiLink.equalsIgnoreCase(actualWikiLink));

        driver.close();
    }
}
