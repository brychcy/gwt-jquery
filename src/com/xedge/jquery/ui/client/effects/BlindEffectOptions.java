package com.xedge.jquery.ui.client.effects;
import com.xedge.jquery.ui.client.JQueryUI.Orientation;

public class BlindEffectOptions extends EffectOptions {
	
	protected BlindEffectOptions() {
	}

	public static native BlindEffectOptions create() /*-{		
		return {};
	}-*/;
	
	/**
	 * The direction of the effect Default:'vertical'
	 * @param orientation
	 */
	public final void setDirection(Orientation direction) {
		setDirection(direction.name());
    }
	
	private final native void setDirection(String direction) /*-{
	this.direction=direction;
}-*/;
	


}

