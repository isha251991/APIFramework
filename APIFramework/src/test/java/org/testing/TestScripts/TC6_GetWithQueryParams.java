package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.jsonParsingUsingOrgJson;

import io.restassured.response.Response;

public class TC6_GetWithQueryParams {

	public void getRequestWithQueryParams() throws FileNotFoundException, IOException {
		Properties loadURIPropertiesFile=LoadPropertiesFile.loadPropertyFile("../APIFramework/URI.properties");
		HTTPMethods httpMethods=new HTTPMethods(loadURIPropertiesFile);
		Response rs=httpMethods.getRequestWithQueryParams("DUMMY_API_EMPLOYEE", "10", "1001");
		jsonParsingUsingOrgJson.getAllKeyOccurences(rs.asString(), "id");
		
	}
}
