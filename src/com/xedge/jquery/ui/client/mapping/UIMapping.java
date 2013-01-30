package com.xedge.jquery.ui.client.mapping;
/**
 * @see http://jqueryui.com/docs/Theming/API
 * @author osaharri
 *
 */
public class UIMapping {
	//Layout Helpers
	//Applies display: none to elements.
	public static final String UI_HELPER_HIDDEN = "ui-helper-hidden";
	
	//Applies accessible hiding to elements (via abs positioning off the page)
	public static final String UI_HELPER_HIDDEN_ACCESSIBLE = "ui-helper-hidden-accessible";

	//A basic style reset for UI elements. Resets things such as padding, margins, text-decoration, list-style, etc.
	public static final String UI_HELPER_RESET = "ui-helper-reset";

	//Applies float wrapping properties to parent elements
	public static final String UI_HELPER_CLEARFIX = "ui-helper-clearfix";
	
	//Applies iframe "fix" css to iframe elements when needed in overlays
	public static final String UI_HELPER_ZFIX = "ui-helper-zfix";
	
	
	//Widget Containers
	//Class to be applied on outer container of all widgets. Applies font family and font size to widget. Also applies same family and 1em font size to child form elements specifically, to combat inheritance issues in Win browsers.
	public static final String UI_WIDGET = "ui-widget";
	
	//Class to be applied to header containers. Applies header container styles to an element and its child text, links, and icons.
	public static final String UI_WIDGET_HEADER = "ui-widget-header";

	//Class to be applied to content containers. Applies content container styles to an element and its child text, links, and icons. (can be applied to parent or sibling of header)
	public static final String UI_WIDGET_CONTENT = "ui-widget-content";


	//Interaction States
	//Class to be applied to clickable button-like elements. Applies "clickable default" container styles to an element and its child text, links, and icons.
	public static final String UI_STATE_DEFAULT = "ui-state-default";
	
	//Class to be applied on mouseover to clickable button-like elements. Applies "clickable hover" container styles to an element and its child text, links, and icons.
	public static final String UI_STATE_HOVER = "ui-state-hover"; 
	
	//Class to be applied on keyboard focus to clickable button-like elements. Applies "clickable hover" container styles to an element and its child text, links, and icons.
	public static final String UI_STATE_FOCUS = "ui-state-focus"; 

	//Class to be applied on mousedown to clickable button-like elements. Applies "clickable active" container styles to an element and its child text, links, and icons.
	public static final String UI_STATE_ACTIVE = "ui-state-active"; 
	
	
	
	//Interaction Cues
	//Class to be applied to highlighted or selected elements. Applies "highlight" container styles to an element and its child text, links, and icons.
	public static final String UI_STATE_HIGHLIGHT = "ui-state-highlight";
	
	//Class to be applied to error messaging container elements. Applies "error" container styles to an element and its child text, links, and icons.
	public static final String UI_STATE_ERROR = "ui-state-error"; 
	
	//An additional class that applies just the error text color without background. Can be used on form labels for instance. Also applies error icon color to child icons.
	public static final String UI_STATE_ERROR_TEXT = "ui-state-error-text"; 
	
	//Applies a dimmed opacity to disabled UI elements. Meant to be added in addition to an already-styled element.
	public static final String UI_STATE_DISABLED = "ui-state-disabled";
	
	//Class to be applied to a priority-1 button in situations where button hierarchy is needed. Applies bold text.
	public static final String UI_PRIORITY_PRIMARY = "ui-priority-primary"; 
	
    //Class to be applied to a priority-2 button in situations where button hierarchy is needed. Applies normal weight text and slight transparency to element.	
	public static final String UI_PRIORITY_SECONDARY = "ui-priority-secondary"; 
	
	 
	//Corner Radius helpers
	
	//Applies corner-radius to top left corner of element.
	public static final String UI_CORNER_TOPLEFT = "ui-corner-tl";
	
	//Applies corner-radius to top right corner of element.
	public static final String UI_CORNER_TOPRIGHT = "ui-corner-tr";

	//Applies corner-radius to bottom left corner of element.
	public static final String UI_CORNER_BOTTOMLEFT = "ui-corner-bl";

	//Applies corner-radius to bottom right corner of element.
	public static final String UI_CORNER_BOTTOMRIGHT = "ui-corner-br";

	//Applies corner-radius to both top corners of element.
	public static final String UI_CORNER_TOP = "ui-corner-top";
	
	//Applies corner-radius to both bottom corners of element.
	public static final String UI_CORNER_BOTTOM = "ui-corner-bottom";

	// Applies corner-radius to both right corners of element.
	public static final String UI_CORNER_RIGHT = "ui-corner-right";
	
	//Applies corner-radius to both left corners of element.
	public static final String UI_CORNER_LEFT = "ui-corner-left";

	//Applies corner-radius to all 4 corners of element.
	public static final String UI_CORNER_ALL = "ui-corner-all";

	//Overlay & Shadow
	//Applies 100% wxh dimensions to an overlay screen, along with background color/texture, and screen opacity.
	public static final String UI_WIDGET_OVERLAY = "ui-widget-overlay";

	//Class to be applied to overlay widget shadow elements. Applies background color/texture, custom corner radius, opacity, top/left offsets and shadow "thickness". Thickness is applied via padding to all sides of a shadow that is set to match the dimensions of the overlay element. Offsets are applied via top and left margins (can be positive or negative)
	public static final String UI_WIDGET_SHADOW= "ui-widget-shadow";

	//Base class to be applied to an icon element. Sets dimensions to 16px square block, hides inner text, sets background image to "content" state sprite image
	public static final String UI_ICON= "ui-icon";
	
	public static final String SELECTOR_BUTTON = ":button";
}
