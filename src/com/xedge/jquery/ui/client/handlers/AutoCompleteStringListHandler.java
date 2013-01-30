package com.xedge.jquery.ui.client.handlers;

import java.util.List;

import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.client.js.JavaScriptStringArray;

public abstract class AutoCompleteStringListHandler {
	public abstract List<String> getData(String value);

	static public JavaScriptStringArray fire(AutoCompleteStringListHandler callback, String value) {
		return JSHelper.convertStringListToJSArray(callback.getData(value));
	}
}