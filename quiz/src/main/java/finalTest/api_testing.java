package finalTest;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.json.simple.JSONObject;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;


public class api_testing {



   @Test
           public void validateBody(){
 /*      JSONObject requestParams = new JSONObject();
       requestParams.put("id", "1984");
       requestParams.put("firstName", "k");
       requestParams.put("lastName", "kk");
       requestParams.put("role", "sdet");
       requestParams.put("department", "HR");*/
String requestBody = "{\"id\":\"1984\",\"firstName\":\"k\",\"lastName\":\"kk\",\"role\":\"sdet\",\"department\":\"HR\"}";
     Response response =  RestAssured.given()
             .header("Content-Type","application/json; charset=utf-8")
             .body(requestBody)
             .when()
             .post("https://employee-management-39848.herokuapp.com/api/employees")
             .then()
             .extract()
             .response();

       Assert.assertEquals("1984" ,response.jsonPath().getString("id"));
       Assert.assertEquals("k" ,response.jsonPath().getString("firstName"));
       Assert.assertEquals("kk" ,response.jsonPath().getString("lastName"));
       Assert.assertEquals("sdet" ,response.jsonPath().getString("role"));
       Assert.assertEquals("HR" ,response.jsonPath().getString("department"));


   }

}
