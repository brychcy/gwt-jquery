package com.xedge.jquery.client.model;

import java.util.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.JQuery.Duration;
import com.xedge.jquery.client.JQuery.Easing;
import com.xedge.jquery.client.handlers.AnimationCompleteHandler;
import com.xedge.jquery.client.js.JSHelper;

/**
 * A map of additional options to pass to the animate method
 * 
 * @author osaharri
 * 
 */
public class AnimateOptions extends JavaScriptObject {
	protected AnimateOptions() {
	}

	public static native AnimateOptions create() /*-{
		return {};
	}-*/;

	/**
	 * A number determining how long the animation will run. eg. 300 , 600
	 * 
	 * @param duration
	 */
	public final native void setDuration(int duration) /*-{
		this.duration=duration;
	}-*/;

	/**
	 * A string determining how long the animation will run. eg. slow , fast
	 * 
	 * @param duration
	 */
	public final  void setDuration(Duration duration) {
		setDuration(duration.name());
	}
	private final native void setDuration(String duration) /*-{
		this.duration=duration;
	}-*/;

	/**
	 * A string indicating which easing function to use for the transition.
	 * 
	 * @param easing
	 */
	public final  void setEasing(Easing easing) {
		setEasing(easing.name());
	}
	private final native void setEasing(String easing) /*-{
		this.easing=easing;
	}-*/;

	/**
	 * A function to call once the animation is complete.
	 * 
	 * @param callback
	 */
	public final native void setCompleteHandler(AnimationCompleteHandler callback) /*-{
		this.complete = function() {
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
		};
	}-*/;

	/**
	 * A function to be called after each step of the animation.
	 * 
	 * @param callback
	 */
	public final native void setStepHandler(AnimationCompleteHandler callback) /*-{
		this.step = function() {
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
		};
	}-*/;

	public final native boolean getQueue() /*-{
		return this.queue;
	}-*/;

	/**
	 * A Boolean indicating whether to place the animation in the effects queue. If false, the animation will begin immediately.
	 * 
	 * @param async
	 */
	public final native void setQueue(boolean queue) /*-{
		this.queue=queue;
	}-*/;

	/**
	 * A map of one or more of the CSS properties defined by the properties argument and their corresponding easing functions 
	 * @param propertValuePairs
	 */
	public final void setSpecialEasing(Map<String, String> propertValuePairs) {
		this.setSpecialEasing(JSHelper.convertStringMapToJSONObject(propertValuePairs).getJavaScriptObject());
	}

	private final native void setSpecialEasing(JavaScriptObject propertValuePairs) /*-{
		return this.specialEasing = propertValuePairs;
	}-*/;

}
