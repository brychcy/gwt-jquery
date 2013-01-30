package com.xedge.jquery.ui.client.effects;

import com.xedge.jquery.ui.client.JQueryUI.Direction;

public class ShakeEffectOptions extends EffectOptions {
	
	protected ShakeEffectOptions() {
	}

	public static native ShakeEffectOptions create() /*-{		
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
	
	/**
	 * Default times is 3
	 * @param times
	 */
	public final native void setTimes(int times) /*-{
	this.times=times;
}-*/;
	
	/**
	 * Speed per shake   Default 140 . The duration of the effect will take precindence over this
	 * @param duration
	 */
	public final native void setDuration(int duration) /*-{
	this.duration=duration;
}-*/;
	
}