import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day08_task1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\AB Proje\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://automation.techleadacademy.io/#/popup");

        driver.findElement(By.id("bmi_btn")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("feet")).sendKeys("5");
        driver.findElement(By.name("inch")).sendKeys("8");
        driver.findElement(By.name("weight")).sendKeys("150");
        driver.findElement(By.id("calculate_btn")).click();
        String res= driver.findElement(By.id("BMI_result")).getText();

        Double res1=Double.parseDouble(res);
        if(res1<18.5){
            System.out.println("Underweight");
        }
        if(res1>=18.5&&res1<=25){
            System.out.println("Normal");
        }
        if(res1>30){
            System.out.println("Overweight");
        }
    }
}

//        driver.close();