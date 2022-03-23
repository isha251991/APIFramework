package org.testing.utilities;

import org.json.JSONArray;
import org.json.JSONObject;

public class jsonParsingUsingOrgJson {
	
	public static String parseResponseAndgetKeyValue(String response,String key) {
		JSONObject obj=new JSONObject(response);
		return obj.get(key).toString();
	}
	
	public static void getAllKeyOccurences(String data,String key) {
		JSONArray array=new JSONArray(data);
		for(int i=0;i<array.length();i++) {
			JSONObject object=array.getJSONObject(i);
			String keyValue=object.get(key).toString();
			System.out.println(keyValue);
		}
	}

}
