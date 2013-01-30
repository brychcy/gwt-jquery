package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.xedge.jquery.client.js.JavaScriptIntegerArray;
import com.xedge.jquery.client.model.XYCoOrdinates;
import com.xedge.jquery.ui.client.JQueryUI.Axis;
import com.xedge.jquery.ui.client.JQueryUI.HelperType;
import com.xedge.jquery.ui.client.handlers.DraggableUIEventHandler;
import com.xedge.jquery.ui.client.handlers.ReturnElementHandler;
import com.xedge.jquery.ui.client.js.JSHelper;

/**
 * The jQuery UI Draggable plugin makes selected elements draggable by mouse. Draggable elements gets a class of ui-draggable During drag the element also gets a class of ui-draggable-dragging
 * 
 * @author osaharri
 * 
 */
public class DraggableOptions extends JavaScriptObject {

	protected DraggableOptions() {
	}

	public enum DraggableBooleanOption {
		disabled, addClasses, iframeFix, refreshPositions, revert, scroll, snap, snapMode
	}

	public enum DraggableStringOption {
		appendTo, axis, cancel, connectToSortable, containment, cursor, handle, helper, revert, scope, snap, stack
	}

	public enum DraggableDoubleOption {
		opacity
	}

	public enum DraggableIntegerOption {
		delay, distance, revertDuration, scrollSensitivity, scrollSpeed, snapTolerance, zIndex
	}

	public enum DraggableRevert {
		valid, invalid
	}

	public enum DraggableSnapMode {
		inner, outer, both
	}

	public static native DraggableOptions create() /*-{
		return {};
	}-*/;

	public final native boolean isDisabled() /*-{
		return this.disabled;
	}-*/;

	/**
	 * Enable or Disable draggable Default:false
	 * 
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
		this.disabled=disabled;
	}-*/;

	public final native boolean isAddClasses() /*-{
		return this.addClasses;
	}-*/;

	/**
	 * If set to false, will prevent the ui-draggable class from being added. This may be desired as a performance optimization when calling .draggable() init on many hundreds of elements. Default:true
	 * 
	 * @param addClasses
	 */
	public final native void setAddClasses(boolean addClasses) /*-{
		this.addClasses=addClasses;
	}-*/;

	public final native String getAppendTo() /*-{
		return this.appendTo;
	}-*/;

	public final native Element getAppendToElement() /*-{
		return this.appendTo||null;
	}-*/;

	/**
	 * The element selected by the appendTo option will be used as the draggable helper's container during dragging. By default, the helper is appended to the same container as the draggable. Default:'parent'
	 * 
	 * @param appendTo
	 *            : Selector
	 */
	public final native void setAppendTo(String appendTo) /*-{
		this.appendTo=appendTo;
	}-*/;

	/**
	 * The element passed to the appendTo option will be used as the draggable helper's container during dragging. By default, the helper is appended to the same container as the draggable. Default:'parent'
	 * 
	 * @param appendTo
	 *            : Element
	 */
	public final native void setAppendTo(Element appendTo) /*-{
		this.appendTo=appendTo;
	}-*/;

