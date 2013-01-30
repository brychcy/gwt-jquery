package com.xedge.jquery.client.handlers;

import com.google.gwt.xhr.client.XMLHttpRequest;


public abstract class XHRHandler {
	public  abstract XMLHttpRequest xhr();
	static public XMLHttpRequest fire(XHRHandler callback) {
		return callback.xhr();
	}
}