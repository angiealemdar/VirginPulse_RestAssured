package test_util;
import io.restassured.RestAssured;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

public class PetNoAuthBasePage {
    @BeforeAll
    public static void init() {

        RestAssured.baseURI = "https://petstore.swagger.io";
        RestAssured.basePath = "/v2";
    }
    @AfterAll
    public static void cleanup(){

        RestAssured.reset();

    }
}
