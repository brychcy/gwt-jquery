package com.xedge.jquery.client.handlers;


	public abstract class ConverterHandler {
		public  abstract String convertData(String data);
		
		static public String fire(ConverterHandler callback,String data) {
			return callback.convertData(data);
		}
	}