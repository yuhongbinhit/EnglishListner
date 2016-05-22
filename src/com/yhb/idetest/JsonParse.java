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
			System.out.println("data length:"+weatherinfo.length());
			Iterator it = weatherinfo.keys();
			while(it.hasNext()){
				System.out.println("In JsonParse-"+it.next()+":"+ weatherinfo.getString((String) it.next()));
				map.put((String)it.next(), weatherinfo.getString((String) it.next()));
			}
		} catch (JSONException e) {
			e.printStackTrace();
			return null;
		}
		return map;
	}
}
