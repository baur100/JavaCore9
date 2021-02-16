package helpersHW;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import modelsHW.CredentialsHW;
import myHelpers.TestObjectGenerator1;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TokenHW {
    public static String get(){
        CredentialsHW credentials = new CredentialsHW("innamammadova584@gmail.com","te$t$tudent");

        Response response = given()
                .baseUri("https://koelapp.testpro.io/")
                .basePath("api/me")
                .header("Content-Type","application/json")
                .header("Accept","application/json")
                .body(credentials)
                .when()
                .post()
                .then()
                .statusCode(200)
                .extract()
                .response();

        JsonPath jsonPath = response.jsonPath();
        return "Bearer"+ jsonPath.getString("token");


    }
}
