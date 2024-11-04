package com.ncs.Negative_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

// returns status code 400
public class FailedUserRegisteration {
    // JSON body for the POST request: invalid password
    String requestBody1 = "{\n" +
    "  \"name\": \"demo-abc\",\n" +
    "  \"email\": \"demo-abc@testing1111.com\",\n" +
    "  \"password\": \"\"\n" +
    "}";

    @Test
    public void failedUserRegister1(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody1)
                            .when()
                                .post("/users/register")
                            .then()
                                .statusCode(400) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("Password must be between 6 and 30 characters")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }

    // JSON body for the POST request: invalid email
    String requestBody2 = "{\n" +
    "  \"name\": \"demo-abc\",\n" +
    "  \"email\": \"\",\n" +
    "  \"password\": \"demo-abc@123\"\n" +
    "}";

    @Test
    public void failedUserRegister2(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody2)
                            .when()
                                .post("/users/register")
                            .then()
                                .statusCode(400) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("A valid email address is required")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }

    // JSON body for the POST request: invalid name
    String requestBody3 = "{\n" +
    "  \"name\": \"\",\n" +
    "  \"email\": \"demo-abc@testing1111.com\",\n" +
    "  \"password\": \"demo-abc@123\"\n" +
    "}";

    @Test
    public void failedUserRegister3(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody3)
                            .when()
                                .post("/users/register")
                            .then()
                                .statusCode(400) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("User name must be between 4 and 30 characters")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }

    
}
