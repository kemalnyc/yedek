import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class SeleniumTest {
    WebDriver driver;
    @BeforeMethod
public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
}

@AfterMethod
public void tearDown(){
    driver.close();
}
@Test(testName = "Google Title test", description = "Testing title is 'Google'",priority = 1)
    public void testGoogleTitle(Method method){

    driver.get("https://google.com");
    String expectedTitle = "Google";
    String actualTitle= driver.getTitle();

    Assert.assertEquals(actualTitle,expectedTitle);

    Test testDetails = method.getAnnotation(Test.class);
    System.out.println(testDetails.testName());
    System.out.println(testDetails.description());
    System.out.println(method.getName());
}
@Test (enabled = false)
    public void testAmazonTitle(){
        driver.get("https://amazon.com");
    String expectedTitle = "Amazon.com. Spend less. Smile more.";
    String actualTitle= driver.getTitle();
    Assert.assertEquals(actualTitle,expectedTitle);
}
    @Test(invocationCount = 3)
    public void testTLAalertpage(){
        driver.get("http://automation.techleadacademy.io/#/");
        driver.findElement(By.linkText("Alert")).click();

        String expected = "http://automation.techleadacademy.io/#/alert";
        String actual = driver.getCurrentUrl();
        Assert.assertEquals(actual, expected);
    }

    @Test (priority = 2, invocationTimeOut = 2000)
    public void testOrbitzPage(){
        driver.get("https://www.orbitz.com/");
        Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Sign in']")).isEnabled());
    }
}
