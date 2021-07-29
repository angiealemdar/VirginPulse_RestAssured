package petTests;


import org.junit.jupiter.api.*;
import test_util.PetNoAuthBasePage;
import static io.restassured.RestAssured.* ;


public class PetSystemCheck extends PetNoAuthBasePage {
    @DisplayName("Pet system testing hard coded param")
    @Test
    public void testSystem(){
        get("/pet/6").prettyPeek().
        then().statusCode(200);

    }
    @DisplayName("Pet system negative testing double number ")
    @Test
    public void testSystemNegative(){
        get("/pet/20.5").prettyPeek()
        .then().statusCode(200);
        //statusCode must be 404
    }
    @DisplayName("Pet system negative testing invalid header ")
    @Test
    public void testSystemInvalid(){
        get("/human/20.5").prettyPeek().
                then().statusCode(200);
        //statusCode must be 404

    }



}
