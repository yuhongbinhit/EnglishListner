package com.yhb.idetest;

public interface HttpCallbackListener {

	public void onFinish(String response);

	void onError(Exception e);

}
