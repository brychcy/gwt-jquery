package com.xedge.jquery.client.model;

import com.google.gwt.core.client.JavaScriptObject;

public class NameValuePair extends JavaScriptObject {
	protected NameValuePair() {
	}

	public static native NameValuePair create() /*-{
		var obj = {};		
		return obj;
	}-*/;
	
public final native String getName() /*-{
	return this.name;
}-*/;


public final native void setName(String name) /*-{
	this.name=name;
}-*/;

public final native String getValue() /*-{
return this.value;
}-*/;


public final native void setValue(String value) /*-{
this.value=value;
}-*/;
}
