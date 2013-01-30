package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.ui.client.handlers.SelectableUIEventHandler;
import com.xedge.jquery.ui.client.handlers.UIEventHandler;

/**
 * The jQuery UI Selectable plugin allows for elements to be selected by dragging a box (sometimes called a lasso) with the mouse over the elements. Also, elements can be selected by click or drag while holding the Ctrl/Meta key, allowing for multiple (non-contiguous) selections.
 * 
 * @author osaharri
 * 
 */
public class SelectableOptions extends JavaScriptObject {

	public enum SelectableOptionParameters {
		destroy, disable, enable,refresh
	}
	
	public enum SelectableTolerance {
		touch, fit
	}
	
	public enum SelectableBooleanOption {
		disabled, autoRefresh
	}
	            
	public enum SelectableStringOption {
		cancel,filter,tolerance
	}


	public enum SelectableIntegerOption {
		delay,distance
	}

	protected SelectableOptions() {
	}

	public static native SelectableOptions create() /*-{
		return {};
	}-*/;

	public final native boolean isDisabled() /*-{
		return this.disabled;
	}-*/;

	/**
	 * Disables (true) or enables (false) the selectable. Can be set when initialising (first creating) the selectable. Default:false
	 * 
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
		this.disabled=disabled;
	}-*/;

	public final native boolean isAutoRefresh() /*-{
		return this.autoRefresh;
	}-*/;

	/**
	 * This determines whether to refresh (recalculate) the position and size of each selectee at the beginning of each select operation. If you have many many items, you may want to set this to false and call the refresh method manually. Default:true
	 * 
	 * @param disabled
	 */
	public final native void setAutoRefresh(boolean autoRefresh) /*-{
		this.autoRefresh=autoRefresh;
	}-*/;

	public final native String getCancel() /*-{
		return this.cancel;
	}-*/;

	/**
	 * Prevents selecting if you start on elements matching the selector. Default:':input,option'
	 * 
	 * @param cancel
	 *            : Selector
	 */
	public final native void setCancel(String cancel) /*-{
		this.cancel=cancel;
	}-*/;

	public final native int getDelay() /*-{
		return this.delay;
	}-*/;

	/**
	 * Time in milliseconds to define when the selecting should start. It helps preventing unwanted selections when clicking on an element. Default:0
	 * 
	 * @param delay
	 */
	public final native void setDelay(int delay) /*-{
		this.delay=delay;
	}-*/;

	public final native int getDistance() /*-{
		return this.distance;
	}-*/;

	/**
	 * Tolerance, in pixels, for when selecting should start. If specified, selecting will not start until after mouse is dragged beyond distance. Default:0
	 * 
	 * @param distance
	 */
	public final native void setDistance(int distance) /*-{
		this.distance=distance;
	}-*/;

	public final native String getFilter() /*-{
		return this.filter;
	}-*/;

	/**
	 * The matching child elements will be made selectees (able to be selected). Default:'*'
	 * 
	 * @param cancel
	 *            : Selector
	 */
	public final native void setFilter(String filter) /*-{
		this.filter=filter;
	}-*/;

	public final SelectableTolerance getTolerance() {
		SelectableTolerance tolerance = null;
		try {
			String selectableTolerance = getToleranceJS();
			if (selectableTolerance != null) {
				tolerance = SelectableTolerance.valueOf(selectableTolerance);
			}
		} catch (Exception e) {
		}
		return tolerance;
	}

	private final native String getToleranceJS() /*-{
		return this.tolerance;
	}-*/;

	/**
	 * Possible values: 'touch', 'fit'. fit: draggable overlaps the droppable entirely touch: draggable overlaps the droppable any amount 
	 * Default:'touch'
	 * @param tolerance
	 */
	public final void setTolerance(SelectableTolerance tolerance) {
		setTolerance(tolerance.name());
	}

	private final native void setTolerance(String tolerance) /*-{
this.tolerance=tolerance;
}-*/;
	
	/**
	 * This event is triggered at the end of the select operation, on each element added to the selection. Event type : selectableselected
	 * @param callback
	 */
	public final native void setSelectedHandler(SelectableUIEventHandler callback) /*-{
	this.selected = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SelectableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SelectableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/google/gwt/dom/client/Element;)(callback,event,currentJQuery,ui.selected);
	};
}-*/;	
	
	
	/**
	 * This event is triggered during the select operation, on each element added to the selection. Event type : selectableselecting
	 * @param callback
	 */
	public final native void setSelectingHandler(SelectableUIEventHandler callback) /*-{
	this.selecting = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SelectableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SelectableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/google/gwt/dom/client/Element;)(callback,event,currentJQuery,ui.selecting);
	};
}-*/;
	
	/**
	 * This event is triggered at the beginning of the select operation. Event type : selectablestart
	 * @param callback
	 */
	public final native void setStartHandler(UIEventHandler callback) /*-{
	this.start = function(event){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.UIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/UIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,event,currentJQuery);
	};
}-*/;	

	/**
	 * This event is triggered at the end of the select operation. Event type : selectablestop
	 * @param callback
	 */
	public final native void setStopHandler(UIEventHandler callback) /*-{
	this.stop = function(event){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.UIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/UIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,event,currentJQuery);
	};
}-*/;	
	
	/**
	 * This event is triggered during the select operation, on each element removed from the selection. Event type : selectableunselecting
	 * @param callback
	 */
	public final native void setUnselectingHandler(SelectableUIEventHandler callback) /*-{
	this.unselecting = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SelectableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SelectableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/google/gwt/dom/client/Element;)(callback,event,currentJQuery,ui.unselecting);
	};
}-*/;
	
	/**
	 * This event is triggered at the end of the select operation, on each element removed from the selection. Event type : selectableunselected
	 * @param callback
	 */
	public final native void setUnselectedHandler(SelectableUIEventHandler callback) /*-{
	this.unselected = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SelectableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SelectableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/google/gwt/dom/client/Element;)(callback,event,currentJQuery,ui.unselected);
	};
}-*/;	
}
