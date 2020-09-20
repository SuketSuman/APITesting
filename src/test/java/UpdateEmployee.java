import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

public class UpdateEmployee {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		RestAssured.baseURI= "http://dummy.restapiexample.com";
		String response = given().header("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("src\\test\\java\\emp.json").toAbsolutePath())))
		.when().post("api/v1/create")
		.then().assertThat().statusCode(200).body("message", equalTo("Successfully! Record has been added."))
		.header("Server","nginx/1.16.0").extract().response().asString();
		JsonPath jp = new JsonPath(response);
		int id = jp.getInt("data.id");
		System.out.println("Added id: " + id);
		given().header("Content-Type","application/json")
		.body(new String(Files.readAllBytes(Paths.get("src\\test\\java\\empUpd.json").toAbsolutePath())))
		.when().put("/api/v1/update/"+id+"")
		.then().log().all().assertThat().statusCode(200).body("message", equalTo("Successfully! Record has been updated."))
		.body("data.name", equalTo("testUpdate"))
		.body("data.salary", equalTo("1234"))
		.body("data.age", equalTo("33"))
		.header("Server","nginx/1.16.0");
	}

}
