package com.xedge.jquery.client.handlers;

public abstract class ReturnIntegerGetIndexValueHandler {
	public  abstract int getValue(int index,int originalValue);
	
	static public int fire(ReturnIntegerGetIndexValueHandler callback,int index,int originalValue) {
		return callback.getValue(index,originalValue);
	}
}