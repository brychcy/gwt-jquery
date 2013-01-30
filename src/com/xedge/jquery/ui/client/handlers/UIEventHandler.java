package com.xedge.jquery.ui.client.handlers;
import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;

public abstract class UIEventHandler {
	public abstract void eventComplete(JQEvent event, JQueryUI currentJQuery);

	static public void fire(UIEventHandler callback, JQEvent event, JQueryUI currentJQuery) {
		callback.eventComplete(event, currentJQuery);
	}
}
