package com.xedge.jquery.client.model;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * A collection of properties that represent the presence of different browser features or bugs.
 * @author osaharri
 *
 */
public class BrowserSupport extends JavaScriptObject {
	protected BrowserSupport() {
	}

	public static native BrowserSupport create() /*-{
		return {};
	}-*/;

	/**
	 * Is equal to true if the page is rendering according to the W3C CSS Box Model 
	 * (is currently false in IE 6 and 7 when they are in Quirks Mode). 
	 * This property is null until document ready occurs.
	 * @return
	 */
	public final native boolean boxModel() /*-{
	return this.boxModel;
}-*/;

	/**
	 * Is equal to true if the name of the property containing the CSS float value is .cssFloat, 
	 * as defined in the CSS Spec. (It is currently false in IE, it uses styleFloat instead).
	 * @return
	 */
	public final native boolean cssFloat() /*-{
	return this.cssFloat;
}-*/;	

	/**
	 * Is equal to true if the .getAttribute() method retrieves the href attribute of elements unchanged, 
	 * rather than normalizing it to a fully-qualified URL. (It is currently false in IE, the URLs are normalized).
	 * @return
	 */
	public final native boolean hrefNormalized() /*-{
	return this.hrefNormalized;
}-*/;	

	/**
	 *  Is equal to true if the browser is able to serialize/insert <link> elements using the 
	 *  .innerHTML property of elements. (is currently false in IE).
	 * @return
	 */
	public final native boolean htmlSerialize() /*-{
	return this.htmlSerialize;
}-*/;	
	
	/**
	 * Is equal to true if the browser inserts content with .innerHTML exactly as provided—specifically, 
	 * if leading whitespace characters are preserved. (It is currently false in IE 6-8).
	 * @return
	 */
	public final native boolean leadingWhitespace() /*-{
	return this.leadingWhitespace;
}-*/;			
	
	/**
	 * Is equal to true if cloned DOM elements are created without event handlers 
	 * (that is, if the event handlers on the source element are not cloned). (It is currently false in IE).
	 * @return
	 */
	public final native boolean noCloneEvent() /*-{
	return this.noCloneEvent;
}-*/;	
	
	/**
	 * Is equal to true if a browser can properly interpret the opacity style property. 
	 * (It is currently false in IE, it uses alpha filters instead). 
	 * @return
	 */
	public final native boolean opacity() /*-{
	return this.opacity;
}-*/;	
	
	/**
	 * Is equal to true if inline scripts are automatically evaluated and executed when inserted to the 
	 * document using standard DOM manipulation methods, such as appendChild() and createTextNode(). 
	 * (It is currently false in IE, it uses .text to insert executable scripts)
	 * @return
	 */
	public final native boolean scriptEval() /*-{
	return this.scriptEval;
}-*/;	
	
	/**
	 * Is equal to true if inline styles for an element can be accessed through the DOM attribute called 
	 * style, as required by the DOM Level 2 specification. In this case, .getAttribute('style') 
	 * can retrieve this value; in Internet Explorer, .cssText is used for this purpose. 
	 * @return
	 */
	public final native boolean style() /*-{
	return this.style;
}-*/;	
	
	/**
	 * Is equal to true if the submit event bubbles up the DOM tree, as required by the W3C DOM event model. 
	 * (It is currently false in IE, and jQuery simulates bubbling).
	 * @return
	 */
	public final native boolean submitBubbles() /*-{
	return this.submitBubbles;
}-*/;	

	/**
	 * Is equal to true if an empty <table> element can exist without a <tbody> element. According to the 
	 * HTML specification, this sub-element is optional, so the property should be true in a fully-compliant
	 * browser. If false, we must account for the possibility of the browser injecting <tbody> tags 
	 * implicitly. (It is currently false in IE, which automatically inserts tbody if it is not present 
	 * in a string assigned to innerHTML).
	 * @return
	 */
	public final native boolean tbody() /*-{
	return this.tbody;
}-*/;
	
}
