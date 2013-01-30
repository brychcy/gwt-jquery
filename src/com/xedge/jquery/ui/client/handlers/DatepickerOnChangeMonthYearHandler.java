package com.xedge.jquery.ui.client.handlers;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.model.DatepickerValues;

	public abstract class DatepickerOnChangeMonthYearHandler {
		public abstract void onChangeMonthYear(JQueryUI currentJQuery,int year,int month, DatepickerValues datePicker);

		static public void fire(DatepickerOnChangeMonthYearHandler callback, JQueryUI currentJQuery, int year,int month, DatepickerValues datePicker) {
			 callback.onChangeMonthYear(currentJQuery, year,month, datePicker);
		}
	}

