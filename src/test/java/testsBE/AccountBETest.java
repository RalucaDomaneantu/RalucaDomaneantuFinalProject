package testsBE;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class AccountBETest {

    @Test
    public void accountTest(){
        RestAssured.baseURI ="https://demoqa.com";
        RequestSpecification request = RestAssured.given();
        request.header("Content-type", "application/json");
        request.header("Accept", "application/json");
    }

}
