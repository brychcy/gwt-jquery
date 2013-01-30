package com.xedge.jquery.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.JQuery.EventType;
import com.xedge.jquery.client.handlers.EventHandler;

public class EventHolder extends JavaScriptObject {
	protected EventHolder() {
	}

	public static native EventHolder create() /*-{
		return {};
	}-*/;
	public final void addHandler(EventType eventType,EventHandler callback) {
		addHandler(eventType.name(), callback);
	}
	private final native void addHandler(String eventType,EventHandler callback) /*-{
	this[eventType] = function(event) {
			var currentJQuery = $wnd.jQuery(this);
			@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
	};
}-*/;

}
