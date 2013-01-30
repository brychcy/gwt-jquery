package com.xedge.jquery.ui.client.handlers;

import com.google.gwt.dom.client.Element;
import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;
	public abstract class SelectableUIEventHandler {
		public abstract void eventComplete(JQEvent event, JQueryUI currentJQuery,Element currentChild);

		static public void fire(SelectableUIEventHandler callback, JQEvent event, JQueryUI currentJQuery,Element currentChild) {
			callback.eventComplete(event, currentJQuery,currentChild);
		}
	}