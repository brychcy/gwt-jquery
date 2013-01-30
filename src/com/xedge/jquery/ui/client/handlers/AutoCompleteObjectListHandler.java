package com.xedge.jquery.ui.client.handlers;

import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.ui.client.model.LabelValuePair;

public abstract class AutoCompleteObjectListHandler {
	public abstract List<LabelValuePair> getData(String value);

	static public JavaScriptObject fire(AutoCompleteObjectListHandler callback, String value) {
		return JSHelper.convertObjectListToJSArray(callback.getData(value));
	}
}
