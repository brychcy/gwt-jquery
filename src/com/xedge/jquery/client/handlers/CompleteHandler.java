package com.xedge.jquery.client.handlers;

import com.xedge.jquery.client.JQXHR;
import com.xedge.jquery.client.model.AjaxSettings.AjaxStatus;

public abstract class CompleteHandler {
	public abstract void complete(AjaxStatus status,JQXHR jqXHR);
	static public void fire(CompleteHandler callback,String textStatus,JQXHR jqXHR) {
		AjaxStatus status = null;
		 try{
			 status = AjaxStatus.valueOf(textStatus);
		 }catch (Exception e) {
			 status = AjaxStatus.unknown;
		}
		 callback.complete(status,jqXHR);
	}
}


