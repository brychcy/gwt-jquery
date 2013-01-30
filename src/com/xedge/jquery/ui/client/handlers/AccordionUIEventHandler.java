package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.model.AccordionUIEventValues;

	public abstract class AccordionUIEventHandler {
		public abstract void eventComplete(JQEvent event, JQueryUI currentJQuery, AccordionUIEventValues uiEventValues);

		static public void fire(AccordionUIEventHandler callback, JQEvent event, JQueryUI currentJQuery, AccordionUIEventValues uiEventValues) {
			callback.eventComplete(event, currentJQuery, uiEventValues);
		}
	}

