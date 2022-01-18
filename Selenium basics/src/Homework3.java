import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homework3 {
    public static void main(String[] args) {

        int johnStart = 30;
        int johnDaily = 10;
        int adamDaily = 20;
        int difference = (johnDaily + johnStart) - adamDaily;
        int dailyDifference = adamDaily-johnDaily;

        int days = 0;

        if (adamDaily <= johnDaily || johnDaily == 0) {
            System.out.println(-1);
        }

        for (int i = difference; i > 0; i--) {
            if(difference>0)
                days+=i;
            }
            System.out.println(days);
        }
    }

