package com.yhb.idetest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.json.JSONException;
import org.json.JSONObject;

public class JsonParse {
	public  static Map<String,String> jsonParseMethod(String result){
		Map<String,String> map = new HashMap<String,String>();
		try {
			JSONObject jsonObject = new JSONObject(result);
			JSONObject weatherinfo = jsonObject.getJSONObject("weatherinfo");
//			System.out.println(weatherinfo.get("city"));
//			System.out.println("data length:"+weatherinfo.length());
			Iterator<String> it = weatherinfo.keys();
			while(it.hasNext()){
				String key = it.next();
				String value = weatherinfo.getString(key); 
				map.put(key, value);
//				System.out.println("in JsonParse"+map.get(key));
//				System.out.println("In JsonParse-"+it.next());
//				map.put((String)it.next(), weatherinfo.getString((String) it.next()));
			}
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
		return map;
	}
}
