package com.xedge.jquery.client.handlers;

import com.google.gwt.core.client.JavaScriptObject;

public class AnimationFunction extends JavaScriptObject {
	protected AnimationFunction() {
	}

	public static native AnimationFunction create(AnimationCompleteHandler callback) /*-{
		return function() {
				    var currentJQuery = $wnd.jQuery(this);
	                @com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
};
	}-*/;
}

