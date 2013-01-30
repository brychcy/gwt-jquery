package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.ui.client.JQueryUI;
	public abstract class ProgressbarEventHandler {
		public abstract void eventComplete(JQEvent event,JQueryUI currentJQuery,int newValue);
		
		static public void fire(ProgressbarEventHandler callback,JQEvent event,JQueryUI currentJQuery,int newValue) {
			 callback.eventComplete(event,currentJQuery,newValue);
		}
	}