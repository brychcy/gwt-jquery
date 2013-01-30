package com.xedge.jquery.ui.client.handlers;

import java.util.Date;

import com.google.gwt.core.client.JsDate;
import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.model.DatepickerBeforeShowDayResult;


	public abstract class DatepickerBeforeShowDayHandler {
		public abstract DatepickerBeforeShowDayResult beforeShowDay(JQueryUI currentJQuery, Date date);

		static public DatepickerBeforeShowDayResult fire(DatepickerBeforeShowDayHandler callback, JQueryUI currentJQuery,JsDate date) {
			return callback.beforeShowDay(currentJQuery, JSHelper.convertJsDateToDate(date));
		}
	}