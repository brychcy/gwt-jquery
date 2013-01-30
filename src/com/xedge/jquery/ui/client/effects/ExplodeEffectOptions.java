package com.xedge.jquery.ui.client.effects;
public class ExplodeEffectOptions extends EffectOptions {
	protected ExplodeEffectOptions() {
	}

	public static native ExplodeEffectOptions create() /*-{		
		return {};
	}-*/;

	

	/**
	 * Pieces for the explosion
	 * @param pieces
	 */
	public final native void setPieces(int pieces) /*-{
	this.pieces=pieces;
}-*/;

}

