package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.ui.client.handlers.ProgressbarEventHandler;
import com.xedge.jquery.ui.client.handlers.UIEventHandler;

/**
 * The progress bar is designed to simply display the current % complete for a process. The bar is coded to be flexibly sized through CSS and will scale to fit inside it's parent container by default. Theme : ui-progressbar , ui-progressbar-value
 * 
 * @author osaharri
 * 
 */
public class ProgressbarOptions extends JavaScriptObject {

	public enum ProgressbarOptionParameters {
		destroy, disable, enable,
	}

	public enum ProgressbarBooleanOption {
		disabled
	}

	protected ProgressbarOptions() {
	}

	public static native ProgressbarOptions create() /*-{
		return {};
	}-*/;

	/**
	 * Disables (true) or enables (false) the progressbar. Can be set when initialising (first creating) the progressbar. Default:false
	 * 
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
		this.disabled=disabled;
	}-*/;

	/**
	 * The value of the progressbar. Default:0
	 * 
	 * @param value
	 */
	public final native void setValue(int value) /*-{
		this.value=value;
	}-*/;

	/**
	 * The maximum value of the progressbar. Default:100
	 * 
	 * @param max
	 */
	public final native void setMax(int max) /*-{
		this.max=max;
	}-*/;

	/**
	 * This event is triggered when the value of the progressbar changes. Event type : progressbarchange
	 * 
	 * @param callback
	 */
	public final native void setChangeHandler(ProgressbarEventHandler callback) /*-{
		this.change = function(event){
			    var currentJQuery = $wnd.jQuery(this);
			    var newValue = currentJQuery.progressbar("value");
			    @com.xedge.jquery.ui.client.handlers.ProgressbarEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ProgressbarEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;I)(callback,event,currentJQuery,newValue);
		};
	}-*/;

	/**
	 * This event is triggered when the value of the progressbar reaches the maximum value of 100. Event type : progressbarcomplete
	 * 
	 * @param callback
	 */
	public final native void setCompleteHandler(UIEventHandler callback) /*-{
		this.complete = function(event){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.UIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/UIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,event,currentJQuery);
		};
	}-*/;
}
