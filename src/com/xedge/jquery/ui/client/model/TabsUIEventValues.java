package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.user.client.Element;

public class TabsUIEventValues  extends JavaScriptObject {
	protected TabsUIEventValues() {
	}

	public static native TabsUIEventValues create() /*-{
		return {};
	}-*/;

	/**
	 * Anchor element of the selected (clicked) tab.
	 * @return
	 */
	public final native Element getTab() /*-{
	return this.tab  ;
}-*/;
	
	/**
	 * Element, that contains the selected/clicked tab contents.
	 * @return
	 */
	public final native Element getPanel() /*-{
	return this.panel  ;
}-*/;

	/**
	 * Zero-based index of the selected (clicked) tab.
	 * @return
	 */
	public final native int getIndex() /*-{
	return this.index  ;
}-*/;	
}
