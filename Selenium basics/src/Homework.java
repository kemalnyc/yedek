import com.sun.org.apache.xpath.internal.objects.XString;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions action = new Actions(driver);

     // Navigate to orbitz.com
        driver.get("https://www.orbitz.com/");
    //  Click "Going to" button
        driver.findElement(By.className("uitk-faux-input")).click();
    //  Enter "Las Vegas" 'to going to' bar
        driver.findElement(By.id("location-field-destination")).sendKeys("Las Vegas");
    //  Click "Las Vegas" on drop down menu
        driver.findElement(By.xpath("//div[@class='uitk-typeahead-button-label uitk-type-medium uitk-type-300 truncate']//*[contains(text(),'Las Vegas')]")).click();
    //  Click "Check in" box
        driver.findElement(By.id("d1-btn")).click();
    //  Select and Click Today on drop down
        WebElement startDate = driver.findElement(By.xpath("//button[@class='uitk-date-picker-day uitk-new-date-picker-day selected edge']"));
        startDate.click();
    //  Click "Check out" box
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-flex-item uitk-flex-shrink-0 dialog-done']")).click();
        driver.findElement(By.id("d2-btn")).click();
    //  Click date button 2 weeks from today's date and click done
        /*LocalDate date = LocalDate.now().plusDays(14);
        String formattedDate = date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(formattedDate);
        String myXpath = "//button[@aria-label='"+formattedDate+"']";
        driver.findElement(By.xpath(myXpath)).click();*/
        driver.findElement(By.xpath("(//button[@class='uitk-date-picker-day uitk-new-date-picker-day'])[15]")).click();
        driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-primary uitk-flex-item uitk-flex-shrink-0 dialog-done']")).click();
    //  Click Travelers button increase number of children to 2 enter their ages, Click add another room, click done
        driver.findElement(By.xpath("//button[@class='uitk-fake-input uitk-form-field-trigger']")).click();
        WebElement childPlus = driver.findElement(By.xpath("(//button[@class='uitk-flex-item uitk-step-input-button'])[4]"));
        childPlus.click();
        childPlus.click();
        Select childAge = new Select(driver.findElement(By.id("child-age-input-0-0")));
        childAge.selectByValue("2");
        Select childAge2 = new Select(driver.findElement(By.id("child-age-input-0-1")));
        childAge2.selectByValue("2");
        driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-medium uitk-button-has-text uitk-button-tertiary']")).click();
        driver.findElement(By.xpath("(//button[@class='uitk-flex-item uitk-step-input-button'])[6]")).click();
        driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary uitk-button-floating-full-width']")).click();
        driver.findElement(By.xpath("//button[@class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']")).click();
    //  Print names of all hotels
        List<WebElement> hotelNames = driver.findElements(By.xpath("//h3[@class='is-visually-hidden']"));
        for(WebElement names : hotelNames){
            System.out.println(names.getText());
    //  Store hotels as per criterias
        /*Map criterias = new HashMap<String,double>();
        criterias.put(names.getText(),)*/

        }
        }
        }
