package com.xedge.jquery.ui.client.handlers;

import com.google.gwt.user.client.Element;
import com.xedge.jquery.ui.client.JQueryUI;

	public abstract class DatepickerEventHandler {
		public abstract void handleEvent(JQueryUI currentJQuery,String dateText, Element datePicker);

		static public void fire(DatepickerEventHandler callback, JQueryUI currentJQuery,String dateText, Element datePicker) {
			 callback.handleEvent(currentJQuery,dateText, datePicker);
		}
	}

