package rest;

import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.response.*;

public class EmployeeRestServices {

    //@Test
    public static void apiCallResponse() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api/AllEmployeeResources").
                then().statusCode(200).extract().response();
        String status = response.getStatusLine();
        String body = response.getBody().print();
        Assert.assertEquals(response, 200);
    }
    @Test
    public static void apiCallResponseSingle() {
        Response response = given().when().get("http://info.venturepulse.org:8080/service-webapp/api" +
                "/SingleEmployeeResources/59ac2f43c09dea2660451c9d").
                then().statusCode(200).extract().response();
        String status = response.getStatusLine();
        String body = response.getBody().print();
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}
