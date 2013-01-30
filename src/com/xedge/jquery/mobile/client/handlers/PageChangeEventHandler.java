package com.xedge.jquery.mobile.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.mobile.client.model.PageChangeEventValues;



	public abstract class PageChangeEventHandler {
		public abstract void eventComplete(JQEvent event, JQuery currentJQuery, PageChangeEventValues eventValues);

		static public void fire(PageChangeEventHandler callback, JQEvent event, JQuery currentJQuery, PageChangeEventValues eventValues) {
			callback.eventComplete(event, currentJQuery, eventValues);
		}
	}
