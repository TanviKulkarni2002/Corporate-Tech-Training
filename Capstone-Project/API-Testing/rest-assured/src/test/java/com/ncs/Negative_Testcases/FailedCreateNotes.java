package com.ncs.Negative_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class FailedCreateNotes {

    // invalid title field
    @Test
    public void failedCreateNotes1() {
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        String requestBody = "{\n" +
                "  \"title\": \"\",\n" +
                "  \"description\": \"API-Testing-Notes for RestAssured\",\n" +
                "  \"category\": \"Work\"\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("x-auth-token", "e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e")
                .body(requestBody)
                .when()
                .post("/notes")
                .then()
                .statusCode(400)
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("Title must be between 4 and 100 characters")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }

    //invalid description field
    @Test
    public void failedCreateNotes2() {
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        String requestBody = "{\n" +
                "  \"title\": \"API Testing\",\n" +
                "  \"description\": \"\",\n" +
                "  \"category\": \"Work\"\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("x-auth-token", "e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e")
                .body(requestBody)
                .when()
                .post("/notes")
                .then()
                .statusCode(400) 
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("Description must be between 4 and 1000 characters")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }

    //invalid category field
    @Test
    public void failedCreateNotes3() {
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        String requestBody = "{\n" +
                "  \"title\": \"API Testing\",\n" +
                "  \"description\": \"API Testing notes for RestAssured\",\n" +
                "  \"category\": \"\"\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("x-auth-token", "e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e")
                .body(requestBody)
                .when()
                .post("/notes")
                .then()
                .statusCode(400)
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("Category must be one of the categories: Home, Work, Personal")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }

    //x-auth-token not given in header
    @Test
    public void failedCreateNotes4() {
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        String requestBody = "{\n" +
                "  \"title\": \"API Testing\",\n" +
                "  \"description\": \"API Testing notes for RestAssured\",\n" +
                "  \"category\": \"Work\"\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .post("/notes")
                .then()
                .statusCode(401)
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("No authentication token specified in x-auth-token header")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }
}