package com.xedge.jquery.mobile.client.model;

import com.xedge.jquery.client.Deferred;

public class PageBeforeLoadEventValues  extends AbstractPageLoadEventValues {
	protected PageBeforeLoadEventValues() {
	}

	/**
	 * Callbacks that call preventDefault() on the event, *MUST* call resolve() or reject() on this object so that changePage() requests resume processing.
	 * @return
	 */
	public final native Deferred getDeferred() /*-{
	return this.deferred;
}-*/;
	 
	
} 
