package com.ncs;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class UpdateProduct {

    String requestBody= "{ \"title\": \"Sketch Pens\" }";

    @Test
    public void updateProduct(){
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "https://dummyjson.com";
        Response response = given()
                                .header("Content-Type","application/json")
                                .body(requestBody)
                            .when()
                                .put("/products/1")
                            .then()
                                .statusCode(200)
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
