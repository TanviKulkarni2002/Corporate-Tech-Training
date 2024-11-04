package com.ncs.Negative_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

//returns status code 409
public class AccountAlreadyExists {
    
    // JSON body for the POST request
    String requestBody = "{\n" +
    "  \"name\": \"demo-abc\",\n" +
    "  \"email\": \"demo-abc@testing1111.com\",\n" +
    "  \"password\": \"demo-abc@123\"\n" +
    "}";

    @Test
    public void accountExists(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody)
                            .when()
                                .post("/users/register")
                            .then()
                                .statusCode(409) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("An account already exists with the same email address")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
