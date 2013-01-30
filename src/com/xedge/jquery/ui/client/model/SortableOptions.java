package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.client.js.JavaScriptIntegerArray;
import com.xedge.jquery.client.model.XYCoOrdinates;
import com.xedge.jquery.ui.client.JQueryUI.Axis;
import com.xedge.jquery.ui.client.JQueryUI.HelperType;
import com.xedge.jquery.ui.client.handlers.ReturnElementHandler;
import com.xedge.jquery.ui.client.handlers.SortableUIEventHandler;

/**
 * The jQuery UI Sortable plugin makes selected elements sortable by dragging with the mouse.
 * 
 * @author osaharri
 * 
 */
public class SortableOptions extends JavaScriptObject {

	public enum SortableOptionParameters {
		destroy, disable, enable, refresh, refreshPositions
	}

	public enum SortableTolerance {
		intersect, pointer
	}

	public enum SortableBooleanOption {
		disabled, dropOnEmpty, forceHelperSize, forcePlaceholderSize, revert, scroll
	}

	public enum SortableStringOption {
		appendTo, axis, cancel, connectWith, containment, cursor, handle, helper, items, placeholder, tolerance
	}

	public enum SortableDoubleOption {
		opacity
	}

	public enum SortableIntegerOption {
		delay, distance, revert, scrollSensitivity, scrollSpeed, zIndex
	}

	protected SortableOptions() {
	}

	public static native SortableOptions create() /*-{
		return {};
	}-*/;

	public final native boolean isDisabled() /*-{
		return this.disabled;
	}-*/;

	/**
	 * Disables (true) or enables (false) the sortable. Can be set when initialising (first creating) the sortable. Default:false
	 * 
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
		this.disabled=disabled;
	}-*/;

	public final native String getAppendTo() /*-{
		return this.appendTo;
	}-*/;

	public final native Element getAppendToElement() /*-{
		return this.appendTo||null;
	}-*/;

	/**
	 * Defines where the helper that moves with the mouse is being appended to during the drag ( for example, to resolve overlap/zIndex issues). Default:'parent'
	 * 
	 * @param appendTo
	 *            : Selector
	 */
	public final native void setAppendTo(String appendTo) /*-{
		this.appendTo=appendTo;
	}-*/;

	/**
	 * Defines where the helper that moves with the mouse is being appended to during the drag (for example, to resolve overlap/zIndex issues). Default:'parent'
	 * 
	 * @param appendTo
	 *            : Element
	 */
	public final native void setAppendTo(Element appendTo) /*-{
		this.appendTo=appendTo;
	}-*/;

	public final Axis getAxis() {
		Axis sortableAxis = null;
		try {
			String axis = getAxisJS();
			if (axis != null) {
				sortableAxis = Axis.valueOf(axis);
			}
		} catch (Exception e) {
		}
		return sortableAxis;
	}

	private final native String getAxisJS() /*-{
		return this.axis;
	}-*/;

	/**
	 * Constrains dragging to either the horizontal (x) or vertical (y) axis. Possible values: 'x', 'y'. Default:false
	 * 
	 * @param axis
	 */
	public final void setAxis(Axis axis) {
		setAxis(axis.name());
	}

	private final native void setAxis(String axis) /*-{
		this.axis=axis;
	}-*/;

	public final native String getCancel() /*-{
		return this.cancel;
	}-*/;

	/**
	 * Prevents sorting if you start on elements matching the selector. Default:':input,option'
	 * 
	 * @param cancel
	 *            : Selector
	 */
	public final native void setCancel(String cancel) /*-{
		this.cancel=cancel;
	}-*/;

	public final native String getConnectWith() /*-{
		return this.connectWith;
	}-*/;

	/**
	 * Takes a jQuery selector with items that also have sortables applied. If used, the sortable is now connected to the other one-way, so you can drag from this sortable to the other. Default:false
	 * 
	 * @param connectWith
	 *            : Selector
	 */
	public final native void setConnectWith(String connectWith) /*-{
		this.connectWith=connectWith;
	}-*/;

	public final native String getContainment() /*-{
		return this.containment;
	}-*/;

	public final native Element getContainmentElement() /*-{
		return this.containment||null;
	}-*/;

