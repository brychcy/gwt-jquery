package com.xedge.jquery.client.js;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArrayString;

public class JavaScriptStringArray extends JsArrayString {
	
	
	  protected JavaScriptStringArray() {
	  }
	  
	  public static JavaScriptStringArray create() {
		    return (JavaScriptStringArray) JavaScriptObject.createArray();
	  }	  
}
