package com.ncs.Positive_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

// x-auth-token: 3b92d9f049bb46388597a98c399cc336506db9bedac84f6d8740b781c988ffe6
// expected 200 status code
public class UpdateNotesById {

    String requestBody = "{\n" +
    "  \"id\": \"670ab7b9a27c690158be388a\",\n" +
    "  \"title\": \"API Testing\",\n" +
    "  \"description\": \"API Testing using RestAssured\",\n" +
    "  \"completed\": \"true\",\n" +
    "  \"category\": \"Work\"\n" +
    "}";


    @Test
    public void updateNotesById(){
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        String noteId = "670ab7b9a27c690158be388a"; // Note ID to update

        Response response = given()
                                .header("Content-Type", "application/json")
                                .header("x-auth-token", "3b92d9f049bb46388597a98c399cc336506db9bedac84f6d8740b781c988ffe6")
                                .body(requestBody)
                            .when()
                                .put("/notes/{id}", noteId)
                            .then()
                                .statusCode(200) // Check the status code
                                .body("success", equalTo(true)) // Check the success field
                                .body("message", equalTo("Note successfully Updated")) // Check the message field
                                .extract().response();

        System.out.println(response.prettyPrint());
    }
}
