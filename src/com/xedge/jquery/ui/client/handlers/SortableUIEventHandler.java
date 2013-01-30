package com.xedge.jquery.ui.client.handlers;
import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.model.SortableUIEventValues;

public abstract class SortableUIEventHandler {
	public abstract void eventComplete(JQEvent event, JQueryUI currentJQuery, SortableUIEventValues uiEventValues);

	static public void fire(SortableUIEventHandler callback, JQEvent event, JQueryUI currentJQuery, SortableUIEventValues uiEventValues) {
		callback.eventComplete(event, currentJQuery, uiEventValues);
	}
}

