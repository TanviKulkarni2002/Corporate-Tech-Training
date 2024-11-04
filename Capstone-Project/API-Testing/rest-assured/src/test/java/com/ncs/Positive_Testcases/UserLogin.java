package com.ncs.Positive_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

// x-auth-token: e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e
// expected 200 status code
public class UserLogin {

    // JSON body for the POST request
    String requestBody = "{\n" +
    "  \"email\": \"demo-abc@testing1111.com\",\n" +
    "  \"password\": \"demo-abc@123\"\n" +
    "}";

    @Test
    public void userLogin(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .body(requestBody)
                            .when()
                                .post("/users/login")
                            .then()
                                .statusCode(200) // Check the status code
                                .body("success", equalTo(true)) // Check the success field
                                .body("message", equalTo("Login successful")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
