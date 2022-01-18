package data;

public class DataProvider {
    @org.testng.annotations.DataProvider(name = "loginData")
    public static Object[][] loginData(){
        Object[][] data = new Object[3][3];
        data[0][0] = "Admin";
        data[0][1] = "admin123";
        data[0][2] = "pass";
        data[1][0] = "admin123";
        data[1][1] = "Admin";
        data[1][2] = "fail";
        data[2][0] = "";
        data[2][1] = "admin123";
        data[2][2] = "fail";
        return data;
    }

}
