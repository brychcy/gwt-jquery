package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.JQuery.Duration;
import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.client.js.JavaScriptIntegerArray;
import com.xedge.jquery.ui.client.JQueryUI.Orientation;
import com.xedge.jquery.ui.client.handlers.SliderUIEventHandler;
import com.xedge.jquery.ui.client.handlers.SliderUIEventWithResultHandler;
/**
 * The jQuery UI Slider plugin makes selected elements into sliders. There are various options such as multiple handles, and ranges. The handle can be moved with the mouse or the arrow keys.
 * Theme : ui-slider ,  ui-slider-horizontal  , ui-slider-handle
 * 
 * @author joe
 *
 */

public class SliderOptions extends JavaScriptObject {
	public enum SliderOptionParameters {
		destroy, disable, enable, 
	}
	
	public enum SliderBooleanOption {
		disabled,animate,range,
	}

	public enum SliderStringOption {
		animate,orientation,range
	}
	
	public enum SliderIntegerOption {
		animate,max,min,step,value
	}

	public enum SliderRange {
		min, max
	}
	protected SliderOptions() {
	}
	
	public static native SliderOptions create() /*-{
	return {};
}-*/;
	
	/**
	 * Disables (true) or enables (false) the slider. Can be set when initialising (first creating) the slider. Default:false
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
	this.disabled=disabled;
}-*/;
	
	/**
	 * Whether to slide handle smoothly when user click outside handle on the bar. Default:false
	 * @param animate
	 */
	public final native void setAnimate(boolean animate) /*-{
	this.animate=animate;
}-*/;
	
	/**
	 * Set animation speed .  Default:false
	 * @param animate
	 */
	public final void setAnimate(Duration animate) {
		setAnimate(animate.name());
    }
	
	private final native void setAnimate(String animate) /*-{
	this.animate=animate;
}-*/;
	
	/**
	 * Set the number of milliseconds to run the animation.   Default:false
	 * @param animate
	 */
	public final native void setAnimate(int animate) /*-{
	this.animate=animate;
}-*/;

	/**
	 * The maximum value of the slider.  Default:100
	 * @param max
	 */
	public final native void setMax(int max) /*-{
	this.max=max;
}-*/;
	
	/**
	 * The minimum  value of the slider.  Default:0
	 * @param max
	 */
	public final native void setMin(int min) /*-{
	this.min=min;
}-*/;
	
	/**
	 * The orientation of the slider Default:'horizontal'
	 * @param orientation
	 */
	public final void setOrientation(Orientation orientation) {
		setOrientation(orientation.name());
    }
	
	private final native void setOrientation(String orientation) /*-{
	this.orientation=orientation;
}-*/;

	/**
	 * If set to true, the slider will detect if you have two handles and create a stylable range element between these two.  Default:false
	 * @param range
	 */
	public final native void setRange(boolean range) /*-{
	this.range=range;
}-*/;
	
	/**
	 * A min range goes from the slider min to one handle. A max range goes from one handle to the slider max.  Default:false
	 * @param range
	 */
	public final void setRange(SliderRange range) {
		setRange(range.name());
    }
	
	private final native void setRange(String range) /*-{
	this.range=range;
}-*/;

	/**
	 * Determines the size or amount of each interval or step the slider takes between min and max.  Default:1
	 * @param step
	 */
	public final native void setStep(int step) /*-{
	this.step=step;
}-*/;
	
	/**
	 * Determines the value of the slider, if there's only one handle. If there is more than one handle, determines the value of the first handle.  Default:0
	 * @param value
	 */
	public final native void setValue(int value) /*-{
	this.value=value;
}-*/;
	
	/**
	 * This option can be used to specify multiple handles. If range is set to true, the length of 'values' should be 2.
	 * @param values
	 */
	public final void setValues(Integer[] values) {
		setValues(JSHelper.convertIntegerArrayToJSArray(values));
    }
	private final native void setValues(JavaScriptIntegerArray values) /*-{
	this.values=values;
}-*/;
	
	/**
	 * This event is triggered when the user starts sliding. Event type : slidestart
	 * @param callback
	 */
	public final native void setStartHandler(SliderUIEventHandler callback) /*-{
	this.start = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SliderUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SliderUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SliderUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
	/**
	 * This event is triggered on every mouse move during slide. Return false in order to prevent a slide. Event type : slide
	 * @param callback
	 */
	public final native void setSlideHandler(SliderUIEventWithResultHandler callback) /*-{
	this.slide = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    return @com.xedge.jquery.ui.client.handlers.SliderUIEventWithResultHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SliderUIEventWithResultHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SliderUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
	/**
	 * This event is triggered on slide stop, or if the value is changed programmatically (by the value method. Event type : slidechange
	 * @param callback
	 */
	public final native void setChangeHandler(SliderUIEventHandler callback) /*-{
	this.change = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SliderUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SliderUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SliderUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
	/**
	 * This event is triggered when the user stops sliding. Event type : slidestop
	 * @param callback
	 */
	public final native void setStopHandler(SliderUIEventHandler callback) /*-{
	this.stop = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.SliderUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/SliderUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/SliderUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
}
