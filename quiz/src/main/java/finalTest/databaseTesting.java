package finalTest;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.DBType;
import utils.DBUtility;

import java.util.List;
import java.util.Map;

public class databaseTesting {

    @BeforeMethod
    public void setUp() {
        utils.DBUtility.establishConnection(DBType.POSTGRESQL);
    }

    @AfterMethod
    public void closeDB() {utils.DBUtility.closeConnections();
    }
    @Test
    public void assertDB(){
        List<Map<String, Object>> empResult = DBUtility.getQueryResults("SELECT first_name FROM employees limit 10");

        Assert.assertEquals(empResult.get(1).get("first_name"), "Bezalel");
        Assert.assertEquals(empResult.get(7).get("first_name"), "Saniya");
        Assert.assertEquals(empResult.get(0).get("first_name"), "Georgi");
    }
}


