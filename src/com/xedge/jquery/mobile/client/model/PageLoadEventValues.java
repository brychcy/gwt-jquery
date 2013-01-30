package com.xedge.jquery.mobile.client.model;

import com.xedge.jquery.client.model.AjaxSettings.AjaxStatus;
import com.xedge.jquery.client.JQXHR;

public class PageLoadEventValues extends AbstractPageLoadEventValues {
	protected PageLoadEventValues() {
	}


	
    /**
     * The jQuery XMLHttpRequest object used when attempting to load the page. 	
     * @return
     */
	public final native JQXHR getXhr() /*-{
	return this.xhr;
}-*/;
	 
	private final native String getTextStatusJS() /*-{
	return this.textStatus;
}-*/;
	
	/**
	 * Status of ajax request.
	 * @return
	 */
	public final AjaxStatus getTextStatus(){
	return AjaxStatus.valueOf(getTextStatusJS());
};
	
	
} 

