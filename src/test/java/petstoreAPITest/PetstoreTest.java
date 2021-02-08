package petstoreAPITest;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import modelsHW.PetHW;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;

public class PetstoreTest {
    @BeforeMethod
    public void startUp(){

    }
    @Test
    public void getPetById() {
        Response response =
            given()
                .baseUri("https://petstore.swagger.io/v2/")
                .basePath("pet/100")
            .when()
                .get()
            .then()
                .statusCode(200)
                .extract()
                .response();
        Assert.assertNotNull(response);
//        String responseStr = response.asPrettyString();
//        System.out.println(responseStr);
//        JsonPath jsonPath = response.jsonPath();
//        PetHW petResponse = jsonPath.getObject("$",PetHW.class);
//        Assert.assertEquals(petResponse.getName(), "testcategory");
    }
}



