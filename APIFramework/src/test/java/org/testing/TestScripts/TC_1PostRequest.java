package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.jsonParsingUsingOrgJson;
import org.testing.utilities.VariableReplacement;
import org.testing.utilities.randomValueGenerator;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class TC_1PostRequest {
	
	static String responseID;
	
	@Test
	public void postRequest() throws FileNotFoundException, IOException {
		
		Properties loadURIPropertiesFile=LoadPropertiesFile.loadPropertyFile("../APIFramework/URI.properties");
		String inputData=LoadJsonFile.loadJsonFile("../APIFramework/src/test/java/org/testing/resources/bodyData.json");
		HTTPMethods postMethod=new HTTPMethods(loadURIPropertiesFile);
		String bodyData=VariableReplacement.replaceVariable(inputData, "id", randomValueGenerator.generateRandomValue());
		Response rs=postMethod.postMethod("QA_URI_Automation", bodyData,null);
		responseID=jsonParsingUsingOrgJson.parseResponseAndgetKeyValue(rs.asString(), "id");
	}
	
}
