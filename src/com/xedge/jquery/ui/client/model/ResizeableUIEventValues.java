package com.xedge.jquery.ui.client.model;

import com.xedge.jquery.client.model.CoOrdinates;
import com.xedge.jquery.client.model.Size;
import com.xedge.jquery.ui.client.JQueryUI;

public class ResizeableUIEventValues extends UIEventValues {
	protected ResizeableUIEventValues() {
	}

	public static native ResizeableUIEventValues create() /*-{
		return {};
	}-*/;

	/**
	 * The jQuery object representing the helper element
	 * 
	 * @return
	 */
	public final native JQueryUI getHelper() /*-{
		return this.helper;
	}-*/;

	/**
	 * Position before resizing started
	 * 
	 * @return
	 */
	public final native CoOrdinates getOriginalPosition() /*-{
		return this.originalPosition;
	}-*/;

	/**
	 * Size before resizing started
	 * 
	 * @return
	 */
	public final native Size getOriginalSize() /*-{
		return this.originalSize;
	}-*/;

	/**
	 * Current size
	 * 
	 * @return
	 */
	public final native Size getSize() /*-{
		return this.size;
	}-*/;
}
