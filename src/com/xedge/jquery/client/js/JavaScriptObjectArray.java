package com.xedge.jquery.client.js;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
public class JavaScriptObjectArray<T extends JavaScriptObject> extends JsArray<T> {

	  protected JavaScriptObjectArray() {
	  }
	  
	  public static <T extends JavaScriptObject> JavaScriptObjectArray<T> create() {
		    return (JavaScriptObjectArray<T>) JavaScriptObject.createArray();
	  }
}
