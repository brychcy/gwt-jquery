package com.xedge.jquery.client.handlers;

import com.google.gwt.core.client.JavaScriptObject;
public class CommandFunction  extends JavaScriptObject {
	protected CommandFunction() {
	}

	public static native CommandFunction create(CommandHandler callback) /*-{
		return function() {
			        @com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(callback);
};
	}-*/;
}

