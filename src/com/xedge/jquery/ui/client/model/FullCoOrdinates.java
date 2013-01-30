package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;

public class FullCoOrdinates extends JavaScriptObject {
	protected FullCoOrdinates() {
	}

	public static native FullCoOrdinates create() /*-{
		var obj = {};	
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

public final native int getRight() /*-{
return this.right;
}-*/;


public final native void setRight(int right) /*-{
this.right=right;
}-*/;

public final native int getBottom() /*-{
return this.bottom;
}-*/;


public final native void setBottom(int bottom) /*-{
this.bottom=bottom;
}-*/;
}
