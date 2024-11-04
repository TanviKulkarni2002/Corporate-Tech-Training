package com.ncs.Positive_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

// expected 201 status code
public class UserRegisteration {

    // JSON body for the POST request
    String requestBody = "{\n" +
    "  \"name\": \"demo-abc\",\n" +
    "  \"email\": \"demo-abc@testing1111.com\",\n" +
    "  \"password\": \"demo-abc@123\"\n" +
    "}";

    @Test
    public void userRegister(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody)
                            .when()
                                .post("/users/register")
                            .then()
                                .statusCode(201) // Check the status code
                                .body("success", equalTo(true)) // Check the success field
                                .body("message", equalTo("User account created successfully")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
