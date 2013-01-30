package com.xedge.jquery.client.handlers;

import com.xedge.jquery.client.JQXHR;
import com.xedge.jquery.client.model.AjaxSettings.AjaxStatus;

public abstract class SuccessHandlerWithDataStatusJQXHR {
	public abstract void success(String data,AjaxStatus ajaxStatus,JQXHR jqxhr);
	static public void fire(SuccessHandlerWithDataStatusJQXHR callback,String data,String textStatus,JQXHR jqxhr) {
		AjaxStatus status = null;
		 try{
			 status = AjaxStatus.valueOf(textStatus);
		 }catch (Exception e) {
			 status = AjaxStatus.unknown;
		}		
		 callback.success(data,status,jqxhr);
	}
}