	/**
	 * Constrains dragging to within the bounds of the specified selector
	 * 
	 * @param containment
	 *            : selector
	 */
	public final native void setContainment(String containment) /*-{
		this.containment=containment;
	}-*/;

	/**
	 * Constrains dragging to within the bounds of the specified element. Possible values: 'parent', 'document', a DOMElement.
	 * 
	 * @param containment
	 *            : element
	 */
	public final native void setContainment(Element containment) /*-{
		this.containment=containment;
	}-*/;

	public final native String getCursor() /*-{
		return this.cursor;
	}-*/;

	/**
	 * Defines the cursor that is being shown while sorting. Default:'auto'
	 * 
	 * @param cursor
	 */
	public final native void setCursor(String cursor) /*-{
		this.cursor=cursor;
	}-*/;

	public final native FullCoOrdinates getCursorAt() /*-{
		return this.cursorAt;
	}-*/;

	/**
	 * Moves the sorting element or helper so the cursor always appears to drag from the same position. Coordinates can be given as a hash using a combination of one or two keys: { top, left, right, bottom }. Default:false
	 * 
	 * @param cursorAt
	 */
	public final native void setCursorAt(FullCoOrdinates cursorAt) /*-{
		this.cursorAt=cursorAt;
	}-*/;

	public final native int getDelay() /*-{
		return this.delay;
	}-*/;

	/**
	 * Time in milliseconds to define when the sorting should start. It helps preventing unwanted drags when clicking on an element. Default:0
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
	 * Tolerance, in pixels, for when sorting should start. If specified, sorting will not start until after mouse is dragged beyond distance. Can be used to allow for clicks on elements within a handle. Default:1
	 * 
	 * @param distance
	 */
	public final native void setDistance(int distance) /*-{
		this.distance=distance;
	}-*/;

	public final native boolean isDropOnEmpty() /*-{
		return this.dropOnEmpty;
	}-*/;

	/**
	 * If false items from this sortable can't be dropped to an empty linked sortable. : Default:true
	 * 
	 * @param dropOnEmpty
	 */
	public final native void setDropOnEmpty(boolean dropOnEmpty) /*-{
		this.dropOnEmpty=dropOnEmpty;
	}-*/;

	public final native boolean isForceHelperSize() /*-{
		return this.forceHelperSize;
	}-*/;

	/**
	 * If true, forces the helper to have a size. Default:false
	 * 
	 * @param forceHelperSize
	 */
	public final native void setForceHelperSize(boolean forceHelperSize) /*-{
		this.forceHelperSize=forceHelperSize;
	}-*/;

	public final native boolean isForcePlaceholderSize() /*-{
		return this.forcePlaceholderSize;
	}-*/;

	/**
	 * If true, forces the placeholder to have a size. Default:false
	 * 
	 * @param forcePlaceholderSize
	 */
	public final native void setForcePlaceholderSize(boolean forcePlaceholderSize) /*-{
		this.forcePlaceholderSize=forcePlaceholderSize;
	}-*/;

	private final native void setGridJS(JavaScriptIntegerArray grid) /*-{
		this.grid=grid;
	}-*/;

	private final native JavaScriptIntegerArray getGridJS() /*-{
		return this.grid;
	}-*/;

	public final XYCoOrdinates getGrid() {
		return JSHelper.convertJSArrayToXYCoOrdinates(getGridJS());
	}

	/**
	 * Snaps the sorting or helper to a grid, every x and y pixels. Default:false
	 * 
	 * @param xyCoOrdinates
	 */
	public final void setGrid(XYCoOrdinates xyCoOrdinates) {
		setGridJS(JSHelper.convertXYCoOrdinatesToJSArray(xyCoOrdinates));
	}

	public final native String getHandle() /*-{
		return this.handle;
	}-*/;

	public final native Element getHandleElement() /*-{
		return this.handle||null;
	}-*/;

	/**
	 * If specified, restricts sort start click to the specified element(s). Default:false
	 * 
	 * @param handle
	 *            : Selector
	 */
	public final native void setHandle(String handle) /*-{
		this.handle=handle;
	}-*/;

