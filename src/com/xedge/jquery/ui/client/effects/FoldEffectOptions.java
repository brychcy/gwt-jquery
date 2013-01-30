package com.xedge.jquery.ui.client.effects;

public class FoldEffectOptions extends EffectOptions {
	protected FoldEffectOptions() {
	}

	public static native FoldEffectOptions create() /*-{		
		return {};
	}-*/;


	/**
	 * Default fold size 15
	 * @param size
	 */
	public final native void setSize(int size) /*-{
	this.size=size;
}-*/;
	
	/**
	 * Fold horizontal first.  Default false
	 * @param horizFirst
	 */
	public final native void setHorizFirst(boolean horizFirst) /*-{
	this.horizFirst=horizFirst;
}-*/;

}




