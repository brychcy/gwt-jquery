package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Icons to display, with or without text (see text option). The primary icon is displayed by default on the left of the label text, the secondary by default is on the right. Value for the primary and secondary properties must be a classname 
 * @author osaharri
 *
 */
public class ButtonIcons extends JavaScriptObject {
	protected ButtonIcons() {
	}

	public static native ButtonIcons create() /*-{
		var obj = {};	
		return obj;
	}-*/;
	public static ButtonIcons create(JQIcons primary) {
		return create(primary.getFullName());
	}
	
	private static native ButtonIcons create(String primary) /*-{
	var obj = {};
	obj.primary=primary;		
	return obj;
}-*/;	
	public static ButtonIcons create(JQIcons primary, JQIcons secondary) {
		return create(primary.getFullName(), secondary.getFullName());
	}

	private static native ButtonIcons create(String primary, String secondary) /*-{
		var obj = {};
		obj.primary=primary;
		obj.secondary=secondary;			
		return obj;
	}-*/;

	public final JQIcons getPrimary() {
		return JQIcons.getByFullName(getPrimaryJS());
	}

	private final native String getPrimaryJS() /*-{
		return this.primary;
	}-*/;

	public final void setPrimary(JQIcons primary) {
		setPrimaryJS(primary.getFullName());
	}

	private final native void setPrimaryJS(String primary) /*-{
		this.primary=primary;
	}-*/;

	public final JQIcons getSecondary() {
		return JQIcons.getByFullName(getSecondaryJS());
	}

	private final native String getSecondaryJS() /*-{
		return this.secondary;
	}-*/;

	public final void setSecondary(JQIcons secondary) {
		setSecondaryJS(secondary.getFullName());
	}

	private final native void setSecondaryJS(String secondary) /*-{
		this.secondary=secondary;
	}-*/;
}