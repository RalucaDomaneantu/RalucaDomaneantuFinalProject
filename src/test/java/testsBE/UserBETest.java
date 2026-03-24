package testsBE;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UserBETest {

    @Test
    public void userLoginTest() {
        RestAssured.baseURI = "https://demoqa.com";
        RequestSpecification request = RestAssured.given();
        request.header("Content-type", "application/json");
        request.header("Accept", "application/json");

        String requestBody = "{\n" +
                "  \"userName\": \"raludom \",\n" +
                "  \"password\": \"Password123!\"\n" +
                "}";

        request.body(requestBody);
        Response response = request.post("/Account/v1/Authorized");
        System.out.println(response.getStatusLine());
        response.body().prettyPrint();
        Assert.assertEquals(response.getStatusCode(), 200);

    }
}
