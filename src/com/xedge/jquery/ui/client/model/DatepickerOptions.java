package com.xedge.jquery.ui.client.model;

import java.util.Date;
import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;
import com.google.gwt.dom.client.Element;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.client.JQuery.Duration;
import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.client.js.JavaScriptStringArray;
import com.xedge.jquery.ui.client.JQueryUI.Effect;
import com.xedge.jquery.ui.client.effects.EffectOptions;
import com.xedge.jquery.ui.client.handlers.CalculateWeekHandler;
import com.xedge.jquery.ui.client.handlers.DatePickerBeforeShowHandler;
import com.xedge.jquery.ui.client.handlers.DatepickerBeforeShowDayHandler;
import com.xedge.jquery.ui.client.handlers.DatepickerEventHandler;
import com.xedge.jquery.ui.client.handlers.DatepickerOnChangeMonthYearHandler;

/**
 * The jQuery UI Datepicker is a highly configurable plugin that adds datepicker functionality to your pages. 
 * You can customize the date format and language, restrict the selectable date ranges and add in buttons and 
 * other navigation options easily.
 * Theme : ui-datepicker , ui-datepicker-header , ui-datepicker-prev , ui-datepicker-next , ui-datepicker-title , ui-datepicker-month , ui-datepicker-calendar , ui-datepicker-week-end , ui-datepicker-week-end ui-datepicker-other-month , ui-datepicker-buttonpane , ui-datepicker-current , ui-datepicker-close
 * @author osaharri
 *
 */
public class DatepickerOptions extends JavaScriptObject {

	public enum DatepickerOptionParameters {
		destroy, disable, enable, hide , show ,refresh
	}
	
	public enum DatepickerBooleanOption {
		disabled,autoSize,buttonImageOnly,changeMonth,changeYear,constrainInput,gotoCurrent,hideIfNoPrevNext,isRTL,navigationAsDateFormat,selectOtherMonths,showButtonPanel,showMonthAfterYear,showOtherMonths,showWeek,
	}

	public enum DatepickerStringOption {
		altField,altFormat,appendText,buttonImage,buttonText,closeText,currentText,dateFormat,defaultDate,duration,maxDate,minDate,nextText,prevText,shortYearCutoff,showAnim,showOn,weekHeader,yearRange,yearSuffix
	}
	
	public enum DatepickerIntegerOption {
		defaultDate,duration,firstDay,maxDate,minDate,numberOfMonths,shortYearCutoff,showCurrentAtPos,stepMonths,
	}
	
	public enum DatepickerDateOption {
		defaultDate,maxDate,minDate
	}
	public enum DatepickerShowOn {
		focus, button, both
	}
	protected DatepickerOptions() {
	}

	public static native DatepickerOptions create() /*-{
		return {};
	}-*/;

	/**
	 * Disables (true) or enables (false) the datepicker. Can be set when initialising (first creating) the datepicker. Default:false
	 * 
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
		this.disabled=disabled;
	}-*/;

	public final native boolean isDisabled() /*-{
	  return this.disabled;
}-*/;
	/**
	 * The jQuery selector for another field that is to be updated with the selected date from the datepicker. Default:''
	 * Use the altFormat setting to change the format of the date within this field.
	 * @param altField
	 */
	public final native void setAltField(String altField) /*-{
		this.altField=altField;
	}-*/;
	
	public final native String getAltField() /*-{
	  return this.altField;
}-*/;

	/**
	 * The jQuery selector for another field that is to be updated with the selected date from the datepicker. Default:''
	 * Use the altFormat setting to change the format of the date within this field.
	 * @param altField
	 */
	public final native void setAltField(JQuery altField) /*-{
		this.altField=altField;
	}-*/;
	
	public final native JQuery getAltFieldJQ() /*-{
	  return this.altField;
}-*/;

	/**
	 * The Element of another field that is to be updated with the selected date from the datepicker. Default:''
	 * Use the altFormat setting to change the format of the date within this field.
	 * @param altField
	 */
	public final native void setAltField(Element altField) /*-{
		this.altField=altField;
	}-*/;
	
