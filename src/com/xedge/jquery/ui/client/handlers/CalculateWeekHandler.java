package com.xedge.jquery.ui.client.handlers;

import java.util.Date;

import com.google.gwt.core.client.JsDate;
import com.xedge.jquery.client.js.JSHelper;


	public abstract class CalculateWeekHandler {
		public  abstract int calculateWeek(Date date);
		
		static public int fire(CalculateWeekHandler callback,JsDate jsDate) {
			return callback.calculateWeek(JSHelper.convertJsDateToDate(jsDate));
		}
	}