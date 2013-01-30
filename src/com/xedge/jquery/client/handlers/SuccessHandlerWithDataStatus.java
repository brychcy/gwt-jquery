package com.xedge.jquery.client.handlers;

import com.xedge.jquery.client.model.AjaxSettings.AjaxStatus;

public abstract class SuccessHandlerWithDataStatus {
	public abstract void success(String data,AjaxStatus ajaxStatus);

	static public void fire(SuccessHandlerWithDataStatus callback, String data, String textStatus) {
		AjaxStatus status = null;
		 try{
			 status = AjaxStatus.valueOf(textStatus);
		 }catch (Exception e) {
			 status = AjaxStatus.unknown;
		}	
		callback.success(data, status);
	}
}
