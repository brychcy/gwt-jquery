package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;

	public abstract class DialogUIEventResultHandler {
		public abstract boolean eventComplete(JQEvent event, JQueryUI currentJQuery);

		static public boolean fire(DialogUIEventResultHandler callback, JQEvent event, JQueryUI currentJQuery) {
			return callback.eventComplete(event, currentJQuery);
		}
	}