package com.xedge.jquery.client.handlers;


public abstract class ReturnStringGetDataAndTypeHandler {
	public  abstract String getFilteredData(String data,String dataType);
	
	static public String fire(ReturnStringGetDataAndTypeHandler callback,String data,String dataType) {
		return callback.getFilteredData(data,dataType);
	}
}