package com.xedge.jquery.client.js;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayInteger;

public class JavaScriptIntegerArray extends JsArrayInteger {

	
	
	  protected JavaScriptIntegerArray() {
	  }
	  
	  public static JavaScriptIntegerArray create() {
		    return (JavaScriptIntegerArray) JavaScriptObject.createArray();
	  }	  
}
