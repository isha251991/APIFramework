package org.testing.utilities;

import java.util.regex.Pattern;

public class VariableReplacement {
	
	public static String replaceVariable(String data,String variableName, String replaceValue) {
		String replacedData=data.replaceAll(Pattern.quote("{{"+variableName+"}}"), replaceValue);
		System.out.println("Data after variable replacement is");
		System.out.println(replacedData);
		return replacedData;
	}

}