	 public final Axis getAxis() {
		Axis draggableAxis = null;
		try {
			String axis = getAxisJS();
			if (axis != null) {
				draggableAxis = Axis.valueOf(axis);
			}
		} catch (Exception e) {
		}
		return draggableAxis;
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
	 * Prevents dragging from starting on specified elements. Default:':input,option'
	 * 
	 * @param cancel
	 *            : Selector
	 */
	public final native void setCancel(String cancel) /*-{
		this.cancel=cancel;
	}-*/;

	public final native String getConnectToSortable() /*-{
		return this.connectToSortable;
	}-*/;

	/**
	 * Allows the draggable to be dropped onto the specified sortables. If this option is used (helper must be set to 'clone' in order to work flawlessly), a draggable can be dropped onto a sortable list and then becomes part of it. Default:false
	 * 
	 * @param connectToSortable
	 *            : Selector
	 */
	public final native void setConnectToSortable(String connectToSortable) /*-{
		this.connectToSortable=connectToSortable;
	}-*/;

	public final native String getContainment() /*-{
		return this.containment;
	}-*/;

	public final native Element getContainmentElement() /*-{
		return this.containment||null;
	}-*/;
	

	/**
	 * Constrains dragging to within the bounds of the specified region [x1, y1, x2, y2]
	 * @param regionCoOrdinates
	 */
	public final void setContainmentRegion(RegionCoOrdinates regionCoOrdinates) {
		setContainmentJS(JSHelper.convertRegionCoOrdinatesToJSArray(regionCoOrdinates));
	}
	
	private final native void setContainmentJS(JavaScriptIntegerArray containment) /*-{
	this.containment=containment;
}-*/;

private final native JavaScriptIntegerArray getContainmentJS() /*-{
	return this.containment;
}-*/;


public final RegionCoOrdinates getContainmentRegion() {
	return JSHelper.convertJSArrayToRegionCoOrdinates(getContainmentJS());
}


	/**
	 * Constrains dragging to within the bounds of the specified element . Possible string values: 'parent', 'document', 'window'. Default:false
	 * 
	 * @param containment
	 *            : Selector,String, Array
	 */
	public final native void setContainment(String containment) /*-{
		this.containment=containment;
	}-*/;


	
	/**
	 * Constrains dragging to within the bounds of the specified element or region. Possible string values: 'parent', 'document', 'window', [x1, y1, x2, y2]. Default:false
	 * 
	 * @param containment
	 *            : Element
	 */
	public final native void setContainment(Element containment) /*-{
		this.containment=containment;
	}-*/;

	public final native String getCursor() /*-{
		return this.cursor;
	}-*/;

	/**
	 * The css cursor during the drag operation. Default:'auto'
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
	 * Sets the offset of the dragging helper relative to the mouse cursor. Coordinates can be given as a hash using a combination of one or two keys: { top, left, right, bottom }. Default:false
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
	 * Time in milliseconds after mousedown until dragging should start. This option can be used to prevent unwanted drags when clicking on an element. Default:0
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
	 * Distance in pixels after mousedown the mouse must move before dragging should start. This option can be used to prevent unwanted drags when clicking on an element. Default:1
	 * 
	 * @param distance
	 */
	public final native void setDistance(int distance) /*-{
		this.distance=distance;
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
	 * Snaps the dragging helper to a grid, every x and y pixels. Default:false
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
	 * If specified, restricts drag start click to the specified element(s). Default:false
	 * 
	 * @param handle
	 *            : Selector
	 */
	public final native void setHandle(String handle) /*-{
		this.handle=handle;
	}-*/;

	/**
	 * If specified, restricts drag start click to the specified element. Default:false
	 * 
	 * @param handle
	 *            : Element
	 */
	public final native void setHandle(Element handle) /*-{
		this.handle=handle;
	}-*/;

	public final HelperType getHelper() {
		HelperType draggableHelper = null;
		try {
			String helper = getHelperJS();
			if (helper != null) {
				draggableHelper = HelperType.valueOf(helper);
			}
		} catch (Exception e) {
		}
		return draggableHelper;
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
		this.helper = function(event) {
			   return @com.xedge.jquery.ui.client.handlers.ReturnElementHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ReturnElementHandler;)(callback);		  
		};
	}-*/;

	public final native boolean isIframeFix() /*-{
		return this.iframeFix;
	}-*/;

	/**
	 * Prevent iframes from capturing the mousemove events during a drag. Useful in combination with cursorAt, or in any case, if the mouse cursor is not over the helper. If set to true, transparent overlays will be placed over all iframes on the page. If a selector is supplied, the matched iframes will have an overlay placed over them. Default:false
	 * 
	 * @param iframeFix
	 */
	public final native void setIframeFix(boolean iframeFix) /*-{
		this.iframeFix=iframeFix;
	}-*/;

	public final native double getOpacity() /*-{
		return this.opacity;
	}-*/;

	/**
	 * Opacity for the helper while being dragged. Default:false
	 * 
	 * @param opacity
	 */
	public final native void setOpacity(double opacity) /*-{
		this.opacity=opacity;
	}-*/;

	public final native boolean isRefreshPositions() /*-{
		return this.refreshPositions;
	}-*/;

	/**
	 * If set to true, all droppable positions are calculated on every mousemove. Caution: This solves issues on highly dynamic pages, but dramatically decreases performance. Default:false
	 * 
	 * @param refreshPositions
	 */
	public final native void setRefreshPositions(boolean refreshPositions) /*-{
		this.refreshPositions=refreshPositions;
	}-*/;

	public final native boolean isRevert() /*-{
		return this.revert||false;
	}-*/;

	/**
	 * If set to true, the element will return to its start position when dragging stops. Default:false
	 * 
	 * @param revert
	 */
	public final native void setRevert(boolean revert) /*-{
		this.revert=revert;
	}-*/;

	public final DraggableRevert getRevert() {
		DraggableRevert draggableRevert = null;
		try {
			String revert = getRevertJS();
			if (revert != null) {
				draggableRevert = DraggableRevert.valueOf(revert);
			}
		} catch (Exception e) {
		}
		return draggableRevert;
	}

	private final native String getRevertJS() /*-{
		return this.revert||null;
	}-*/;

