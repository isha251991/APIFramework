package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.jsonParsingUsingOrgJson;

import io.restassured.response.Response;

public class TC8_getAllDummyRest {
	
	
	public void getAllRequest() throws FileNotFoundException, IOException {
		String expectedMessage="Successfully! All records has been fetched.";
		Properties loadURIPropertiesFile=LoadPropertiesFile.loadPropertyFile("../APIFramework/URI.properties");
		HTTPMethods httpMethod=new HTTPMethods(loadURIPropertiesFile);
		Response rs=httpMethod.getMethod("DUMMY_RESTAPI","employees");
		String keyresponse=jsonParsingUsingOrgJson.parseResponseAndgetKeyValue(rs.asString(), "data");
		System.out.println("The IDs are:");
		jsonParsingUsingOrgJson.getAllKeyOccurences(keyresponse, "id");
		String messageReceived=jsonParsingUsingOrgJson.parseResponseAndgetKeyValue(rs.asString(), "message");
		if(expectedMessage.equals(messageReceived))
		System.out.println("Message Received is correct");	
	}
}
