package com.xedge.jquery.mobile.client.model;

public class LoadPageOptions extends PageOptions {

	protected LoadPageOptions() {
	}

	public static native LoadPageOptions create() /*-{
		return {};
	}-*/;


	/**
	 * number (in ms) - Forced delay before the loading message is shown. This is meant to allow time for a page that has already been visited to be fetched from cache without a loading message. default: 50
	 * @param loadMsgDelay
	 */
	public final native void setLoadMsgDelay(int loadMsgDelay) /*-{
	this.loadMsgDelay =loadMsgDelay;
}-*/;
	
	/**
	 * number (in ms) - Forced delay before the loading message is shown. This is meant to allow time for a page that has already been visited to be fetched from cache without a loading message. default: 50 
	 * @return
	 */
	public  final native int getLoadMsgDelay() /*-{
	return this.loadMsgDelay;
}-*/;
	
}

