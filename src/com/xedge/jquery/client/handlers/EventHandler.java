package com.xedge.jquery.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;

public abstract class EventHandler {
	public abstract void eventComplete(JQEvent event,JQuery currentJQuery);
	
	static public void fire(EventHandler callback,JQEvent event,JQuery currentJQuery) {
		 callback.eventComplete(event,currentJQuery);
	}
}