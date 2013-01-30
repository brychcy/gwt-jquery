package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler;

public class DialogButton  extends JavaScriptObject {

	protected DialogButton() {
	}

	public static DialogButton create(String text,ExecuteCurrentUIHandler callback) {
		DialogButton dialogButton = DialogButton.create();
		dialogButton.setText(text);
		dialogButton.setClickHandler(callback);
		return dialogButton;
	}
		
	private static native DialogButton create() /*-{
		return {};
	}-*/;
	
	public final native String getText() /*-{
	return this.text;
}-*/;


public final native void setText(String text) /*-{
	this.text=text;
}-*/;

public final native void setClickHandler(ExecuteCurrentUIHandler callback) /*-{
this.click = function() {
	var currentJQuery = $wnd.jQuery(this);
	@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
};
}-*/;
	
}
