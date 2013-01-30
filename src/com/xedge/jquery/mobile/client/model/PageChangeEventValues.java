package com.xedge.jquery.mobile.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.JQuery;

public class PageChangeEventValues extends JavaScriptObject {
	protected PageChangeEventValues() {
	}

	public static native PageChangeEventValues create() /*-{
	return {};
}-*/;

    /**
     * The jQuery object representing the page the caller wishes to make active.
     * @return
     */
	public final native JQuery getToPage () /*-{
		return this.toPage;
	}-*/;

    /**
     * The absolute/relative url to an internal or external page  the caller wishes to make active.
     * @return
     */
	public final native String getToPageURL() /*-{
	return this.toPage;
}-*/;
	
	/**
	 * This object contains the configuration options to be used for the current changePage() call.
	 * @return
	 */
	public final native ChangePageOptions getOptions() /*-{
	return this.options;
}-*/;
}
