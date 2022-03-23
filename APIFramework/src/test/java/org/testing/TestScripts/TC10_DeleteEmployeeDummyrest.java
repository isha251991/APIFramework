package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.VariableReplacement;

import io.restassured.response.Response;

public class TC10_DeleteEmployeeDummyrest {
	
	public void deleteEmployee() throws FileNotFoundException, IOException {
		Properties loadURIPropertiesFile=LoadPropertiesFile.loadPropertyFile("../APIFramework/URI.properties");
		HTTPMethods httpMethods=new HTTPMethods(loadURIPropertiesFile);
		String enpoint=VariableReplacement.replaceVariable("delete/{{id}}", "id", "2");
		httpMethods.deleteRequest("DUMMY_RESTAPI", enpoint);
		System.out.println("Employee is deleted");
	}

}
