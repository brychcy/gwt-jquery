package com.xedge.jquery.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.handlers.CommandHandler;
	public class StatusCodeHolder extends JavaScriptObject {
		protected StatusCodeHolder() {
		}

		public static native StatusCodeHolder create() /*-{
			return {};
		}-*/;

		public final native void addHandler(int statusCode,CommandHandler callback) /*-{
		this[statusCode] = function() {
			    @com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(callback);
		};
	}-*/;

	}