	public final native Element getAltFieldElement() /*-{
	  return this.altField;
}-*/;
	
	
	/**
	 * The dateFormat to be used for the altField option. This allows one date format to be shown 
	 * to the user for selection purposes, while a different format is actually sent behind the scenes. Default:''
	 * http://docs.jquery.com/UI/Datepicker/formatDate
	 * @param altFormat
	 */
	public final native void setAltFormat(String altFormat) /*-{
	this.altFormat=altFormat;
}-*/;
	
	public final native String getAltFormat() /*-{
	  return this.altFormat;
}-*/;
	
	
	/**
	 * The text to display after each date field, e.g. to show the required format. Default:''
	 * @param appendText
	 */
	public final native void setAppendText(String appendText) /*-{
	this.appendText=appendText;
}-*/;
	
	public final native String getAppendText() /*-{
	  return this.appendText;
}-*/;
	/**
	 * Set to true to automatically resize the input field to accomodate dates in the current dateFormat. Default:false
	 * @param autoSize
	 */
	public final native void setAutoSize(boolean autoSize) /*-{
	this.autoSize=autoSize;
}-*/;
	
	public final native boolean isAutoSize() /*-{
	  return this.autoSize;
}-*/;
	/**
	 * The URL for the popup button image. If set, buttonText becomes the alt value and is not directly displayed. eg. /images/datepicker.gif
	 * Default:''
	 * @param buttonImage
	 */
	public final native void setButtonImage(String buttonImage) /*-{
	this.buttonImage=buttonImage;
}-*/;
	
	public final native String getButtonImage() /*-{
	  return this.buttonImage;
}-*/;
	/**
	 * Set to true to place an image after the field to use as the trigger without it appearing on a button. Default:false
	 * @param buttonImageOnly
	 */
	public final native void setButtonImageOnly(boolean buttonImageOnly) /*-{
	this.buttonImageOnly=buttonImageOnly;
}-*/;
	
	public final native boolean isButtonImageOnly() /*-{
	  return this.buttonImageOnly;
}-*/;
	
	/**
	 * The text to display on the trigger button. Use in conjunction with showOn equal to 'button' or 'both'
	 * Default:'...'
	 * @param buttonText
	 */
	public final native void setButtonText(String buttonText) /*-{
	this.buttonText=buttonText;
}-*/;

	public final native String getButtonText() /*-{
	  return this.buttonText;
}-*/;
	/**
	 * A function to calculate the week of the year for a given date. The default implementation uses the 
	 * ISO 8601 definition: weeks start on a Monday; the first week of the year contains the first Thursday 
	 * of the year.
	 * Default:$.datepicker.iso8601Week
	 * @param callback
	 */
	public final native void setCalculateWeekHandler(CalculateWeekHandler callback) /*-{
	this.calculateWeek = function(date){
		    return @com.xedge.jquery.ui.client.handlers.CalculateWeekHandler::fire(Lcom/xedge/jquery/ui/client/handlers/CalculateWeekHandler;Lcom/google/gwt/core/client/JsDate;)(callback,date);
	};
}-*/;	
	
	/**
	 * Allows you to change the month by selecting from a drop-down list. Default:false
	 * @param changeMonth
	 */
	public final native void setChangeMonth(boolean changeMonth) /*-{
	this.changeMonth=changeMonth;
}-*/;
	
	public final native boolean isChangeMonth() /*-{
	  return this.changeMonth;
}-*/;
	/**
	 * Allows you to change the year by selecting from a drop-down list. You can enable this feature 
	 * by setting the attribute to true. Use the yearRange option to control which years are made available 
	 * for selection.  Default:false
	 * @param changeYear
	 */
	public final native void setChangeYear(boolean changeYear) /*-{
	this.changeYear=changeYear;
}-*/;
	
	public final native boolean isChangeYear() /*-{
	  return this.changeYear;
}-*/;
	
	/**
	 * The text to display for the close link. This attribute is one of the regionalisation attributes. 
	 * Use the showButtonPanel to display this button.  Default:'Done'
	 * @param closeText
	 */
	public final native void setCloseText(String closeText) /*-{
	this.closeText=closeText;
}-*/;
	
	public final native String getCloseText() /*-{
	  return this.closeText;
}-*/;
	
	/**
	 * When true entry in the input field is constrained to those characters allowed by the current dateFormat.
	 * Default:true
	 */
	public final native void setConstrainInput(boolean constrainInput) /*-{
	this.constrainInput=constrainInput;
}-*/;
	
