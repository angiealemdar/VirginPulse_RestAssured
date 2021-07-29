package petTests;
import io.restassured.http.ContentType;
import test_util.PetNoAuthBasePage;
import org.junit.jupiter.api.*;
import java.io.File;
import static io.restassured.RestAssured.* ;


public class CreatePetWithExternalFile extends PetNoAuthBasePage {
    @DisplayName("POST /pets with external file")
    @Test
    public void testPostDataWithJsonFileAsBody(){


        File jsonFile = new File("singlePetSchema.json");

        given()
                .log().all()
                .contentType(ContentType.JSON)
                .body(jsonFile).
                when()
                .post("/pet").
                then()
                .log().all()
                .statusCode(200)
        ;


    }

}
