package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.ui.client.model.DialogUIEventValues;



	public abstract class DialogUIEventResultWithUIItemHandler {
		public abstract boolean eventComplete(JQEvent event, JQuery currentJQuery, DialogUIEventValues uiEventValues);

		static public boolean fire(DialogUIEventResultWithUIItemHandler callback, JQEvent event, JQuery currentJQuery, DialogUIEventValues uiEventValues) {
			return callback.eventComplete(event, currentJQuery, uiEventValues);
		}
	}