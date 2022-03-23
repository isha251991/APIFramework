package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.jsonParsingUsingOrgJson;

import io.restassured.response.Response;

public class TC7_DummyRestAPIPost {
	

	public void PostDummyRestAPI() throws FileNotFoundException, IOException{
		Properties loadURIPropertiesFile=LoadPropertiesFile.loadPropertyFile("../APIFramework/URI.properties");
		String inputData=LoadJsonFile.loadJsonFile("../APIFramework/src/test/java/org/testing/resources/dummyRestBodyData.json");
		HTTPMethods httpMethods=new HTTPMethods(loadURIPropertiesFile);
		Response rs=httpMethods.postMethod("DUMMY_RESTAPI", inputData, "create");
		System.out.println("Status Message Received is "+jsonParsingUsingOrgJson.parseResponseAndgetKeyValue(rs.asString(), "status"));
	}
}
