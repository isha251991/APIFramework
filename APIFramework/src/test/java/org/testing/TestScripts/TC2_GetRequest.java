package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;

import io.restassured.response.Response;

public class TC2_GetRequest {
	
	public void getRequest() throws FileNotFoundException, IOException {
		Properties loadURIPropertiesFile=LoadPropertiesFile.loadPropertyFile("../APIFramework/URI.properties");
		HTTPMethods httpMethod=new HTTPMethods(loadURIPropertiesFile);
		Response rs=httpMethod.getMethod("QA_URI_Automation",TC_1PostRequest.responseID);
		System.out.println(rs.statusCode());
		System.out.println(rs.asPrettyString());
	}

}
