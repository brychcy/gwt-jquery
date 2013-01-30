package com.xedge.jquery.client.handlers;
import com.xedge.jquery.client.JQuery;

public abstract class GlobalTriggerHandler {
	public abstract void complete(JQuery currentJQuery);

	static public void fire(GlobalTriggerHandler callback, JQuery currentJQuery) {
		callback.complete(currentJQuery);
	}
}
