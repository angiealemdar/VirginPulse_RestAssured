package petTests;
import org.junit.jupiter.api.*;
import pojo.Category;
import pojo.PetId;
import pojo.Tags;
import test_util.PetNoAuthBasePage;
import java.util.Arrays;
import static io.restassured.RestAssured.* ;
import static org.hamcrest.Matchers.* ;
@DisplayName("adding data by pojo")
public class CreatePet extends PetNoAuthBasePage{
    @DisplayName("By nested pojo")
    @Test
    public void testPostDataWithStringBody(){

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
                .body(pet1).
        when()
                .post("/pet").
        then()
                .log().all()
                .statusCode(is(200));





    }
}
