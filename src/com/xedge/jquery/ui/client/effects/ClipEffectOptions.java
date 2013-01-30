package com.xedge.jquery.ui.client.effects;
import com.xedge.jquery.ui.client.JQueryUI.Orientation;

public class ClipEffectOptions  extends EffectOptions {
	
	protected ClipEffectOptions() {
	}

	public static native ClipEffectOptions create() /*-{		
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



