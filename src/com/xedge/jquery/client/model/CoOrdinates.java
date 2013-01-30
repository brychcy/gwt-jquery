package com.xedge.jquery.client.model;

import com.google.gwt.core.client.JavaScriptObject;

public class CoOrdinates extends JavaScriptObject {
	protected CoOrdinates() {
	}

	public static native CoOrdinates create(int top,int left) /*-{
		var obj = {};
	    obj.top=top;
	    obj.left=left;			
		return obj;
	}-*/;
	
public final native int getTop() /*-{
	return this.top;
}-*/;


public final native void setTop(int top) /*-{
	this.top=top;
}-*/;

public final native int getLeft() /*-{
return this.left;
}-*/;


public final native void setLeft(int left) /*-{
this.left=left;
}-*/;
}
