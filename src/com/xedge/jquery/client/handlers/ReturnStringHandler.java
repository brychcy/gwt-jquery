package com.xedge.jquery.client.handlers;

public abstract class ReturnStringHandler {
	public  abstract String getValue();
	static public String fire(ReturnStringHandler callback) {
		return callback.getValue();
	}
}