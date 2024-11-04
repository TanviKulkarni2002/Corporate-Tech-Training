package com.ncs.Negative_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

// x-auth-token: e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e
public class FailedUserInfoUpdate {
    String requestBody1 = "{\n" +
    "  \"name\": \"\",\n" +
    "  \"phone\": \"1234567890\",\n" +
    "  \"company\": \"\"\n" +
    "}";

    //x-auth-token not given in header
    // expected 401 status code
    @Test
    public void failedUpdate1(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody1)
                            .when()
                                .patch("/users/profile")
                            .then()
                                .statusCode(401) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("No authentication token specified in x-auth-token header")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }

    //invalid input
    String requestBody2 = "{\n" +
    "  \"name\": \"\",\n" +
    "  \"phone\": \"\",\n" +
    "  \"company\": \"\"\n" +
    "}";

    //x-auth-token incorrect
    // expected 401 status code
    @Test
    public void failedUpdate2(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .header("x-auth-token","e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437f")
                                .body(requestBody2)
                            .when()
                                .patch("/users/profile")
                            .then()
                                .statusCode(401) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("Access token is not valid or has expired, you will need to login")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }

    //incorrect name field input
    // expected 400 status code
    String requestBody3 = "{\n" +
    "  \"name\": \"\",\n" +
    "  \"phone\": \"\",\n" +
    "  \"company\": \"\"\n" +
    "}";

    @Test
    public void failedUpdate3(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .header("x-auth-token","e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e")
                                .body(requestBody3)
                            .when()
                                .patch("/users/profile")
                            .then()
                                .statusCode(400) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("User name must be between 4 and 30 characters")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}