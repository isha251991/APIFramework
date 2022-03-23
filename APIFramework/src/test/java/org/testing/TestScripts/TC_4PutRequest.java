package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.VariableReplacement;
import org.testing.utilities.randomValueGenerator;

import io.restassured.response.Response;

public class TC_4PutRequest {
	
	public void putRequest() throws FileNotFoundException, IOException {
		Properties loadURIPropertiesFile=LoadPropertiesFile.loadPropertyFile("../APIFramework/URI.properties");
		String inputData=LoadJsonFile.loadJsonFile("../APIFramework/src/test/java/org/testing/resources/updatebodyData.json");
		String updatedbodyData=VariableReplacement.replaceVariable(inputData, "id", TC_1PostRequest.responseID);
		HTTPMethods httpMethod=new HTTPMethods(loadURIPropertiesFile);
		Response rs=httpMethod.putRequest("QA_URI_Automation", updatedbodyData, TC_1PostRequest.responseID);
		System.out.println("Response of Put Request is"+rs.statusCode());
		
	}
}
