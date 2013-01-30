package com.xedge.jquery.client.handlers;

import com.google.gwt.xhr.client.XMLHttpRequest;
import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.client.model.AjaxSettings;

public abstract class GlobalCompleteHandler {
	public abstract void complete(JQuery currentJQuery,JQEvent event,XMLHttpRequest xmlHttpRequest,AjaxSettings ajaxSettings);
	static public void fire(GlobalCompleteHandler callback,JQuery currentJQuery,JQEvent event,XMLHttpRequest xmlHttpRequest,AjaxSettings ajaxSettings) {
		 callback.complete(currentJQuery,event,xmlHttpRequest,ajaxSettings);
	}
}
