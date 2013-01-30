package com.xedge.jquery.ui.client.effects;
import com.xedge.jquery.client.JQuery.ElementPosition;
import com.xedge.jquery.ui.client.JQueryUI.Orientation;

public class ScaleEffectOptions extends EffectOptions {
	
	protected ScaleEffectOptions() {
	}

	public static native ScaleEffectOptions create() /*-{		
		return {};
	}-*/;
	
	/**
	 * Percentage of element size to scale to.
	 * @param times
	 */
	public final native void setPercent(int percent) /*-{
	this.percent=percent;
}-*/;
	 
	/**
	 * Axis for the scaling.  Default 'both'; 
	 * @param axis
	 */
	public final void setDirection(Orientation direction) {
		setDirection(direction.name());
    }
	
	private final native void setDirection(String direction) /*-{
	this.direction=direction;
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
}