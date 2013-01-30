package com.xedge.jquery.ui.client.effects;

public class PulsateEffectOptions extends EffectOptions {
	
	protected PulsateEffectOptions() {
	}

	public static native PulsateEffectOptions create() /*-{		
		return {};
	}-*/;
	
	/**
	 * Number of times to pulsate  Default times is 5
	 * @param times
	 */
	public final native void setTimes(int times) /*-{
	this.times=times;
}-*/;
	 
}