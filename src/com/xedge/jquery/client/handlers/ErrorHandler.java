package com.xedge.jquery.client.handlers;

import com.xedge.jquery.client.JQXHR;
import com.xedge.jquery.client.model.AjaxSettings.AjaxStatus;

public abstract class ErrorHandler {
	
	public abstract void error(AjaxStatus ajaxStatus,JQXHR jqxhr);
	static public void fire(ErrorHandler callback,String textStatus,JQXHR jqxhr) {
		AjaxStatus status = null;
		 try{
			 status = AjaxStatus.valueOf(textStatus);
		 }catch (Exception e) {
			 status = AjaxStatus.unknown;
		}
		 callback.error(status,jqxhr);
	}
}