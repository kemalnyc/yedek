package com.pluralsight;

import io.cucumber.java.AfterAll;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.ConfigReader;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebDriverDemo extends BasePage {
    WebDriver driver;
    public WebDriverDemo(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public static void main (String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        //driver.get(ConfigReader.readProperty("url"));
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));

driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS)
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("pluralsight");
        searchField.sendKeys(Keys.ENTER);
        WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
        imagesLink.click();

        WebElement imageElement = driver.findElements(By.xpath("//img[@class='rg_i Q4LuWd']")).get(0);
        imageElement.click();


    }
}
