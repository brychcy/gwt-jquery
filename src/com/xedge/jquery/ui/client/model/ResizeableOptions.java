package com.xedge.jquery.ui.client.model;

import java.util.ArrayList;
import java.util.List;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.client.JQuery.Duration;
import com.xedge.jquery.client.JQuery.Easing;
import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.client.js.JavaScriptIntegerArray;
import com.xedge.jquery.client.model.XYCoOrdinates;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.handlers.ResizeableUIEventHandler;


/**
 * The jQuery UI Resizable plugin makes selected elements resizable (meaning they have draggable resize handles). You can specify one or more handles as well as min and max width and height.
 * Themes : ui-resizable etc.
 * 
 * 
 * @author osaharri
 * 
 */
public class ResizeableOptions extends JavaScriptObject {

	protected ResizeableOptions() {
	}

	public enum ResizeableHandles {
		n, e, s, w, ne, se, sw, nw, all
	}

	public enum ResizeableBooleanOption {
		disabled, animate,aspectRatio,autoHide,ghost,
	}
	            
	public enum ResizeableStringOption {
		alsoResize,animateDuration,animateEasing,containment,handles,helper,
	}

	public enum ResizeableDoubleOption {
		aspectRatio
	}

	public enum ResizeableIntegerOption {
		delay,animateDuration,distance,maxWidth,maxHeight,minHeight,minWidth
	}
	public static native ResizeableOptions create() /*-{
		return {};
	}-*/;

	public final native boolean isDisabled() /*-{
		return this.disabled;
	}-*/;

	/**
	 * Disables (true) or enables (false) the resizable. Can be set when initialising (first creating) the resizable. Default:false
	 * 
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
		this.disabled=disabled;
	}-*/;

	public final native String getAlsoResize() /*-{
		return this.alsoResize;
	}-*/;

	public final native Element getAlsoResizeElement() /*-{
		return this.alsoResize||null;
	}-*/;

	public final native JQueryUI getAlsoResizeJQ() /*-{
		return this.alsoResize||null;
	}-*/;

	/**
	 * Resize these elements synchronous when resizing. Default:false
	 * 
	 * @param alsoResize
	 *            : selector
	 */
	public final native void setAlsoResize(String alsoResize) /*-{
		this.alsoResize=alsoResize;
	}-*/;

	/**
	 * Resize these elements synchronous when resizing. Default:false
	 * 
	 * @param alsoResize
	 *            : Element
	 */
	public final native void setAlsoResize(Element alsoResize) /*-{
		this.alsoResize=alsoResize;
	}-*/;

	/**
	 * Resize these elements synchronous when resizing. Default:false
	 * 
	 * @param alsoResize
	 *            : JQuery
	 */
	public final native void setAlsoResize(JQuery alsoResize) /*-{
		this.alsoResize=alsoResize;
	}-*/;

	public final native boolean isAnimate() /*-{
		return this.animate;
	}-*/;

	/**
	 * Animates to the final size after resizing. Default:false
	 * 
	 * @param animate
	 */
	public final native void setAnimate(boolean animate) /*-{
		this.animate=animate;
	}-*/;

	public final native int getAnimateDuration() /*-{
		return this.animateDuration;
	}-*/;

	/**
	 * Duration time for animating, in milliseconds. Default:'slow'
	 * 
	 * @param animateDuration
	 */
	public final native void setAnimateDuration(int animateDuration) /*-{
		this.animateDuration=animateDuration;
	}-*/;

	/**
	 * Duration time for animating, Possible values: 'slow', 'normal', 'fast'. Default:'slow'
	 * 
	 * @param animateDuration
	 */
	public final void setAnimateDuration(Duration animateDuration) {
		setAnimateDuration(animateDuration.name());
	}

	private final native void setAnimateDuration(String animateDuration) /*-{
		this.animateDuration=animateDuration;
	}-*/;

	public final Duration getAnimateDurationObject() {
		Duration duration = null;
		try {
			String animateDuration = getAnimateDurationJS();
			if (animateDuration != null) {
				duration = Duration.valueOf(animateDuration);
			}
		} catch (Exception e) {
		}
		return duration;
	}

