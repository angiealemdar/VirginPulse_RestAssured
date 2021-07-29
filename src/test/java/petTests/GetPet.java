package petTests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import test_util.PetNoAuthBasePage;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class GetPet extends PetNoAuthBasePage {
    @DisplayName("Verifying the GET / response directly in the chain")
    @Test
    public void testOnePetInOneShot(){


        given()
                .log().all()

        .when()
                .get("/pet/1").
                then()
                .statusCode(200)
                .header("Content-Type", is("application/json") )
                .contentType("application/json")
                .body("name" , is(equalTo("sky") ))


        ;


    }

}
