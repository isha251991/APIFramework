package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.json.JSONArray;
import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.jsonParsingUsingOrgJson;

import io.restassured.response.Response;

public class TC3_GetAllRequest {

	public void getAllRequest() throws FileNotFoundException, IOException {
		Properties loadURIPropertiesFile=LoadPropertiesFile.loadPropertyFile("../APIFramework/URI.properties");
		HTTPMethods httpMethod=new HTTPMethods(loadURIPropertiesFile);
		Response rs=httpMethod.getAllRecords("QA_URI_Automation");
		jsonParsingUsingOrgJson.getAllKeyOccurences(rs.asString(), "id");
		
	}
}
