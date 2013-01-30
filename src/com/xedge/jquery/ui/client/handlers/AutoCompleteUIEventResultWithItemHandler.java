package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.ui.client.model.LabelValuePair;

public abstract class AutoCompleteUIEventResultWithItemHandler {
	public abstract boolean eventComplete(JQEvent event, JQuery currentJQuery, LabelValuePair item);

	static public boolean fire(AutoCompleteUIEventResultWithItemHandler callback, JQEvent event, JQuery currentJQuery, LabelValuePair item) {
		return callback.eventComplete(event, currentJQuery, item);
	}
}