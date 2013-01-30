package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.model.SliderUIEventValues;

public abstract class SliderUIEventHandler {
	public abstract void eventComplete(JQEvent event, JQueryUI currentJQuery, SliderUIEventValues uiEventValues);

	static public void fire(SliderUIEventHandler callback, JQEvent event, JQueryUI currentJQuery, SliderUIEventValues uiEventValues) {
		callback.eventComplete(event, currentJQuery, uiEventValues);
	}
}
