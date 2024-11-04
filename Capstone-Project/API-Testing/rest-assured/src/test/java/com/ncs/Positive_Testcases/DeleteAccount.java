package com.ncs.Positive_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

// x-auth-token: 3b92d9f049bb46388597a98c399cc336506db9bedac84f6d8740b781c988ffe6
// expected 200 status code
public class DeleteAccount {

    @Test
    public void deleteAccount(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .header("x-auth-token", "a4888cb45e9946079d45953c82c3c450a07ce0981c08412c9bb6207001101a45")
                                // .body(requestBody) // Include the request body
                            .when()
                                .delete("/users/delete-account")
                            .then()
                                .statusCode(200) // Check the status code
                                .body("success", equalTo(true)) // Check the success field
                                .body("message", equalTo("Account successfully deleted")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}