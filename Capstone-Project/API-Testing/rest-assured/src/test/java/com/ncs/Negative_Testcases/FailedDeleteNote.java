package com.ncs.Negative_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class FailedDeleteNote {
    
    // wrong id entered
    @Test
    public void failedDeleteNote1(){
        String requestBody = "{\n" +
                "  \"id\": \"wrong-id-here\"\n" +
                "}";

        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("x-auth-token", "e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e")
                .body(requestBody)
                .when()
                .delete("/notes/wrong-id-here")
                .then()
                .statusCode(400)
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("Note ID must be a valid ID" + //
                                        "")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }

    // x-auth-token not given in header
    @Test
    public void failedDeleteNote2(){
        String requestBody = "{\n" +
                "  \"id\": \"670ab7f1a27c690158be389e\",\n" +
                "  \"completed\": \"\"\n" +
                "}";

        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody)
                .when()
                .delete("/notes/670ab7f1a27c690158be389e")
                .then()
                .statusCode(401)
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("No authentication token specified in x-auth-token header")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }

}
