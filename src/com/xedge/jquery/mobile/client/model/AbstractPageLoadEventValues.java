package com.xedge.jquery.mobile.client.model;

import com.google.gwt.core.client.JavaScriptObject;

public abstract class AbstractPageLoadEventValues extends JavaScriptObject {
	protected AbstractPageLoadEventValues() {
	}

	public static native AbstractPageLoadEventValues create() /*-{
	return {};
}-*/;


	/**
	 * The absolute or relative URL that was passed into loadPage() by the caller.
	 * @return
	 */
	public final native String getUrl() /*-{
		return this.url;
	}-*/;

	/**
	 * The absolute version of the url. If url was relative, it is resolved against the url used to load the current active page.
	 * @return
	 */
	public final native String getAbsUrl() /*-{
	return this.absUrl;
}-*/;
	
	/**
	 * The filtered version of absUrl to be used when identifying the page and updating the browser location when the page is made active.
	 * @return
	 */
	public final native String getDataUrl() /*-{
	return this.dataUrl;
}-*/;
	 
	
	/**
	 * This object contains the options that were passed into loadPage().
	 * @return
	 */
	public final native LoadPageOptions getOptions() /*-{
	return this.options;
}-*/;
	
} 

