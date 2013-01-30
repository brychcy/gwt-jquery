package com.xedge.jquery.ui.client.effects;

public class HighlightEffectOptions extends EffectOptions {

	
	protected HighlightEffectOptions() {
	}

	/**
	 * @return
	 */
	public static native HighlightEffectOptions create() /*-{		
		return {};
	}-*/;

	/**
	 * Color for the highlight    default : '#ffff99'
	 * @param color
	 */
	public final native void setColor(String color) /*-{
	this.color=color;
}-*/;

	


}
