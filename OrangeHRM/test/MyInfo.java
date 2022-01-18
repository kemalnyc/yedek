import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.List;

public class MyInfo {

    @Test (dataProvider = "listCheck", dataProviderClass = DataProvider.class)
    public void test01(String name){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/validateCredentials");
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"sidenav\"]/li/a"));
        for (WebElement res: list){
            System.out.println(res.getText());

        Assert.assertTrue(res.getText().equals("pass"));
        }
    }
}