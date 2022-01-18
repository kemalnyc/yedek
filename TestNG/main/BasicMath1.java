public class BasicMath1 {
    public static void main(String[] args) {
        BasicMath1 math1 = new BasicMath1();
        int testData1 = 15;
        int testData2 = 20;

        int expectedSub = testData1-testData2;
        int actualSub = math1.sub(testData1,testData2);
        int expectedDiv = testData1/testData2;
        int actualDiv = math1.div(testData1,testData2);
        int expectedMul = testData1*testData2;
        int actualMul = math1.mul(testData1, testData2);

        System.out.println(expectedSub == actualSub);
        System.out.println(expectedDiv == actualDiv);
        System.out.println(expectedMul == actualMul);
    }

    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public int div(int num1, int num2) {
        return num1 / num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }
}
