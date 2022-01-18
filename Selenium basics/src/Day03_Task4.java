import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day03_Task4 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com");

        String userNames = driver.findElement(By.className("login_credentials")).getText();
        System.out.println(userNames);

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        //String pass = driver.findElement(By.className("login_password")).getText();
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        System.out.println(driver.findElement(By.className("inventory_item_name")).getText());
        System.out.println(driver.findElement(By.className("inventory_item_price")).getText());

        //driver.findElement(By.className("inventory_item.img")).sendKeys(Keys.CONTROL +"t");
     driver.findElement(By.className("inventory_item_name")).click();
    }
}