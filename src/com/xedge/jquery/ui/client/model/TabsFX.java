package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.JQuery.Duration;

public class TabsFX extends JavaScriptObject {
	protected TabsFX() {
	}

	public static native TabsFX create() /*-{
		return {};
	}-*/;

	/**
	 * A CSS property that will be animated eg. height , opacity
	 * @param name
	 */
	public final native void setToggleProperty(String name) /*-{
	  this[name]="toggle";
    }-*/;
	
	/**
	 * Use toggle to show and hide with height
	 * @param height
	 */
	public final native void setHeightToggle() /*-{
		this.height="toggle";
	}-*/;

	/**
	 * Use toggle to show and hide with opacity
	 * @param opacity
	 */
	public final native void setOpacityToggle() /*-{
		this.opacity="toggle";
	}-*/;

	public final native void setDuration(int duration) /*-{
		this.duration=duration;
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

}
