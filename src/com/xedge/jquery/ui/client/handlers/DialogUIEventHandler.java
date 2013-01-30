package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;

	public abstract class DialogUIEventHandler {
		public abstract void eventComplete(JQEvent event, JQueryUI currentJQuery);

		static public void fire(DialogUIEventHandler callback, JQEvent event, JQueryUI currentJQuery) {
			callback.eventComplete(event, currentJQuery);
		}
	}