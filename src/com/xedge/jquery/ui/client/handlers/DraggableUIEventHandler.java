package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.model.DraggableUIEventValues;

public abstract class DraggableUIEventHandler {
	public abstract void eventComplete(JQEvent event, JQueryUI currentJQuery, DraggableUIEventValues uiEventValues);

	static public void fire(DraggableUIEventHandler callback, JQEvent event, JQueryUI currentJQuery, DraggableUIEventValues uiEventValues) {
		callback.eventComplete(event, currentJQuery, uiEventValues);
	}
}