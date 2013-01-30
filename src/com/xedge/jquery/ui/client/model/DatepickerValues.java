package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
public class DatepickerValues extends JavaScriptObject {
	protected DatepickerValues() {
	}

	public static native DatepickerValues create() /*-{
		return {};
	}-*/;
	

	public final native int getSelectedDay() /*-{
	return this.selectedDay;
	}-*/;

	public final native int getSelectedMonth() /*-{
	return this.selectedMonth;
	}-*/;

	public final native int getSelectedYear() /*-{
	return this.selectedYear;
	}-*/;

	public final native int getCurrentDay() /*-{
	return this.currentDay;
	}-*/;

	public final native int getCurrentMonth() /*-{
	return this.currentMonth;
	}-*/;

	public final native int getCurrentYear() /*-{
	return this.currentYear;
	}-*/;
	
	public final native DatepickerOptions getSettings() /*-{
	return this.settings;
	}-*/;
	


}
