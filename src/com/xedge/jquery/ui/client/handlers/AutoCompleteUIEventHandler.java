package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
public abstract class AutoCompleteUIEventHandler {
	public abstract void eventComplete(JQEvent event, JQuery currentJQuery);

	static public void fire(AutoCompleteUIEventHandler callback, JQEvent event, JQuery currentJQuery) {
		callback.eventComplete(event, currentJQuery);
	}
}