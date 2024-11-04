package com.ncs.Positive_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
// expected 200 status code
public class UserForgotPassword {

    String requestBody = "{\n" +
                "  \"email\": \"demo-abc@testing1101.com\"\n" +
                "}";

    @Test
    public void userforgotPasscode(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody)
                            .when()
                                .post("/users/forgot-password")
                            .then()
                                .statusCode(200) // Check the status code
                                .body("success", equalTo(true)) // Check the success field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
