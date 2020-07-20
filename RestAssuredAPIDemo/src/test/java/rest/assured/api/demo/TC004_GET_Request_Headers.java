package rest.assured.api.demo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC004_GET_Request_Headers {

	@Test
	void printAllHeaders() {
		
		RestAssured.baseURI = "https://www.google.com";
		
		RequestSpecification httpRequest = RestAssured.given();
		
		Response response = httpRequest.request(Method.GET, "/");
		
		Headers headers = response.getHeaders();
		for (Header header : headers) {
			System.out.println(header.getName() + "\t\t" + header.getValue());
		}
	}
}
