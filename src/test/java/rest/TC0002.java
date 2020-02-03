package rest;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import constants.GenericConstants;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TC0002 {
	
	@Test
	public void TC0001_getProducts() {
		RestAssured.baseURI  = GenericConstants.getBaseRest();
		given().
			contentType(ContentType.JSON).
		when().
			queryParam("q", "samsung s8").
			get("/MLA/search").
			
		then().
			assertThat().
			statusCode(200).
			contentType("application/json").
			body("paging.'total'", equalTo("1405")).
			log().all();
		
		
	}

}