	private final native String getAnimateDurationJS() /*-{
		return this.animateDuration;
	}-*/;

	/**
	 * Easing effect for animating.
	 * @param animateEasing
	 */
	public final void setAnimateEasing(Easing animateEasing) {
		setAnimateEasing(animateEasing.name());
	}

	private final native void setAnimateEasing(String animateEasing) /*-{
		this.animateEasing=animateEasing;
	}-*/;

	public final Easing getAnimateEasing() {
		Easing easing = null;
		try {
			String animateEasing = getAnimateEasingJS();
			if (animateEasing != null) {
				easing = Easing.valueOf(animateEasing);
			}
		} catch (Exception e) {
		}
		return easing;
	}

	private final native String getAnimateEasingJS() /*-{
		return this.animateEasing;
	}-*/;

	public final native double getAspectRatio() /*-{
		return this.aspectRatio;
	}-*/;

	/**
	 * A custom aspect ratio can be specified, such as 9 / 16, or 0.5. Default:false
	 * 
	 * @param aspectRatio
	 */
	public final native void setAspectRatio(double aspectRatio) /*-{
		this.aspectRatio=aspectRatio;
	}-*/;

	public final native boolean isAspectRatio() /*-{
		return this.aspectRatio;
	}-*/;

	/**
	 * If set to true, resizing is constrained by the original aspect ratio. Default:false
	 * 
	 * @param aspectRatio
	 */
	public final native void setAspectRatio(boolean aspectRatio) /*-{
		this.aspectRatio=aspectRatio;
	}-*/;

	public final native boolean isAutoHide() /*-{
		return this.autoHide;
	}-*/;

	/**
	 * If set to true, automatically hides the handles except when the mouse hovers over the element. Default:false
	 * 
	 * @param autoHide
	 */
	public final native void setAutoHide(boolean autoHide) /*-{
		this.autoHide=autoHide;
	}-*/;

	public final native String getCancel() /*-{
		return this.cancel;
	}-*/;

	/**
	 * Prevents resizing if you start on elements matching the selector. Default:':input,option'
	 * 
	 * @param cancel
	 *            : Selector
	 */
	public final native void setCancel(String cancel) /*-{
		this.cancel=cancel;
	}-*/;

	public final native String getContainment() /*-{
		return this.containment;
	}-*/;

	public final native Element getContainmentElement() /*-{
		return this.containment||null;
	}-*/;

	/**
	 * Constrains resizing to within the bounds of the specified selector
	 * 
	 * @param containment
	 *            : selector
	 */
	public final native void setContainment(String containment) /*-{
		this.containment=containment;
	}-*/;

	/**
	 * Constrains resizing to within the bounds of the specified element. Possible values: 'parent', 'document', a DOMElement.
	 * 
	 * @param containment
	 *            : element
	 */
	public final native void setContainment(Element containment) /*-{
		this.containment=containment;
	}-*/;

	public final native int getDelay() /*-{
		return this.delay;
	}-*/;

	/**
	 * Tolerance, in milliseconds, for when resizing should start. If specified, resizing will not start until after mouse is moved beyond duration. This can help prevent unintended resizing when clicking on an element. Default:0
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
	 * Tolerance, in pixels, for when resizing should start. If specified, resizing will not start until after mouse is moved beyond distance. This can help prevent unintended resizing when clicking on an element. Default:1
	 * 
	 * @param distance
	 */
	public final native void setDistance(int distance) /*-{
		this.distance=distance;
	}-*/;

	public final native boolean isGhost() /*-{
		return this.ghost;
	}-*/;

	/**
	 * If set to true, a semi-transparent helper element is shown for resizing. Default:false
	 * 
	 * @param ghost
	 */
	public final native void setGhost(boolean ghost) /*-{
		this.ghost=ghost;
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
	 * Snaps the resizing element to a grid, every x and y pixels. Default:false
	 * 
	 * @param xyCoOrdinates
	 */
	public final void setGrid(XYCoOrdinates xyCoOrdinates) {
		setGridJS(JSHelper.convertXYCoOrdinatesToJSArray(xyCoOrdinates));
	}

