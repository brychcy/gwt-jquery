package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.model.ResizeableUIEventValues;

public abstract class ResizeableUIEventHandler {
	public abstract void eventComplete(JQEvent event, JQueryUI currentJQuery, ResizeableUIEventValues uiEventValues);

	static public void fire(ResizeableUIEventHandler callback, JQEvent event, JQueryUI currentJQuery, ResizeableUIEventValues uiEventValues) {
		callback.eventComplete(event, currentJQuery, uiEventValues);
	}
}