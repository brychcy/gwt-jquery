package com.xedge.jquery.ui.client.handlers;

import com.google.gwt.dom.client.InputElement;
import com.google.gwt.user.client.Element;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.model.DatepickerOptions;

public abstract class DatePickerBeforeShowHandler {
	public abstract DatepickerOptions beforeShow(JQueryUI currentJQuery, InputElement input, Element datePicker);

	static public DatepickerOptions fire(DatePickerBeforeShowHandler callback, JQueryUI currentJQuery, InputElement input, Element datePicker) {
		return callback.beforeShow(currentJQuery, input, datePicker);
	}
}