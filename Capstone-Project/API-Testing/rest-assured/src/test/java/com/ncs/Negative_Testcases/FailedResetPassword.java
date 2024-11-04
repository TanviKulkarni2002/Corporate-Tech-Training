package com.ncs.Negative_Testcases;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class FailedResetPassword {

    @Test
    public void failedResetPasscode1() {
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        String requestBody1 = "{\n" +
                "  \"currentPassword\": \"\",\n" +
                "  \"newPassword\": \"\"\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("x-auth-token", "e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e")
                .body(requestBody1)
                .when()
                .post("/users/reset-password")
                .then()
                .statusCode(400) // Check the status code
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("New password must be between 6 and 30 characters")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }

    @Test
    public void failedResetPasscode2() {
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        String requestBody2 = "{\n" +
                "  \"currentPassword\": \"demo-abc@123\",\n" +
                "  \"newPassword\": \"\"\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .header("x-auth-token", "e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e")

                .body(requestBody2)
                .when()
                .post("/users/reset-password")
                .then()
                .statusCode(400) // Check the status code
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("New password must be between 6 and 30 characters")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }

    // x-auth-token not given
    @Test
    public void failedResetPasscode3() {
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        String requestBody3 = "{\n" +
                "  \"currentPassword\": \"\",\n" +
                "  \"newPassword\": \"MarvelWorld@123\"\n" +
                "}";

        Response response = given()
                .header("Content-Type", "application/json")
                .body(requestBody3)
                .when()
                .post("/users/reset-password")
                .then()
                .statusCode(400) // Check the status code
                .body("success", equalTo(false)) // Check the success field
                .body("message", equalTo("Token must be between 64 characters")) // Check the message field
                .extract().response();
        System.out.println(response.prettyPrint());
    }

    @Test
    public void failedResetPasscode4() {
        RestAssured.baseURI = "https://practice.expandtesting.com/notes/api";
        String requestBody4 = "{\n" +
                            "  \"currentPassword\": \"\",\n" +
                            "  \"newPassword\": \"MarvelWorld@123\"\n" +
                            "}";

        Response response = given()
                                .header("Content-Type", "application/json")
                                .header("x-auth-token", "e0ec6f5194d54951aac8210638bcef0f825fbd405bec4f6197f4d56cc58c437e")
                                .body(requestBody4)
                            .when()
                                .post("/users/reset-password")
                            .then()
                                .statusCode(400) // Check the status code
                                .body("success", equalTo(false)) // Check the success field
                                .body("message", equalTo("Token must be between 64 characters")) // Check the message
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
