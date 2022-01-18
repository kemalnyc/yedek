package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test(testName = "Google test", groups = {"regression"})
    public void test01() {
        getDriver().get("https://google.com");
        extentTest.info("Opening google.com");
        logScreenshot();
        Assert.assertEquals(getDriver().getTitle(),"Google");

    }

    @Test
    public void amazonTest() {
        getDriver().get("https://amazon.com");
        extentTest.pass("Opened amazon web page");
        logScreenshot("Home Page");
    }

    @Test(testName = "Ebay web page")
    public void Test3() {
        getDriver().get("https://ebay.com");
        extentTest.pass("Opened ebay web page");
        logScreenshot("Home Page");
    }
}