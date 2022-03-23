package org.testing.runner;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testing.TestScripts.TC2_GetRequest;
import org.testing.TestScripts.TC3_GetAllRequest;
import org.testing.TestScripts.TC5_DeleteRequest;
import org.testing.TestScripts.TC_1PostRequest;
import org.testing.TestScripts.TC_4PutRequest;

public class Runner {
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		new TC_1PostRequest().postRequest();
		new TC2_GetRequest().getRequest();
		new TC3_GetAllRequest().getAllRequest();
		new TC_4PutRequest().putRequest();
		new TC5_DeleteRequest().deleteRequest();
	}

}
