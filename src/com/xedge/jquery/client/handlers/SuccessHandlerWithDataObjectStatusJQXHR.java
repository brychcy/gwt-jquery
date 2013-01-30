package com.xedge.jquery.client.handlers;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;
import com.xedge.jquery.client.JQXHR;
import com.xedge.jquery.client.model.AjaxSettings.AjaxStatus;


public abstract class SuccessHandlerWithDataObjectStatusJQXHR {
	public abstract void success(JSONObject data,AjaxStatus ajaxStatus,JQXHR jqxhr);
	static public void fire(SuccessHandlerWithDataObjectStatusJQXHR callback,JavaScriptObject data,String ajaxStatus,JQXHR jqxhr) {
		AjaxStatus status = null;
		 try{
			 status = AjaxStatus.valueOf(ajaxStatus);
		 }catch (Exception e) {
			 status = AjaxStatus.unknown;
		}		
		 callback.success(new JSONObject(data),status,jqxhr);
	}
}
