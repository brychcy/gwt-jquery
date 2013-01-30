package com.xedge.jquery.client.handlers;

import com.xedge.jquery.client.JQXHR;
import com.xedge.jquery.client.model.AjaxSettings;


public abstract class BeforeSendHandler {
	public abstract boolean beforeSend(JQXHR jqXHR,AjaxSettings settings);
	static public boolean fire(BeforeSendHandler callback,JQXHR jqXHR,AjaxSettings settings) {
		 return callback.beforeSend(jqXHR,settings);
	}
}



