package com.ncs.Negative_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class FailedGetAllNotes {
    
    //x-auth-token not given in header
    @Test
    public void failedGetAllNotes(){

        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                .header("Content-Type", "application/json")
                .when()
                .get("/notes")
                .then()
                .statusCode(401)
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("No authentication token specified in x-auth-token header")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
