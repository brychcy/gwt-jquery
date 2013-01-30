package com.xedge.jquery.ui.client.model;

import com.xedge.jquery.client.model.CoOrdinates;
import com.xedge.jquery.ui.client.JQueryUI;

public class DraggableUIEventValues  extends UIEventValues {
	protected DraggableUIEventValues() {
	}

	public static native DraggableUIEventValues create() /*-{
		return {};
	}-*/;


	/**
	 * The jQuery object representing the helper that's being dragged
	 * @return
	 */
	public final native JQueryUI getHelper() /*-{
		return this.helper;
	}-*/;
	
	/**
	 * Current absolute position of the  helper 
	 * @return
	 */
	public final native CoOrdinates getOffset() /*-{
		return this.offset;
	}-*/;

}
