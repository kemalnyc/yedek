package com.pluralsight;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class WebDriverRadioButtons {
    public static void main(String args[]){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:63342/WebDriverDemo/RadioButtonTest.html?_ijt=ln1l4q40coombvfk5j9ke8u04r");
    List<WebElement> radioButtons = driver.findElements(By.name("color"));
    radioButtons.get(1).click();

    for (WebElement radioButton : radioButtons){
        if(radioButton.isSelected()){
            System.out.println(radioButton.getAttribute("value"));
        }
    }
    }
}
