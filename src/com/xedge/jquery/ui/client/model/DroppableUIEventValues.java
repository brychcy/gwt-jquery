package com.xedge.jquery.ui.client.model;

import com.xedge.jquery.client.model.CoOrdinates;
import com.xedge.jquery.ui.client.JQueryUI;

public class DroppableUIEventValues extends UIEventValues {
	protected DroppableUIEventValues() {
	}

	public static native DroppableUIEventValues create() /*-{
		return {};
	}-*/;



	/**
	 * Current draggable element
	 * @return
	 */
	public final native JQueryUI getDraggable() /*-{
		return this.draggable;
	}-*/;

	/**
	 * Current draggable helper
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
