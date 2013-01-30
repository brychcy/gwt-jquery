package com.xedge.jquery.ui.client.model;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.xedge.jquery.client.JQuery.Easing;
import com.xedge.jquery.client.JQuery.EventType;
import com.xedge.jquery.client.handlers.ValidateHandler;
import com.xedge.jquery.ui.client.JQueryUI;
import com.xedge.jquery.ui.client.JQueryUI.Effect;
import com.xedge.jquery.ui.client.handlers.AccordionUIEventHandler;

/**
 * Make the selected elements Accordion widgets. Semantic requirements:
 * 
 * The markup of your accordion container needs pairs of headers and content panels:
 * 
 * <div id="accordion"> <h3><a href="#">First header</a></h3> <div>First content</div> <h3><a href="#">Second header</a></h3> <div>Second content</div> </div>
 * 
 * Theme : main div = ui-accordion  , h3 = ui-accordion-header , content div = ui-accordion-content 
 * @author joe
 * 
 */
public class AccordionOptions extends JavaScriptObject {

	public enum AccordionOptionParameters {
		destroy, disable, enable, resize
	}
	
	public enum AccordionBooleanOption {
		disabled,active,animated,autoHeight,clearStyle,collapsible,fillSpace,navigation
	}

	public enum AccordionStringOption {
		animated,event,
	}
	
	public enum AccordionIntegerOption {
		active
	}
	
	protected AccordionOptions() {
	}
	
	

	public static native AccordionOptions create() /*-{
		return {};
	}-*/;

	/**
	 * Disables (true) or enables (false) the accordion. Can be set when initialising (first creating) the accordion. Default:false
	 * 
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
		this.disabled=disabled;
	}-*/;

	/**
	 * Expand the item at the position
	 * @param active : indexed postion
	 */
	public final native void setActive(int active) /*-{
		this.active=active;
	}-*/;
	
	/**
	 * Expand the item with the selector
	 * @param active : selector
	 */
	public final native void setActive(String active) /*-{
	this.active=active;
}-*/;
	
	/**
	 * Expand the element
	 * @param active
	 */
	public final native void setActive(Element active) /*-{
	this.active=active;
}-*/;
	
	/**
	 * Expand the items represented by the jquery object
	 * @param active
	 */
	public final native void setActive(JQueryUI active) /*-{
	this.active=active;
}-*/;

	/**
	 * Collapse all items
	 */
	public final native void inactiveAll() /*-{
	this.active=false;
	this.collapsible=true;
}-*/;	
	
	/**
	 * Choose your favorite animation easing  Default:'slide'
	 * @param easing
	 */
	public final void setAnimated(Easing easing) {
		 setAnimated(easing.name());
	}

	/**
	 * Choose your favorite animation effect  Default:'slide'
	 * @param effect
	 */
	public final void setAnimated(Effect effect) {
		 setAnimated(effect.name());
	}
	
	private final native void setAnimated(String animated) /*-{
	this.animated=animated;
}-*/;
	
	/**
	 * Disable animation
	 */
	public final native void disableAnimated() /*-{
	this.animated=false;
}-*/;
	/**
	 * If set, the highest content part is used as height reference for all other parts. Provides more consistent animations. Default:true
	 * Won't work together with clearStyle
	 * @param autoHeight
	 */
	public final native void setAutoHeight(boolean autoHeight) /*-{
	this.autoHeight=autoHeight;
	if(autoHeight){
	   this.clearStyle=false;
	}
}-*/;
	
	/**
	 * If set, clears height and overflow styles after finishing animations. This enables accordions to work with dynamic content. Won't work together with autoHeight. Default:false
	 * @param clearStyle
	 */
	public final native void setClearStyle(boolean clearStyle) /*-{
	this.clearStyle=clearStyle;
	if(clearStyle){
	   this.autoHeight=false;
	}
}-*/;

	/**
	 * Whether all the sections can be closed at once. Allows collapsing the active section by the triggering event (click is the default). Default:false
	 * @param collapsible
	 */
	public final native void setCollapsible(boolean collapsible) /*-{
	this.collapsible=collapsible;
}-*/;
	
	/**
	 * The event on which to trigger the accordion. Default:'click'
	 * @param eventType
	 */
	public final void setEvent(EventType eventType) {
		 setEvent(eventType.name());
	}
	
	private final native void setEvent(String event) /*-{
	this.event=event;
}-*/;
	
	/**
	 * If set, the accordion completely fills the height of the parent element. Overrides autoheight. Default:false
	 * @param fillSpace
	 */
	public final native void setFillSpace(boolean fillSpace) /*-{
	this.fillSpace=fillSpace;
}-*/;
	
	/**
	 * Selector for the header element. Default:'> li > :first-child,> :not(li):even'
	 * eg. 'h3'
	 * @param header : selector
	 */
	public final native void setHeader(String header) /*-{
	this.header=header;
}-*/;
	

	
	/**
	 * Selector for the header element. Default:'> li > :first-child,> :not(li):even'
	 * eg. 'h3'
	 * @param header
	 */
	public final native void setHeader(JQueryUI header) /*-{
	this.header=header;
}-*/;
	
	/**
	 * Icons to use for headers. Default:{ 'header': 'ui-icon-triangle-1-e', 'headerSelected': 'ui-icon-triangle-1-s' }
	 * @param icons
	 */
	public final native void setIcons(AccordionIcons icons) /*-{
	this.icons=icons;
}-*/;
	
	
	/**
	 * If set, looks for the anchor that matches location.href and activates it. Great for href-based state-saving. 
	 * Use navigationFilter to implement your own matcher. Default:false
	 * @param navigation
	 */
	public final native void setNavigation(boolean navigation) /*-{
	this.navigation=navigation;
}-*/;
	
	
	/**
	 * Overwrite the default location.href-matching with your own matcher.
	 * @param callback
	 */
	public final native void setNavigationFilter(ValidateHandler callback) /*-{
	     this.navigationFilter = function(){
	     @com.xedge.jquery.client.handlers.ValidateHandler::fire(Lcom/xedge/jquery/client/handlers/ValidateHandler;)(callback);
	};
}-*/;
	
	
	/**
	 * This event is triggered every time the accordion changes. If the accordion is animated, the event will be triggered upon completion of the animation; otherwise, it is triggered immediately
	 * Event type : accordionchange
	 */
	public final native void setChangeHandler(AccordionUIEventHandler callback) /*-{
		this.change = function(event,ui){
			    var currentJQuery = $wnd.jQuery(this);
			    @com.xedge.jquery.ui.client.handlers.AccordionUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/AccordionUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/AccordionUIEventValues;)(callback,event,currentJQuery,ui);
		};
	}-*/;

	/**
	 * This event is triggered every time the accordion starts to change. Event type : accordionchangestart
	 * @param callback
	 */
	public final native void setChangeStartHandler(AccordionUIEventHandler callback) /*-{
	this.changestart = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.AccordionUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/AccordionUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/AccordionUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
}
