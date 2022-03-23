package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class LoadJsonFile {
	
	public static String loadJsonFile(String path) throws FileNotFoundException {
		//read the data from json file and return data as string
		File file=new File(path);
		JSONTokener jsonTokener=new JSONTokener(new FileReader(file));
		JSONObject jsonobj=new JSONObject(jsonTokener);
		return jsonobj.toString();
	}
	
	
	
	
	
	

}
