package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.model.DialogUIEventValues;

public abstract class DialogUIEventWithUIItemHandler {
	public abstract void eventComplete(JQEvent event, JQueryUI currentJQuery, DialogUIEventValues uiEventValues);

	static public void fire(DialogUIEventWithUIItemHandler callback, JQEvent event, JQueryUI currentJQuery, DialogUIEventValues uiEventValues) {
		callback.eventComplete(event, currentJQuery, uiEventValues);
	}
}