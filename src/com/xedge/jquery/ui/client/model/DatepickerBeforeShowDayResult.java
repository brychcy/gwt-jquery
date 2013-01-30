package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;

public class DatepickerBeforeShowDayResult extends JavaScriptObject{

protected DatepickerBeforeShowDayResult() {
}

public static native DatepickerBeforeShowDayResult create(boolean selectable, String className, String tooltip) /*-{
	var obj = [3];
    obj[0]=selectable;
    obj[1]=className;
    obj[2]=tooltip;	
	return obj;
}-*/;

public static native DatepickerBeforeShowDayResult create(boolean selectable, String className) /*-{
var obj = [3];
obj[0]=selectable;
obj[1]=className;
return obj;
}-*/;

public static DatepickerBeforeShowDayResult create() {
return DatepickerBeforeShowDayResult.create(false);
}

public static DatepickerBeforeShowDayResult create(boolean selectable) {
	return DatepickerBeforeShowDayResult.create(selectable, "");
	}

/**
 * Whether or not this date is selectable.  Default : false
 * @param selectable
 */
public final native void setSelectable(boolean selectable) /*-{
this[0]=selectable;
}-*/;

/**
 *  CSS class name(s) or '' for the default presentation.  Default : ''
 * @param className
 */
public final native void setClassName(String className) /*-{
this[1]=className;
}-*/;


/**
 * An optional popup tooltip for this date.  Default : null
 * @param tooltip
 */
public final native void setTooltip(String tooltip) /*-{
this[2]=tooltip;
}-*/;




}
