package com.ncs.Positive_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

// x-auth-token: 3b92d9f049bb46388597a98c399cc336506db9bedac84f6d8740b781c988ffe6
// expected 200 status code
public class CreateNotes {

    // JSON body for the POST request
    String requestBody1 = "{\n" +
    "  \"title\": \"API Testing\",\n" +
    "  \"description\": \"API Testing using RestAssured\",\n" +
    "  \"category\": \"Work\"\n" +
    "}";

    @Test
    public void createNotes1(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .header("x-auth-token","3b92d9f049bb46388597a98c399cc336506db9bedac84f6d8740b781c988ffe6")
                                .body(requestBody1)
                            .when()
                                .post("/notes")
                            .then()
                                .statusCode(200) // Check the status code
                                .body("success", equalTo(true)) // Check the success field
                                .body("message", equalTo("Note successfully created")) // Check the message field
                                .extract().response();
        System.out.println(response.asString());
    }

    // JSON body for the POST request
    String requestBody2 = "{\n" +
    "  \"title\": \"JAVA Programming made Easy\",\n" +
    "  \"description\": \"Basics to Advanced JAVA\",\n" +
    "  \"category\": \"Home\"\n" +
    "}";

    @Test
    public void createNotes2(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .header("x-auth-token","3b92d9f049bb46388597a98c399cc336506db9bedac84f6d8740b781c988ffe6")
                                .body(requestBody2)
                            .when()
                                .post("/notes")
                            .then()
                                .statusCode(200) // Check the status code
                                .body("success", equalTo(true)) // Check the success field
                                .body("message", equalTo("Note successfully created")) // Check the message field
                                .extract().response();
        System.out.println(response.asString());
    }

    // JSON body for the POST request
    String requestBody3 = "{\n" +
    "  \"title\": \"AI/ML for Intermediate Learners\",\n" +
    "  \"description\": \"Advanced AI/ML/DL for Professionals \",\n" +
    "  \"category\": \"Home\"\n" +
    "}";

    @Test
    public void createNotes3(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        Response response = given()
                                .header("Content-Type", "application/json")
                                .header("x-auth-token","3b92d9f049bb46388597a98c399cc336506db9bedac84f6d8740b781c988ffe6")
                                .body(requestBody3)
                            .when()
                                .post("/notes")
                            .then()
                                .statusCode(200) // Check the status code
                                .body("success", equalTo(true)) // Check the success field
                                .body("message", equalTo("Note successfully created")) // Check the message field
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}