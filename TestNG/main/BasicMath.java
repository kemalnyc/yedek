public class BasicMath {

    public static void main(String[] args) {
        BasicMath math = new BasicMath();

        int testData1 = 15;
        int testData2 = 4;

        int expectedResultSum = testData1 + testData2;
        int actualResultSum = math.sum(testData1, testData2);
        if (expectedResultSum == actualResultSum) {
            System.out.println("Sum test passed");
        } else {
            System.out.println("Sum test FAILED");
        }

        int expectedResultSub = testData1 - testData2;
        int actualResultSub = math.subtract(testData1, testData2);
        if (expectedResultSub == actualResultSub) {
            System.out.println("Subtract test passed");
        } else {
            System.out.println("Subtract test FAILED");
        }

        double testDataA = 15.0;
        double testDataB = 4.0;
        double expectedResultDiv = testDataA / testDataB;
        double actualResultDiv = math.divide(testDataA, testDataB);
        if (expectedResultDiv == actualResultDiv) {
            System.out.println("Divide test passed");
        } else {
            System.out.println("Divide test FAILED");
        }

        int expectedResult = testData1 * testData2;
        int actualResult = math.multiply(testData1, testData2);
        if (expectedResult == actualResult) {
            System.out.println("Multiply test passed");
        } else {
            System.out.println("Multiply test FAILED");
        }
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int subtract(int num1, int num2) {
        return num1 - num2;
    }

    public double divide(double num1, double num2) {
        return num1 / num2;
    }

    public int multiply(int num1, int num2) {
        return num1 * num2;
    }
}