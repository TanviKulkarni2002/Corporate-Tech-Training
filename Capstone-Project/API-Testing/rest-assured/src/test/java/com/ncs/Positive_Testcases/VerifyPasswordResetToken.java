package com.ncs.Positive_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

// expected 200 status code
public class VerifyPasswordResetToken {

    String requestBody = "{\n" +
                "  \"token\": \"valid-token-here\"\n" +
                "}";

    @Test
    public void userforgotPasscode(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody)
                            .when()
                                .post("/users/verify-reset-password-token")
                            .then()
                                .statusCode(200) // Check the status code
                                .body("success", equalTo(true)) // Check the success field
                                .body("message",equalTo("The provided password reset token is valid"))
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