	/**
	 * If specified, restricts sort start click to the specified element. Default:false
	 * 
	 * @param handle
	 *            : Element
	 */
	public final native void setHandle(Element handle) /*-{
		this.handle=handle;
	}-*/;

	public final HelperType getHelper() {
		HelperType sortableHelper = null;
		try {
			String helper = getHelperJS();
			if (helper != null) {
				sortableHelper = HelperType.valueOf(helper);
			}
		} catch (Exception e) {
		}
		return sortableHelper;
	}

	private final native String getHelperJS() /*-{
		return this.helper;
	}-*/;

	/**
	 * Allows for a helper element to be used for dragging display. Possible values: 'original', 'clone Default:'original'
	 * 
	 * @param helper
	 */
	public final void setHelper(HelperType helper) {
		setHelper(helper.name());
	}

	private final native void setHelper(String helper) /*-{
		this.helper=helper;
	}-*/;

	/**
	 * Allows for a helper element to be used for dragging display. The callback must return a DOMElement
	 * 
	 * @param callback
	 */
	public final native void setHelperHandler(ReturnElementHandler callback) /*-{
		this.helper = function(event,es) {
			   return @com.xedge.jquery.ui.client.handlers.ReturnElementHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ReturnElementHandler;)(callback);
		};
	}-*/;

	public final native String getItems() /*-{
		return this.items;
	}-*/;

	/**
	 * Specifies which items inside the element should be sortable. Default:'> *'
	 * 
	 * @param items
	 *            : Selector
	 */
	public final native void setItems(String items) /*-{
		this.items=items;
	}-*/;

	public final native double getOpacity() /*-{
		return this.opacity;
	}-*/;

	/**
	 * Defines the opacity of the helper while sorting. From 0.01 to 1. Default:false
	 * 
	 * @param opacity
	 */
	public final native void setOpacity(double opacity) /*-{
		this.opacity=opacity;
	}-*/;

	public final native String getPlaceholder() /*-{
		return this.placeholder;
	}-*/;

	/**
	 * Class that gets applied to the otherwise white space. Default:false
	 * 
	 * @param placeholder
	 */
	public final native void setPlaceholder(String placeholder) /*-{
		this.placeholder=placeholder;
	}-*/;

	public final native boolean isRevert() /*-{
		return this.revert||false;
	}-*/;

	/**
	 * If set to true, the item will be reverted to its new DOM position with a smooth animation. Default:false
	 * 
	 * @param revert
	 */
	public final native void setRevert(boolean revert) /*-{
		this.revert=revert;
	}-*/;

	/**
	 * The item will be reverted to its new DOM position with a smooth animation. Controls the duration of the animation in ms. Default:false
	 * 
	 * @param revert
	 */
	public final native void setRevert(int revert) /*-{
		this.revert=revert;
	}-*/;

	public final native boolean isScroll() /*-{
		return this.scroll;
	}-*/;

	/**
	 * If set to true, the page scrolls when coming to an edge. Default:true
	 * 
	 * @param scroll
	 */
	public final native void setScroll(boolean scroll) /*-{
		this.scroll=scroll;
	}-*/;

	public final native int getScrollSensitivity() /*-{
		return this.scrollSensitivity;
	}-*/;

	/**
	 * Defines how near the mouse must be to an edge to start scrolling. Default:20
	 * 
	 * @param scrollSensitivity
	 */
	public final native void setScrollSensitivity(int scrollSensitivity) /*-{
		this.scrollSensitivity=scrollSensitivity;
	}-*/;

	public final native int getScrollSpeed() /*-{
		return this.scrollSpeed;
	}-*/;

	/**
	 * The speed at which the window should scroll once the mouse pointer gets within the scrollSensitivity distance. Default:20
	 * 
	 * @param scrollSpeed
	 */
	public final native void setScrollSpeed(int scrollSpeed) /*-{
		this.scrollSpeed=scrollSpeed;
	}-*/;

	public final SortableTolerance getTolerance() {
		SortableTolerance sortableTolerance = null;
		try {
			String tolerance = getToleranceJS();
			if (tolerance != null) {
				sortableTolerance = SortableTolerance.valueOf(tolerance);
			}
		} catch (Exception e) {
		}
		return sortableTolerance;
	}

