package tests;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AccountPage;

import java.util.Locale;

public class AccountTest extends BaseTest {
    AccountPage page;

    @BeforeMethod
    public void setUp () {page = new AccountPage(getDriver());}

    @Test (testName = "Account Test")
    public void test1() {
        getDriver().get("https://strutsdepot.com");
        getExtentTest().info("Opening strutsdepot.com");
        logScreenshot();
        Assert.assertTrue(getDriver().getTitle().toLowerCase().contains("strutsdepot"));
        page.sleep(2000);
    }
    }



