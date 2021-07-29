package petTests;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;
import pojo.Category;
import pojo.PetId;
import pojo.Tags;
import test_util.PetNoAuthBasePage;

import java.io.File;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;
@DisplayName("Testing adding data multiple way")
public class CreatePet extends PetNoAuthBasePage{
    @DisplayName("By nested ")
    @Test
    public void testPostDataWithStringBody(){
        /*
        {
    "id": 6,
    "category": {
        "id": 3,
        "name": "bats"
    },
    "name": "rexy",
    "photoUrls": [
        "string"
    ],
    "tags": [
        {
            "id": 0,
            "name": "my_pet"
        }
    ],
    "status": "sold"

}
         */
        PetId pet1=new PetId();
        Category category1=new Category();
        Tags tags1=new Tags();

        pet1.setId(1);
        category1.setId(0);
        category1.setName("Dog");
        pet1.setName("Magic");
        pet1.setPhotoUrls(Arrays.asList("https://post.medicalnewstoday.com/wp-content/uploads/sites/3/2020/02/322868_1100-800x825.jpg"));
        tags1.setName("mine");
        pet1.setTags(Arrays.asList(tags1));
        pet1.setCategory(category1);
        pet1.setStatus("loved");

        given()
                .log().all()
                .header("Content-Type", "application/json")
       //  OR   .contentType("application/json")
        //  OR  .contentType( ContentType.JSON)
      .body(pet1).
        when()
                .post("/pet").
        then()
                .log().all()
                .statusCode(is(200));





    }
}
