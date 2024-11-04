package com.ncs.Negative_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class FailedVerifyPasswordResetToken {

    //invalid token
    String requestBody1 = "{\n" +
                "  \"token\": \"\"\n" +
                "}";
    
    @Test
    public void failedVerifyToken1(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody1)
                            .when()
                                .post("/users/verify-reset-password-token")
                            .then()
                                .statusCode(401) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("The provided password reset token is invalid or has expired")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());

    }

    //invalid token
    String requestBody2 = "{\n" +
                "  \"token\": \"invalid134token7f45e69entered21r\"\n" +
                "}";

    @Test
    public void failedVerifyToken2(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody2)
                            .when()
                                .post("/users/verify-reset-password-token")
                            .then()
                                .statusCode(401) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("The provided password reset token is invalid or has expired")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());

    }
}
