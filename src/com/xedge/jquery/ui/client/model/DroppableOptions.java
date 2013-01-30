package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.ui.client.handlers.DroppableUIEventHandler;
import com.xedge.jquery.ui.client.handlers.ValidateDraggableHandler;

/**
 * The jQuery UI Droppable plugin makes selected elements droppable (meaning they accept being dropped on by draggables). You can specify which (individually) or which kind of draggables each will accept.
 * 
 * @author osaharri
 * 
 */
public class DroppableOptions extends JavaScriptObject {
	public enum DroppableTolerance {
		fit, intersect, pointer, touch
	}

	public enum DroppableBooleanOption {
		disabled, addClasses, greedy
	}
	
	public enum DroppableStringOption {
		accept, activeClass, hoverClass,scope,tolerance
	}
	protected DroppableOptions() {
	}

	public static native DroppableOptions create() /*-{
		return {};
	}-*/;

	public final native boolean isDisabled() /*-{
		return this.disabled;
	}-*/;

	/**
	 * Disables (true) or enables (false) the droppable. Can be set when initialising (first creating) the droppable. Default:false
	 * 
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
		this.disabled=disabled;
	}-*/;

	public final native String getAccept() /*-{
		return this.accept||'';
	}-*/;

	/**
	 * All draggables that match the selector will be accepted. Default:'*'
	 * 
	 * @param accept
	 *            : Selector
	 */
	public final native void setAccept(String accept) /*-{
		this.accept=accept;
	}-*/;

	/**
	 * 
	 */
	public final native void setAcceptHandler(ValidateDraggableHandler callback) /*-{
		this.accept = function(draggable){
			var droppable = $wnd.jQuery(this);
			return @com.xedge.jquery.ui.client.handlers.ValidateDraggableHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ValidateDraggableHandler;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,droppable,draggable);
		};
	}-*/;

	public final native String getActiveClass() /*-{
		return this.activeClass;
	}-*/;

	/**
	 * If specified, the class will be added to the droppable while an acceptable draggable is being dragged. Default:false
	 * 
	 * @param activeClass
	 */
	public final native void setActiveClass(String activeClass) /*-{
		this.activeClass=activeClass;
	}-*/;

	public final native boolean isAddClasses() /*-{
		return this.addClasses;
	}-*/;

	/**
	 * If set to false, will prevent the ui-droppable class from being added. This may be desired as a performance optimization when calling .droppable() init on many hundreds of elements. Default:true
	 * 
	 * @param addClasses
	 */
	public final native void setAddClasses(boolean addClasses) /*-{
		this.addClasses=addClasses;
	}-*/;

	public final native boolean isGreedy() /*-{
		return this.greedy;
	}-*/;

	/**
	 * If true, will prevent event propagation on nested droppables. Default:false
	 * 
	 * @param greedy
	 */
	public final native void setGreedy(boolean greedy) /*-{
		this.greedy=greedy;
	}-*/;

	public final native String getHoverClass() /*-{
		return this.hoverClass;
	}-*/;

	/**
	 * If specified, the class will be added to the droppable while an acceptable draggable is being hovered. Default:false
	 * 
	 * @param hoverClass
	 */
	public final native void setHoverClass(String hoverClass) /*-{
		this.hoverClass=hoverClass;
	}-*/;

	public final native String getScope() /*-{
		return this.scope;
	}-*/;

	/**
	 * Used to group sets of draggable and droppable items, in addition to droppable's accept option. A draggable with the same scope value as a droppable will be accepted by the droppable. Default:'default'
	 * 
	 * @param scope
	 */
	public final native void setScope(String scope) /*-{
		this.scope=scope;
	}-*/;

	public final DroppableTolerance getTolerance(){
		DroppableTolerance droppableTolerance = null;
		try{
		String tolerance = getToleranceJS();
		if(tolerance!=null){
			droppableTolerance = DroppableTolerance.valueOf(tolerance);
		}
		}catch (Exception e) {
		}
		return droppableTolerance;
	}

	
	private final native String getToleranceJS() /*-{
		return this.tolerance;
	}-*/;


	/**
	 * Specifies which mode to use for testing whether a draggable is 'over' a droppable. Default:'intersect' Possible values: 'fit', 'intersect', 'pointer', 'touch'. fit: draggable overlaps the droppable entirely intersect: draggable overlaps the droppable at least 50% pointer: mouse pointer overlaps the droppable touch: draggable overlaps the droppable any amount
	 * 
	 * @param tolerance
	 */
	public final void setTolerance(DroppableTolerance droppableTolerance) {
		setTolerance(droppableTolerance.name());
	}
	private final native void setTolerance(String tolerance) /*-{
	this.tolerance=tolerance;
}-*/;
	/**
	 * This event is triggered any time an accepted draggable starts dragging. This can be useful if you want to make the droppable 'light up' when it can be dropped on. Type:dropactivate
	 * 
	 * @param callback
	 */
	public final native void setActivateHandler(DroppableUIEventHandler callback) /*-{
		this.activate = function(event,ui){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.DroppableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DroppableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DroppableUIEventValues;)(callback,event,currentJQuery,ui);
		};
	}-*/;

	/**
	 * This event is triggered any time an accepted draggable stops dragging. Type:dropdeactivate
	 * 
	 * @param callback
	 */
	public final native void setDeactivateHandler(DroppableUIEventHandler callback) /*-{
		this.deactivate = function(event,ui){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.DroppableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DroppableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DroppableUIEventValues;)(callback,event,currentJQuery,ui);
		};
	}-*/;

	/**
	 * This event is triggered as an accepted draggable is dragged 'over' (within the tolerance of) this droppable. Type:dropover
	 * 
	 * @param callback
	 */
	public final native void setOverHandler(DroppableUIEventHandler callback) /*-{
		this.over = function(event,ui){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.DroppableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DroppableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DroppableUIEventValues;)(callback,event,currentJQuery,ui);
		};
	}-*/;

	/**
	 * This event is triggered when an accepted draggable is dragged out (within the tolerance of) this droppable. Type:dropout
	 * 
	 * @param callback
	 */
	public final native void setOutHandler(DroppableUIEventHandler callback) /*-{
		this.out = function(event,ui){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.DroppableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DroppableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DroppableUIEventValues;)(callback,event,currentJQuery,ui);
		};
	}-*/;

	/**
	 * This event is triggered when an accepted draggable is dropped 'over' (within the tolerance of) this droppable. 
	 * Type:drop
	 * @param callback
	 */
	public final native void setDropHandler(DroppableUIEventHandler callback) /*-{
		this.drop = function(event,ui){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.DroppableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DroppableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DroppableUIEventValues;)(callback,event,currentJQuery,ui);
		};
	}-*/;
}