	public final native boolean isConstrainInput() /*-{
	  return this.constrainInput;
}-*/;
	
	/**
	 * The text to display for the current day link. This attribute is one of the regionalisation attributes. Use the showButtonPanel to display this button.
	 * Default:'Today'
	 * @param currentText
	 */
	public final native void setCurrentText(String currentText) /*-{
	this.currentText=currentText;
}-*/;
	
	public final native String getCurrentText() /*-{
	  return this.currentText;
}-*/;

	/**
	 * The format for parsed and displayed dates. This attribute is one of the regionalisation attributes.
	 * http://docs.jquery.com/UI/Datepicker/formatDate
	 * Default:'mm/dd/yy'
	 * @param dateFormat
	 */
	public final native void setDateFormat(String dateFormat) /*-{
	this.dateFormat=dateFormat;
}-*/;
	
	public final native String getDateFormat() /*-{
	  return this.dateFormat;
}-*/;
	
	/**
	 * The list of long day names, starting from Sunday, for use as requested via the dateFormat setting. They also appear as popup hints when hovering over the corresponding column headings. This attribute is one of the regionalisation attributes.
	 * Default:['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
	 * @param dayNames
	 */
	public final void setDayNames(List<String> dayNames) {
		setDayNames(JSHelper.convertStringListToJSArray(dayNames));
	}
	
	/**
	 * The array of long day names, starting from Sunday, for use as requested via the dateFormat setting. They also appear as popup hints when hovering over the corresponding column headings. This attribute is one of the regionalisation attributes.
	 * Default:['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
	 * @param dayNames
	 */
	public final void setDayNames(String[] dayNames) {
		setDayNames(JSHelper.convertStringArrayToJSArray(dayNames));
	}

	private final native void setDayNames(JavaScriptStringArray dayNames) /*-{
		this.dayNames=dayNames;
	}-*/;
	
	public final List<String> getDayNames() {
		return JSHelper.convertJSArrayToStringList(getDayNamesJS());
	}
	
	private final native JavaScriptStringArray getDayNamesJS() /*-{
	  return this.dayNames;
}-*/;
	
	/**
	 * The list of minimised day names, starting from Sunday, for use as column headers within the datepicker. This attribute is one of the regionalisation attributes.
	 * Default:['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa'] 
	 * @param dayNamesMin
	 */
	public final void setDayNamesMin(List<String> dayNamesMin) {
		setDayNamesMin(JSHelper.convertStringListToJSArray(dayNamesMin));
	}

	/**
	 * The array of minimised day names, starting from Sunday, for use as column headers within the datepicker. This attribute is one of the regionalisation attributes.
	 * Default:['Su', 'Mo', 'Tu', 'We', 'Th', 'Fr', 'Sa'] 
	 * @param dayNamesMin
	 */
	public final void setDayNamesMin(String[] dayNamesMin) {
		setDayNamesMin(JSHelper.convertStringArrayToJSArray(dayNamesMin));
	}
	
	private final native void setDayNamesMin(JavaScriptStringArray dayNamesMin) /*-{
		this.dayNamesMin=dayNamesMin;
	}-*/;
	
	public final List<String> getDayNamesMin() {
		return JSHelper.convertJSArrayToStringList(getDayNamesMinJS());
	}
	
	private final native JavaScriptStringArray getDayNamesMinJS() /*-{
	  return this.dayNamesMin;
}-*/;

	
	/**
	 * The list of abbreviated day names, starting from Sunday, for use as requested via the dateFormat setting. This attribute is one of the regionalisation attributes.
	 * Default:['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']
	 * @param dayNamesShort
	 */
	public final void setDayNamesShort(List<String> dayNamesShort) {
		setDayNamesShort(JSHelper.convertStringListToJSArray(dayNamesShort));
	}
	
	
	/**
	 * The array of abbreviated day names, starting from Sunday, for use as requested via the dateFormat setting. This attribute is one of the regionalisation attributes.
	 * Default:['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']
	 * @param dayNamesShort
	 */
	public final void setDayNamesShort(String[] dayNamesShort) {
		setDayNamesShort(JSHelper.convertStringArrayToJSArray(dayNamesShort));
	}
	 

