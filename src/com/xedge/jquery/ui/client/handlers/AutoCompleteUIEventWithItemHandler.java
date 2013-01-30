package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.ui.client.model.LabelValuePair;


public abstract class AutoCompleteUIEventWithItemHandler {
	public abstract void eventComplete(JQEvent event, JQuery currentJQuery, LabelValuePair item);

	static public void fire(AutoCompleteUIEventWithItemHandler callback, JQEvent event, JQuery currentJQuery, LabelValuePair item) {
		callback.eventComplete(event, currentJQuery, item);
	}
}