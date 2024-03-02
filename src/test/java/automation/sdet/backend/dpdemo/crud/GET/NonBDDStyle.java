package automation.sdet.backend.dpdemo.crud.GET;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class NonBDDStyle {

	public static void main(String[] args) {
		
		// GET Request
	    // BDD style and Non BDD Style

	    // given, when. then () . builder pattern

	    // https://restful-booker.herokuapp.com/booking/1
		
	
		RequestSpecification r = RestAssured.given();
		r.baseUri("https://restful-booker.herokuapp.com/booking/");
		r.basePath("booking/2752").log().all();
		Response response =	r.when().log().all().get();
		response.then().log().all().statusCode(404);
	
		
		
		
		
		RequestSpecification r2 = RestAssured.given();
		r2.baseUri("https://restful-booker.herokuapp.com/");
		r2.basePath("booking/2840");
		Response res = r2.when().get();
		res.then().log().all().statusCode(200);
		
		

	}

}
