package com.ncs;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class DeleteProduct {

    @Test
    public void updateProduct(){
        RestAssured.useRelaxedHTTPSValidation();
        RestAssured.baseURI = "https://dummyjson.com";
        Response response = given()
                                .header("Content-Type","application/json")
                            .when()
                                .delete("/products/1")
                            .then()
                                .statusCode(200)
                                .extract().response();
        System.out.println(response.prettyPrint());
    }
}
