package com.xedge.jquery.client.handlers;

public abstract class SuccessHandlerWithData {
	public abstract void success(String data);
	static public void fire(SuccessHandlerWithData callback,String data) {
		 callback.success(data);
	}
}