	/**
	 * Possible string values: 'valid', 'invalid'. If set to invalid, revert will only occur if the draggable has not been dropped on a droppable. For valid, it's the other way around.
	 * 
	 * @param revert
	 */

	public final void setRevert(DraggableRevert revert) {
		setRevert(revert.name());
	};

	private final native void setRevert(String revert) /*-{
		this.revert=revert;
	}-*/;

	public final native int getRevertDuration() /*-{
		return this.revertDuration;
	}-*/;

	/**
	 * The duration of the revert animation, in milliseconds. Ignored if revert is false. Default:500
	 * 
	 * @param revertDuration
	 */
	public final native void setRevertDuration(int revertDuration) /*-{
		this.revertDuration=revertDuration;
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

	public final native boolean isScroll() /*-{
		return this.scroll;
	}-*/;

	/**
	 * If set to true, container auto-scrolls while dragging. Default:true
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
	 * Distance in pixels from the edge of the viewport after which the viewport should scroll. Distance is relative to pointer, not the draggable. Default:20
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

	public final native boolean isSnap() /*-{
		return this.snap||false;
	}-*/;

	/**
	 * If set to true (equivalent to '.ui-draggable'), the draggable will snap to the edges of the selected elements when near an edge of the element. Default:false
	 * 
	 * @param snap
	 */
	public final native void setSnap(boolean snap) /*-{
		this.snap=snap;
	}-*/;

	public final native String getSnap() /*-{
		return this.snap||'';
	}-*/;

	/**
	 * If set to a selector the draggable will snap to the edges of the selected elements when near an edge of the element.
	 * 
	 * @param snap
	 */
	public final native void setSnap(String snap) /*-{
		this.snap=snap;
	}-*/;

	public final DraggableSnapMode getSnapMode() {
		DraggableSnapMode draggableSnapMode = null;
		try {
			String snapMode = getSnapModeJS();
			if (snapMode != null) {
				draggableSnapMode = DraggableSnapMode.valueOf(snapMode);
			}
		} catch (Exception e) {
		}
		return draggableSnapMode;
	}

	private final native String getSnapModeJS() /*-{
		return this.snapMode;
	}-*/;

	/**
	 * Determines which edges of snap elements the draggable will snap to. Ignored if snap is false. Possible values: 'inner', 'outer', 'both' Default:'both'
	 * 
	 * @param snapMode
	 */

	public final void setSnapMode(DraggableSnapMode snapMode) {
		setSnapMode(snapMode.name());
	};

	private final native void setSnapMode(String snapMode) /*-{
		this.snapMode=snapMode;
	}-*/;

	public final native int getSnapTolerance() /*-{
		return this.snapTolerance;
	}-*/;

	/**
	 * The distance in pixels from the snap element edges at which snapping should occur. Ignored if snap is false. Default:20
	 * 
	 * @param snapTolerance
	 */
	public final native void setSnapTolerance(int snapTolerance) /*-{
		this.snapTolerance=snapTolerance;
	}-*/;

	public final native String getStack() /*-{
		return this.stack;
	}-*/;

	/**
	 * Controls the z-Index of the set of elements that match the selector, always brings to front the dragged item. Very useful in things like window managers. Default:false
	 * 
	 * @param stack
	 *            : Selector
	 */
	public final native void setStack(String stack) /*-{
		this.stack=stack;
	}-*/;

	public final native int getZIndex() /*-{
		return this.zIndex;
	}-*/;

	/**
	 * z-index for the helper while being dragged. Default:false
	 * 
	 * @param zIndex
	 */
	public final native void setZIndex(int zIndex) /*-{
		this.zIndex=zIndex;
	}-*/;

	// Events

	/**
	 * This event is triggered when dragging starts. Event type : dragstart
	 */
	public final native void setStartHandler(DraggableUIEventHandler callback) /*-{
		this.start = function(event,ui){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.DraggableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DraggableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DraggableUIEventValues;)(callback,event,currentJQuery,ui);
		};
	}-*/;

	/**
	 * This event is triggered when the mouse is moved during the dragging. Event type : drag
	 */
	public final native void setDragHandler(DraggableUIEventHandler callback) /*-{
		this.drag = function(event,ui){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.DraggableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DraggableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DraggableUIEventValues;)(callback,event,currentJQuery,ui);
		};
	}-*/;

	/**
	 * This event is triggered when dragging stops. Event type : dragstop
	 */
	public final native void setStopHandler(DraggableUIEventHandler callback) /*-{
		this.stop = function(event,ui){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.DraggableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DraggableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DraggableUIEventValues;)(callback,event,currentJQuery,ui);
		};
	}-*/;

}
