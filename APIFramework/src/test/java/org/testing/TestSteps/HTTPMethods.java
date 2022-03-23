package org.testing.TestSteps;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import java.util.Properties;

import org.apache.http.entity.mime.content.StringBody;

import io.restassured.http.ContentType;

public class HTTPMethods {
	
	Properties pr;
	
	public HTTPMethods(Properties pr) {
		
		this.pr=pr;
		
	}
	
	public Response postMethod(String uriKey, String bodyData,String endPoint) {
		String URI=null;
		if(endPoint!=null){
			URI=pr.getProperty(uriKey)+"/"+endPoint;	
		}
		else
			URI=pr.getProperty(uriKey);
		Response rs=given().contentType(ContentType.JSON).body(bodyData)
				.when().post(URI);
		System.out.println("Post status code is"+rs.statusCode());
		return rs;
	}
	
	public Response getMethod(String uriKey,String endPoint) {
		String URI=pr.getProperty(uriKey)+"/"+endPoint;
		Response rs=given().contentType(ContentType.JSON)
				.when().get(URI);
		System.out.println("Get status code is"+rs.statusCode());
		return rs;
	}
	
	public Response getAllRecords(String urikey) {
		Response rs=given().contentType(ContentType.JSON)
				.when().get(pr.getProperty(urikey));
		System.out.println("Get All status code is"+rs.statusCode());
		return rs;
		
	}
	
	public Response putRequest(String urikey,String bodyData,String endpoint) {
		String URI=pr.getProperty(urikey)+"/"+endpoint;
		Response rs=given().contentType(ContentType.JSON).body(bodyData)
				.when().put(URI);
		System.out.println("Put status code is"+rs.statusCode());
		return rs;
		
	}
	
	public void deleteRequest(String uriKey,String endPoint) {
		String URI=pr.getProperty(uriKey)+"/"+endPoint;
		Response rs=given().contentType(ContentType.JSON)
				.when().delete(URI);
		System.out.println("Record deleted");
		System.out.println("Delete status code is"+rs.statusCode());
	}
	
	public Response getRequestWithQueryParams(String urikey,String queryParam1,String queryParam2) {
		String URI=pr.getProperty(urikey)+"?noofRecords="+queryParam1+"&idStarts="+queryParam2;
		Response rs=given().contentType(ContentType.JSON)
				.when().get(URI);
		System.out.println("Get status code with query params is"+rs.statusCode());
		return rs;
	}
	
	
}
