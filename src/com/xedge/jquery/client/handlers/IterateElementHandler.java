package com.xedge.jquery.client.handlers;

import com.google.gwt.dom.client.Element;
import com.xedge.jquery.client.JQuery;


public abstract class IterateElementHandler {
	public  abstract void execute(int index,Element element,JQuery currentJQuery);
	
	static public void fire(IterateElementHandler callback,int index,Element element,JQuery currentJQuery) {
		 callback.execute(index,element,currentJQuery);
	}
}