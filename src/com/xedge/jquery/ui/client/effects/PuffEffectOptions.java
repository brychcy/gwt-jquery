package com.xedge.jquery.ui.client.effects;

public class PuffEffectOptions extends EffectOptions {

	
	protected PuffEffectOptions() {
	}

	/**
	 * @return
	 */
	public static native PuffEffectOptions create() /*-{		
		return {};
	}-*/;

	/**
	 * Percentage of component size to puff to : default : 150
	 * @param color
	 */
	public final native void setPercent(int percent) /*-{
	this.percent=percent;
}-*/;

	


}
