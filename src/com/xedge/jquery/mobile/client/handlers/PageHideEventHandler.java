package com.xedge.jquery.mobile.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.mobile.client.model.PageHideEventValues;




public abstract class PageHideEventHandler {
	public abstract void eventComplete(JQEvent event, JQuery currentJQuery, PageHideEventValues eventValues);

	static public void fire(PageHideEventHandler callback, JQEvent event, JQuery currentJQuery, PageHideEventValues eventValues) {
		callback.eventComplete(event, currentJQuery, eventValues);
	}
}