	private final native void setDayNamesShort(JavaScriptStringArray dayNamesShort) /*-{
		this.dayNamesShort=dayNamesShort;
	}-*/;
	
	
	public final List<String> getDayNamesShort() {
		return JSHelper.convertJSArrayToStringList(getDayNamesShortJS());
	}
	
	private final native JavaScriptStringArray getDayNamesShortJS() /*-{
	  return this.dayNamesShort;
}-*/;

	/**
	 * Set the date to highlight on first opening if the field is blank.
	 * Specifies a String in the current dateFormat or  or a string of values and 
	 * periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d')
	 * Default:null today
	 * @param defaultDate
	 */
	public final native void setDefaultDate(String defaultDate) /*-{
	this.defaultDate=defaultDate;
}-*/;
	
	public final native String getDefaultDateString() /*-{
	  return this.defaultDate;
}-*/;
	
	/**
	 * Set the date to highlight on first opening if the field is blank.
	 * Specifies the number of days from today (e.g. +7) 
	 * Default:null today
	 * @param defaultDate
	 */
	public final native void setDefaultDate(int defaultDate) /*-{
	this.defaultDate=defaultDate;
}-*/;
	
	public final native int getDefaultDateInt() /*-{
	  return this.defaultDate;
}-*/;
	
	/**
	 * Set the date to highlight on first opening if the field is blank. Specifies an actual date.
	 * Default:null today
	 * @param defaultDate
	 */
	public final void setDefaultDate(Date defaultDate) {
		setDefaultDate(JSHelper.convertDateToJsDate(defaultDate));
	}

	private final native void setDefaultDate(JsDate defaultDate) /*-{
	this.defaultDate=defaultDate;
}-*/;
	
	public final Date getDefaultDate() {
		return JSHelper.convertJsDateToDate(getDefaultDateJS());
	}

	
	private final native JsDate getDefaultDateJS() /*-{
	  return this.defaultDate;
}-*/;
	
	public final native void setDuration(int duration) /*-{
	this.duration=duration;
}-*/;
	
