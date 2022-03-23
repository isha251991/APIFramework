package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;

public class TC5_DeleteRequest {
	
	public void deleteRequest() throws FileNotFoundException, IOException {
		
		Properties loadURIPropertiesFile=LoadPropertiesFile.loadPropertyFile("../APIFramework/URI.properties");
		HTTPMethods httpMethods=new HTTPMethods(loadURIPropertiesFile);
		httpMethods.deleteRequest("QA_URI_Automation", TC_1PostRequest.responseID);
		
	}
	
	
	

}
