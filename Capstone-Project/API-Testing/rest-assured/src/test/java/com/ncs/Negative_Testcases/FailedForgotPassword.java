package com.ncs.Negative_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class FailedForgotPassword {

    String requestBody1 = "{\n" +
                "  \"email\": \"\"\n" +
                "}";

    @Test
    public void failedForgotPasscode1(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody1)
                            .when()
                                .post("/users/forgot-password")
                            .then()
                                .statusCode(400) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("A valid email address is required")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }

    String requestBody2 = "{\n" +
                "  \"email\": \"lonewolf@gmail.com\"\n" +
                "}";

    @Test
    public void failedForgotPasscode2(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody2)
                            .when()
                                .post("/users/forgot-password")
                            .then()
                                .statusCode(401) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("No account found with the given email address")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
