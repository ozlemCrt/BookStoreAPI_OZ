package com.bookstore.services;

import com.bookstore.utilities.Globals;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;

import java.util.List;

public class GetAllBooks extends Globals {
    public void getAllBooks(){
        response= RestAssured
                .given()
                .accept(ContentType.JSON)
                .when().log().all()
                .get("/BookStore/v1/Books")
                .prettyPeek();

    }
    public void validateThatAllBooksAreListed(){
        Assert.assertEquals(response.statusCode(),200);
        //assert that all isbn numbers have value
        JsonPath jsonPath=response.jsonPath();
        List<String> list = jsonPath.getList("books.isbn");
        //listin tüm üyeleri dolu mu
        list.forEach(n->Assert.assertNotNull(n));

        isbnNumbers=jsonPath.getList("books.isbn");
    }

}
