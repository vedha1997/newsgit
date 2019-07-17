package restAssured1;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetInfo 
{
	//@Test
	public void GetData()
	{
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/todos";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/1");
		String responseBody = response.getBody().asString();
		System.out.println("This is response body:" +responseBody);

		int statusCode = response.getStatusCode();
		System.out.println("the status code is  " + statusCode);
		Assert.assertEquals(statusCode,200);
		String statusLine = response.getStatusLine();
		System.out.println("the status line is " +  statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}



	//@Test
	public void postData() {
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com/todos";

		RequestSpecification httpRequest2 = RestAssured.given();

		JSONObject requestparams = new JSONObject();
		requestparams.put("name :", "vedha");
		requestparams.put("salary :", "23300000");
		requestparams.put("age :", "21");
		requestparams.put("id :", "536");

		httpRequest2.header("Content -type","application/json");
		httpRequest2.body(requestparams.toJSONString());
		Response response2 = httpRequest2.request(Method.POST );
		String responseBody2 = response2.getBody().asString();
		System.out.println("the status line is " + responseBody2	);
		int statusCode2 = response2.getStatusCode();
		System.out.println("the status code is  :"  + statusCode2 );
		//Assert.assertEquals(statusCode2,200);
		String statusLine2 = response2.getStatusLine();
		//Assert.assertEquals(statusLine2, "HTTP/1.1 200 OK");
		String successCode = response2.jsonPath().get("Success");
		//Assert.assertEquals(successCode,"operation_sucees");



	}

	@Test
	public void test2() throws ParseException {
		String expectedFirstName = "Janet";
		String expectedLastName = "Weaver";
		String expectedEmail = "janet.weaver@reqres.in";
		
		String requestUrl = "https://reqres.in/api/users/2";
		RestAssured.baseURI = requestUrl;
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET );
		String responseBody = response.getBody().asString();
		System.out.println("responseBody:"+responseBody);
		
		
		JSONParser parser = new JSONParser();
		JSONObject responseObject = (JSONObject) parser.parse(responseBody);
		JSONObject data = (JSONObject) responseObject.get("data");
		String firstName = (String) data.get("first_name");
		String lastName = (String) data.get("last_name");
		String email = (String) data.get("email");

		
		System.out.println("FirstName::"+firstName);
		
		//TODO: your code here
		
		
		
		String actualFirstName = firstName;	
		
		//parse this from your response;
		String actualLastName = lastName;		//parse this from your response;
		String actualEmail = email;		//parse this from your response;
		
		 
		Assert.assertEquals(actualFirstName, expectedFirstName, "Verifying first name");
		System.out.println("assertion passed"  + actualFirstName  + expectedFirstName );
		Assert.assertEquals(actualLastName, expectedLastName, "Verifying last name");
		System.out.println("assertion passed"  + actualLastName  + expectedLastName );
		Assert.assertEquals(actualEmail, expectedEmail, "Verifying email ");
		System.out.println("assertion passed"  + actualEmail  + expectedEmail );

		
	}

}
