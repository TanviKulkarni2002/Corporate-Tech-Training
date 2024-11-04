package com.ncs;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class AddProduct {

    String requestBody= "{ \"title\": \"Pencil\" }";

    @Test
    public void addProduct(){
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "https://dummyjson.com";
        Response response = given()
                                .header("Content-Type","application/json")
                                .body(requestBody)
                            .when()
                                .post("/products/add")
                            .then()
                                .statusCode(201)
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
