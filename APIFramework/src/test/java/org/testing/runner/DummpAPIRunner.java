package org.testing.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testing.TestScripts.TC10_DeleteEmployeeDummyrest;
import org.testing.TestScripts.TC6_GetWithQueryParams;
import org.testing.TestScripts.TC7_DummyRestAPIPost;
import org.testing.TestScripts.TC8_getAllDummyRest;
import org.testing.TestScripts.TC9_getOneEmployeeDummyRest;

public class DummpAPIRunner {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		//new TC6_GetWithQueryParams().getRequestWithQueryParams();
		//new TC7_DummyRestAPIPost().PostDummyRestAPI();
		//new TC8_getAllDummyRest().getAllRequest();
		//new TC9_getOneEmployeeDummyRest().getOneEmployee();
		new TC10_DeleteEmployeeDummyrest().deleteEmployee();
		new TC8_getAllDummyRest().getAllRequest();
		
		
	}

}
