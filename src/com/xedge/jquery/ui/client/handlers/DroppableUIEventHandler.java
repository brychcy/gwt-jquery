package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.model.DroppableUIEventValues;

public abstract class DroppableUIEventHandler {
	public abstract void eventComplete(JQEvent event,JQueryUI currentJQuery,DroppableUIEventValues uiEventValues);
	
	static public void fire(DroppableUIEventHandler callback,JQEvent event,JQueryUI currentJQuery,DroppableUIEventValues uiEventValues) {
		 callback.eventComplete(event,currentJQuery,uiEventValues);
	}
}