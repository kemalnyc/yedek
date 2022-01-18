import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasicMathTest {

    @Test
    public void testSum() {
        BasicMath math = new BasicMath();

        int testData1 = 15;
        int testData2 = 4;

        int expectedResultSum = testData1 + testData2;
        int actualResultSum = math.sum(testData1, testData2);
        Assert.assertEquals(actualResultSum, expectedResultSum);
    }
    @Test
    public void testSubtract(){

    }

}