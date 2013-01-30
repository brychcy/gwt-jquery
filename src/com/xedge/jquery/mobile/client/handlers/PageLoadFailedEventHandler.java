package com.xedge.jquery.mobile.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.mobile.client.model.PageLoadFailedEventValues;



	public abstract class PageLoadFailedEventHandler {
		public abstract void eventComplete(JQEvent event, JQuery currentJQuery, PageLoadFailedEventValues eventValues);

		static public void fire(PageLoadFailedEventHandler callback, JQEvent event, JQuery currentJQuery, PageLoadFailedEventValues eventValues) {
			callback.eventComplete(event, currentJQuery, eventValues);
		}
	}