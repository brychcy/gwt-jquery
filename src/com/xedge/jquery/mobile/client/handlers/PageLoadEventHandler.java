package com.xedge.jquery.mobile.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.mobile.client.model.PageLoadEventValues;


public abstract class PageLoadEventHandler {
	public abstract void eventComplete(JQEvent event, JQuery currentJQuery, PageLoadEventValues eventValues);

	static public void fire(PageLoadEventHandler callback, JQEvent event, JQuery currentJQuery, PageLoadEventValues eventValues) {
		callback.eventComplete(event, currentJQuery, eventValues);
	}
}