package Data;

public class DataProvider {

    @org.testng.annotations.DataProvider(name = "listCheck")
    public static Object[][]listCheck(){
        Object [][] data = new Object[11][2];
        data [0][0] = "Personal Details";
        data [0][1] = "pass";
        data [1][0] = "Contact Details";
        data [1][1] = "pass";
        data [2][0] = "Emergency Contacts";
        data [2][1] = "pass";
        data [3][0] = "Dependents";
        data [3][1] = "pass";
        data [4][0] = "Immigration";
        data [4][1] = "pass";
        data [5][0] = "Job";
        data [5][1] = "pass";
        data [6][0] = "Immigration";
        data [6][1] = "pass";
        data [7][0] = "Job";
        data [7][1] = "pass";
        data [8][0] = "Salary";
        data [8][1] = "pass";
        data [9][0] = "Tax Exemptions";
        data [9][1] = "pass";
        data [10][0] = "Report-to";
        data [10][1] = "pass";
        data [11][0] = "Qualifications";
        data [11][1] = "pass";

        return data;
    }
}

