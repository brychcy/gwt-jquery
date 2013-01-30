package com.xedge.jquery.client.handlers;

import com.google.gwt.dom.client.Element;
public abstract class ReturnStringGetIndexElementHandler {
	public  abstract String getValue(int index,Element element);
	
	static public String fire(ReturnStringGetIndexElementHandler callback,int index,Element element) {
		return callback.getValue(index, element);
	}
}
