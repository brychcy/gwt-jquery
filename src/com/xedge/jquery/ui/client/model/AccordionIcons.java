package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Configure the According header and headerSelected icons. The defaults are { 'header': 'ui-icon-triangle-1-e', 'headerSelected': 'ui-icon-triangle-1-s' }
 * 
 * @author joe
 * 
 */
public class AccordionIcons extends JavaScriptObject {
	protected AccordionIcons() {
	}

	public static native AccordionIcons create() /*-{
		var obj = {};	
		return obj;
	}-*/;

	public static AccordionIcons create(JQIcons header, JQIcons headerSelected) {
		return create(header.getFullName(), headerSelected.getFullName());
	}

	private static native AccordionIcons create(String header, String headerSelected) /*-{
		var obj = {};
		obj.header=header;
		obj.headerSelected=headerSelected;			
		return obj;
	}-*/;

	public final JQIcons getHeader() {
		return JQIcons.getByFullName(getHeaderJS());
	}

	private final native String getHeaderJS() /*-{
		return this.header;
	}-*/;

	public final void setHeader(JQIcons header) {
		setHeaderJS(header.getFullName());
	}

	private final native void setHeaderJS(String header) /*-{
		this.header=header;
	}-*/;

	public final JQIcons getHeaderSelected() {
		return JQIcons.getByFullName(getHeaderSelectedJS());
	}

	private final native String getHeaderSelectedJS() /*-{
		return this.headerSelected;
	}-*/;

	public final void setHeaderSelected(JQIcons headerSelected) {
		setHeaderSelectedJS(headerSelected.getFullName());
	}

	private final native void setHeaderSelectedJS(String headerSelected) /*-{
		this.headerSelected=headerSelected;
	}-*/;
}