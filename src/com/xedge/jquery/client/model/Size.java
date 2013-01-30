package com.xedge.jquery.client.model;

import com.google.gwt.core.client.JavaScriptObject;

public class Size  extends JavaScriptObject {
	protected Size() {
	}

	public static native Size create(int width,int height) /*-{
		var obj = {};
	    obj.width=width;
	    obj.height=height;			
		return obj;
	}-*/;
	
	public final native int getWidth() /*-{
		return this.width;
	}-*/;


	public final native void setWidth(int width) /*-{
		this.width=width;
	}-*/;

	public final native int getHeight() /*-{
	return this.height;
	}-*/;


	public final native void setHeight(int height) /*-{
	this.height=height
	}-*/;
	}
