package com.xedge.jquery.mobile.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.mobile.client.model.PageShowEventValues;


public abstract class PageShowEventHandler {
	public abstract void eventComplete(JQEvent event, JQuery currentJQuery, PageShowEventValues eventValues);

	static public void fire(PageShowEventHandler callback, JQEvent event, JQuery currentJQuery, PageShowEventValues eventValues) {
		callback.eventComplete(event, currentJQuery, eventValues);
	}
}