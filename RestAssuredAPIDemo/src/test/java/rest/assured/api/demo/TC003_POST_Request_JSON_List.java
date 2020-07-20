package rest.assured.api.demo;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC003_POST_Request_JSON_List {

	String[] courseNames = { "Python55", "Java55", "C++55" };

	@Test
	void demo() {
		
		// base URI 
		RestAssured.baseURI = "http://localhost:7022";
		
		// request object 
		RequestSpecification httpRequest = RestAssured.given();
		
		
		List<JSONObject> jsonObjects = new ArrayList<>();  
		for (int i = 0; i < courseNames.length; i++) {
			JSONObject obj = new JSONObject(); 
			obj.put("courseName", courseNames[i]);
			jsonObjects.add(obj);
		}
		
		httpRequest.header("Content-Type", "application/json");
		httpRequest.body(jsonObjects.toString());
		Response response = httpRequest.request(Method.POST, "/addCourses");

		String responseBody = response.getBody().asString();
		System.out.println("Response body is: " + responseBody); 
		
		int statusCode = response.getStatusCode(); 
		Assert.assertEquals(statusCode, 200); 

	}
}
