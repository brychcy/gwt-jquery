package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.model.TabsUIEventValues;

public abstract class TabsUIEventHandler {
	public abstract void eventComplete(JQEvent event, JQueryUI currentJQuery, TabsUIEventValues uiEventValues);

	static public void fire(TabsUIEventHandler callback, JQEvent event, JQueryUI currentJQuery, TabsUIEventValues uiEventValues) {
		callback.eventComplete(event, currentJQuery, uiEventValues);
	}
}
