package com.xedge.jquery.mobile.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.JQuery;

public class PageShowEventValues  extends JavaScriptObject {
	protected PageShowEventValues() {
	}

	public static native PageShowEventValues create() /*-{
	return {};
}-*/;

	/**
	 * The jQuery object representing the previous page which is being hidden.
	 * @return
	 */
	public final native JQuery getPrevPage() /*-{
		return this.prevPage;
	}-*/;


}
