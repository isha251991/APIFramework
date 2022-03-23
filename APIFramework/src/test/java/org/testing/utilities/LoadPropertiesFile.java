package org.testing.utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LoadPropertiesFile {

	public static Properties loadPropertyFile(String path) throws FileNotFoundException, IOException {//generic method for loading any properties file	
		File file=new File(path);
		Properties pr=new Properties();
		pr.load(new FileReader(file));
		return pr;
		
	}
}
