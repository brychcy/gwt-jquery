package com.xedge.jquery.client.handlers;


public abstract class ReturnStringGetIndexHandler {
	public  abstract String getValue(int index);
	static public String fire(ReturnStringGetIndexHandler callback,int index) {
		return callback.getValue(index);
	}
}