	private String getResizableHandles(List<ResizeableHandles> resizableHandles) {
		StringBuffer handlesList = new StringBuffer();
		for (ResizeableHandles handle : resizableHandles) {
			handlesList.append(handle.name());
			handlesList.append(",");
		}
		String handles = handlesList.toString();
		if(handles.length()>0){
			handles=handles.substring(0,handles.length()-1);
		}
		return handles;
	}

	/**
	 * Set resizable handles from different sides Default: 'e, s, se'
	 * 
	 * @param resizableHandles
	 */
	public final void setHandles(List<ResizeableHandles> resizableHandles) {
		setHandles(getResizableHandles(resizableHandles));
	}

	private final native void setHandles(String handles) /*-{
		this.handles=handles;
	}-*/;

	public final List<ResizeableHandles> getHandles() {
		List<ResizeableHandles> resizableHandles = new ArrayList<ResizeableHandles>();
		try {
			String handles = getHandlesJS();
			if (handles != null) {
				
				String[] tokens = handles.split(",");
				for (String value : tokens) {
					resizableHandles.add(ResizeableHandles.valueOf(value));
				}
			}
		} catch (Exception e) {
		}
		return resizableHandles;
	}

	private final native String getHandlesJS() /*-{
		return this.handles;
	}-*/;

	public final native String getHelper() /*-{
		return this.helper;
	}-*/;

	/**
	 * This is the css class that will be added to a proxy element to outline the resize during the drag of the resize handle. Once the resize is complete, the original element is sized. Default:false
	 * 
	 * @param helper
	 */
	public final native void setHelper(String helper) /*-{
		this.helper=helper;
	}-*/;

	public final native int getMaxHeight() /*-{
		return this.maxHeight;
	}-*/;

	/**
	 * This is the maximum height the resizable should be allowed to resize to.
	 * 
	 * @param maxHeight
	 */
	public final native void setMaxHeight(int maxHeight) /*-{
		this.maxHeight=maxHeight;
	}-*/;

	public final native int getMaxWidth() /*-{
		return this.maxWidth;
	}-*/;

	/**
	 * This is the maximum width the resizable should be allowed to resize to.
	 * 
	 * @param maxWidth
	 */
	public final native void setMaxWidth(int maxWidth) /*-{
		this.maxWidth=maxWidth;
	}-*/;

	public final native int getMinHeight() /*-{
		return this.minHeight;
	}-*/;

	/**
	 * his is the minimum height the resizable should be allowed to resize to.
	 * 
	 * @param minHeight
	 */
	public final native void setMinHeight(int minHeight) /*-{
		this.minHeight=minHeight;
	}-*/;

	public final native int getMinWidth() /*-{
		return this.minWidth;
	}-*/;

	/**
	 * his is the minimum width the resizable should be allowed to resize to.
	 * 
	 * @param minWidth
	 */
	public final native void setMinWidth(int minWidth) /*-{
		this.minWidth=minWidth ;
	}-*/;

	/**
	 * This event is triggered at the start of a resize operation. Event type : resizestart
	 */
	public final native void setStartHandler(ResizeableUIEventHandler callback) /*-{
		this.start = function(event,ui){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.ResizeableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ResizeableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/ResizeableUIEventValues;)(callback,event,currentJQuery,ui);
		};
	}-*/;	
	
	/**
	 * This event is triggered during the resize, on the drag of the resize handler. Event type : resize
	 * @param callback
	 */
	public final native void setResizeHandler(ResizeableUIEventHandler callback) /*-{
	this.resize = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.ResizeableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ResizeableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/ResizeableUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
	/**
	 * This event is triggered at the end of a resize operation. Event type : resizestop
	 * @param callback
	 */
	public final native void setStopHandler(ResizeableUIEventHandler callback) /*-{
	this.stop = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.ResizeableUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ResizeableUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/ResizeableUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
}
