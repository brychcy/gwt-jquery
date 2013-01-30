package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.ui.client.JQueryUI;

public class AccordionUIEventValues extends JavaScriptObject {
	protected AccordionUIEventValues() {
	}

	public static native AccordionUIEventValues create() /*-{
		return {};
	}-*/;

	/**
	 * The jQuery object representing the activated header.
	 * 
	 * @return
	 */
	public final native JQueryUI getNewHeader() /*-{
		return this.newHeader ;
	}-*/;

	/**
	 * The jQuery object representing the previous  header.
	 * 
	 * @return
	 */
	public final native JQueryUI getOldHeader () /*-{
		return this.oldHeader  ;
	}-*/;

	
	/**
	 * The jQuery object representing the activated content.
	 * 
	 * @return
	 */
	public final native JQueryUI getNewContent () /*-{
		return this.newContent  ;
	}-*/;

	
	/**
	 * The jQuery object representing the previous content.
	 * 
	 * @return
	 */
	public final native JQueryUI getOldContent () /*-{
		return this.oldContent  ;
	}-*/;


}
