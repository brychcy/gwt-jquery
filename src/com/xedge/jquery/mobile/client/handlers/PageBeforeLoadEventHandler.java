package com.xedge.jquery.mobile.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.mobile.client.model.PageBeforeLoadEventValues;



public abstract class PageBeforeLoadEventHandler {
	public abstract void eventComplete(JQEvent event, JQuery currentJQuery, PageBeforeLoadEventValues eventValues);

	static public void fire(PageBeforeLoadEventHandler callback, JQEvent event, JQuery currentJQuery, PageBeforeLoadEventValues eventValues) {
		callback.eventComplete(event, currentJQuery, eventValues);
	}
}