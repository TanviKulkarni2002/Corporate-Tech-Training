package com.ncs.Negative_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

// expected 400 status code
public class FailedUserLogin {

    // JSON body for the POST request: invalid email
    String requestBody1 = "{\n" +
    "  \"email\": \"\",\n" +
    "  \"password\": \"demo-abc@123\"\n" +
    "}";

    @Test
    public void failedUserLogin1(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody1)
                            .when()
                                .post("/users/login")
                            .then()
                                .statusCode(400) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("A valid email address is required")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }

    // JSON body for the POST request: invalid password
    String requestBody2 = "{\n" +
    "  \"email\": \"demo-abc@testing1111.com\",\n" +
    "  \"password\": \"\"\n" +
    "}";

    @Test
    public void failedUserLogin2(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody2)
                            .when()
                                .post("/users/login")
                            .then()
                                .statusCode(400) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("Password must be between 6 and 30 characters")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }

    // JSON body for the POST request: invalid email and password
    String requestBody3 = "{\n" +
    "  \"email\": \"\",\n" +
    "  \"password\": \"\"\n" +
    "}";

    @Test
    public void failedUserLogin3(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody3)
                            .when()
                                .post("/users/login")
                            .then()
                                .statusCode(400) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("A valid email address is required")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}