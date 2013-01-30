package com.xedge.jquery.client.handlers;

public abstract class ReturnStringGetIndexValueHandler {
	public  abstract String getValue(int index,String originalValue);
	
	static public String fire(ReturnStringGetIndexValueHandler callback,int index,String originalValue) {
		return callback.getValue(index,originalValue);
	}
}