	public final native int getDurationInt() /*-{
	  return this.duration;
}-*/;

/**
 * Set animation duration
 * @param duration
 */
public final void setDuration(Duration duration) {
	setDuration(duration.name());
}

/**
 * Set animation duration in milliseconds
 * @param duration
 */
private final native void setDuration(String duration) /*-{
	this.duration=duration;
}-*/;

public final Duration getDuration() {
	return Duration.valueOf(getDurationJS());
}

private final native String getDurationJS() /*-{
return this.duration;
}-*/;


/**
 * Set the first day of the week: Sunday is 0, Monday is 1, ... This attribute is one of the regionalisation attributes.
 * Default:0 Sunday
 * @param firstDay
 */
public final void setFirstDay(DaysOfTheWeek firstDay) {
	setFirstDay(firstDay.getDay());
}


private final native void setFirstDay(int firstDay) /*-{
	this.firstDay=firstDay;
}-*/;

public final DaysOfTheWeek getFirstDay() {
	return DaysOfTheWeek.getDaysOfTheWeek(getFirstDayJS());
}

private final native int getFirstDayJS() /*-{
return this.firstDay;
}-*/;


/**
 * When true the current day link moves to the currently selected date instead of today. Default:false
 * @param gotoCurrent
 */
public final native void setGotoCurrent(boolean gotoCurrent) /*-{
this.gotoCurrent=gotoCurrent;
}-*/;

public final native boolean isGotoCurrent() /*-{
return this.gotoCurrent;
}-*/;

/**
 * Normally the previous and next links are disabled when not applicable (see minDate/maxDate). 
 * You can hide them altogether by setting this attribute to true.
 * Default:false
 * @param hideIfNoPrevNext
 */
public final native void setHideIfNoPrevNext(boolean hideIfNoPrevNext) /*-{
this.hideIfNoPrevNext=hideIfNoPrevNext;
}-*/;

public final native boolean isHideIfNoPrevNext() /*-{
return this.hideIfNoPrevNext;
}-*/;

/**
 * True if the current language is drawn from right to left. This attribute is one of the regionalisation attributes.
 * Default:false
 * @param isRTL
 */
public final native void setIsRTL(boolean isRTL) /*-{
this.isRTL=isRTL;
}-*/;

public final native boolean isRTL() /*-{
return this.isRTL;
}-*/;

/**
 * Set a maximum selectable date.
 * Specifies a String in the current dateFormat or  or a string of values and 
 * periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d')
 * Default:null for no limit.
 * @param maxDate
 */
public final native void setMaxDate(String maxDate) /*-{
this.maxDate=maxDate;
}-*/;

public final native String getMaxDateString() /*-{
return this.maxDate;
}-*/;

/**
 * Set a maximum selectable date.
 * Specifies the number of days from today (e.g. +7) 
 * Default:null for no limit.
 * @param maxDate
 */
public final native void setMaxDate(int maxDate) /*-{
this.maxDate=maxDate;
}-*/;

public final native int getMaxDateInt() /*-{
return this.maxDate;
}-*/;

/**
 * Set a maximum selectable date. Specifies an actual date.
 * Default:null for no limit.
 * @param maxDate
 */
public final void setMaxDate(Date maxDate) {
	setMaxDate(JSHelper.convertDateToJsDate(maxDate));
}

private final native void setMaxDate(JsDate maxDate) /*-{
this.maxDate=maxDate;
}-*/;

public final Date getMaxDate() {
	return JSHelper.convertJsDateToDate(getMaxDateJS());
}

private final native JsDate getMaxDateJS() /*-{
return this.maxDate;
}-*/;
/**
 * Set a minimum selectable date.
 * Specifies a String in the current dateFormat or  or a string of values and 
 * periods ('y' for years, 'm' for months, 'w' for weeks, 'd' for days, e.g. '+1m +7d')
 * Default:null for no limit.
 * @param minDate
 */
public final native void setMinDate(String minDate) /*-{
this.minDate=minDate;
}-*/;

public final native String getMinDateString() /*-{
return this.minDate;
}-*/;
/**
 * Set a minimum selectable date.
 * Specifies the number of days from today (e.g. +7) 
 * Default:null for no limit.
 * @param minDate
 */
public final native void setMinDate(int minDate) /*-{
this.minDate=minDate;
}-*/;

public final native int getMinDateInt() /*-{
return this.minDate;
}-*/;
/**
 * Set a minimum selectable date. Specifies an actual date.
 * Default:null for no limit.
 * @param minDate
 */
public final void setMinDate(Date minDate) {
	setMinDate(JSHelper.convertDateToJsDate(minDate));
}

private final native void setMinDate(JsDate minDate) /*-{
this.minDate=minDate;
}-*/;

public final Date getMinDate() {
	return JSHelper.convertJsDateToDate(getMinDateJS());
}

private final native JsDate getMinDateJS() /*-{
return this.minDate;
}-*/;
/**
 * The list of full month names, for use as requested via the dateFormat setting. 
 * This attribute is one of the regionalisation attributes.
 * Default:['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']
 * @param monthNames
 */
public final void setMonthNames(List<String> monthNames) {
	setMonthNames(JSHelper.convertStringListToJSArray(monthNames));
}

/**
 * The array of full month names, for use as requested via the dateFormat setting. 
 * This attribute is one of the regionalisation attributes.
 * Default:['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December']
 * @param monthNames
 */
public final void setMonthNames(String[] monthNames) {
	setMonthNames(JSHelper.convertStringArrayToJSArray(monthNames));
}

private final native void setMonthNames(JavaScriptStringArray monthNames) /*-{
	this.monthNames=monthNames;
}-*/;

public final List<String> getMonthNames() {
	return JSHelper.convertJSArrayToStringList(getMonthNamesJS());
}

private final native JavaScriptStringArray getMonthNamesJS() /*-{
  return this.monthNames;
}-*/;

/**
 * The list of abbreviated month names, as used in the month header on each datepicker and as requested via the dateFormat setting. 
 * This attribute is one of the regionalisation attributes.
 * Default:['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
 * @param monthNamesShort
 */
public final void setMonthNamesShort(List<String> monthNamesShort) {
	setMonthNamesShort(JSHelper.convertStringListToJSArray(monthNamesShort));
}

/**
 * The array of abbreviated month names, as used in the month header on each datepicker and as requested via the dateFormat setting. 
 * This attribute is one of the regionalisation attributes.
 * Default:['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
 * @param monthNamesShort
 */
public final void setMonthNamesShort(String[] monthNamesShort) {
	setMonthNamesShort(JSHelper.convertStringArrayToJSArray(monthNamesShort));
}


private final native void setMonthNamesShort(JavaScriptStringArray monthNamesShort) /*-{
	this.monthNamesShort=monthNamesShort;
}-*/;

public final List<String> getMonthNamesShort() {
	return JSHelper.convertJSArrayToStringList(getMonthNamesShortJS());
}

private final native JavaScriptStringArray getMonthNamesShortJS() /*-{
  return this.monthNamesShort;
}-*/;

/**
 * When true the formatDate function is applied to the prevText, nextText, and currentText values before 
 * display, allowing them to display the target month names for example.
 * Default:false
 * @param navigationAsDateFormat
 */
public final native void setNavigationAsDateFormat(boolean navigationAsDateFormat) /*-{
this.navigationAsDateFormat=navigationAsDateFormat;
}-*/;

public final native String getNavigationAsDateFormat() /*-{
return this.navigationAsDateFormat;
}-*/;

/**
 * The text to display for the next month link. This attribute is one of the regionalisation attributes. 
 * With the standard ThemeRoller styling, this value is replaced by an icon.
 * Default:'Next'
 * @param nextText
 */
public final native void setNextText(String nextText) /*-{
this.nextText=nextText;
}-*/;

public final native String getNextText() /*-{
return this.nextText;
}-*/;

/**
 * Set how many months to show at once
 * @param numberOfMonths
 */
public final native void setNumberOfMonths(int numberOfMonths) /*-{
this.numberOfMonths=numberOfMonths;
}-*/;

public final native int getNumberOfMonths() /*-{
return this.numberOfMonths;
}-*/;

/**
 * Set how many months to show at once by defining the number of rows and columns to display.
 * @param rows
 * @param cols
 */
public final native void setNumberOfMonths(int rows,int cols) /*-{
this.numberOfMonths=[rows,cols];
}-*/;


/**
 * The text to display for the previous month link. This attribute is one of the regionalisation attributes. 
 * With the standard ThemeRoller styling, this value is replaced by an icon.
 * Default:'Prev'
 * @param prevText
 */
public final native void setPrevText(String prevText) /*-{
this.prevText=prevText;
}-*/;

public final native String getPrevText() /*-{
return this.prevText;
}-*/;
/**
 * When true days in other months shown before or after the current month are selectable. This only applies if showOtherMonths is also true.
 * Default:false
 * @param selectOtherMonths
 */
public final native void setSelectOtherMonths(boolean selectOtherMonths) /*-{
this.selectOtherMonths=selectOtherMonths;
}-*/;

public final native boolean isSelectOtherMonths() /*-{
return this.selectOtherMonths;
}-*/;

/**
 * Set the cutoff year for determining the century for a date (used in conjunction with dateFormat 'y')
 * A numeric value (0-99) is used directly.
 * Once the cutoff year is calculated, any dates entered with a year value less than or equal to it are considered to be in the current century, while those greater than it are deemed to be in the previous century.
 * Default:'+10'
 * @param shortYearCutoff
 */
public final native void setShortYearCutoff(int shortYearCutoff) /*-{
this.shortYearCutoff=shortYearCutoff;
}-*/;

public final native int getShortYearCutoffInt() /*-{
return this.shortYearCutoff;
}-*/;

/**
 * Set the cutoff year for determining the century for a date (used in conjunction with dateFormat 'y')
 * Converted to a number and added to the current year.
 * Once the cutoff year is calculated, any dates entered with a year value less than or equal to it are considered to be in the current century, while those greater than it are deemed to be in the previous century.
 * Default:'+10'
 * @param shortYearCutoff
 */
public final native void setShortYearCutoff(String shortYearCutoff) /*-{
this.shortYearCutoff=shortYearCutoff;
}-*/;

public final native String getShortYearCutoff() /*-{
return this.shortYearCutoff;
}-*/;
/**
 * Set the name of the animation used to show/hide the datepicker. Default:'show'
 * @param effect
 */
public final void  setShowAnim(Effect effect) {
	 setShowAnim(effect.name());
}

private final native void setShowAnim(String showAnim) /*-{
this.showAnim=showAnim;
}-*/;

public final Effect  getShowAnim() {
	return Effect.valueOf(getShowAnimJS());
}

private final native String getShowAnimJS() /*-{
return this.showAnim;
}-*/;

/**
 * Whether to show the button panel.
 * @param showButtonPanel
 */
public final native void setShowButtonPanel(boolean showButtonPanel) /*-{
this.showButtonPanel=showButtonPanel;
}-*/;

public final native boolean isShowButtonPanel() /*-{
return this.showButtonPanel;
}-*/;

/**
 * Specify where in a multi-month display the current month shows, starting from 0 at the top/left.
 * Default:0
 * @param showCurrentAtPos
 */
public final native void setShowCurrentAtPos(int showCurrentAtPos) /*-{
this.showCurrentAtPos=showCurrentAtPos;
}-*/;

public final native int getShowCurrentAtPos() /*-{
return this.showCurrentAtPos;
}-*/;
/**
 * Whether to show the month after the year in the header. This attribute is one of the regionalisation attributes.
 * Default:false
 * @param showMonthAfterYear
 */
public final native void setShowMonthAfterYear(boolean showMonthAfterYear) /*-{
this.showMonthAfterYear=showMonthAfterYear;
}-*/;

public final native boolean isShowMonthAfterYear() /*-{
return this.showMonthAfterYear;
}-*/;


/**
 * Have the datepicker appear automatically when the field receives focus ('focus'), appear only when a 
 * button is clicked ('button'), or appear when either event takes place ('both'). Default:'focus'
 * @param showOn
 */
public final void  setShowOn(DatepickerShowOn showOn) {
	setShowOn(showOn.name());
}

private final native void setShowOn(String showOn) /*-{
this.showOn=showOn;
}-*/;

public final DatepickerShowOn  getShowOn() {
	return DatepickerShowOn.valueOf(getShowOnJS());
}

private final native String getShowOnJS() /*-{
 return this.showOn;
}-*/;


/**
 * If using one of the jQuery UI effects for showAnim, you can provide additional settings for that animation via this option.
 * @param showOptions
 */
public final native void  setShowOptions(EffectOptions showOptions) /*-{
	this.showOptions=showOptions;
}-*/;

public final native EffectOptions  getShowOptions() /*-{
return this.showOptions;
}-*/;

/**
 * Display dates in other months (non-selectable) at the start or end of the current month. To make these days selectable use selectOtherMonths.
 * Default:false
 * @param showOtherMonths
 */
public final native void setShowOtherMonths(boolean showOtherMonths) /*-{
this.showOtherMonths=showOtherMonths;
}-*/;

public final native boolean isShowOtherMonths() /*-{
return this.showOtherMonths;
}-*/;
/**
 * When true a column is added to show the week of the year. The calculateWeek option determines how the week 
 * of the year is calculated. You may also want to change the firstDay option.
 * Default:false
 * @param showWeek
 */
public final native void setShowWeek(boolean showWeek) /*-{
this.showWeek=showWeek;
}-*/;

public final native boolean isShowWeek() /*-{
return this.showWeek;
}-*/;
/**
 * Set how many months to move when clicking the Previous/Next links. Default:1
 * @param stepMonths
 */
public final native void setStepMonths(int stepMonths) /*-{
this.stepMonths=stepMonths;
}-*/;

public final native int getStepMonths() /*-{
return this.stepMonths;
}-*/;

/**
 * The text to display for the week of the year column heading. This attribute is one of the regionalisation 
 * attributes. Use showWeek to display this column. eg.  'W'
 * Default:'Wk'
 * @param weekHeader
 */
public final native void setWeekHeader(String weekHeader) /*-{
this.weekHeader=weekHeader;
}-*/;

public final native String getWeekHeader() /*-{
return this.weekHeader;
}-*/;
/**
 * Control the range of years displayed in the year drop-down: either relative to today's year (-nn:+nn), 
 * relative to the currently selected year (c-nn:c+nn), absolute (nnnn:nnnn), 
 * or combinations of these formats (nnnn:-nn). 
 * Note that this option only affects what appears in the drop-down, to restrict which dates may be selected 
 * use the minDate and/or maxDate options.
 * eg. '2000:2010'
 * Default:'c-10:c+10'
 * @param yearRange
 */
public final native void setYearRange(String yearRange) /*-{
this.yearRange=yearRange;
}-*/;

public final native String getYearRange() /*-{
return this.yearRange;
}-*/;
/**
 * Additional text to display after the year in the month headers. This attribute is one of the regionalisation attributes.
 * eg. 'CE'
 * Default:''
 * @param yearSuffix
 */
public final native void setYearSuffix(String yearSuffix) /*-{
this.yearSuffix=yearSuffix;
}-*/;

public final native String getYearSuffix() /*-{
return this.yearSuffix;
}-*/;



/**
 * Can be a function that takes an input field and current datepicker instance and returns an options object to update the datepicker with. It is called just before the datepicker is displayed.
 * @param callback
 */
public final native void setBeforeShowHandler(DatePickerBeforeShowHandler callback) /*-{
this.beforeShow = function(input, inst){
	    var currentJQuery = $wnd.jQuery(this);
	    return @com.xedge.jquery.ui.client.handlers.DatePickerBeforeShowHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DatePickerBeforeShowHandler;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/google/gwt/dom/client/InputElement;Lcom/google/gwt/user/client/Element;)(callback,currentJQuery,input,inst);
};
}-*/;	

/**
 * Set the DatePicker so no weekend is selectable
 */
public final native void setNoWeekends() /*-{
this.beforeShowDay = $wnd.jQuery.datepicker.noWeekends;
}-*/;

/**
 * The function takes a date as a parameter and must return an array with [0] equal to true/false indicating whether or not this date is selectable, [1] equal to a CSS class name(s) or '' for the default presentation, and [2] an optional popup tooltip for this date. It is called for each day in the datepicker before it is displayed.
 * @param callback
 */
public final native void setBeforeShowDayHandler(DatepickerBeforeShowDayHandler callback) /*-{
this.beforeShowDay = function(date){
	    var currentJQuery = $wnd.jQuery(this);
	    return @com.xedge.jquery.ui.client.handlers.DatepickerBeforeShowDayHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DatepickerBeforeShowDayHandler;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/google/gwt/core/client/JsDate;)(callback,currentJQuery,date);
};
}-*/;	

/**
 * Allows you to define your own event when the datepicker moves to a new month and/or year. The function receives the selected year, month (1-12), and the datepicker instance as parameters. this refers to the associated input field.
 * @param callback
 */
public final native void setOnChangeMonthYearHandler(DatepickerOnChangeMonthYearHandler callback) /*-{
this.onChangeMonthYear = function(year, month, inst){
	    var currentJQuery = $wnd.jQuery(this);
	    @com.xedge.jquery.ui.client.handlers.DatepickerOnChangeMonthYearHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DatepickerOnChangeMonthYearHandler;Lcom/xedge/jquery/ui/client/JQueryUI;IILcom/xedge/jquery/ui/client/model/DatepickerValues;)(callback,currentJQuery,year, month, inst);
};
}-*/;	

/**
 * Allows you to define your own event when the datepicker is closed, whether or not a date is selected. The function receives the selected date as text ('' if none) and the datepicker instance as parameters. this refers to the associated input field.
 * @param callback
 */
public final native void setOnCloseHandler(DatepickerEventHandler callback) /*-{
this.onClose = function(dateText, inst){
	    var currentJQuery = $wnd.jQuery(this);
	    @com.xedge.jquery.ui.client.handlers.DatepickerEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DatepickerEventHandler;Lcom/xedge/jquery/ui/client/JQueryUI;Ljava/lang/String;Lcom/google/gwt/user/client/Element;)(callback,currentJQuery,dateText, inst);
};
}-*/;	

/**
 * Allows you to define your own event when the datepicker is selected. The function receives the selected date as text and the datepicker instance as parameters. this refers to the associated input field.
 * @param callback
 */
public final native void setOnSelectHandler(DatepickerEventHandler callback) /*-{
this.onSelect = function(dateText, inst){
	    var currentJQuery = $wnd.jQuery(this);
	    @com.xedge.jquery.ui.client.handlers.DatepickerEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DatepickerEventHandler;Lcom/xedge/jquery/ui/client/JQueryUI;Ljava/lang/String;Lcom/google/gwt/user/client/Element;)(callback,currentJQuery,dateText, inst);
};
}-*/;

}

