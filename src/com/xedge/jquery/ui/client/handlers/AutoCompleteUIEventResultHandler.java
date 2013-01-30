package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;

public abstract class AutoCompleteUIEventResultHandler {
	public abstract boolean eventComplete(JQEvent event, JQuery currentJQuery);

	static public boolean fire(AutoCompleteUIEventResultHandler callback, JQEvent event, JQuery currentJQuery) {
		return callback.eventComplete(event, currentJQuery);
	}
}