package com.xedge.jquery.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.handlers.ConverterHandler;
import com.xedge.jquery.client.model.AjaxSettings.AjaxDataType;

public class ConverterHolder extends JavaScriptObject {
	protected ConverterHolder() {
	}

	public static native ConverterHolder create() /*-{
		return {};
	}-*/;

	public final void addHandler(AjaxDataType fromDataType, AjaxDataType toDataType, ConverterHandler callback) {
		addHandler(fromDataType.name() + " " + toDataType.name(), callback);
	}

	private final native void addHandler(String dataTypes, ConverterHandler callback) /*-{
		this[dataTypes] = function(data) {
			    return @com.xedge.jquery.client.handlers.ConverterHandler::fire(Lcom/xedge/jquery/client/handlers/ConverterHandler;Ljava/lang/String;)(callback,data);
		};
	}-*/;

}
