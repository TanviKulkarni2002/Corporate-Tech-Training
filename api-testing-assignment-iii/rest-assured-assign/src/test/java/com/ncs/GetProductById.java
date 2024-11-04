package com.ncs;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class GetProductById {

    @Test
    public void getProductById(){
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "https://dummyjson.com";
        Response response = given()
                                .header("Content-Type","application/json")
                            .when()
                                .get("/products/1")
                            .then()
                                .statusCode(200)
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
