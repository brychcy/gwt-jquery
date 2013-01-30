package com.xedge.jquery.mobile.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.JQuery;

public class PageHideEventValues extends JavaScriptObject {
	protected PageHideEventValues() {
	}

	public static native PageHideEventValues create() /*-{
	return {};
}-*/;

	/**
	 * The jQuery object representing the next page to be shown.
	 * @return
	 */
	public final native JQuery getNextPage() /*-{
		return this.nextPage;
	}-*/;


}