	private final native String getToleranceJS() /*-{
		return this.tolerance;
	}-*/;

	/**
	 * This is the way the reordering behaves during drag. In some setups, 'pointer' is more natural. Default:'intersect' intersect: draggable overlaps the droppable at least 50% pointer: mouse pointer overlaps the droppable
	 * 
	 * @param tolerance
	 */
	public final void setTolerance(SortableTolerance sortableTolerance) {
		setTolerance(sortableTolerance.name());
	}

	private final native void setTolerance(String tolerance) /*-{
		this.tolerance=tolerance;
	}-*/;

	public final native int getZIndex() /*-{
		return this.zIndex;
	}-*/;

	/**
	 * Z-index for element/helper while being sorted. Default:1000
	 * 
	 * @param zIndex
	 */
	public final native void setZIndex(int zIndex) /*-{
		this.zIndex=zIndex;
	}-*/;
	

	/**
	 * This event is triggered when sorting starts. Event type : sortstart
	 */
	public final native void setStartHandler(SortableUIEventHandler callback) /*-{
		this.start = function(event,ui){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.SortableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SortableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SortableUIEventValues;)(callback,event,currentJQuery,ui);
		};
	}-*/;
	
	/**
	 * This event is triggered during sorting. Event type : sort
	 */
	public final native void setSortHandler(SortableUIEventHandler callback) /*-{
		this.sort = function(event,ui){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.SortableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SortableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SortableUIEventValues;)(callback,event,currentJQuery,ui);
		};
	}-*/;	
	
	/**
	 * This event is triggered during sorting, but only when the DOM position has changed. Event type : sortchange
	 * @param callback
	 */
	public final native void setChangeHandler(SortableUIEventHandler callback) /*-{
	this.change = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SortableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SortableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SortableUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
	/**
	 * This event is triggered when sorting stops, but when the placeholder/helper is still available. Event type : sortbeforestop
	 * @param callback
	 */
	public final native void setBeforeStopHandler(SortableUIEventHandler callback) /*-{
	this.beforeStop = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SortableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SortableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SortableUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
	/**
	 * This event is triggered when sorting has stopped. Event type : sortstop
	 * @param callback
	 */
	public final native void setStopHandler(SortableUIEventHandler callback) /*-{
	this.stop = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SortableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SortableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SortableUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
	/**
	 * This event is triggered when the user stopped sorting and the DOM position has changed. Event type : sortupdate
	 * @param callback
	 */
	public final native void setUpdateHandler(SortableUIEventHandler callback) /*-{
	this.update = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SortableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SortableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SortableUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
	/**
	 * This event is triggered when a connected sortable list has received an item from another list. Event type : sortreceive
	 * @param callback
	 */
	public final native void setReceiveHandler(SortableUIEventHandler callback) /*-{
	this.receive = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SortableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SortableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SortableUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
	/**
	 * This event is triggered when a sortable item has been dragged out from the list and into another. Event type : sortremove
	 * @param callback
	 */
	public final native void setRemoveHandler(SortableUIEventHandler callback) /*-{
	this.remove = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SortableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SortableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SortableUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
	/**
	 * This event is triggered when a sortable item is moved into a connected list. Event type : sortover
	 * @param callback
	 */
	public final native void setOverHandler(SortableUIEventHandler callback) /*-{
	this.over = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SortableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SortableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SortableUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
	/**
	 * This event is triggered when a sortable item is moved away from a connected list. Event type : sortout
	 * @param callback
	 */
	public final native void setOutHandler(SortableUIEventHandler callback) /*-{
	this.out = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SortableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SortableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SortableUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
	/**
	 * This event is triggered when using connected lists, every connected list on drag start receives it. Event type : sortactivate
	 * @param callback
	 */
	public final native void setActivateHandler(SortableUIEventHandler callback) /*-{
	this.activate = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SortableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SortableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SortableUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
	/**
	 * This event is triggered when sorting was stopped, is propagated to all possible connected lists. Event type : sortdeactivate
	 * @param callback
	 */
	public final native void setDeactivateHandler(SortableUIEventHandler callback) /*-{
	this.deactivate = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SortableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SortableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SortableUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
}
