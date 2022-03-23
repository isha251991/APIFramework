package org.testing.TestScripts;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testing.TestSteps.HTTPMethods;
import org.testing.utilities.LoadJsonFile;
import org.testing.utilities.LoadPropertiesFile;
import org.testing.utilities.VariableReplacement;

import io.restassured.response.Response;

public class TC9_getOneEmployeeDummyRest {
	
	public void getOneEmployee() throws FileNotFoundException, IOException {
		Properties loadURIPropertiesFile=LoadPropertiesFile.loadPropertyFile("../APIFramework/URI.properties");
		HTTPMethods httpMethods=new HTTPMethods(loadURIPropertiesFile);
		String enpoint=VariableReplacement.replaceVariable("employee/{{id}}", "id", "2");
		Response rs=httpMethods.getMethod("DUMMY_RESTAPI", enpoint);
		System.out.println("Employee Data is");
		System.out.println(rs.asPrettyString());
	}

}
