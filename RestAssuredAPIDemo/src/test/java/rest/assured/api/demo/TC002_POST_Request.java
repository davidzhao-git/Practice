package rest.assured.api.demo;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request {

	@Test
	void testOneJSONObjectPOSTRequest() {
		
		// Base URI 
		RestAssured.baseURI = "http://localhost:7022";
		
		// Request object 
		RequestSpecification httpRequest = RestAssured.given();
				
		// prepare POST request 
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("courseName", "Python100");
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(jsonObject.toJSONString());
		
		// send a POST request and receive a response from server 
		Response response = httpRequest.request(Method.POST, "/addCourse");
		
		
		String responseBody = response.getBody().asString();
		System.out.println("Response body is: " + responseBody); 
		
		int statusCode = response.getStatusCode(); 
		Assert.assertEquals(statusCode, 200); 
	}
}
