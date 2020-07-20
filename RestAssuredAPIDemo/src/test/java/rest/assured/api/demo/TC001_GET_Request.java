package rest.assured.api.demo;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_GET_Request {
	
	@Test
	void testBasicGETRequest() {
		
		// Specify base URI
		RestAssured.baseURI = "http://google.com";
		
		// Request object 
		RequestSpecification httpRequest = RestAssured.given();
		
		// Response object - send a request and receive a response from server 
		Response response = httpRequest.request(Method.GET, "/");
		
		// print response in console 
		String responseBody = response.getBody().asString();
		System.out.println("Response body is: " + responseBody);
		
		// Status code validation
		int statusCode = response.getStatusCode();
		System.out.println("Status code is: " + statusCode);
		int expectedStatusCode = 200; 
		Assert.assertEquals(statusCode, expectedStatusCode);
		
	}
}