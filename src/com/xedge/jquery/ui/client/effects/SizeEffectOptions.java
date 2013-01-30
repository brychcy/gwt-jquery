package com.xedge.jquery.ui.client.effects;

import com.xedge.jquery.client.model.Size;
import com.xedge.jquery.client.JQuery.ElementPosition;
import com.xedge.jquery.ui.client.JQueryUI.Scale;

public class SizeEffectOptions extends EffectOptions {
	
	protected SizeEffectOptions() {
	}

	public static native SizeEffectOptions create() /*-{		
		return {};
	}-*/;
	
	
	/**
	 * Defaults to false
	 * @param restore
	 */
	public final native void setRestore(boolean restore) /*-{
	this.restore=restore;
}-*/;
	/**
	 *  box : Scale the css box
	 *  content : scale the content or children
     *  Default 'both'; 
	 * @param scale
	 */
	public final void setScale(Scale scale) {
		setScale(scale.name());
    }
	
	private final native void setScale(String scale) /*-{
	this.scale=scale;
}-*/;
	
	/**
	 * The origin of the scaling  eg.  ['middle','center'];
	 * @param firstPosition
	 * @param secondPosition
	 */
	public final void setOrigin(ElementPosition firstPosition,ElementPosition secondPosition) {
		setOrigin(firstPosition.name(),secondPosition.name());
	}
	
	private final native void setOrigin(String firstPosition,String secondPosition) /*-{
	    this.origin=[firstPosition,secondPosition];
}-*/;
	
	/**
	 * Size to resize from.   default is original size
	 * @param from
	 */
	public final native void setFrom(Size from) /*-{
	this.from=from;
}-*/;

	/**
	 * Size to resize to.   default is original size
	 * @param to
	 */
	public final native void setTo(Size to) /*-{
	this.to=to;
}-*/;
}