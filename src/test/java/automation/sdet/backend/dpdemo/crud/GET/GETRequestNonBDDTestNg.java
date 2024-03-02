package automation.sdet.backend.dpdemo.crud.GET;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


public class GETRequestNonBDDTestNg {
	
	@Test
	
	public void getAllBooking() {
		RequestSpecification req = RestAssured.given();
		req.baseUri("https://restful-booker.herokuapp.com/");
		req.basePath("booking/2752");
		Response response = req.when().get();
		response.then().log().all().statusCode(404);

	}
	
	@Test
    public void testGetAllBookingNegative2(){
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/abc").log().all();
        r.when().get();
        r.then().log().all().statusCode(202);

    }

	 @Test(enabled = false)
	    public void testGetAllBookingPositive(){

	        RequestSpecification r = RestAssured.given();
	        r.baseUri("https://restful-booker.herokuapp.com");
	        r.basePath("/booking/2002").log().all();
	        r.when().get();
	        r.then().log().all().statusCode(200);

	    }



}
