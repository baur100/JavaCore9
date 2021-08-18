package koelApi;

import com.github.javafaker.Faker;
import helpers.TestDataGenerator;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import models.CreatePlaylistRequest;
import models.CreatePlaylistResponse;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PlaylistTest {
    private int playlistId;
    private String token;
    private String plName;
    @BeforeMethod
    public void createNewPlaylist(){
        token = TestDataGenerator.getToken();
        Faker faker = new Faker();
        plName = faker.artist().name();
        System.out.println(plName);
        CreatePlaylistRequest pl = new CreatePlaylistRequest(plName);
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist")
                        .header("Content-Type","application/json")
                        .header("Authorization",token)
                        .body(pl)
                        .when()
                        .post()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        playlistId = jsonPath.getInt("id");
        System.out.println(playlistId);
    }
    @AfterMethod
    public void tearDown(){
        given()
                .baseUri("https://bbb.testpro.io/")
                .basePath("api/playlist"+playlistId)
                .header("Authorization",token)
                .when()
                .delete();
    }
    @Test
    public void test(){
        Response response =
                given()
                        .baseUri("https://bbb.testpro.io/")
                        .basePath("api/playlist")
                        .header("Authorization",token)
                        .when()
                        .get()
                        .then()
                        .statusCode(200)
                        .extract()
                        .response();
        JsonPath jsonPath = response.jsonPath();
        CreatePlaylistResponse[] playlists = jsonPath.getObject("$", CreatePlaylistResponse[].class);
        int count = 0;
        for (CreatePlaylistResponse pl: playlists){
            if (pl.getId()==playlistId && pl.getName().equals(plName)){
                System.out.println(pl.getName());
                count++;
            }
        }
        Assert.assertEquals(count,1);
    }
}
