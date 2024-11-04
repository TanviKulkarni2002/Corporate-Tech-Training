package com.ncs;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Authentication {    
    String requestBody = "{ \"username\": \"emilys\", \"password\": \"emilyspass\" }";
    @Test
    public void authenticate(){
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "https://dummyjson.com";
        Response response = given()
                                .header("Content-Type","application/json")
                                .body(requestBody)
                            .when()
                                .post("/auth/login")
                            .then()
                                .statusCode(200)
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
