package com.xedge.jquery.ui.client.effects;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.JQuery.Easing;
import com.xedge.jquery.ui.client.JQueryUI.Mode;

public abstract class EffectOptions extends JavaScriptObject {
	protected EffectOptions() {
	}	
	
	
	public static native EffectOptions create() /*-{		
	return  {};
}-*/;
	
	/**
	 * The easing algorith to use for the animation
	 * @param easing
	 */
	public final  void setEasing(Easing easing){
		setEasing(easing.name());
	}
	/**
	 * 
	 * @param easing
	 */
	private final native void setEasing(String easing) /*-{
	this.easing=easing;
}-*/;

    /**
     * Wether to show or hide the element .
     * @param mode
     */
	public final  void setMode(Mode mode){
		setMode(mode.name());
	}

	/**
	 * 
	 * @param mode
	 */
	private final native void setMode(String mode) /*-{
	this.mode=mode;
}-*/;


}
