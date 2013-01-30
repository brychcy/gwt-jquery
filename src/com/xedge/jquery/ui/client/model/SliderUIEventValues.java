package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

public class SliderUIEventValues extends JavaScriptObject {
	protected SliderUIEventValues() {
	}

	public static native SliderUIEventValues create() /*-{
		return {};
	}-*/;

	/**
	 * DOMElement - the current focused handle
	 * @return
	 */
	public final native Element getHandle() /*-{
	return this.handle  ;
}-*/;

	/**
	 * Integer - the current handle's value
	 * @return
	 */
	public final native int getValue() /*-{
	return this.value  ;
}-*/;	
}
