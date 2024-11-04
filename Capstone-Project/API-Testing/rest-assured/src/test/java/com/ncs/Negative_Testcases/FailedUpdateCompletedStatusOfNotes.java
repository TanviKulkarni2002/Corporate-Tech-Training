package com.ncs.Negative_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class FailedUpdateCompletedStatusOfNotes {
    
    // wrong id entered
    @Test
    public void failedUpdateCompletedStatus1(){
        String requestBody = "{\n" +
                "  \"id\": \"wrong-id-here\",\n" +
                "  \"completed\": \"true\"\n" +
                "}";

        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("x-auth-token", "e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e")
                .body(requestBody)
                .when()
                .put("/notes/67094404e1227f0151f9fde1")
                .then()
                .statusCode(400)
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("Title must be between 4 and 100 characters" + //
                                        "")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }

    // completed status is not entered
    @Test
    public void failedUpdateCompletedStatus2(){
        String requestBody = "{\n" +
                "  \"id\": \"670ab7f1a27c690158be389e\",\n" +
                "  \"completed\": \"\"\n" +
                "}";

        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("x-auth-token", "e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e")
                .body(requestBody)
                .when()
                .put("/notes/67094404e1227f0151f9fde2")
                .then()
                .statusCode(400)
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("Title must be between 4 and 100 characters")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }

    // wrong id, and invalid completed status entered
    @Test
    public void failedUpdateCompletedStatus3(){
        String requestBody = "{\n" +
                "  \"id\": \"\",\n" +
                "  \"completed\": \"\"\n" +
                "}";

        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("x-auth-token", "e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e")
                .body(requestBody)
                .when()
                .put("/notes/670ab7f1a27c690158be389e")
                .then()
                .statusCode(400)
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("Title must be between 4 and 100 characters")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }

    // x-auth-token not entered
    @Test
    public void failedUpdateCompletedStatus4(){
        String requestBody = "{\n" +
                "  \"id\": \"enter-id-here\",\n" +
                "  \"completed\": \"true\"\n" +
                "}";

        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .put("/notes/670ab7f1a27c690158be389e")
                .then()
                .statusCode(401)
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("No authentication token specified in x-auth-token header")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }

}
