package com.xedge.jquery.client.handlers;

import com.google.gwt.core.client.JavaScriptObject;

public interface AuthorisationHandler {
	 void loggedIn(JavaScriptObject user);
	 void loggedOut();
}
