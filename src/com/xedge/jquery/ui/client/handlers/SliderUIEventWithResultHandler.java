package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.model.SliderUIEventValues;

	public abstract class SliderUIEventWithResultHandler {
		public abstract boolean eventComplete(JQEvent event, JQueryUI currentJQuery, SliderUIEventValues uiEventValues);

		static public boolean fire(SliderUIEventWithResultHandler callback, JQEvent event, JQueryUI currentJQuery, SliderUIEventValues uiEventValues) {
			return callback.eventComplete(event, currentJQuery, uiEventValues);
		}
	}
