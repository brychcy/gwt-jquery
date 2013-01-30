package com.xedge.jquery.ui.client.effects;

import com.xedge.jquery.ui.client.JQueryUI.Direction;

public class DropEffectOptions extends EffectOptions {
	
	protected DropEffectOptions() {
	}

	public static native DropEffectOptions create() /*-{		
		return {};
	}-*/;
	
	/**
	 * The direction of the effect Default:'left'
	 * @param orientation
	 */
	public final void setDirection(Direction direction) {
		setDirection(direction.name());
    }
	
	private final native void setDirection(String direction) /*-{
	this.direction=direction;
}-*/;

	
	/**
	 * Default distance is 20
	 * @param distance
	 */
	public final native void setDistance(int distance) /*-{
	this.distance=distance;
}-*/;
}
