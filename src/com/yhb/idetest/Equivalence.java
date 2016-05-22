package com.yhb.idetest;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Equivalence {
    public static void main(String[] args) {
    	HttpUtil.sendHttpRequest("http://www.weather.com.cn/data/cityinfo/101190404.html", new HttpCallbackListener() {
			
			@Override
			public void onFinish(String response) {
				Map<String,String> cityWeatherInfo=JsonParse.jsonParseMethod(response);
				Set<String> keySet = cityWeatherInfo.keySet();
				Iterator<String> it = keySet.iterator();
				while(it.hasNext()){
					System.out.println(it.next()+":"+cityWeatherInfo.get(it.hasNext()));
				}
			}
			
			@Override
			public void onError(Exception e) {
				e.printStackTrace();
				System.out.println("Error");
			}
		});
    }
}