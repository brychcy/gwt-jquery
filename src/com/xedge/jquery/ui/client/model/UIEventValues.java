package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.model.CoOrdinates;

public abstract class UIEventValues extends JavaScriptObject {
	protected UIEventValues() {
	}

	/**
	 * Current position of the  helper 
	 * @return
	 */
	public final native CoOrdinates getPosition() /*-{
		return this.position;
	}-*/;


}
