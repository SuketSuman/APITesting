import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class AddEmployee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RestAssured.baseURI= "http://dummy.restapiexample.com";
		RequestSpecification res = given().header("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("src\\test\\java\\emp.json").toAbsolutePath())));
		Response response =res.when().post("api/v1/create")
		.then().extract().response();
	
	}

}
