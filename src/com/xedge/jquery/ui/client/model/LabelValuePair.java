package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;

public class LabelValuePair extends JavaScriptObject {
	protected LabelValuePair() {
	}

	public static native LabelValuePair create(String label,String value) /*-{
		var obj = {};		
		obj.label=label;
		obj.value=value;
		return obj;
	}-*/;

	
	public final native String getLabel() /*-{
		return this.label;
	}-*/;

	public final native void setLabel(String label) /*-{
		this.label=label;
	}-*/;

	public final native String getValue() /*-{
		return this.value;
	}-*/;

	public final native void setValue(String value) /*-{
		this.value=value;
	}-*/;
}
