package com.xedge.jquery.ui.client.model;

import com.google.gwt.dom.client.Element;
import com.xedge.jquery.client.model.CoOrdinates;
import com.xedge.jquery.ui.client.JQueryUI;

public class SortableUIEventValues extends UIEventValues {
	protected SortableUIEventValues() {
	}

	public static native SortableUIEventValues create() /*-{
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
	 * Current absolute position of the helper
	 * 
	 * @return
	 */
	public final native CoOrdinates getOffset() /*-{
		return this.offset;
	}-*/;

	/**
	 * The current dragged element
	 * 
	 * @return
	 */
	public final native Element getItem() /*-{
		return this.item;
	}-*/;

	/**
	 * The placeholder (if you defined one)
	 * 
	 * @return
	 */
	public final native Element getPlaceholder() /*-{
		return this.placeholder;
	}-*/;

	/**
	 * The sortable where the item comes from (only exists if you move from one connected list to another)
	 * 
	 * @return
	 */
	public final native JQueryUI getSender() /*-{
		return this.sender;
	}-*/;
}
