package com.xedge.jquery.ui.client.effects;

import com.xedge.jquery.ui.client.JQueryUI.Direction;

public class BounceEffectOptions extends EffectOptions {
	
	protected BounceEffectOptions() {
	}

	public static native BounceEffectOptions create() /*-{		
		return {};
	}-*/;
	
	/**
	 * The direction of the effect Default:'up'
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
	
	/**
	 * Default times is 5
	 * @param times
	 */
	public final native void setTimes(int times) /*-{
	this.times=times;
}-*/;
	 
}