package employee;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;
import static org.hamcrest.Matchers.equalTo;

public class employeeList {
    public String path;
    String id;
    String name;
    String salary;
    String age;
    public static Map<String, String> variables;

   /* @BeforeClass
    public void setUpLogInAndToken() {*/
        /*RestAssured.baseURI = "http://dummy.restapiexample.com";
        RestAssured.basePath = "/api/v1/employees";*/


        //return RestAssured.given()

/*
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                //.post(path)
                .then() // Allows me to validate response body or content type as well as status codes
                .statusCode(200);*/
               // .extract() // Getting all the values from the api POST request
               // .body("/api/v1/employees") // {"token": "123124124124jkk124"}
                //.jsonPath() // Allows us to navigate in the Json body
                //.get("token");  // result = 834f9392-ce89-411c-8366-00c86886ec9b*/

    @Test
    public void verifyStatus() {
        RestAssured.baseURI = "http://dummy.restapiexample.com";
        RestAssured.basePath = "/api/v1/employees/4";
        RestAssured.given()
                .contentType("application/json")
                .body("http://dummy.restapiexample.com/api/v1/employees/4")
                .when()
                .get()
                .then()
                .statusCode(200)
                .and()
                .body("id", equalTo(4))
                .and()
                .body("employee_name",equalTo("Cedric Kelly"))
                .and()
                .body("employee_salary",equalTo(433060))
                .and()
                .body("employee_age",equalTo(22))
                .contentType("apllication/json");
    }

    @Test
    public void verifyCred() {

    /*  //  RestAssured.baseURI = "";
     //Response response = RestAssured.given()
        RestAssured.given()
                .when()
                .get("http://dummy.restapiexample.com/api/v1/employees")
              //  .then()

               // .assertThat().extract()//.response()
        //.header("Content-Type","application/json");
        //.assertThat().body("id[3]", equalTo('4'));
*/
    }
}