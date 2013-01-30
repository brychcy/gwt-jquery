package com.xedge.jquery.ui.client.effects;

public class TransferEffectOptions extends EffectOptions {


	protected TransferEffectOptions() {
	}

	/**
	 * Selector to transfer to
	 * @param to
	 * @return
	 */
	public static native TransferEffectOptions create(String to) /*-{		
		var obj = {};
	    obj.to=to;		
		return obj;
	}-*/;

	/**
	 * Selector to transfer to
	 * @param to
	 */
	public final native void setTo(String to) /*-{
	this.to=to;
}-*/;
	
	/**
	 * 
	 * @param className
	 */
	public final native void setClassName(String className) /*-{
	this.className=className;
}-*/;

}
