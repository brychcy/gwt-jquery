package com.xedge.jquery.client;

import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.Node;
import com.google.gwt.json.client.JSONObject;
import com.xedge.jquery.client.handlers.AnimationCompleteHandler;
import com.xedge.jquery.client.handlers.AnimationFunction;
import com.xedge.jquery.client.handlers.CommandHandler;
import com.xedge.jquery.client.handlers.EventHandler;
import com.xedge.jquery.client.handlers.GlobalCompleteHandler;
import com.xedge.jquery.client.handlers.GlobalTriggerHandler;
import com.xedge.jquery.client.handlers.IterateElementHandler;
import com.xedge.jquery.client.handlers.OffsetHandler;
import com.xedge.jquery.client.handlers.ReturnIntegerGetIndexValueHandler;
import com.xedge.jquery.client.handlers.ReturnStringGetIndexElementHandler;
import com.xedge.jquery.client.handlers.ReturnStringGetIndexHandler;
import com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler;
import com.xedge.jquery.client.handlers.SuccessHandlerWithData;
import com.xedge.jquery.client.handlers.SuccessHandlerWithDataObjectStatusJQXHR;
import com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR;
import com.xedge.jquery.client.handlers.ValidateItemHandler;
import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.client.js.JavaScriptObjectArray;
import com.xedge.jquery.client.model.AjaxSettings;
import com.xedge.jquery.client.model.AnimateOptions;
import com.xedge.jquery.client.model.BrowserSupport;
import com.xedge.jquery.client.model.CoOrdinates;
import com.xedge.jquery.client.model.EventHolder;
import com.xedge.jquery.client.model.NameValuePair;
import com.xedge.jquery.client.model.PositionOptions;

/**
 * 
 * Special selectors (':animated') Select all elements that are in the progress of an animation at the time the selector is run. ('[attribute|=value]') Selects elements that have the specified attribute with a value either equal to a given string or starting with that string followed by a hyphen (-). ('[attribute*=value]') Selects elements that have the specified attribute with a value containing the a given substring. ('[attribute~=value]') Selects elements that have the specified attribute with a value containing a given word, delimited by spaces. ('[attribute$=value]') Selects elements that have the specified attribute with a value ending exactly with a given string. The comparison is case sensitive. ('[attribute=value]') Selects elements that have the specified attribute with a value
 * exactly equal to a certain value. ('[attribute!=value]') Select elements that either don't have the specified attribute, or do have the specified attribute but not with a certain value. ('[attribute^=value]') Selects elements that have the specified attribute with a value beginning exactly with a given string. (':button') Selects all button elements and elements of type button. (':checkbox') Selects all elements of type checkbox. (':checked') Matches all elements that are checked. ('parent > child') Selects all direct child elements specified by "child" of elements specified by "parent". ('.class') Selects all elements with the given class. (':contains(text)') Select all elements that contain the specified text. ('ancestor descendant') Selects all elements that are descendants of a
 * given ancestor. (':disabled') Selects all elements that are disabled. ('element') Selects all elements with the given tag name. (':enabled') Selects all elements that are enabled. (':eq(index)') Select the element at index n within the matched set. (':even') Selects even elements, zero-indexed. See also odd. (':file') Selects all elements of type file. (':first-child') Selects all elements that are the first child of their parent. (':first') Selects the first matched element. (':gt(index)') Select all elements at an index greater than index within the matched set. ('[attribute]') Selects elements that have the specified attribute, with any value. (':has(selector)') Selects elements which contain at least one element that matches the specified selector. (':header') Selects all elements
 * that are headers, like h1, h2, h3 and so on. (':hidden') Selects all elements that are hidden. ('#id') An ID to search for, specified via the id attribute of an element. (':image') Selects all elements of type image. (':input') Selects all input, textarea, select and button elements. (':last-child') Selects all elements that are the last child of their parent. (':last') Selects the last matched element. (':lt(index)') Select all elements at an index less than index within the matched set. ('[attributeFilter1][attributeFilter2][attributeFilterN]') Matches elements that match all of the specified attribute filters. ('selector1, selector2, selectorN') Selects the combined results of all the specified selectors. ('prev + next') Selects all next elements matching "next" that are immediately
 * preceded by a sibling "prev". ('prev ~ siblings') Selects all sibling elements that follow after the "prev" element, have the same parent, and match the filtering "siblings" selector. (':not(selector)') Selects all elements that do not match the given selector.' (':nth-child(index/even/odd/equation)') Selects all elements that are the nth-child of their parent. (':odd') Selects odd elements, zero-indexed. See also even. (':only-child') Selects all elements that are the only child of their parent. (':parent') Select all elements that are the parent of another element, including text nodes. (':password') Selects all elements of type password. (':radio') Selects all elements of type radio. (':reset') Selects all elements of type reset. (':selected') Selects all elements that are selected.
 * (':submit') Selects all elements of type submit. (':text') Selects all elements of type text. (':visible') Selects all elements that are visible. (':focus') You can use this selector to find the currently focused element on the page.
 * 
 * @author osaharri
 * 
 */
public class JQuery extends JavaScriptObject {
	public enum Duration {
		slow, fast, normal
	}

	public enum Easing {
		swing, linear, easeInQuad, easeOutQuad, easeInOutQuad, easeInCubic, easeOutCubic, easeInOutCubic, easeInQuart, easeOutQuart, easeInOutQuart, easeInQuint, easeOutQuint, easeInOutQuint, easeInSine, easeOutSine, easeInOutSine, easeInExpo, easeOutExpo, easeInOutExpo, easeInCirc, easeOutCirc, easeInOutCirc, easeInElastic, easeOutElastic, easeInOutElastic, easeInBack, easeOutBack, easeInOutBack, easeInBounce, easeOutBounce, easeInOutBounce
	}

	public enum EventType {
		blur, focus, focusin, focusout, load, resize, scroll, unload, click, dblclick, mousedown, mouseup, mousemove, mouseover, mouseout, mouseenter, mouseleave, change, select, submit, keydown, keypress, keyup, error, dragstart, drag, dragstop, dropactivate, dropdeactivate, dropover, dropout, drop, resizestart, resizestop,tap,taphold,swipe,swipeleft,swiperight,scrollstart,scrollstop,pagebeforeshow,pagebeforehide,pageshow,pagehide,pagebeforecreate,pagecreate,vmouseover,vmousedown,vmousemove,vmouseup,vclick,vmousecancel,orientationchange,pagebeforeload,pageload,pageloadfailed,pagebeforechange,pagechange,pagechangefailed,pageinit,pageremove,updatelayout
	}

	public enum ElementPosition{
		middle,center, left, right, top, bottom 
	}
	
	protected JQuery() {
	}



	/**
	 * A function to execute after the DOM is ready.
	 * 
	 * @param callback
	 */
	public static final native void ready(CommandHandler callback) /*-{
		$wnd.jQuery($doc).ready(
						function() {
							$wnd.jQuery.noConflict();
							@com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(callback);
						});
	}-*/;

	/**
	 * Relinquish jQuery's control of the $ variable.
	 * 
	 * @return
	 */
	public static final native void noConflict() /*-{
		$wnd.jQuery.noConflict();
	}-*/;

	/**
	 * Determines whether its argument is a number.
	 * 
	 * @param value
	 * @return
	 */
	public static final native boolean isNumeric(String value) /*-{
		return $wnd.jQuery.isNumeric(value) || false;
	}-*/;

	/**
	 * Accepts a string containing a CSS selector which is then used to match a set of elements.
	 * 
	 * @param selector
	 *            a string containing a selector expression
	 * @return
	 */
	public static final native JQuery select(String selector) /*-{
		return $wnd.jQuery(selector);
	}-*/;

	/**
	 * Accepts a string containing a CSS selector which is then used to match a set of elements.
	 * 
	 * @param selector
	 *            a string containing a selector expression
	 * @param element
	 *            a DOM Element to use as context
	 * @return
	 */
	public static final native JQuery select(String selector, Element context) /*-{
		return $wnd.jQuery(selector, context);
	}-*/;

	/**
	 * Accepts a string containing a CSS selector which is then used to match a set of elements.
	 * 
	 * @param selector
	 *            a string containing a selector expression
	 * @param context
	 *            a Document to use as context
	 * @return
	 */
	public static final native JQuery select(String selector, Document context) /*-{
		return $wnd.jQuery(selector, context);
	}-*/;

	/**
	 * Accepts a string containing a CSS selector which is then used to match a set of elements.
	 * 
	 * @param selector
	 *            a string containing a selector expression
	 * @param context
	 *            a JQuery to use as context
	 * @return
	 */
	public static final native JQuery select(String selector, JQuery context) /*-{
		return $wnd.jQuery(selector, context);
	}-*/;

	/**
	 * A DOM element to wrap in a jQuery object.
	 * 
	 * @param element
	 * @return
	 */
	public static final native JQuery select(Element element) /*-{
		return $wnd.jQuery(element);
	}-*/;

	private static final native JQuery select(JavaScriptObjectArray<Element> elementArray) /*-{
		return $wnd.jQuery(elementArray);
	}-*/;

	/**
	 * An array containing a set of DOM elements to wrap in a jQuery object.
	 * 
	 * @param elementArray
	 * @return
	 */
	public static final JQuery select(List<Element> elementArray) {
		return select(JSHelper.convertObjectListToJSArray(elementArray));
	}
	
	/**
	 * An array containing a set of DOM elements to wrap in a jQuery object.
	 * 
	 * @param elementArray
	 * @return
	 */
	public static final JQuery select(Element[] elementArray) {
		return select(JSHelper.convertObjectArrayToJSArray(elementArray));
	}

	/**
	 * An existing jQuery object to clone.
	 * 
	 * @param toClone
	 * @return
	 */
	public static final native JQuery select(JQuery toClone) /*-{
		return $wnd.jQuery(toClone);
	}-*/;

	/**
	 * An empty jQuery set
	 * 
	 * @return
	 */
	public static final native JQuery selectEmpty() /*-{
		return $wnd.jQuery();
	}-*/;

	/**
	 * Creates DOM elements on the fly from the provided string of raw HTML.
	 * 
	 * @param html
	 *            A string of HTML to create on the fly. Note that this parses HTML, not XML.
	 * @return
	 */
	public static final native JQuery createHtml(String html) /*-{
		return $wnd.jQuery(html);
	}-*/;

	/**
	 * Insert every element in the set of matched elements to the end of the target.
	 * 
	 * @param target
	 *            : A selector
	 * @return
	 */
	public final native JQuery appendTo(String target) /*-{
		return this.appendTo(target);
	}-*/;

	/**
	 * Insert every element in the set of matched elements to the end of the target.
	 * 
	 * @param jquery
	 *            :
	 * @return
	 */
	public final native JQuery appendTo(JQuery jquery) /*-{
		return this.appendTo(jquery);
	}-*/;

	/**
	 * Insert every element in the set of matched elements to the end of the target.
	 * 
	 * @param element
	 * @return
	 */
	public final native JQuery appendTo(Element element) /*-{
		return this.appendTo(element);
	}-*/;

	/**
	 * Add elements to the set of matched elements.
	 * 
	 * @param selectorOrHtml
	 *            A string containing a selector expression to match additional elements against. or an HTML fragment to add to the set of matched elements.
	 * @return
	 */
	public final native JQuery add(String selectorOrHtml) /*-{
		return this.add(selectorOrHtml);
	}-*/;

	/**
	 * Add elements to the set of matched elements.
	 * 
	 * @param selector
	 *            a string containing a selector expression
	 * @param context
	 *            a DOM Element to use as context
	 * @return
	 */
	public final native JQuery add(String selector, Element context) /*-{
		return this.add(selector, context);
	}-*/;

	/**
	 * Add elements to the set of matched elements.
	 * 
	 * @param selector
	 *            a string containing a selector expression
	 * @param context
	 *            a Document to use as context
	 * @return
	 */
	public final native JQuery add(String selector, Document context) /*-{
		return this.add(selector, context);
	}-*/;

	/**
	 * Add elements to the set of matched elements.
	 * 
	 * @param selector
	 *            a string containing a selector expression
	 * @param context
	 *            a JQuery to use as context
	 * @return
	 */
	public final native JQuery add(String selector, JQuery context) /*-{
		return this.add(selector, context);
	}-*/;

	private final native JQuery add(JavaScriptObjectArray<Element> elementArray) /*-{
		return this.add(selectorOrHtml);
	}-*/;

	/**
	 * Add elements to the set of matched elements.
	 * 
	 * @param elementArray
	 *            one or more elements to add to the set of matched elements.
	 * @return
	 */
	public final JQuery add(List<Element> elementArray) {
		return add(JSHelper.convertObjectListToJSArray(elementArray));
	}
	
	/**
	 * Add elements to the set of matched elements.
	 * @param elementArray
	 * @return
	 */
	public final JQuery add(Element[] elementArray) {
		return add(JSHelper.convertObjectArrayToJSArray(elementArray));
	}


	/**
	 * Get the value of a style property for the first element in the set of matched elements.
	 * 
	 * @param propertyName
	 *            a CSS property.
	 * @return
	 */
	public final native String css(String propertyName) /*-{
		var result = this.css(propertyName).toString();
		return result;
	}-*/;

	/**
	 * Set one or more CSS properties for the set of matched elements. NB. You can now prefix a CSS value with "+=" or "-=" to update the property relatively, in relation to the current value.
	 * 
	 * @param propertyName
	 *            a CSS property.
	 * @param value
	 *            A value to set for the property.
	 * @return
	 */
	public final native JQuery css(String propertyName, String value) /*-{
		return this.css(propertyName, value);
	}-*/;

	/**
	 * Set one or more CSS properties for the set of matched elements.
	 * 
	 * @param propertyName
	 *            a CSS property.
	 * @param callback
	 *            A callback returning the value to set. Receives the index position of the element in the set and the old value as arguments.
	 * @return
	 */
	public final native JQuery css(String propertyName, ReturnStringGetIndexValueHandler callback) /*-{
		return this
				.css(
						propertyName,
						function(index, value) {
							return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,value);
						});
	}-*/;

	private final native JQuery css(JavaScriptObject propertyValuePairs) /*-{
		return this.css(propertyValuePairs);
	}-*/;

	/**
	 * Set one or more CSS properties for the set of matched elements.
	 * 
	 * @param propertyValuePairs
	 *            A map of property-value pairs to set.
	 * @return
	 */
	public final JQuery css(Map<String, String> propertyValuePairs) {
		return this.css(JSHelper.convertStringMapToJSONObject(propertyValuePairs).getJavaScriptObject());
	}

	/**
	 * The number of elements in the jQuery object.
	 * 
	 * @return
	 */
	public final native int length() /*-{
		return this.length || 0;
	}-*/;

	/**
	 * A selector representing selector originally passed to jQuery().
	 * 
	 * @return
	 */
	public final native String selector() /*-{
		return this.selector || '';
	}-*/;

	/**
	 * Current Jquery version being used
	 * 
	 * @return
	 */
	public final native String version() /*-{
		return this.jquery;
	}-*/;

	/**
	 * Retrieve the DOM element matched by the jQuery object.
	 * 
	 * @param index
	 *            A zero-based integer indicating which element to retrieve.
	 * @return
	 */
	public final native Element get(int index) /*-{
		return this.get(index) || null;
	}-*/;

	private final native JavaScriptObjectArray<Element> getJS() /*-{
		return this.get();
	}-*/;

	/**
	 * Retrieve the DOM elements matched by the jQuery object.
	 * 
	 * @return
	 */
	public final List<Element> get() {
		return JSHelper.convertJSArrayToObjectList(getJS());
	}

	/**
	 * Adds the specified class(es) to each of the set of matched elements.
	 * 
	 * @param className
	 *            One or more class names to be added to the class attribute of each matched element.
	 * @return
	 */
	public final native JQuery addClass(String className) /*-{
		return this.addClass(className);
	}-*/;

	/**
	 * Adds the specified class(es) to each of the set of matched elements.
	 * 
	 * @param callback
	 *            A callback returning one or more space-separated class names to be added. Receives the index position of the element in the set and the old class value as arguments.
	 * @return
	 */
	public final native JQuery addClass(ReturnStringGetIndexValueHandler callback) /*-{
		return this
				.addClass(function(index, className) {
					return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,className);
				});
	}-*/;

	/**
	 * Remove a all classes from each element in the set of matched elements.
	 * 
	 * @return
	 */
	public final native JQuery removeClass() /*-{
		return this.removeClass();
	}-*/;

	/**
	 * Remove a single class or all classes from each element in the set of matched elements.
	 * 
	 * @param className
	 *            A class name to be removed from the class attribute of each matched element.
	 * @return
	 */

	public final native JQuery removeClass(String className) /*-{
		return this.removeClass(className);
	}-*/;

	/**
	 * Remove a single class, multiple classes, or all classes from each element in the set of matched elements.
	 * 
	 * @param callback
	 *            A callback returning one or more space-separated class names to be removed. Receives the index position of the element in the set and the old class value as arguments.
	 * @return
	 */
	public final native JQuery removeClass(ReturnStringGetIndexValueHandler callback) /*-{
		return this
				.removeClass(function(index, className) {
					return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,className);
				});
	}-*/;

	/**
	 * Determine whether any of the matched elements are assigned the given class.
	 * 
	 * @param className
	 *            The class name to search for.
	 * @return
	 */
	public final native boolean hasClass(String className) /*-{
		return this.hasClass(className) || false;
	}-*/;

	/**
	 * Hide the matched elements.
	 * 
	 * @return
	 */
	public final native JQuery hide() /*-{
		return this.hide();
	}-*/;

	/**
	 * Hide the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @return
	 */

	public final JQuery hide(Duration duration) {
		return hide(duration.name());
	}

	private final native JQuery hide(String duration) /*-{
		return this.hide(duration);
	}-*/;

	/**
	 * Hide the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @return
	 */
	public final native JQuery hide(int duration) /*-{
		return this.hide(duration);
	}-*/;

	/**
	 * Hide the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param callback
	 *            once the hide is completed
	 * @return
	 */
	public final JQuery hide(Duration duration, AnimationCompleteHandler callback) {
		return hide(duration.name(), callback);
	}

	private final native JQuery hide(String duration, AnimationCompleteHandler callback) /*-{
		return this
				.hide(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Hide the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param callback
	 *            once the hide is completed
	 * @return
	 */
	public final native JQuery hide(int duration, AnimationCompleteHandler callback) /*-{
		return this
				.hide(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Hide the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery hide(Duration duration, Easing easing) {
		return hide(duration.name(), easing.name());
	}

	private final native JQuery hide(String duration, String easing) /*-{
		return this.hide(duration, easing);
	}-*/;

	/**
	 * Hide the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery hide(int duration, Easing easing) {
		return hide(duration, easing.name());
	}

	private final native JQuery hide(int duration, String easing) /*-{
		return this.hide(duration, easing);
	}-*/;

	/**
	 * Hide the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the hide is completed
	 * @return
	 */
	public final JQuery hide(Duration duration, Easing easing, AnimationCompleteHandler callback) {
		return hide(duration.name(), easing.name(), callback);
	}

	private final native JQuery hide(String duration, String easing, AnimationCompleteHandler callback) /*-{
		return this
				.hide(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Hide the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the hide is completed
	 * @return
	 */
	public final JQuery hide(int duration, Easing easing, AnimationCompleteHandler callback) {
		return hide(duration, easing.name(), callback);
	}

	private final native JQuery hide(int duration, String easing, AnimationCompleteHandler callback) /*-{
		return this
				.hide(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display the matched elements.
	 * 
	 * @return
	 */
	public final native JQuery show() /*-{
		return this.show();
	}-*/;

	/**
	 * Display the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @return
	 */
	public final JQuery show(Duration duration) {
		return show(duration.name());
	}

	private final native JQuery show(String duration) /*-{
		return this.show(duration);
	}-*/;

	/**
	 * Display the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @return
	 */
	public final native JQuery show(int duration) /*-{
		return this.show(duration);
	}-*/;

	/**
	 * Display the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery show(Duration duration, AnimationCompleteHandler callback) {
		return show(duration.name(), callback);
	}

	private final native JQuery show(String duration, AnimationCompleteHandler callback) /*-{
		return this
				.show(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final native JQuery show(int duration, AnimationCompleteHandler callback) /*-{
		return this
				.show(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery show(int duration, Easing easing, AnimationCompleteHandler callback) {
		return show(duration, easing.name(), callback);
	}

	private final native JQuery show(int duration, String easing, AnimationCompleteHandler callback) /*-{
		return this
				.show(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery show(int duration, Easing easing) {
		return show(duration, easing.name());
	}

	private final native JQuery show(int duration, String easing) /*-{
		return this.show(duration, easing);
	}-*/;

	/**
	 * Display the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery show(Duration duration, Easing easing) {
		return show(duration.name(), easing.name());
	}

	private final native JQuery show(String duration, String easing) /*-{
		return this.show(duration, easing);
	}-*/;

	/**
	 * Display the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery show(Duration duration, Easing easing, AnimationCompleteHandler callback) {
		return show(duration.name(), easing.name(), callback);
	}

	private final native JQuery show(String duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.show(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Trigger the click event on an element.
	 * 
	 * @return
	 */
	public final native JQuery click() /*-{
		return this.click();
	}-*/;

	/**
	 * Bind an event handler to the "click" JavaScript event
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery click(EventHandler callback) /*-{
		return this.click(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery click(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.click(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the "click" JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery click(Map<String, String> eventData, EventHandler callback) {
		return click(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Insert content, specified by the parameter, after each element in the set of matched elements.
	 * 
	 * @param html
	 *            HTML fragment.
	 * @return
	 */
	public final native JQuery after(String html) /*-{
		return this.after(html);
	}-*/;

	/**
	 * Insert content, specified by the parameter, after each element in the set of matched elements.
	 * 
	 * @param items
	 *            An element to insert after each element in the set of matched elements.
	 * @return
	 */
	public final native JQuery after(Element element) /*-{
		return this.after(element);
	}-*/;

	/**
	 * Insert content, specified by the parameter, after each element in the set of matched elements.
	 * 
	 * @param items
	 *            A JQuery object to insert after each element in the set of matched elements.
	 * @return
	 */
	public final native JQuery after(JQuery jquery) /*-{
		return this.after(jquery);
	}-*/;

	/**
	 * Insert content, specified by the parameter, after each element in the set of matched elements.
	 * 
	 * @param callback
	 *            A function that returns an HTML string to insert after each element in the set of matched elements.
	 * @return
	 */

	public final native JQuery after(ReturnStringGetIndexHandler callback) /*-{
		return this.after(function(index) {
					return @com.xedge.jquery.client.handlers.ReturnStringGetIndexHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexHandler;I)(callback,index);
				});
	}-*/;

	/**
	 * Perform an asynchronous HTTP (Ajax) request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param ajaxSettings
	 *            A set of key/value pairs that configure the Ajax request. All options are optional. A default can be set for any option with ajaxSetup().
	 */
	public static final native void ajax(String url, AjaxSettings ajaxSettings) /*-{
		$wnd.jQuery.ajax(url, ajaxSettings);
	}-*/;

	/**
	 * Perform an asynchronous HTTP (Ajax) request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 */
	public static final native void ajax(String url) /*-{
		$wnd.jQuery.ajax(url);
	}-*/;

	/**
	 * Perform an asynchronous HTTP (Ajax) request.
	 * 
	 * @param ajaxSettings
	 *            : A set of key/value pairs that configure the Ajax request. All options are optional. A default can be set for any option with ajaxSetup().
	 */
	public static final native void ajax(AjaxSettings ajaxSettings) /*-{
		$wnd.jQuery.ajax(ajaxSettings);
	}-*/;

	/**
	 * Set default values for future Ajax requests.
	 * 
	 * @param ajaxSettings
	 */
	public static final native void ajaxSetup(AjaxSettings ajaxSettings) /*-{
		$wnd.jQuery.ajaxSetup(ajaxSettings);
	}-*/;

	/**
	 * Register a global handler to be called when Ajax requests complete. Can be successful or have an error the handler gets passed 3 arguments: The event,the XMLHttpRequest object and the settings used in the request.
	 * 
	 * @param handler
	 * @return
	 */
	public final native JQuery ajaxComplete(GlobalCompleteHandler handler) /*-{
		return this.ajaxComplete(function(event, request, settings) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.GlobalCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/GlobalCompleteHandler;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/client/JQEvent;Lcom/google/gwt/xhr/client/XMLHttpRequest;Lcom/xedge/jquery/client/model/AjaxSettings;)(handler,currentJQuery,event,request, settings);
				});
	}-*/;

	/**
	 * Register a global handler to be called when Ajax requests complete with an error. the handler gets passed 3 arguments: The event,the XMLHttpRequest object and the settings used in the request.
	 * 
	 * @param handler
	 * @return
	 */
	public final native JQuery ajaxError(GlobalCompleteHandler handler) /*-{
		return this.ajaxError(function(event, request, settings) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.GlobalCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/GlobalCompleteHandler;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/client/JQEvent;Lcom/google/gwt/xhr/client/XMLHttpRequest;Lcom/xedge/jquery/client/model/AjaxSettings;)(handler,currentJQuery,event,request, settings);
				});
	}-*/;

	/**
	 * Register a global handler to be called whenever an Ajax request is about to be sent. the handler gets passed 3 arguments: The event,the XMLHttpRequest object and the settings used in the request.
	 * 
	 * @param handler
	 * @return
	 */
	public final native JQuery ajaxSend(GlobalCompleteHandler handler) /*-{
		return this.ajaxSend(function(event, request, settings) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.GlobalCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/GlobalCompleteHandler;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/client/JQEvent;Lcom/google/gwt/xhr/client/XMLHttpRequest;Lcom/xedge/jquery/client/model/AjaxSettings;)(handler,currentJQuery,event,request, settings);
				});
	}-*/;

	/**
	 * Register a global handler to be called whenever an Ajax request completes successfully. the handler gets passed 3 arguments: The event,the XMLHttpRequest object and the settings used in the request.
	 * 
	 * @param handler
	 * @return
	 */
	public final native JQuery ajaxSuccess(GlobalCompleteHandler handler) /*-{
		return this.ajaxSuccess(function(event, request, settings) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.GlobalCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/GlobalCompleteHandler;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/client/JQEvent;Lcom/google/gwt/xhr/client/XMLHttpRequest;Lcom/xedge/jquery/client/model/AjaxSettings;)(handler,currentJQuery,event,request, settings);
				});
	}-*/;

	/**
	 * Register a global handler to be called when the Ajax request begins
	 * 
	 * @param handler
	 * @return
	 */
	public final native JQuery ajaxStart(GlobalTriggerHandler handler) /*-{
		return this.ajaxStart(function() {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.GlobalTriggerHandler::fire(Lcom/xedge/jquery/client/handlers/GlobalTriggerHandler;Lcom/xedge/jquery/client/JQuery;)(handler,currentJQuery);
				});
	}-*/;

	/**
	 * Register a global handler to be called when the Ajax request completes
	 * 
	 * @param handler
	 * @return
	 */
	public final native JQuery ajaxStop(GlobalTriggerHandler handler) /*-{
		return this.ajaxStop(function() {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.GlobalTriggerHandler::fire(Lcom/xedge/jquery/client/handlers/GlobalTriggerHandler;Lcom/xedge/jquery/client/JQuery;)(handler,currentJQuery);
				});
	}-*/;

	/**
	 * Add the previous set of elements on the stack to the current set.
	 * 
	 * @return
	 */
	public final native JQuery andSelf() /*-{
		return this.andSelf();
	}-*/;

	/**
	 * Perform a custom animation of a set of CSS properties.
	 * 
	 * @param propertyValuePairs
	 *            : A map of CSS properties that the animation will move toward.
	 * @return
	 */
	public final JQuery animate(Map<String, String> propertyValuePairs) {
		return this.animate(JSHelper.convertStringMapToJSONObject(propertyValuePairs).getJavaScriptObject());
	}

	private final native JQuery animate(JavaScriptObject propertyValuePairs) /*-{
		return this.animate(propertyValuePairs);
	}-*/;

	/**
	 * Perform a custom animation of a set of CSS properties.
	 * 
	 * @param propertyValuePairs
	 *            : A map of CSS properties that the animation will move toward.
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @return
	 */
	public final JQuery animate(Map<String, String> propertyValuePairs, Duration duration) {
		return this.animate(JSHelper.convertStringMapToJSONObject(propertyValuePairs).getJavaScriptObject(), duration.name());
	}

	private final native JQuery animate(JavaScriptObject propertyValuePairs, String duration) /*-{
		return this.animate(propertyValuePairs, duration);
	}-*/;

	/**
	 * Perform a custom animation of a set of CSS properties.
	 * 
	 * @param propertyValuePairs
	 *            : A map of CSS properties that the animation will move toward.
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @return
	 */
	public final JQuery animate(Map<String, String> propertyValuePairs, int duration) {
		return this.animate(JSHelper.convertStringMapToJSONObject(propertyValuePairs).getJavaScriptObject(), duration);
	}

	private final native JQuery animate(JavaScriptObject propertyValuePairs, int duration) /*-{
		return this.animate(propertyValuePairs, duration);
	}-*/;

	/**
	 * Perform a custom animation of a set of CSS properties.
	 * 
	 * @param propertyValuePairs
	 *            : A map of CSS properties that the animation will move toward.
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param callback
	 *            once the animation is completed
	 * @return
	 */
	public final JQuery animate(Map<String, String> propertyValuePairs, Duration duration, AnimationCompleteHandler callback) {
		return this.animate(JSHelper.convertStringMapToJSONObject(propertyValuePairs).getJavaScriptObject(), duration.name(), callback);
	}

	private final native JQuery animate(JavaScriptObject propertyValuePairs, String duration, AnimationCompleteHandler callback) /*-{
		return this.animate(propertyValuePairs,duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery)
						});
	}-*/;

	/**
	 * Perform a custom animation of a set of CSS properties.
	 * 
	 * @param propertyValuePairs
	 *            : A map of CSS properties that the animation will move toward.
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param callback
	 *            once the animation is completed
	 * @return
	 */
	public final JQuery animate(Map<String, String> propertyValuePairs, int duration, AnimationCompleteHandler callback) {
		return this.animate(JSHelper.convertStringMapToJSONObject(propertyValuePairs).getJavaScriptObject(), duration, callback);
	}

	private final native JQuery animate(JavaScriptObject propertyValuePairs, int duration, AnimationCompleteHandler callback) /*-{
		return this.animate(propertyValuePairs,duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Perform a custom animation of a set of CSS properties.
	 * 
	 * @param propertyValuePairs
	 *            : A map of CSS properties that the animation will move toward.
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery animate(Map<String, String> propertyValuePairs, int duration, Easing easing) {
		return this.animate(JSHelper.convertStringMapToJSONObject(propertyValuePairs).getJavaScriptObject(), duration, easing.name());
	}

	private final native JQuery animate(JavaScriptObject propertyValuePairs, int duration, String easing) /*-{
		return this.animate(propertyValuePairs, duration, easing);
	}-*/;

	/**
	 * Perform a custom animation of a set of CSS properties.
	 * 
	 * @param propertyValuePairs
	 *            : A map of CSS properties that the animation will move toward.
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param callback
	 *            once the animation is completed
	 * @return
	 */
	public final JQuery animate(Map<String, String> propertyValuePairs, Duration duration, Easing easing, AnimationCompleteHandler callback) {
		return this.animate(JSHelper.convertStringMapToJSONObject(propertyValuePairs).getJavaScriptObject(), duration.name(), easing.name(), callback);
	}

	private final native JQuery animate(JavaScriptObject propertyValuePairs, String duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.animate(propertyValuePairs,duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Perform a custom animation of a set of CSS properties.
	 * 
	 * @param propertyValuePairs
	 *            : A map of CSS properties that the animation will move toward.
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param callback
	 *            once the animation is completed
	 * @return
	 */
	public final JQuery animate(Map<String, String> propertyValuePairs, int duration, Easing easing, AnimationCompleteHandler callback) {
		return this.animate(JSHelper.convertStringMapToJSONObject(propertyValuePairs).getJavaScriptObject(), duration, easing.name(), callback);
	}

	private final native JQuery animate(JavaScriptObject propertyValuePairs, int duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.animate(propertyValuePairs,duration,easing,
						function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Perform a custom animation of a set of CSS properties.
	 * 
	 * @param propertyValuePairs
	 *            : A map of CSS properties that the animation will move toward.
	 * @param animateOptions
	 *            :Additional options to pass to the method
	 * @return
	 */
	public final JQuery animate(Map<String, String> propertyValuePairs, AnimateOptions animateOptions) {
		return this.animate(JSHelper.convertStringMapToJSONObject(propertyValuePairs).getJavaScriptObject(), animateOptions);
	}

	private final native JQuery animate(JavaScriptObject propertyValuePairs, AnimateOptions animateOptions) /*-{
		return this.animate(propertyValuePairs, animateOptions);
	}-*/;

	/**
	 * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
	 * 
	 * @param html
	 *            HTML fragment.
	 * @return
	 */
	public final native JQuery append(String html) /*-{
		return this.append(html);
	}-*/;

	/**
	 * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
	 * 
	 * @param element
	 *            An element to insert at the end of each element in the set of matched elements.
	 * @return
	 */
	public final native JQuery append(Element element) /*-{
		return this.append(element);
	}-*/;

	/**
	 * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
	 * 
	 * @param jquery
	 *            A JQuery object to insert at the end of each element in the set of matched elements.
	 * @return
	 */
	public final native JQuery append(JQuery jquery) /*-{
		return this.append(jquery);
	}-*/;

	/**
	 * Insert content, specified by the parameter, to the end of each element in the set of matched elements.
	 * 
	 * @param callback
	 *            A function that returns an HTML string to insert at the end of each element in the set of matched elements. Receives the index position of the element in the set and the old HTML value of the element as arguments.
	 * @return
	 */

	public final native JQuery append(ReturnStringGetIndexValueHandler callback) /*-{
		return this.append(function(index, html) {
					return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,html);
				});
	}-*/;

	/**
	 * Get the value of a property for the first element in the set of matched elements.
	 * 
	 * @param propertyName
	 *            : The name of the property to get.
	 * @return
	 */
	public final native String prop(String propertyName) /*-{
		return this.prop(propertyName);
	}-*/;

	/**
	 * Set one or more properties for the set of matched elements.
	 * 
	 * @param propertyName
	 *            : The name of the property to set.
	 * @param value
	 *            : A value to set for the property.
	 * @return
	 */
	public final native JQuery prop(String propertyName, String value) /*-{
		return this.prop(propertyName, value);
	}-*/;

	private final native JQuery prop(JavaScriptObject propertyValuePairs) /*-{
		return this.prop(propertyValuePairs);
	}-*/;

	/**
	 * A map of property-value pairs to set.
	 * 
	 * @param propertyValuePairs
	 *            : A map of property-value pairs to set.
	 * @return
	 */
	public final JQuery prop(Map<String, String> propertyValuePairs) {
		return this.prop(JSHelper.convertStringMapToJSONObject(propertyValuePairs).getJavaScriptObject());
	}

	/**
	 * Set one or more properties for the set of matched elements.
	 * 
	 * @param propertyName
	 *            : The name of the property to set.
	 * @param callback
	 *            : A function returning the value to set. this is the current element. Receives the index position of the element in the set and the old property value as arguments.
	 * @return
	 */
	public final native JQuery prop(String propertyName, ReturnStringGetIndexValueHandler callback) /*-{
		return this.prop(propertyName,function(index, value) {
							return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,value);
						});
	}-*/;

	/**
	 * Get the value of an attribute for the first element in the set of matched elements.
	 * 
	 * @param attributeName
	 *            : The name of the attribute to get.
	 * @return
	 */
	public final native String attr(String attributeName) /*-{
		return this.attr(attributeName);
	}-*/;

	/**
	 * Set one or more attributes for the set of matched elements.
	 * 
	 * @param attributeName
	 *            : The name of the attribute to set.
	 * @param value
	 *            : A value to set for the attribute.
	 * @return
	 */
	public final native JQuery attr(String attributeName, String value) /*-{
		return this.attr(attributeName, value);
	}-*/;

	private final native JQuery attr(JavaScriptObject attributeValuePairs) /*-{
		return this.attr(attributeValuePairs);
	}-*/;

	/**
	 * Set one or more attributes for the set of matched elements.
	 * 
	 * @param attributeValuePairs
	 *            : A map of attribute-value pairs to set.
	 * @return
	 */
	public final JQuery attr(Map<String, String> attributeValuePairs) {
		return this.attr(JSHelper.convertStringMapToJSONObject(attributeValuePairs).getJavaScriptObject());
	}

	/**
	 * Set one or more attributes for the set of matched elements.
	 * 
	 * @param attributeName
	 *            : The name of the attribute to set.
	 * @param callback
	 *            : A function returning the value to set. this is the current element. Receives the index position of the element in the set and the old attribute value as arguments.
	 * @return
	 */
	public final native JQuery attr(String attributeName, ReturnStringGetIndexValueHandler callback) /*-{
		return this.attr(attributeName,function(index, value) {
							return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,value);
						});
	}-*/;

	/**
	 * Insert content, specified by the parameter, before each element in the set of matched elements.
	 * 
	 * @param html
	 *            HTML fragment.
	 * @return
	 */
	public final native JQuery before(String html) /*-{
		return this.before(html);
	}-*/;

	/**
	 * Insert content, specified by the parameter, before each element in the set of matched elements.
	 * 
	 * @param items
	 *            An element to insert before each element in the set of matched elements.
	 * @return
	 */
	public final native JQuery before(Element element) /*-{
		return this.before(element);
	}-*/;

	/**
	 * Insert content, specified by the parameter, before each element in the set of matched elements.
	 * 
	 * @param items
	 *            A JQuery object to insert before each element in the set of matched elements.
	 * @return
	 */
	public final native JQuery before(JQuery jquery) /*-{
		return this.before(jquery);
	}-*/;

	/**
	 * Insert content, specified by the parameter, before each element in the set of matched elements.
	 * 
	 * @param callback
	 *            A function that returns an HTML string to insert before each element in the set of matched elements.
	 * @return
	 */

	public final native JQuery before(ReturnStringGetIndexHandler callback) /*-{
		return this.before(function(index) {
					return @com.xedge.jquery.client.handlers.ReturnStringGetIndexHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexHandler;I)(callback,index);
				});
	}-*/;

	private final native JQuery bind(String eventType, JavaScriptObject eventData, EventHandler callback) /*-{
		return this.bind(eventType,eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Attach a handler to an event for the elements.
	 * 
	 * @param eventTypes
	 *            A string containing one or more custom event names.
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery bindCustomEvent(String eventType, Map<String, String> eventData, EventHandler callback) {
		return bind(eventType, JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Attach a handler to an event for the elements.
	 * 
	 * @param eventType
	 *            one JavaScript event type, such as "click" or "submit,"
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery bind(EventType eventType, Map<String, String> eventData, EventHandler callback) {
		return bind(eventType.name(), JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Attach a handler to an event for the elements.
	 * 
	 * @param eventTypes
	 *            A List of JavaScript event types, such as "click" or "submit,"
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery bind(EventType[] eventTypes, Map<String, String> eventData, EventHandler callback) {
		return bind(getEventTypes(eventTypes), JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	private String getEventTypes(EventType[] eventTypes) {
		StringBuffer eventList = new StringBuffer();
		for (EventType eventType : eventTypes) {
			eventList.append(eventType.name());
			eventList.append(" ");
		}
		return eventList.toString();
	}

	/**
	 * Attach a handler to an event for the elements.
	 * 
	 * @param eventType
	 *            A string containing one or more custom JavaScript event types
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery bindCustomEvent(String eventType, EventHandler callback) {
		return bind(eventType, callback);
	}

	/**
	 * Attach a handler to an event for the elements.
	 * 
	 * @param eventType
	 *            One JavaScript event type, such as "click" or "submit,"
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery bind(EventType eventType, EventHandler callback) {
		return bind(eventType.name(), callback);
	}

	/**
	 * Attach a handler to an event for the elements.
	 * 
	 * @param eventType
	 *            A list of JavaScript event types, such as "click" or "submit,"
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery bind(EventType[] eventTypes, EventHandler callback) {
		return bind(getEventTypes(eventTypes), callback);
	}

	private final native JQuery bind(String eventType, EventHandler callback) /*-{
		return this.bind(eventType,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Attach a handler to an event for the elements.
	 * 
	 * @param events
	 *            : A map of one or more event types and functions to execute for them.
	 * @return
	 */
	public final native JQuery bind(EventHolder events) /*-{
		return this.bind(events);
	}-*/;

	/**
	 * Trigger the blur event on an element.
	 * 
	 * @return
	 */
	public final native JQuery blur() /*-{
		return this.blur();
	}-*/;

	/**
	 * Bind an event handler to the blur JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery blur(EventHandler callback) /*-{
		return this.blur(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery blur(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.blur(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the blur JavaScript event.
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery blur(Map<String, String> eventData, EventHandler callback) {
		return blur(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Trigger the change event on a textbox,textarea or listbox
	 * 
	 * @return
	 */
	public final native JQuery change() /*-{
		return this.change();
	}-*/;

	/**
	 * Bind an event handler to the change JavaScript event on a textbox,textarea or listbox
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery change(EventHandler callback) /*-{
		return this.change(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery change(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.change(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the change JavaScript event on a textbox,textarea or listbox
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery change(Map<String, String> eventData, EventHandler callback) {
		return change(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Get the children of each element in the set of matched elements
	 * 
	 * @return
	 */
	public final native JQuery children() /*-{
		return this.children();
	}-*/;

	/**
	 * Get the children of each element in the set of matched elements filtered by a selector.
	 * 
	 * @param selector
	 * @return
	 */
	public final native JQuery children(String selector) /*-{
		return this.children(selector);
	}-*/;

	/**
	 * Remove from the queue all items that have not yet been run.
	 * 
	 * @return
	 */
	public final native JQuery clearQueue() /*-{
		return this.clearQueue();
	}-*/;

	/**
	 * Remove from the queue all items that have not yet been run.
	 * 
	 * @param queueName
	 *            : A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 * @return
	 */
	public final native JQuery clearQueue(String queueName) /*-{
		return this.clearQueue(queueName);
	}-*/;

	/**
	 * Create a deep copy of the set of matched elements.
	 * 
	 * @param withDataAndEvents
	 *            : A Boolean indicating whether event handlers should be copied along with the elements. As of jQuery 1.4, element data will be copied as well.
	 * @return
	 */
	public final native JQuery clone(boolean withDataAndEvents) /*-{
		return this.clone(withDataAndEvents);
	}-*/;

	/**
	 * Create a deep copy of the set of matched elements.
	 * 
	 * @param withDataAndEvents
	 *            : A Boolean indicating whether event handlers should be copied along with the elements. As of jQuery 1.4, element data will be copied as well.
	 * @param deepWithDataAndEvents
	 *            : A Boolean indicating whether event handlers and data for all children of the cloned element should be copied. The default value is false.
	 * @return
	 */
	public final native JQuery clone(boolean withDataAndEvents, boolean deepWithDataAndEvents) /*-{
		return this.clone(withDataAndEvents, deepWithDataAndEvents);
	}-*/;

	/**
	 * Get the first ancestor element that matches the selector, beginning at the current element and progressing up through the DOM tree.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery closest(String selector) /*-{
		return this.closest(selector);
	}-*/;

	/**
	 * Get the first ancestor element that matches the selector, beginning at the current element and progressing up through the DOM tree.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @param element
	 *            : A DOM element within which a matching element may be found
	 * @return
	 */
	public final native JQuery closest(String selector, Element element) /*-{
		return this.closest(selector, element);
	}-*/;

	/**
	 * Get the first ancestor element that matches the selector, beginning at the current element and progressing up through the DOM tree.
	 * 
	 * @param element
	 *            : An element to match elements against.
	 * @return
	 */
	public final native JQuery closest(Element element) /*-{
		return this.closest(element);
	}-*/;

	/**
	 * Get the first ancestor element that matches the selector, beginning at the current element and progressing up through the DOM tree.
	 * 
	 * @param jquery
	 *            : A jQuery object to match elements against.
	 * @return
	 */
	public final native JQuery closest(JQuery jquery) /*-{
		return this.closest(jquery);
	}-*/;

	/**
	 * Check to see if a DOM node is within another DOM node.
	 * 
	 * @param container
	 *            : The DOM element that may contain the other element.
	 * @param contained
	 *            : The DOM node that may be contained by the other element.
	 * @return
	 */
	public static final native boolean contains(Element container, Element contained) /*-{
		return $wnd.jQuery.contains(container, contained);
	}-*/;

	/**
	 * Get the children of each element in the set of matched elements, including text and comment nodes.
	 * 
	 * @return
	 */
	public final native JQuery contents() /*-{
		return this.contents();
	}-*/;

	/**
	 * The DOM node context originally passed to jQuery(); if none was passed then context will likely be the document.
	 * 
	 * @return
	 */
	public final native Element context() /*-{
		return this.context;
	}-*/;

	/**
	 * Store arbitrary data associated with the matched elements.
	 * 
	 * @param key
	 *            : A string naming the piece of data to set.
	 * @param value
	 *            : The new data value as a string
	 */
	public final native void data(String key, String value) /*-{
		this.data(key, value);
	}-*/;

	/**
	 * Store arbitrary data associated with the matched elements.
	 * 
	 * @param key
	 *            : A string naming the piece of data to set.
	 * @param value
	 *            : The new data value; it can be any Javascript type including Array or Object.
	 */
	public final native void data(String key, JavaScriptObject value) /*-{
		this.data(key, value);
	}-*/;

	/**
	 * * Store arbitrary data associated with the matched elements.
	 * 
	 * @param keyValuePairs
	 *            : A JavaScriptObject of key-value pairs of data to update
	 */
	public final native void data(JavaScriptObject keyValuePairs) /*-{
		this.data(keyValuePairs);
	}-*/;

	/**
	 * Store arbitrary data associated with the matched elements.
	 * 
	 * @param keyValuePairs
	 *            : A map of key-value pairs of data to update
	 * @return
	 */
	public final void data(Map<String, String> keyValuePairs) {
		this.data(JSHelper.convertStringMapToJSONObject(keyValuePairs).getJavaScriptObject());
	}

	/**
	 * Returns object at key data store for the first element in the jQuery collection, as set by data(key, value).
	 * 
	 * @param key
	 *            :Name of the data stored.
	 * @return
	 */
	public final native JavaScriptObject data(String key) /*-{
		return this.data(key);
	}-*/;

	/**
	 * Returns string at key data store for the first element in the jQuery collection, as set by data(key, value).
	 * 
	 * @param key
	 *            :Name of the data stored.
	 * @param key
	 * @return
	 */
	public final native String dataString(String key) /*-{
		return this.data(key);
	}-*/;

	/**
	 * Returns all data as a object
	 * 
	 * @return
	 */
	public final native JavaScriptObject data() /*-{
		return this.data();
	}-*/;

	/**
	 * Returns all data as a Map
	 * 
	 * @return
	 */
	public final Map<String, String> dataMap() {
		return JSHelper.convertJSONObjectToStringMap(new JSONObject(data()));
	}

	/**
	 * Store arbitrary data associated with the specified element.
	 * 
	 * @param element
	 *            : The DOM element to associate with the data.
	 * @param key
	 *            : A string naming the piece of data to set.
	 * @param value
	 *            : The new data value as a string
	 */
	public static final native void data(Element element, String key, String value) /*-{
		$wnd.jQuery.data(element, key, value);
	}-*/;

	/**
	 * Store arbitrary data associated with the specified element.
	 * 
	 * @param element
	 *            : The DOM element to associate with the data.
	 * @param key
	 *            : A string naming the piece of data to set.
	 * @param value
	 *            : The new data value as an object
	 */
	public static final native void data(Element element, String key, JavaScriptObject value) /*-{
		$wnd.jQuery.data(element, key, value);
	}-*/;

	/**
	 * Returns string at named data store for the element, as set by jQuery.data(element, name, value), or the full data store for the element.
	 * 
	 * @param element
	 *            : The DOM element to associate with the data.
	 * @param key
	 *            : A string naming the piece of data to set.
	 * @return
	 */
	public static final native String dataString(Element element, String key) /*-{
		return $wnd.jQuery.data(element, key);
	}-*/;

	/**
	 * Returns object at named data store for the element, as set by jQuery.data(element, name, value), or the full data store for the element.
	 * 
	 * @param element
	 *            : The DOM element to associate with the data.
	 * @param key
	 *            : A string naming the piece of data to set.
	 * @return
	 */
	public static final native JavaScriptObject data(Element element, String key) /*-{
		return $wnd.jQuery.data(element, key);
	}-*/;

	/**
	 * Returns all data as a object for the element
	 * 
	 * @param element
	 * @return
	 */
	public static final native JavaScriptObject data(Element element) /*-{
		return $wnd.jQuery.data(element);
	}-*/;

	/**
	 * Returns all data as a Map for the element
	 * 
	 * @param element
	 * @return
	 */
	public static final Map<String, String> dataMap(Element element) {
		return JSHelper.convertJSONObjectToStringMap(new JSONObject(data(element)));
	}


	/**
	 * Trigger the dblclick event on an element.
	 * 
	 * @return
	 */
	public final native JQuery dblclick() /*-{
		return this.dblclick();
	}-*/;

	/**
	 * Bind an event handler to the "dblclick" JavaScript event
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery dblclick(EventHandler callback) /*-{
		return this.dblclick(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery dblclick(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.dblclick(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery)
						});
	}-*/;

	/**
	 * Bind an event handler to the "dblclick" JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery dblclick(Map<String, String> eventData, EventHandler callback) {
		return dblclick(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Set a timer to delay execution of subsequent items in the queue.
	 * 
	 * @param duration
	 *            : An integer indicating the number of milliseconds to delay execution of the next item in the queue.
	 * @return
	 */
	public final native JQuery delay(int duration) /*-{
		return this.delay(duration);
	}-*/;

	/**
	 * Set a timer to delay execution of subsequent items in the queue.
	 * 
	 * @param duration
	 *            : An integer indicating the number of milliseconds to delay execution of the next item in the queue.
	 * @param queueName
	 *            : A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 * @return
	 */
	public final native JQuery delay(int duration, String queueName) /*-{
		return this.delay(duration, queueName);
	}-*/;

	private final native JQuery delegate(String selector, String eventType, JavaScriptObject eventData, EventHandler callback) /*-{
		return this.delegate(selector,eventType,eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Attach a handler to one event for all elements that match the selector, now or in the future, based on a specific set of root elements.
	 * 
	 * @param selector
	 *            : A selector to filter the elements that trigger the event.
	 * @param eventType
	 *            : One JavaScript event type, such as "click" or "keydown,"
	 * @param eventData
	 *            : A map of data that will be passed to the event handler.
	 * @param callback
	 *            : A function to execute at the time the event is triggered.
	 * @return
	 */
	public final JQuery delegate(String selector, EventType eventType, Map<String, String> eventData, EventHandler callback) {
		return delegate(selector, eventType.name(), JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Attach a handler to one or more events for all elements that match the selector, now or in the future, based on a specific set of root elements.
	 * 
	 * @param selector
	 *            : A selector to filter the elements that trigger the event.
	 * @param eventType
	 *            : A list of JavaScript event types, such as "click" or "keydown,"
	 * @param eventData
	 *            : A map of data that will be passed to the event handler.
	 * @param callback
	 *            : A function to execute at the time the event is triggered.
	 * @return
	 */
	public final JQuery delegate(String selector, EventType[] eventTypes, Map<String, String> eventData, EventHandler callback) {
		return delegate(selector, getEventTypes(eventTypes), JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Attach a handler to one or more custom events for all elements that match the selector, now or in the future, based on a specific set of root elements.
	 * 
	 * @param selector
	 *            : A selector to filter the elements that trigger the event.
	 * @param eventType
	 *            : A string containing one or more space-separated custom JavaScript event types
	 * @param eventData
	 *            : A map of data that will be passed to the event handler.
	 * @param callback
	 *            : A function to execute at the time the event is triggered.
	 * @return
	 */
	public final JQuery delegateCustomEvent(String selector, String eventType, Map<String, String> eventData, EventHandler callback) {
		return delegate(selector, eventType, JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Attach a handler to one or more events for all elements that match the selector, now or in the future, based on a specific set of root elements.
	 * 
	 * @param selector
	 *            : A selector to filter the elements that trigger the event.
	 * @param eventType
	 *            : A listof JavaScript event types, such as "click" or "keydown,".
	 * @param callback
	 *            : A function to execute at the time the event is triggered.
	 * @return
	 */
	public final JQuery delegate(String selector, EventType[] eventTypes, EventHandler callback) {
		return delegate(selector, getEventTypes(eventTypes), callback);
	}

	/**
	 * Attach a handler to one event for all elements that match the selector, now or in the future, based on a specific set of root elements.
	 * 
	 * @param selector
	 *            : A selector to filter the elements that trigger the event.
	 * @param eventType
	 *            : One JavaScript event types, such as "click" or "keydown,"
	 * @param callback
	 *            : A function to execute at the time the event is triggered.
	 * @return
	 */
	public final JQuery delegate(String selector, EventType eventType, EventHandler callback) {
		return delegate(selector, eventType.name(), callback);
	}

	/**
	 * Attach a handler to one or more custom events for all elements that match the selector, now or in the future, based on a specific set of root elements.
	 * 
	 * @param selector
	 *            : A selector to filter the elements that trigger the event.
	 * @param eventType
	 *            : A string containing one or more space-separated custom JavaScript event types.
	 * @param callback
	 *            : A function to execute at the time the event is triggered.
	 * @return
	 */
	public final JQuery delegateCustomEvent(String selector, String eventType, EventHandler callback) {
		return delegate(selector, eventType, callback);
	}

	private final native JQuery delegate(String selector, String eventType, EventHandler callback) /*-{
		return this.delegate(selector,eventType,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Execute the next function on the queue for the matched elements.
	 * 
	 * @return
	 */
	public final native JQuery dequeue() /*-{
		return this.dequeue();
	}-*/;

	/**
	 * Execute the next function on the queue for the matched elements.
	 * 
	 * @param queueName
	 *            : A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 * @return
	 */
	public final native JQuery dequeue(String queueName) /*-{
		return this.dequeue(queueName);
	}-*/;

	/**
	 * Execute the next function on the queue for the matched element.
	 * 
	 * @param element
	 *            : A DOM element from which to remove and execute a queued function.
	 * @return
	 */
	public static final native JavaScriptObject dequeue(Element element) /*-{
		return $wnd.jQuery.dequeue(element);
	}-*/;

	/**
	 * Execute the next function on the queue for the matched element.
	 * 
	 * @param element
	 *            : A DOM element from which to remove and execute a queued function.
	 * @param queueName
	 *            : A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 * @return
	 */
	public static final native JavaScriptObject dequeue(Element element, String queueName) /*-{
		return $wnd.jQuery.dequeue(element, queueName);
	}-*/;

	/**
	 * Remove the set of matched elements from the DOM.
	 * 
	 * @param selector
	 *            : A selector expression that filters the set of matched elements to be removed.
	 * @return
	 */
	public final native JQuery detach(String selector) /*-{
		return this.detach(selector);
	}-*/;

	/**
	 * Remove the set of matched elements from the DOM.
	 * 
	 * @return
	 */
	public final native JQuery detach() /*-{
		return this.detach();
	}-*/;

	/**
	 * Remove all event handlers previously attached using .live() from the elements.
	 * 
	 * @return
	 */
	public final native JQuery die() /*-{
		return this.die();
	}-*/;

	/**
	 * Remove all event handlers previously attached using .live() from the elements.
	 * 
	 * @param eventType
	 *            : A string containing a JavaScript event type, such as click or keydown.
	 * @return
	 */
	public final JQuery die(EventType eventType) {
		return die(eventType.name());
	}

	/**
	 * Remove all event handlers previously attached using .live() from the elements.
	 * 
	 * @param eventType
	 *            : A list of JavaScript event types, such as click or keydown.
	 * @return
	 */
	public final JQuery die(EventType[] eventTypes) {
		return die(getEventTypes(eventTypes));
	}

	/**
	 * Remove all custom event handlers previously attached using .live() from the elements.
	 * 
	 * @param eventType
	 *            : A list of custom JavaScript event types
	 * @return
	 */
	public final JQuery dieCustomEvent(String eventType) {
		return die(eventType);
	}

	private final native JQuery die(String eventType) /*-{
		return this.die(eventType);
	}-*/;

	/**
	 * Iterate over a jQuery object, executing a function for each matched element.
	 * 
	 * @param callback
	 *            : A function to execute for each matched element.
	 * @return
	 */
	public final native JQuery each(IterateElementHandler callback) /*-{
		return this.each(function(index, element) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.IterateElementHandler::fire(Lcom/xedge/jquery/client/handlers/IterateElementHandler;ILcom/google/gwt/dom/client/Element;Lcom/xedge/jquery/client/JQuery;)(callback,index,element,currentJQuery);
				});
	}-*/;

	/**
	 * End the most recent filtering operation in the current chain and return the set of matched elements to its previous state.
	 * 
	 * @return
	 */
	public final native JQuery end() /*-{
		return this.end();
	}-*/;

	/**
	 * Reduce the set of matched elements to the one at the specified index. A negative index will count backwards from the last element in the set.
	 * 
	 * @param index
	 * @return
	 */
	public final native JQuery eq(int index) /*-{
		return this.eq(index);
	}-*/;

	/**
	 * Bind an event handler to the "error" event
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery error(EventHandler callback) /*-{
		return this.error(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery error(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.error(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the "error" event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery error(Map<String, String> eventData, EventHandler callback) {
		return error(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Takes a string and throws an exception containing it.
	 * 
	 * @param message
	 * @return
	 */
	public static final native void error(String message) /*-{
		$wnd.jQuery.error(message);
	}-*/;

	/**
	 * Merge the contents of two objects together.
	 * 
	 * @param deep
	 *            : If true, the merge becomes recursive (aka. deep copy).
	 * @param target
	 * @param object
	 * @return
	 */
	public static final native JavaScriptObject extend(boolean deep, JavaScriptObject target, JavaScriptObject object) /*-{
		return $wnd.jQuery.extend(deep, target, object);
	}-*/;

	/**
	 * Merge the contents of two objects together.
	 * 
	 * @param deep
	 *            : If true, the merge becomes recursive (aka. deep copy).
	 * @param target
	 * @param object
	 * @return
	 */
	public static final JSONObject extend(boolean deep, JSONObject target, JSONObject object) {
		JavaScriptObject result = extend(deep, target.getJavaScriptObject(), object.getJavaScriptObject());
		return new JSONObject(result);
	}

	/**
	 * Display the matched elements by fading them to opaque.
	 * 
	 * @return
	 */
	public final native JQuery fadeIn() /*-{
		return this.fadeIn();
	}-*/;

	/**
	 * Display the matched elements by fading them to opaque.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @return
	 */
	public final JQuery fadeIn(Duration duration) {
		return fadeIn(duration.name());
	}

	private final native JQuery fadeIn(String duration) /*-{
		return this.fadeIn(duration);
	}-*/;

	/**
	 * Display the matched elements by fading them to opaque.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @return
	 */
	public final native JQuery fadeIn(int duration) /*-{
		return this.fadeIn(duration);
	}-*/;

	/**
	 * Display the matched elements by fading them to opaque.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery fadeIn(Duration duration, AnimationCompleteHandler callback) {
		return fadeIn(duration.name(), callback);
	}

	private final native JQuery fadeIn(String duration, AnimationCompleteHandler callback) /*-{
		return this.fadeIn(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display the matched elements by fading them to opaque.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final native JQuery fadeIn(int duration, AnimationCompleteHandler callback) /*-{
		return this.fadeIn(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display the matched elements by fading them to opaque.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery fadeIn(int duration, Easing easing, AnimationCompleteHandler callback) {
		return fadeIn(duration, easing.name(), callback);
	}

	private final native JQuery fadeIn(int duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.fadeIn(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display the matched elements by fading them to opaque.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery fadeIn(int duration, Easing easing) {
		return fadeIn(duration, easing.name());
	}

	private final native JQuery fadeIn(int duration, String easing) /*-{
		return this.fadeIn(duration, easing);
	}-*/;

	/**
	 * Display the matched elements by fading them to opaque.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery fadeIn(Duration duration, Easing easing) {
		return fadeIn(duration.name(), easing.name());
	}

	private final native JQuery fadeIn(String duration, String easing) /*-{
		return this.fadeIn(duration, easing);
	}-*/;

	/**
	 * Display the matched elements by fading them to opaque.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery fadeIn(Duration duration, Easing easing, AnimationCompleteHandler callback) {
		return fadeIn(duration.name(), easing.name(), callback);
	}

	private final native JQuery fadeIn(String duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.fadeIn(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Hide the matched elements by fading them to transparent.
	 * 
	 * @return
	 */
	public final native JQuery fadeOut() /*-{
		return this.fadeOut();
	}-*/;

	/**
	 * Hide the matched elements by fading them to transparent.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @return
	 */
	public final JQuery fadeOut(Duration duration) {
		return fadeOut(duration.name());
	}

	private final native JQuery fadeOut(String duration) /*-{
		return this.fadeOut(duration);
	}-*/;

	/**
	 * Hide the matched elements by fading them to transparent.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @return
	 */
	public final native JQuery fadeOut(int duration) /*-{
		return this.fadeOut(duration);
	}-*/;

	/**
	 * Hide the matched elements by fading them to transparent.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery fadeOut(Duration duration, AnimationCompleteHandler callback) {
		return fadeOut(duration.name(), callback);
	}

	private final native JQuery fadeOut(String duration, AnimationCompleteHandler callback) /*-{
		return this.fadeOut(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Hide the matched elements by fading them to transparent.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final native JQuery fadeOut(int duration, AnimationCompleteHandler callback) /*-{
		return this.fadeOut(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Hide the matched elements by fading them to transparent.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery fadeOut(int duration, Easing easing, AnimationCompleteHandler callback) {
		return fadeOut(duration, easing.name(), callback);
	}

	private final native JQuery fadeOut(int duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.fadeOut(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Hide the matched elements by fading them to transparent.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery fadeOut(int duration, Easing easing) {
		return fadeOut(duration, easing.name());
	}

	private final native JQuery fadeOut(int duration, String easing) /*-{
		return this.fadeOut(duration, easing);
	}-*/;

	/**
	 * Hide the matched elements by fading them to transparent.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery fadeOut(Duration duration, Easing easing) {
		return fadeOut(duration.name(), easing.name());
	}

	private final native JQuery fadeOut(String duration, String easing) /*-{
		return this.fadeOut(duration, easing);
	}-*/;

	/**
	 * Hide the matched elements by fading them to transparent.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery fadeOut(Duration duration, Easing easing, AnimationCompleteHandler callback) {
		return fadeOut(duration.name(), easing.name(), callback);
	}

	private final native JQuery fadeOut(String duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.fadeOut(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Adjust the opacity of the matched elements.
	 * 
	 * @param opacity
	 *            : A number between 0 and 1 denoting the target opacity.
	 * @return
	 */
	public final native JQuery fadeTo(double opacity) /*-{
		return this.fadeTo(opacity);
	}-*/;

	/**
	 * Adjust the opacity of the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param opacity
	 *            : A number between 0 and 1 denoting the target opacity.
	 * @return
	 */
	public final JQuery fadeTo(Duration duration, double opacity) {
		return fadeTo(duration.name(), opacity);
	}

	private final native JQuery fadeTo(String duration, double opacity) /*-{
		return this.fadeTo(duration, opacity);
	}-*/;

	/**
	 * Adjust the opacity of the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param opacity
	 *            : A number between 0 and 1 denoting the target opacity.
	 * @return
	 */
	public final native JQuery fadeTo(int duration, double opacity) /*-{
		return this.fadeTo(duration, opacity);
	}-*/;

	/**
	 * Adjust the opacity of the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param opacity
	 *            : A number between 0 and 1 denoting the target opacity.
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery fadeTo(Duration duration, double opacity, AnimationCompleteHandler callback) {
		return fadeTo(duration.name(), opacity, callback);
	}

	private final native JQuery fadeTo(String duration, double opacity, AnimationCompleteHandler callback) /*-{
		return this.fadeTo(duration,opacity,
						function() {var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Adjust the opacity of the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param opacity
	 *            : A number between 0 and 1 denoting the target opacity.
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final native JQuery fadeTo(int duration, double opacity, AnimationCompleteHandler callback) /*-{
		return this.fadeTo(duration,opacity,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Adjust the opacity of the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param opacity
	 *            : A number between 0 and 1 denoting the target opacity.
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery fadeTo(int duration, double opacity, Easing easing, AnimationCompleteHandler callback) {
		return fadeTo(duration, opacity, easing.name(), callback);
	}

	private final native JQuery fadeTo(int duration, double opacity, String easing, AnimationCompleteHandler callback) /*-{
		return this.fadeTo(duration,opacity,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Adjust the opacity of the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param opacity
	 *            : A number between 0 and 1 denoting the target opacity.
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery fadeTo(int duration, double opacity, Easing easing) {
		return fadeTo(duration, opacity, easing.name());
	}

	private final native JQuery fadeTo(int duration, double opacity, String easing) /*-{
		return this.fadeTo(duration, opacity, easing);
	}-*/;

	/**
	 * Adjust the opacity of the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param opacity
	 *            : A number between 0 and 1 denoting the target opacity.
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery fadeTo(Duration duration, double opacity, Easing easing) {
		return fadeTo(duration.name(), opacity, easing.name());
	}

	private final native JQuery fadeTo(String duration, double opacity, String easing) /*-{
		return this.fadeTo(duration, opacity, easing);
	}-*/;

	/**
	 * Adjust the opacity of the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param opacity
	 *            : A number between 0 and 1 denoting the target opacity.
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery fadeTo(Duration duration, double opacity, Easing easing, AnimationCompleteHandler callback) {
		return fadeTo(duration.name(), opacity, easing.name(), callback);
	}

	private final native JQuery fadeTo(String duration, double opacity, String easing, AnimationCompleteHandler callback) /*-{
		return this.fadeTo(duration,opacity,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Reduce the set of matched elements to those that match the selector
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match the current set of elements against.
	 * @return
	 */
	public final native JQuery filter(String selector) /*-{
		return this.filter(selector);
	}-*/;

	/**
	 * Reduce the set of matched elements to those that pass the function's test.
	 * 
	 * @param callback
	 * @return
	 */
	public final native JQuery filter(ValidateItemHandler callback) /*-{
		return this.filter(function(index) {
					var currentJQuery = $wnd.jQuery(this);
					return @com.xedge.jquery.client.handlers.ValidateItemHandler::fire(Lcom/xedge/jquery/client/handlers/ValidateItemHandler;ILcom/xedge/jquery/client/JQuery;)(callback,index,currentJQuery);
				});
	}-*/;

	/**
	 * Reduce the set of matched elements to those that match the element
	 * 
	 * @param element
	 *            : An element to match the current set of elements against.
	 * @return
	 */
	public final native JQuery filter(Element element) /*-{
		return this.filter(element);
	}-*/;

	/**
	 * Reduce the set of matched elements to those that match the jQuery object
	 * 
	 * @param jquery
	 *            : An existing jQuery object to match the current set of elements against.
	 * @return
	 */
	public final native JQuery filter(JQuery jquery) /*-{
		return this.filter(jquery);
	}-*/;

	/**
	 * Get the descendants of each element in the current set of matched elements, filtered by a selector.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery find(String selector) /*-{
		return this.find(selector);
	}-*/;

	/**
	 * Get the descendants of each element in the current set of matched elements, filtered by an element.
	 * 
	 * @param element
	 * @return
	 */
	public final native JQuery find(Element element) /*-{
		return this.find(element);
	}-*/;

	/**
	 * Get the descendants of each element in the current set of matched elements, filtered by a jQuery object.
	 * 
	 * @param jquery
	 * @return
	 */
	public final native JQuery find(JQuery jquery) /*-{
		return this.find(jquery);
	}-*/;

	/**
	 * Reduce the set of matched elements to the first in the set.
	 * 
	 * @return
	 */
	public final native JQuery first() /*-{
		return this.first();
	}-*/;

	/**
	 * Trigger the focus event on an element.
	 * 
	 * @return
	 */
	public final native JQuery focus() /*-{
		return this.focus();
	}-*/;

	/**
	 * Bind an event handler to the "focus" JavaScript event
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery focus(EventHandler callback) /*-{
		return this.focus(function(event) {
			        var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery focus(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.focus(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the "focus" JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery focus(Map<String, String> eventData, EventHandler callback) {
		return focus(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Bind an event handler to the "focusin" JavaScript event The focusin event is sent to an element when it, or any element inside of it, gains focus.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery focusin(EventHandler callback) /*-{
		return this.focusin(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery focusin(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.focusin(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the "focusin" JavaScript event The focusin event is sent to an element when it, or any element inside of it, gains focus.
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery focusin(Map<String, String> eventData, EventHandler callback) {
		return focus(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Bind an event handler to the "focusout" JavaScript event The focusout event is sent to an element when it, or any element inside of it, loses focus.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery focusout(EventHandler callback) /*-{
		return this.focusout(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery focusout(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.focusout(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the "focusout" JavaScript event The focusout event is sent to an element when it, or any element inside of it, loses focus.
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery focusout(Map<String, String> eventData, EventHandler callback) {
		return focusout(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Get the rate (in milliseconds) at which animations fire. The default is 13 milliseconds
	 * 
	 * @return
	 */
	public static final native double getFXInterval() /*-{
		return $wnd.jQuery.fx.interval;
	}-*/;

	/**
	 * Set the rate (in milliseconds) at which animations fire. The default is 13 milliseconds
	 * 
	 * @param interval
	 */
	public static final native void setFXInterval(double interval) /*-{
		$wnd.jQuery.fx.interval = interval;
	}-*/;

	/**
	 * Is all animations disable.
	 * 
	 * @return
	 */
	public static final native boolean getFXOff() /*-{
		return $wnd.jQuery.fx.off || false;
	}-*/;

	/**
	 * Globally disable all animations.
	 * 
	 * @param off
	 */
	public static final native void setFXOff(boolean off) /*-{
		$wnd.jQuery.fx.off = off;
	}-*/;

	/**
	 * Load data from the server using a HTTP GET request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param url
	 */
	public static final native void get(String url) /*-{
		$wnd.jQuery.get(url);
	}-*/;

	/**
	 * Load data from the server using a HTTP GET request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public static final native void get(String url, SuccessHandlerWithDataStatusJQXHR callback) /*-{
		$wnd.jQuery.get(url,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataStatusJQXHR;Ljava/lang/String;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
						});
	}-*/;

	/**
	 * Load data from the server using a HTTP GET request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param sentData
	 *            : Data to be sent to the server.It's appended to the url as parameters.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public static final native void get(String url, String sentData, SuccessHandlerWithDataStatusJQXHR callback) /*-{
		$wnd.jQuery.get(url,sentData,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataStatusJQXHR;Ljava/lang/String;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
						});
	}-*/;

	private static final native void get(String url, JavaScriptObject sentData, SuccessHandlerWithDataStatusJQXHR callback) /*-{
		$wnd.jQuery.get(url,sentData,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataStatusJQXHR;Ljava/lang/String;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
						});
	}-*/;

	/**
	 * Load data from the server using a HTTP GET request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param sentData
	 *            : Data to be sent to the server.Object must be Key/Value pairs. It's appended to the url as parameters.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public static final void get(String url, Map<String, String> sentData, SuccessHandlerWithDataStatusJQXHR callback) {
		get(url, JSHelper.convertStringMapToJSONObject(sentData).getJavaScriptObject(), callback);
	}

	/**
	 * Load data from the server using a HTTP GET request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param sentData
	 *            : Data to be sent to the server.It's appended to the url as parameters.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 * @param dataType
	 *            : The type of data that you're expecting back from the server. Default: Intelligent Guess (xml, json, script, or html)
	 */
	public static final native void get(String url, String sentData, SuccessHandlerWithDataStatusJQXHR callback, String dataType) /*-{
		$wnd.jQuery.get(url,sentData,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataStatusJQXHR;Ljava/lang/String;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
						}, dataType);
	}-*/;

	private static final native void get(String url, JavaScriptObject sentData, SuccessHandlerWithDataStatusJQXHR callback, String dataType) /*-{
		$wnd.jQuery.get(url,sentData,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataStatusJQXHR;Ljava/lang/String;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
						}, dataType);
	}-*/;

	/**
	 * Load data from the server using a HTTP GET request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param sentData
	 *            : Data to be sent to the server.Object must be Key/Value pairs. It's appended to the url as parameters.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 * @param dataType
	 *            : The type of data that you're expecting back from the server. Default: Intelligent Guess (xml, json, script, or html)
	 */
	public static final void get(String url, Map<String, String> sentData, SuccessHandlerWithDataStatusJQXHR callback, String dataType) {
		get(url, JSHelper.convertStringMapToJSONObject(sentData).getJavaScriptObject(), callback, dataType);
	}

	/**
	 * Load JSON-encoded data from the server using a GET HTTP request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public static final native void getJSON(String url, SuccessHandlerWithDataObjectStatusJQXHR callback) /*-{
		$wnd.jQuery.getJSON(url,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataObjectStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataObjectStatusJQXHR;Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
						});
	}-*/;

	/**
	 * Load JSON-encoded data from the server using a GET HTTP request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param sentData
	 *            : Data to be sent to the server.It's appended to the url as parameters.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public static final native void getJSON(String url, String sentData, SuccessHandlerWithDataObjectStatusJQXHR callback) /*-{
		$wnd.jQuery.getJSON(url,sentData,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataObjectStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataObjectStatusJQXHR;Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
						});
	}-*/;

	private static final native void getJSON(String url, JavaScriptObject sentData, SuccessHandlerWithDataObjectStatusJQXHR callback) /*-{
		$wnd.jQuery.getJSON(url,sentData,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataObjectStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataObjectStatusJQXHR;Lcom/google/gwt/core/client/JavaScriptObject;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
		});
	}-*/;

	/**
	 * Load JSON-encoded data from the server using a GET HTTP request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param sentData
	 *            : Data to be sent to the server.Object must be Key/Value pairs. It's appended to the url as parameters.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public static final void getJSON(String url, Map<String, String> sentData, SuccessHandlerWithDataObjectStatusJQXHR callback) {
		getJSON(url, JSHelper.convertStringMapToJSONObject(sentData).getJavaScriptObject(), callback);
	}

	/**
	 * Load a JavaScript file from the server using a GET HTTP request, then execute it.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 */
	public static final native void getScript(String url) /*-{
		$wnd.jQuery.getScript(url);
	}-*/;

	/**
	 * Load a JavaScript file from the server using a GET HTTP request, then execute it.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public static final native void getScript(String url, SuccessHandlerWithData callback) /*-{
		$wnd.jQuery.getScript(url,function(data) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithData::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithData;Ljava/lang/String;)(callback,data);
						});
	}-*/;

	/**
	 * Execute some JavaScript code globally.
	 * 
	 * @param code
	 */
	public static final native void globalEval(String code) /*-{
		$wnd.jQuery.globalEval(code);
	}-*/;

	/**
	 * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery has(String selector) /*-{
		return this.has(selector);
	}-*/;

	/**
	 * Reduce the set of matched elements to those that have a descendant that matches the selector or DOM element.
	 * 
	 * @param contained
	 *            : A DOM element to match elements against.
	 * @return
	 */
	public final native JQuery has(Element contained) /*-{
		return this.has(contained);
	}-*/;

	/**
	 * Get the current computed height for the first element in the set of matched elements.
	 * 
	 * @return
	 */
	public final native int height() /*-{
		return this.height();
	}-*/;

	/**
	 * Set the CSS height of every matched element.
	 * 
	 * @param value
	 *            : An integer representing the number of pixels
	 * @return
	 */
	public final native JQuery height(int value) /*-{
		return this.height(value);
	}-*/;

	/**
	 * Set the CSS height of every matched element.
	 * 
	 * @param value
	 *            : A number with an optional unit of measure appended. "px" is the default
	 * @return
	 */
	public final native JQuery height(String value) /*-{
		return this.height(value);
	}-*/;

	/**
	 * Set the CSS height of every matched element.
	 * 
	 * @param callback
	 *            : A function returning the height to set. Receives the index position of the element in the set and the old height as arguments.
	 * @return
	 */
	public final native JQuery height(ReturnIntegerGetIndexValueHandler callback) /*-{
		return this.height(function(index, height) {
					return @com.xedge.jquery.client.handlers.ReturnIntegerGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnIntegerGetIndexValueHandler;II)(callback,index,height);
				});
	}-*/;

	/**
	 * Bind two handlers to the matched elements, to be executed when the mouse pointer enters and leaves the elements.
	 * 
	 * @param inHandler
	 *            : A function to execute when the mouse pointer enters the element.
	 * @param outHandler
	 *            : A function to execute when the mouse pointer leaves the element.
	 * @return
	 */
	public final native JQuery hover(EventHandler inHandler, EventHandler outHandler) /*-{
		return this.hover(
		  function (event) {
		    @com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(inHandler,event,$wnd.jQuery(this));
		  },
		  function (event) {
		    @com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(outHandler,event,$wnd.jQuery(this));
		  }
		);
	}-*/;

	/**
	 * Bind a single handler to the matched elements, to be executed when the mouse pointer enters or leaves the elements.
	 * 
	 * @param handlerInOut
	 *            : A function to execute when the mouse pointer enters or leaves the element.
	 * @return
	 */
	public final native JQuery hover(EventHandler handlerInOut) /*-{
		return this.hover(function(event) {
			@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(handlerInOut,event,$wnd.jQuery(this));
		 });
	}-*/;

	/**
	 * Get the HTML contents of the first element in the set of matched elements.
	 * 
	 * @return
	 */
	public final native String html() /*-{
		return this.html();
	}-*/;

	/**
	 * Set the HTML contents of each element in the set of matched elements.
	 * 
	 * @param htmlString
	 *            : A string of HTML to set as the content of each matched element.
	 * @return
	 */
	public final native JQuery html(String htmlString) /*-{
		return this.html(htmlString);
	}-*/;

	/**
	 * Set the HTML contents of each element in the set of matched elements.
	 * 
	 * @param callback
	 *            : A function returning the HTML content to set. Receives the index position of the element in the set and the old HTML value as arguments
	 * @return
	 */
	public final native JQuery html(ReturnStringGetIndexValueHandler callback) /*-{
		return this.html(function(index, value) {
					return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,value);
				});
	}-*/;

	/**
	 * Search for a given element from among the matched elements.
	 * 
	 * @return
	 */
	public final native int index() /*-{
		return this.index();
	}-*/;

	/**
	 * Search for a given element from among the matched elements.
	 * 
	 * @param selector
	 *            : A selector representing a jQuery collection in which to look for an element.
	 * @return
	 */
	public final native int index(String selector) /*-{
		return this.index(selector);
	}-*/;

	/**
	 * Search for a given element from among the matched elements.
	 * 
	 * @param element
	 *            : The DOM element or first element within the jQuery object to look for.
	 * @return
	 */
	public final native int index(Element element) /*-{
		return this.index(element);
	}-*/;

	/**
	 * Get the current computed height for the first element in the set of matched elements, including padding but not border.
	 * 
	 * @return
	 */
	public final native int innerHeight() /*-{
		return this.innerHeight();
	}-*/;

	/**
	 * Get the current computed width for the first element in the set of matched elements, including padding but not border.
	 * 
	 * @return
	 */
	public final native int innerWidth() /*-{
		return this.innerWidth();
	}-*/;

	/**
	 * Insert every element in the set of matched elements after the target.
	 * 
	 * @param selector
	 *            : A selector representing a jQuery collection . The matched set of elements will be inserted after the element(s) specified by this parameter.
	 * @return
	 */
	public final native JQuery insertAfter(String selector) /*-{
		return this.insertAfter(selector);
	}-*/;

	/**
	 * Insert every element in the set of matched elements after the target.
	 * 
	 * @param element
	 *            : The matched set of elements will be inserted after the element(s) specified by this parameter.
	 * @return
	 */
	public final native JQuery insertAfter(Element element) /*-{
		return this.insertAfter(element);
	}-*/;

	/**
	 * Insert every element in the set of matched elements after the target.
	 * 
	 * @param jquery
	 *            : The matched set of elements will be inserted after the element(s) specified by this parameter.
	 * @return
	 */
	public final native JQuery insertAfter(JQuery jquery) /*-{
		return this.insertAfter(jquery);
	}-*/;

	/**
	 * Insert every element in the set of matched elements before the target.
	 * 
	 * @param selector
	 *            : The matched set of elements will be inserted before the element(s) specified by this parameter.
	 * @return
	 */
	public final native JQuery insertBefore(String selector) /*-{
		return this.insertBefore(selector);
	}-*/;

	/**
	 * Insert every element in the set of matched elements before the target.
	 * 
	 * @param element
	 *            : The matched set of elements will be inserted before the element(s) specified by this parameter.
	 * @return
	 */
	public final native JQuery insertBefore(Element element) /*-{
		return this.insertBefore(element);
	}-*/;

	/**
	 * Insert every element in the set of matched elements before the target.
	 * 
	 * @param jquery
	 *            : The matched set of elements will be inserted before the element(s) specified by this parameter.
	 * @return
	 */
	public final native JQuery insertBefore(JQuery jquery) /*-{
		return this.insertBefore(jquery);
	}-*/;

	/**
	 * Check the current matched set of elements against a selector and return true if at least one of these elements matches the selector.
	 * 
	 * @param selector
	 * @return
	 */
	public final native boolean is(String selector) /*-{
		return this.is(selector);
	}-*/;

	/**
	 * Check the current matched set of elements against an element and return true if at least one of these elements matches the given arguments.
	 * 
	 * @param element
	 * @return
	 */
	public final native boolean is(Element element) /*-{
		return this.is(element);
	}-*/;

	/**
	 * Check the current matched set of elements against a jQuery object and return true if at least one of these elements matches the given arguments.
	 * 
	 * @param jquery
	 * @return
	 */
	public final native boolean is(JQuery jquery) /*-{
		return this.is(jquery);
	}-*/;

	/**
	 * Determine whether the argument is an array.
	 * 
	 * @param obj
	 *            : object to test
	 * @return
	 */
	public static final native boolean isArray(JavaScriptObject obj) /*-{
		return $wnd.jQuery.isArray(obj);
	}-*/;

	/**
	 * Check to see if an object is empty (contains no properties).
	 * 
	 * @param obj
	 *            : object to test
	 * @return
	 */
	public static final native boolean isEmptyObject(JavaScriptObject obj) /*-{
		return $wnd.jQuery.isEmptyObject(obj);
	}-*/;

	/**
	 * Determine if the argument passed is a Javascript function object.
	 * 
	 * @param obj
	 *            : object to test
	 * @return
	 */
	public static final native boolean isFunction(JavaScriptObject obj) /*-{
		return $wnd.jQuery.isFunction(obj);
	}-*/;

	/**
	 * Check to see if an object is a plain object (created using "{}" or "new Object").
	 * 
	 * @param obj
	 *            object to test
	 * @return
	 */
	public static final native boolean isPlainObject(JavaScriptObject obj) /*-{
		return $wnd.jQuery.isPlainObject(obj);
	}-*/;

	/**
	 * Determine whether the argument is a window.
	 * 
	 * @param obj
	 *            object to test
	 * @return
	 */
	public static final native boolean isWindow(JavaScriptObject obj) /*-{
		return $wnd.jQuery.isWindow(obj);
	}-*/;

	/**
	 * Check to see if a DOM node is within an XML document (or is an XML document).
	 * 
	 * @param obj
	 *            : The DOM node that will be checked to see if it's in an XML document.
	 * @return
	 */
	public static final native boolean isXMLDoc(Node obj) /*-{
		return $wnd.jQuery.isXMLDoc(obj);
	}-*/;

	/**
	 * Trigger the keydown event on an element.
	 * 
	 * @return
	 */
	public final native JQuery keydown() /*-{
		return this.keydown();
	}-*/;

	/**
	 * Bind an event handler to the keydown JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery keydown(EventHandler callback) /*-{
		return this.keydown(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery keydown(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.keydown(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the keydown JavaScript event.
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery keydown(Map<String, String> eventData, EventHandler callback) {
		return keydown(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Trigger the keypress event on an element.
	 * 
	 * @return
	 */
	public final native JQuery keypress() /*-{
		return this.keypress();
	}-*/;

	/**
	 * Bind an event handler to the keypress JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery keypress(EventHandler callback) /*-{
		return this.keypress(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery keypress(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.keypress(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the keypress JavaScript event.
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery keypress(Map<String, String> eventData, EventHandler callback) {
		return keypress(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Trigger the keyup event on an element.
	 * 
	 * @return
	 */
	public final native JQuery keyup() /*-{
		return this.keyup();
	}-*/;

	/**
	 * Bind an event handler to the keyup JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery keyup(EventHandler callback) /*-{
		return this.keyup(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery keyup(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.keyup(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the keyup JavaScript event.
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery keyup(Map<String, String> eventData, EventHandler callback) {
		return keyup(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Reduce the set of matched elements to the final one in the set.
	 * 
	 * @return
	 */
	public final native JQuery last() /*-{
		return this.last();
	}-*/;

	private final native JQuery live(String eventType, JavaScriptObject eventData, EventHandler callback) /*-{
		return this.live(eventType,eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Attach a handler to the event for all elements which match the current selector, now and in the future.
	 * 
	 * @param eventType
	 *            A JavaScript event type, such as "click" or "submit,"
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery live(EventType eventType, Map<String, String> eventData, EventHandler callback) {
		return live(eventType.name(), JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Attach a handler to the events for all elements which match the current selector, now and in the future.
	 * 
	 * @param eventType
	 *            A list of JavaScript event types, such as "click" or "submit,"
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery live(EventType[] eventTypes, Map<String, String> eventData, EventHandler callback) {
		return live(getEventTypes(eventTypes), JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Attach a handler to the custom events for all elements which match the current selector, now and in the future.
	 * 
	 * @param eventType
	 *            A string containing one or more custom JavaScript event types.
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery liveCustomEvent(String eventType, Map<String, String> eventData, EventHandler callback) {
		return live(eventType, JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Attach a handler to the event for all elements which match the current selector, now and in the future.
	 * 
	 * @param eventType
	 *            A JavaScript event type, such as "click" or "submit,"
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery live(EventType eventType, EventHandler callback) {
		return live(eventType.name(), callback);
	}

	/**
	 * Attach a handler to the events for all elements which match the current selector, now and in the future.
	 * 
	 * @param eventTypes
	 *            A list of JavaScript event types, such as "click" or "submit,".
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery live(EventType[] eventTypes, EventHandler callback) {
		return live(getEventTypes(eventTypes), callback);
	}

	/**
	 * Attach a handler to the custom event for all elements which match the current selector, now and in the future.
	 * 
	 * @param eventType
	 *            A string containing one or more custom JavaScript event types.
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery liveCustomEvent(String eventType, EventHandler callback) {
		return live(eventType, callback);
	}

	private final native JQuery live(String eventType, EventHandler callback) /*-{
		return this.live(eventType,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Load data from the server and place the returned HTML into the matched element.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 */
	public final native JQuery load(String url) /*-{
		return this.load(url);
	}-*/;

	/**
	 * Load data from the server and place the returned HTML into the matched element.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public final native JQuery load(String url, SuccessHandlerWithData callback) /*-{
		return this.load(url,function(data) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithData::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithData;Ljava/lang/String;)(callback,data);
						});
	}-*/;

	/**
	 * Load data from the server and place the returned HTML into the matched element.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param sentData
	 *            : Data to be sent to the server.It's appended to the url as parameters.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public final native JQuery load(String url, String sentData, SuccessHandlerWithData callback) /*-{
		return this.load(url,sentData,function(data) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithData::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithData;Ljava/lang/String;)(callback,data);
						});
	}-*/;

	private final native JQuery load(String url, JavaScriptObject sentData, SuccessHandlerWithData callback) /*-{
		return this.load(url,sentData,function(data) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithData::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithData;Ljava/lang/String;)(callback,data);
						});
	}-*/;

	/**
	 * Load data from the server and place the returned HTML into the matched element.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param sentData
	 *            : Data to be sent to the server.Object must be Key/Value pairs. It's appended to the url as parameters.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public final JQuery load(String url, Map<String, String> sentData, SuccessHandlerWithData callback) {
		return load(url, JSHelper.convertStringMapToJSONObject(sentData).getJavaScriptObject(), callback);
	}

	/**
	 * Bind an event handler to the load JavaScript event. The load event is sent to an element when it and all sub-elements have been completely loaded. This event can be sent to any element associated with a URL: images, scripts, frames, iframes, and the window object.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery load(EventHandler callback) /*-{
		return this.load(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery load(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.load(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the load JavaScript event. The load event is sent to an element when it and all sub-elements have been completely loaded. This event can be sent to any element associated with a URL: images, scripts, frames, iframes, and the window object.
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery load(Map<String, String> eventData, EventHandler callback) {
		return load(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Select the window object
	 * 
	 * @return
	 */
	public static final native JQuery selectWindow() /*-{
		return $wnd.jQuery($wnd);
	}-*/;

	/**
	 * Pass each element in the current matched set through a function, producing a new jQuery object containing the return values.
	 * 
	 * @param callback
	 * @return
	 */
	public final native JQuery map(ReturnStringGetIndexElementHandler callback) /*-{
		return this.map(function(index, element) {
					return @com.xedge.jquery.client.handlers.ReturnStringGetIndexElementHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexElementHandler;ILcom/google/gwt/dom/client/Element;)(callback,index,element);
				});
	}-*/;

	/**
	 * Trigger the mousedown event on an element.
	 * 
	 * @return
	 */
	public final native JQuery mousedown() /*-{
		return this.mousedown();
	}-*/;

	/**
	 * Bind an event handler to the mousedown JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery mousedown(EventHandler callback) /*-{
		return this.mousedown(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery mousedown(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.mousedown(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the mousedown JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery mousedown(Map<String, String> eventData, EventHandler callback) {
		return mousedown(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Trigger the mouseenter event on an element.
	 * 
	 * @return
	 */
	public final native JQuery mouseenter() /*-{
		return this.mouseenter();
	}-*/;

	/**
	 * Bind an event handler to the mouseenter JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery mouseenter(EventHandler callback) /*-{
		return this.mouseenter(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery mouseenter(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.mouseenter(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the mouseenter JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery mouseenter(Map<String, String> eventData, EventHandler callback) {
		return mouseenter(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Trigger the mouseleave event on an element.
	 * 
	 * @return
	 */
	public final native JQuery mouseleave() /*-{
		return this.mouseleave();
	}-*/;

	/**
	 * Bind an event handler to the mouseleave JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery mouseleave(EventHandler callback) /*-{
		return this.mouseleave(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery mouseleave(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.mouseleave(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the mouseleave JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery mouseleave(Map<String, String> eventData, EventHandler callback) {
		return mouseleave(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Trigger the mousemove event on an element.
	 * 
	 * @return
	 */
	public final native JQuery mousemove() /*-{
		return this.mousemove();
	}-*/;

	/**
	 * Bind an event handler to the mousemove JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery mousemove(EventHandler callback) /*-{
		return this.mousemove(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery mousemove(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.mousemove(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the mousemove JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery mousemove(Map<String, String> eventData, EventHandler callback) {
		return mousemove(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Trigger the mouseout event on an element.
	 * 
	 * @return
	 */
	public final native JQuery mouseout() /*-{
		return this.mouseout();
	}-*/;

	/**
	 * Bind an event handler to the mouseout JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery mouseout(EventHandler callback) /*-{
		return this.mouseout(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery mouseout(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.mouseout(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the mouseout JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery mouseout(Map<String, String> eventData, EventHandler callback) {
		return mouseout(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Trigger the mouseover event on an element.
	 * 
	 * @return
	 */
	public final native JQuery mouseover() /*-{
		return this.mouseover();
	}-*/;

	/**
	 * Bind an event handler to the mouseover JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery mouseover(EventHandler callback) /*-{
		return this.mouseover(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery mouseover(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.mouseover(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the mouseover JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery mouseover(Map<String, String> eventData, EventHandler callback) {
		return mouseover(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Trigger the mouseup event on an element.
	 * 
	 * @return
	 */
	public final native JQuery mouseup() /*-{
		return this.mouseup();
	}-*/;

	/**
	 * Bind an event handler to the mouseup JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery mouseup(EventHandler callback) /*-{
		return this.mouseup(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery mouseup(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.mouseup(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the mouseup JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery mouseup(Map<String, String> eventData, EventHandler callback) {
		return mouseup(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Get the immediately following sibling of each element in the set of matched elements. If a selector is provided, it retrieves the next sibling only if it matches that selector.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery next(String selector) /*-{
		return this.next(selector);
	}-*/;

	/**
	 * Get the immediately following sibling of each element in the set of matched elements. If a selector is provided, it retrieves the next sibling only if it matches that selector.
	 * 
	 * @return
	 */
	public final native JQuery next() /*-{
		return this.next();
	}-*/;

	/**
	 * Get all following siblings of each element in the set of matched elements filtered by a selector.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery nextAll(String selector) /*-{
		return this.nextAll(selector);
	}-*/;

	/**
	 * Get all following siblings of each element in the set of matched elements.
	 * 
	 * @return
	 */
	public final native JQuery nextAll() /*-{
		return this.nextAll();
	}-*/;

	/**
	 * Get all following siblings of each element up to but not including the element matched by the selector.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery nextUntil(String selector) /*-{
		return this.nextUntil(selector);
	}-*/;

	/**
	 * An empty function.
	 * 
	 * @return
	 */
	public static final native JavaScriptObject noop() /*-{
		return $wnd.jQuery.noop();
	}-*/;

	/**
	 * Remove elements from the set of matched elements.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match the current set of elements against.
	 * @return
	 */
	public final native JQuery not(String selector) /*-{
		return this.not(selector);
	}-*/;

	/**
	 * Remove elements from the set of matched elements.
	 * 
	 * @param callback
	 * @return
	 */
	public final native JQuery not(ValidateItemHandler callback) /*-{
		return this.not(function(index) {
					var currentJQuery = $wnd.jQuery(this);
					return @com.xedge.jquery.client.handlers.ValidateItemHandler::fire(Lcom/xedge/jquery/client/handlers/ValidateItemHandler;ILcom/xedge/jquery/client/JQuery;)(callback,index,currentJQuery);
				});
	}-*/;

	/**
	 * Remove elements from the set of matched elements.
	 * 
	 * @param element
	 *            : An element to match the current set of elements against.
	 * @return
	 */
	public final native JQuery not(Element element) /*-{
		return this.not(element);
	}-*/;

	/**
	 * Remove elements from the set of matched elements.
	 * 
	 * @param jquery
	 *            : An existing jQuery object to match the current set of elements against.
	 * @return
	 */
	public final native JQuery not(JQuery jquery) /*-{
		return this.not(jquery);
	}-*/;

	/**
	 * Get the current coordinates of the first element in the set of matched elements, relative to the document. Contrast this with .position(), which retrieves the current position relative to the offset parent.
	 * 
	 * @return
	 */
	public final native CoOrdinates offset() /*-{
		return this.offset();
	}-*/;

	/**
	 * Set the current coordinates of every element in the set of matched elements, relative to the document.
	 * 
	 * @param coordinates
	 * @return
	 */
	public final native JQuery offset(CoOrdinates coordinates) /*-{
		return this.offset(coordinates);
	}-*/;

	/**
	 * Set the current coordinates of every element in the set of matched elements, relative to the document.
	 * 
	 * @param callback
	 *            : A function to return the coordinates to set. Receives the index of the element in the collection as the first argument and the current coordinates as the second argument.
	 * @return
	 */
	public final native JQuery offset(OffsetHandler callback) /*-{
		return this.offset(function(index, coords) {
					return @com.xedge.jquery.client.handlers.OffsetHandler::fire(Lcom/xedge/jquery/client/handlers/OffsetHandler;ILcom/xedge/jquery/client/model/CoOrdinates;)(callback,index,coords);
				});
	}-*/;

	/**
	 * Get the closest ancestor element that is positioned.
	 * 
	 * @return
	 */
	public final native JQuery offsetParent() /*-{
		return this.offsetParent();
	}-*/;

	private final native JQuery one(String eventType, JavaScriptObject eventData, EventHandler callback) /*-{
		return this.one(eventType,eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Attach a handler to an event for the elements. The handler is executed at most once per element.
	 * 
	 * @param eventType
	 *            A JavaScript event type, such as "click" or "submit,".
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery one(EventType eventType, Map<String, String> eventData, EventHandler callback) {
		return one(eventType.name(), JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Attach a handler to list of events for the elements. The handler is executed at most once per element.
	 * 
	 * @param eventType
	 *            A list of JavaScript event types, such as "click" or "submit,".
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery one(EventType[] eventTypes, Map<String, String> eventData, EventHandler callback) {
		return one(getEventTypes(eventTypes), JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	public final JQuery oneCustomEvent(String eventType, Map<String, String> eventData, EventHandler callback) {
		return one(eventType, JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Attach a handler to an event for the elements. The handler is executed at most once per element.
	 * 
	 * @param eventType
	 *            One JavaScript event type such as "click" or "submit,".
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery one(EventType eventType, EventHandler callback) {
		return one(eventType.name(), callback);
	}

	/**
	 * Attach a handler to events for the elements. The handler is executed at most once per element.
	 * 
	 * @param eventTypes
	 *            List of JavaScript event types such as "click" or "submit,".
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery one(EventType[] eventTypes, EventHandler callback) {
		return one(getEventTypes(eventTypes), callback);
	}

	/**
	 * Attach a handler to custom events for the elements. The handler is executed at most once per element.
	 * 
	 * @param eventType
	 *            One or more custom JavaScript event types.
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery oneCustomEvent(String eventType, EventHandler callback) {
		return one(eventType, callback);
	}

	private final native JQuery one(String eventType, EventHandler callback) /*-{
		return this.one(eventType,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Get the current computed height for the first element in the set of matched elements, including padding, border.
	 * 
	 * @return
	 */
	public final native int outerHeight() /*-{
		return this.outerHeight();
	}-*/;

	/**
	 * Get the current computed height for the first element in the set of matched elements, including padding, border, and optionally margin.
	 * 
	 * @param includeMargin
	 *            : A Boolean indicating whether to include the element's margin in the calculation.
	 * @return
	 */
	public final native int outerHeight(boolean includeMargin) /*-{
		return this.outerHeight(includeMargin);
	}-*/;

	/**
	 * Get the current computed width for the first element in the set of matched elements, including padding and border.
	 * 
	 * @return
	 */
	public final native int outerWidth() /*-{
		return this.outerWidth();
	}-*/;

	/**
	 * Get the current computed width for the first element in the set of matched elements, including padding and border, and optionally margin.
	 * 
	 * @param includeMargin
	 *            : A Boolean indicating whether to include the element's margin in the calculation.
	 * @return
	 */
	public final native int outerWidth(boolean includeMargin) /*-{
		return this.outerWidth(includeMargin);
	}-*/;

	/**
	 * Create a serialized representation of an array or object, suitable for use in a URL query string or Ajax request.
	 * 
	 * @param obj
	 *            : An array or object to serialize.
	 * @return
	 */
	public static final native String param(JavaScriptObject obj) /*-{
		return $wnd.jQuery.param(obj);
	}-*/;

	/**
	 * Create a serialized representation of an array or object, suitable for use in a URL query string or Ajax request.
	 * 
	 * @param obj
	 *            : An array or object to serialize.
	 * @param traditional
	 *            : A Boolean indicating whether to perform a traditional "shallow" serialization.
	 * @return
	 */
	public static final native String param(JavaScriptObject obj, boolean traditional) /*-{
		return $wnd.jQuery.param(obj, traditional);
	}-*/;

	/**
	 * Get the parent of each element in the current set of matched elements,filtered by a selector.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery parent(String selector) /*-{
		return this.parent(selector);
	}-*/;

	/**
	 * Get the parent of each element in the current set of matched elements.
	 * 
	 * @return
	 */
	public final native JQuery parent() /*-{
		return this.parent();
	}-*/;

	/**
	 * Get the ancestors of each element in the current set of matched elements,filtered by a selector.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery parents(String selector) /*-{
		return this.parents(selector);
	}-*/;

	/**
	 * Get the ancestors of each element in the current set of matched elements.
	 * 
	 * @return
	 */
	public final native JQuery parents() /*-{
		return this.parents();
	}-*/;

	/**
	 * Get the ancestors of each element in the current set of matched elements, up to but not including the element matched by the selector.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery parentsUntil(String selector) /*-{
		return this.parentsUntil(selector);
	}-*/;

	/**
	 * Takes a well-formed JSON string and returns the resulting JavaScript object.
	 * 
	 * @param json
	 *            : The JSON string to parse.
	 * @return
	 */
	public static final native JavaScriptObject parseJSON(String json) /*-{
		return $wnd.jQuery.parseJSON(json);
	}-*/;

	/**
	 * Parses a string into an XML document.
	 * 
	 * @param xml
	 *            : a well-formed XML string to be parsed
	 * @return
	 */
	public static final native JavaScriptObject parseXML(String xml) /*-{
		return $wnd.jQuery.parseXML(xml);
	}-*/;

	/**
	 * Get the current coordinates of the first element in the set of matched elements, relative to the offset parent.
	 * 
	 * @return
	 */
	public final native CoOrdinates position() /*-{
		return this.position();
	}-*/;

	/**
	 * Load data from the server using a HTTP GET request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param url
	 */
	public static final native void post(String url) /*-{
		$wnd.jQuery.post(url);
	}-*/;

	/**
	 * Load data from the server using a HTTP POST request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public static final native void post(String url, SuccessHandlerWithDataStatusJQXHR callback) /*-{
		$wnd.jQuery.post(url,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataStatusJQXHR;Ljava/lang/String;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
						});
	}-*/;

	/**
	 * Load data from the server using a HTTP POST request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param sentData
	 *            : Data to be sent to the server.It's appended to the url as parameters.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public static final native void post(String url, String sentData, SuccessHandlerWithDataStatusJQXHR callback) /*-{
		$wnd.jQuery.post(url,sentData,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataStatusJQXHR;Ljava/lang/String;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
						});
	}-*/;

	private static final native void post(String url, JavaScriptObject sentData, SuccessHandlerWithDataStatusJQXHR callback) /*-{
		$wnd.jQuery.post(url,sentData,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataStatusJQXHR;Ljava/lang/String;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
						});
	}-*/;

	/**
	 * Load data from the server using a HTTP POST request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param sentData
	 *            : Data to be sent to the server.Object must be Key/Value pairs. It's appended to the url as parameters.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 */
	public static final void post(String url, Map<String, String> sentData, SuccessHandlerWithDataStatusJQXHR callback) {
		post(url, JSHelper.convertStringMapToJSONObject(sentData).getJavaScriptObject(), callback);
	}

	/**
	 * Load data from the server using a HTTP POST request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param sentData
	 *            : Data to be sent to the server.It's appended to the url as parameters.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 * @param dataType
	 *            : The type of data that you're expecting back from the server. Default: Intelligent Guess (xml, json, script, or html)
	 */
	public static final native void post(String url, String sentData, SuccessHandlerWithDataStatusJQXHR callback, String dataType) /*-{
		$wnd.jQuery.post(url,sentData,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataStatusJQXHR;Ljava/lang/String;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
						}, dataType);
	}-*/;

	private static final native void post(String url, JavaScriptObject sentData, SuccessHandlerWithDataStatusJQXHR callback, String dataType) /*-{
		$wnd.jQuery.post(url,sentData,function(data, textStatus, jqXHR) {
							@com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataStatusJQXHR;Ljava/lang/String;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
						}, dataType);
	}-*/;

	/**
	 * Load data from the server using a HTTP POST request.
	 * 
	 * @param url
	 *            : A string containing the URL to which the request is sent.
	 * @param sentData
	 *            : Data to be sent to the server.Object must be Key/Value pairs. It's appended to the url as parameters.
	 * @param callback
	 *            : A callback function that is executed if the request succeeds.
	 * @param dataType
	 *            : The type of data that you're expecting back from the server. Default: Intelligent Guess (xml, json, script, or html)
	 */
	public static final void post(String url, Map<String, String> sentData, SuccessHandlerWithDataStatusJQXHR callback, String dataType) {
		post(url, JSHelper.convertStringMapToJSONObject(sentData).getJavaScriptObject(), callback, dataType);
	}


	/**
	 * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
	 * 
	 * @param html
	 *            HTML fragment.
	 * @return
	 */
	public final native JQuery prepend(String html) /*-{
		return this.prepend(html);
	}-*/;

	/**
	 * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
	 * 
	 * @param element
	 *            An element to insert at the end of each element in the set of matched elements.
	 * @return
	 */
	public final native JQuery prepend(Element element) /*-{
		return this.prepend(element);
	}-*/;

	/**
	 * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
	 * 
	 * @param jquery
	 *            A JQuery object to insert at the end of each element in the set of matched elements.
	 * @return
	 */
	public final native JQuery prepend(JQuery jquery) /*-{
		return this.prepend(jquery);
	}-*/;

	/**
	 * Insert content, specified by the parameter, to the beginning of each element in the set of matched elements.
	 * 
	 * @param callback
	 *            A function that returns an HTML string to insert at the end of each element in the set of matched elements. Receives the index position of the element in the set and the old HTML value of the element as arguments.
	 * @return
	 */

	public final native JQuery prepend(ReturnStringGetIndexValueHandler callback) /*-{
		return this.prepend(function(index, html) {
					return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,html);
				});
	}-*/;

	/**
	 * Insert every element in the set of matched elements to the beginning of the target.
	 * 
	 * @param target
	 *            : A selector
	 * @return
	 */
	public final native JQuery prependTo(String target) /*-{
		return this.prependTo(target);
	}-*/;

	/**
	 * Insert every element in the set of matched elements to the beginning of the target.
	 * 
	 * @param jquery
	 *            :
	 * @return
	 */
	public final native JQuery prependTo(JQuery jquery) /*-{
		return this.prependTo(jquery);
	}-*/;

	/**
	 * Insert every element in the set of matched elements to the beginning of the target.
	 * 
	 * @param element
	 * @return
	 */
	public final native JQuery prependTo(Element element) /*-{
		return this.prependTo(element);
	}-*/;

	/**
	 * Get the immediately preceding sibling of each element in the set of matched elements
	 * 
	 * @return
	 */
	public final native JQuery prev() /*-{
		return this.prev();
	}-*/;

	/**
	 * Get the immediately preceding sibling of each element in the set of matched elements filtered by a selector.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery prev(String selector) /*-{
		return this.prev(selector);
	}-*/;

	/**
	 * Get all preceding siblings of each element in the set of matched elements
	 * 
	 * @return
	 */
	public final native JQuery prevAll() /*-{
		return this.prevAll();
	}-*/;

	/**
	 * Get all preceding siblings of each element in the set of matched elements filtered by a selector.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery prevAll(String selector) /*-{
		return this.prevAll(selector);
	}-*/;

	/**
	 * Get all preceding siblings of each element up to but not including the element matched by the selector.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to indicate where to stop matching preceding sibling elements.
	 * @return
	 */
	public final native JQuery prevUntil(String selector) /*-{
		return this.prevUntil(selector);
	}-*/;

	private final native JQuery pushStack(JavaScriptObjectArray<Element> elementArray) /*-{
		return this.pushStack(elementArray);
	}-*/;

	/**
	 * Add a collection of DOM elements onto the jQuery stack.
	 * 
	 * @param elementArray
	 * @return
	 */
	public final JQuery pushStack(List<Element> elementArray) {
		return pushStack(JSHelper.convertObjectListToJSArray(elementArray));
	}

	/**
	 * Add a collection of DOM elements onto the jQuery stack.
	 * 
	 * @param elementArray
	 * @return
	 */
	public final JQuery pushStack(Element[] elementArray) {
		return pushStack(JSHelper.convertObjectArrayToJSArray(elementArray));
	}
	/**
	 * Show the queue of functions to be executed on the matched elements.
	 * 
	 * @return
	 */
	public final native JavaScriptObject queue() /*-{
		return this.queue();
	}-*/;

	/**
	 * Show the queue of functions to be executed on the matched elements.
	 * 
	 * @param queueName
	 *            : A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 * @return
	 */
	public final native JavaScriptObject queue(String queueName) /*-{
		return this.queue(queueName);
	}-*/;

	private final native JQuery queue(JavaScriptObject newQueue) /*-{
		return this.queue(newQueue);
	}-*/;

	/**
	 * Manipulate the queue of functions to be executed on the matched elements.
	 * 
	 * @param functionArray
	 *            : An array of functions to replace the current queue contents.
	 * @return
	 */
	public final JQuery queue(List<AnimationFunction> functionArray) {
		return queue(JSHelper.convertObjectListToJSArray(functionArray));
	}

	private final native JQuery queue(String queueName, JavaScriptObject newQueue) /*-{
		return this.queue(queueName, newQueue);
	}-*/;

	/**
	 * Manipulate the queue of functions to be executed on the matched elements.
	 * 
	 * @param queueName
	 *            : A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 * @param functionArray
	 *            : An array of functions to replace the current queue contents.
	 * @return
	 */
	public final JQuery queue(String queueName, List<AnimationFunction> functionArray) {
		return queue(queueName, JSHelper.convertObjectListToJSArray(functionArray));
	}

	/**
	 * Manipulate the queue of functions to be executed on the matched elements.
	 * 
	 * @param queueName
	 *            : A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 * @param callback
	 *            : The new function to add to the queue,
	 * @return
	 */
	public final native JQuery queue(String queueName, AnimationCompleteHandler callback) /*-{
		return this.queue(queueName,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Manipulate the queue of functions to be executed on the matched elements.
	 * 
	 * @param callback
	 *            : The new function to add to the queue,
	 * @return
	 */
	public final native JQuery queue(AnimationCompleteHandler callback) /*-{
		return this.queue(function() {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
				});
	}-*/;

	/**
	 * Show the queue of functions to be executed on the matched element.
	 * 
	 * @param element
	 *            : A DOM element to inspect for an attached queue.
	 * @return
	 */
	public static final native JavaScriptObject queue(Element element) /*-{
		return $wnd.jQuery.queue(element);
	}-*/;

	/**
	 * Show the queue of functions to be executed on the matched element.
	 * 
	 * @param element
	 *            : A DOM element to inspect for an attached queue.
	 * @param queueName
	 *            : A string containing the name of the queue. Defaults to fx, the standard effects queue.
	 * @return
	 */
	public static final native JavaScriptObject queue(Element element, String queueName) /*-{
		return $wnd.jQuery.queue(element, queueName);
	}-*/;

	/**
	 * Remove the set of matched elements from the DOM.
	 * 
	 * @return
	 */
	public final native JQuery remove() /*-{
		return this.remove();
	}-*/;

	/**
	 * Remove the set of matched elements from the DOM.
	 * 
	 * @param selector
	 *            : A selector expression that filters the set of matched elements to be removed.
	 * @return
	 */
	public final native JQuery remove(String selector) /*-{
		return this.remove(selector);
	}-*/;

	/**
	 * Remove an attribute from each element in the set of matched elements.
	 * 
	 * @param attributeName
	 *            : An attribute to remove.
	 * @return
	 */
	public final native JQuery removeAttr(String attributeName) /*-{
		return this.removeAttr(attributeName);
	}-*/;
	
	/**
	 * Remove a list of attributes from each element in the set of matched elements.
	 * @param attributeNames
	 * @return
	 */
	public final JQuery removeAttr(String[] attributeNames) {
	return this.removeAttr(JSHelper.convertStringArrayToString(attributeNames));
    };

	/**
	 * Remove a previously-stored piece of data.
	 * 
	 * @param key
	 *            : A string naming the piece of data to delete.
	 */
	public final native void removeData(String key) /*-{
		this.removeData(key);
	}-*/;

	/**
	 * Remove  previously-stored pieces of data.
	 * @param keys
	 */
	public final void removeData(String[] keys) {
		 this.removeData(JSHelper.convertStringArrayToString(keys));
	 };
	    
	/**
	 * Remove a previously-stored piece of data.
	 * 
	 * @param element
	 *            : A DOM element from which to remove data.
	 * @param key
	 */
	public static final native void removeData(Element element, String key) /*-{
		$wnd.jQuery.removeData(element, key);
	}-*/;

	/**
	 * Replace each element in the set of matched elements with the provided new content.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery replaceAll(String selector) /*-{
		return this.replaceAll(selector);
	}-*/;

	/**
	 * Replace each element in the set of matched elements with the provided new content.
	 * 
	 * @param html
	 *            HTML fragment.
	 * @return
	 */
	public final native JQuery replaceWith(String html) /*-{
		return this.replaceWith(html);
	}-*/;

	/**
	 * Replace each element in the set of matched elements with the provided new content.
	 * 
	 * @param element
	 *            An element to insert at the end of each element in the set of matched elements.
	 * @return
	 */
	public final native JQuery replaceWith(Element element) /*-{
		return this.replaceWith(element);
	}-*/;

	/**
	 * Replace each element in the set of matched elements with the provided new content.
	 * 
	 * @param jquery
	 *            A JQuery object to insert at the end of each element in the set of matched elements.
	 * @return
	 */
	public final native JQuery replaceWith(JQuery jquery) /*-{
		return this.replaceWith(jquery);
	}-*/;

	/**
	 * Replace each element in the set of matched elements with the provided new content.
	 * 
	 * @param callback
	 *            A function that returns an HTML string to insert at the end of each element in the set of matched elements. Receives the index position of the element in the set and the old HTML value of the element as arguments.
	 * @return
	 */

	public final native JQuery replaceWith(ReturnStringGetIndexValueHandler callback) /*-{
		return this.replaceWith(function(index, html) {
					return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,html);
				});
	}-*/;

	/**
	 * Trigger the resize event on an element.
	 * 
	 * @return
	 */
	public final native JQuery resize() /*-{
		return this.resize();
	}-*/;

	/**
	 * Bind an event handler to the resize JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery resize(EventHandler callback) /*-{
		return this.resize(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery resize(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.resize(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the resize JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery resize(Map<String, String> eventData, EventHandler callback) {
		return resize(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Trigger the scroll event on an element.
	 * 
	 * @return
	 */
	public final native JQuery scroll() /*-{
		return this.scroll();
	}-*/;

	/**
	 * Bind an event handler to the scroll JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery scroll(EventHandler callback) /*-{
		return this.scroll(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery scroll(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.scroll(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the scroll JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery scroll(Map<String, String> eventData, EventHandler callback) {
		return scroll(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * Get the current horizontal position of the scroll bar for the first element in the set of matched elements.
	 * 
	 * @return
	 */
	public final native int scrollLeft() /*-{
		return this.scrollLeft();
	}-*/;

	/**
	 * Set the current horizontal position of the scroll bar for each of the set of matched elements.
	 * 
	 * @param value
	 * @return
	 */
	public final native JQuery scrollLeft(int value) /*-{
		return this.scrollLeft(value);
	}-*/;

	/**
	 * Get the current vertical position of the scroll bar for the first element in the set of matched elements.
	 * 
	 * @return
	 */
	public final native int scrollTop() /*-{
		return this.scrollTop();
	}-*/;

	/**
	 * Set the current vertical position of the scroll bar for each of the set of matched elements.
	 * 
	 * @param value
	 * @return
	 */
	public final native JQuery scrollTop(int value) /*-{
		return this.scrollTop(value);
	}-*/;

	/**
	 * Trigger the select event on a textbox or textarea.
	 * 
	 * @return
	 */
	public final native JQuery select() /*-{
		return this.select();
	}-*/;

	/**
	 * Bind an event handler to the select JavaScript event on a textbox or textarea.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery select(EventHandler callback) /*-{
		return this.select(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery select(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.select(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the select JavaScript event on a textbox or textarea.
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery select(Map<String, String> eventData, EventHandler callback) {
		return select(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * A selector representing selector originally passed.
	 * 
	 * @return
	 */
	public final native String getSelector() /*-{
		return this.selector || '';
	}-*/;

	/**
	 * Encode a set of form elements as a string for submission.
	 * 
	 * @return
	 */
	public final native String serialize() /*-{
		return this.serialize();
	}-*/;

	private final native JavaScriptObjectArray<NameValuePair> serializeArrayJS() /*-{
		return this.serializeArray() || '';
	}-*/;

	/**
	 * Encode a set of form elements as a map of names and values.
	 * 
	 * @return
	 */
	public final List<NameValuePair> serializeArray() {
		return JSHelper.convertJSArrayToObjectList(serializeArrayJS());
	}

	/**
	 * Get the siblings of each element in the set of matched elements.
	 * 
	 * @return
	 */
	public final native JQuery siblings() /*-{
		return this.siblings();
	}-*/;

	/**
	 * Get the siblings of each element in the set of matched elements filtered by a selector.
	 * 
	 * @param selector
	 *            : A string containing a selector expression to match elements against.
	 * @return
	 */
	public final native JQuery siblings(String selector) /*-{
		return this.siblings(selector);
	}-*/;

	/**
	 * Reduce the set of matched elements to a subset specified by a range of indices.
	 * 
	 * @param start
	 *            : An integer indicating the 0-based position at which the elements begin to be selected. If negative, it indicates an offset from the end of the set.
	 * @return
	 */
	public final native JQuery slice(int start) /*-{
		return this.slice(start);
	}-*/;

	/**
	 * Reduce the set of matched elements to a subset specified by a range of indices.
	 * 
	 * @param start
	 *            : An integer indicating the 0-based position at which the elements begin to be selected. If negative, it indicates an offset from the end of the set.
	 * 
	 * @param end
	 *            : An integer indicating the 0-based position at which the elements stop being selected. If negative, it indicates an offset from the end of the set.
	 * @return
	 */
	public final native JQuery slice(int start, int end) /*-{
		return this.slice(start, end);
	}-*/;

	/**
	 * Display the matched elements with a sliding motion.
	 * 
	 * @return
	 */
	public final native JQuery slideDown() /*-{
		return this.slideDown();
	}-*/;

	/**
	 * Display the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @return
	 */
	public final JQuery slideDown(Duration duration) {
		return slideDown(duration.name());
	}

	private final native JQuery slideDown(String duration) /*-{
		return this.slideDown(duration);
	}-*/;

	/**
	 * Display the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @return
	 */
	public final native JQuery slideDown(int duration) /*-{
		return this.slideDown(duration);
	}-*/;

	/**
	 * Display the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery slideDown(Duration duration, AnimationCompleteHandler callback) {
		return slideDown(duration.name(), callback);
	}

	private final native JQuery slideDown(String duration, AnimationCompleteHandler callback) /*-{
		return this.slideDown(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final native JQuery slideDown(int duration, AnimationCompleteHandler callback) /*-{
		return this.slideDown(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery slideDown(int duration, Easing easing, AnimationCompleteHandler callback) {
		return slideDown(duration, easing.name(), callback);
	}

	private final native JQuery slideDown(int duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.slideDown(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery slideDown(int duration, Easing easing) {
		return slideDown(duration, easing.name());
	}

	private final native JQuery slideDown(int duration, String easing) /*-{
		return this.slideDown(duration, easing);
	}-*/;

	/**
	 * Display the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery slideDown(Duration duration, Easing easing) {
		return slideDown(duration.name(), easing.name());
	}

	private final native JQuery slideDown(String duration, String easing) /*-{
		return this.slideDown(duration, easing);
	}-*/;

	/**
	 * Display the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery slideDown(Duration duration, Easing easing, AnimationCompleteHandler callback) {
		return slideDown(duration.name(), easing.name(), callback);
	}

	private final native JQuery slideDown(String duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.slideDown(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display or hide the matched elements with a sliding motion.
	 * 
	 * @return
	 */
	public final native JQuery slideToggle() /*-{
		return this.slideToggle();
	}-*/;

	/**
	 * Display or hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @return
	 */
	public final JQuery slideToggle(Duration duration) {
		return slideToggle(duration.name());
	}

	private final native JQuery slideToggle(String duration) /*-{
		return this.slideToggle(duration);
	}-*/;

	/**
	 * Display or hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @return
	 */
	public final native JQuery slideToggle(int duration) /*-{
		return this.slideToggle(duration);
	}-*/;

	/**
	 * Display or hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery slideToggle(Duration duration, AnimationCompleteHandler callback) {
		return slideToggle(duration.name(), callback);
	}

	private final native JQuery slideToggle(String duration, AnimationCompleteHandler callback) /*-{
		return this.slideToggle(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display or hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final native JQuery slideToggle(int duration, AnimationCompleteHandler callback) /*-{
		return this.slideToggle(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display or hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery slideToggle(int duration, Easing easing, AnimationCompleteHandler callback) {
		return slideToggle(duration, easing.name(), callback);
	}

	private final native JQuery slideToggle(int duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.slideToggle(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display or hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery slideToggle(int duration, Easing easing) {
		return slideToggle(duration, easing.name());
	}

	private final native JQuery slideToggle(int duration, String easing) /*-{
		return this.slideToggle(duration, easing);
	}-*/;

	/**
	 * Display or hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery slideToggle(Duration duration, Easing easing) {
		return slideToggle(duration.name(), easing.name());
	}

	private final native JQuery slideToggle(String duration, String easing) /*-{
		return this.slideToggle(duration, easing);
	}-*/;

	/**
	 * Display or hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery slideToggle(Duration duration, Easing easing, AnimationCompleteHandler callback) {
		return slideToggle(duration.name(), easing.name(), callback);
	}

	private final native JQuery slideToggle(String duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.slideToggle(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Hide the matched elements with a sliding motion.
	 * 
	 * @return
	 */
	public final native JQuery slideUp() /*-{
		return this.slideUp();
	}-*/;

	/**
	 * Hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @return
	 */
	public final JQuery slideUp(Duration duration) {
		return slideUp(duration.name());
	}

	private final native JQuery slideUp(String duration) /*-{
		return this.slideUp(duration);
	}-*/;

	/**
	 * Hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @return
	 */
	public final native JQuery slideUp(int duration) /*-{
		return this.slideUp(duration);
	}-*/;

	/**
	 * Hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery slideUp(Duration duration, AnimationCompleteHandler callback) {
		return slideUp(duration.name(), callback);
	}

	private final native JQuery slideUp(String duration, AnimationCompleteHandler callback) /*-{
		return this.slideUp(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final native JQuery slideUp(int duration, AnimationCompleteHandler callback) /*-{
		return this.slideUp(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery slideUp(int duration, Easing easing, AnimationCompleteHandler callback) {
		return slideUp(duration, easing.name(), callback);
	}

	private final native JQuery slideUp(int duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.slideUp(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery slideUp(int duration, Easing easing) {
		return slideUp(duration, easing.name());
	}

	private final native JQuery slideUp(int duration, String easing) /*-{
		return this.slideUp(duration, easing);
	}-*/;

	/**
	 * Hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery slideUp(Duration duration, Easing easing) {
		return slideUp(duration.name(), easing.name());
	}

	private final native JQuery slideUp(String duration, String easing) /*-{
		return this.slideUp(duration, easing);
	}-*/;

	/**
	 * Hide the matched elements with a sliding motion.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery slideUp(Duration duration, Easing easing, AnimationCompleteHandler callback) {
		return slideUp(duration.name(), easing.name(), callback);
	}

	private final native JQuery slideUp(String duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.slideUp(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Stop the currently-running animation on the matched elements.
	 * 
	 * @return
	 */
	public final native JQuery stop() /*-{
		return this.stop();
	}-*/;

	/**
	 * Stop the currently-running animation on the matched elements.
	 * 
	 * @param clearQueue
	 *            : A Boolean indicating whether to remove queued animation as well. Defaults to false.
	 * @return
	 */
	public final native JQuery stop(boolean clearQueue) /*-{
		return this.stop(clearQueue);
	}-*/;

	/**
	 * Stop the currently-running animation on the matched elements.
	 * 
	 * @param clearQueue
	 *            : A Boolean indicating whether to remove queued animation as well. Defaults to false.
	 * @param jumpToEnd
	 *            : A Boolean indicating whether to complete the current animation immediately. Defaults to false.
	 * @return
	 */
	public final native JQuery stop(boolean clearQueue, boolean jumpToEnd) /*-{
		return this.stop(clearQueue, jumpToEnd);
	}-*/;

	
	
	
	
	/**
	 * Stop the currently-running animation on the matched elements.
	 * @param queue The name of the queue in which to stop animations.
	 * @return
	 */
	public final native JQuery stop(String queue) /*-{
	return this.stop(queue);
}-*/;

/**
 * Stop the currently-running animation on the matched elements.
 * @param queue The name of the queue in which to stop animations.
 * @param clearQueue
 *            : A Boolean indicating whether to remove queued animation as well. Defaults to false.
 * @return
 */
public final native JQuery stop(String queue,boolean clearQueue) /*-{
	return this.stop(queue,clearQueue);
}-*/;

/**
 * Stop the currently-running animation on the matched elements.
 * @param queue The name of the queue in which to stop animations.
 * @param clearQueue
 *            : A Boolean indicating whether to remove queued animation as well. Defaults to false.
 * @param jumpToEnd
 *            : A Boolean indicating whether to complete the current animation immediately. Defaults to false.
 * @return
 */
public final native JQuery stop(String queue,boolean clearQueue, boolean jumpToEnd) /*-{
	return this.stop(queue,clearQueue, jumpToEnd);
}-*/;

	/**
	 * Trigger the submit event on an element.
	 * 
	 * @return
	 */
	public final native JQuery submit() /*-{
		return this.submit();
	}-*/;

	/**
	 * Bind an event handler to the submit JavaScript event.
	 * 
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final native JQuery submit(EventHandler callback) /*-{
		return this.submit(function(event) {
					var currentJQuery = $wnd.jQuery(this);
					@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
				});
	}-*/;

	private final native JQuery submit(JavaScriptObject eventData, EventHandler callback) /*-{
		return this.submit(eventData,function(event) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
						});
	}-*/;

	/**
	 * Bind an event handler to the submit JavaScript event
	 * 
	 * @param eventData
	 *            A map of data that will be passed to the event handler via event.data
	 * @param callback
	 *            A function to execute each time the event is triggered.
	 * @return
	 */
	public final JQuery submit(Map<String, String> eventData, EventHandler callback) {
		return submit(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
	}

	/**
	 * A collection of properties that represent the presence of different browser features or bugs.
	 * 
	 * @return
	 */
	public static final native BrowserSupport support() /*-{
		return $wnd.jQuery.support;
	}-*/;

	/**
	 * Get the combined text contents of each element in the set of matched elements, including their descendants.
	 * 
	 * @return
	 */
	public final native String text() /*-{
		return this.text();
	}-*/;

	/**
	 * Set the content of each element in the set of matched elements to the specified text.
	 * 
	 * @param textString
	 *            : A string of text to set as the content of each matched element.
	 * @return
	 */
	public final native JQuery text(String textString) /*-{
		return this.text(textString);
	}-*/;

	/**
	 * Set the content of each element in the set of matched elements to the specified text.
	 * 
	 * @param callback
	 *            : A function returning the text content to set. Receives the index position of the element in the set and the old text value as arguments
	 * @return
	 */
	public final native JQuery text(ReturnStringGetIndexValueHandler callback) /*-{
		return this.text(function(index, value) {
					return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,value);
				});
	}-*/;

	private final native JavaScriptObjectArray<Element> toArrayJS() /*-{
		return this.toArray() || '';
	}-*/;

	/**
	 * Retrieve all the DOM elements contained in the jQuery set, as an array.
	 * 
	 * @return
	 */
	public final List<Element> toArray() {
		return JSHelper.convertJSArrayToObjectList(toArrayJS());
	}

	/**
	 * Display or hide the matched elements.
	 * 
	 * @return
	 */
	public final native JQuery toggle() /*-{
		return this.toggle();
	}-*/;

	/**
	 * Display or hide the matched elements.
	 * 
	 * @param show
	 *            : Boolean indicating whether to show or hide the elements.
	 * @return
	 */
	public final native JQuery toggle(boolean show) /*-{
		return this.toggle(show);
	}-*/;

	/**
	 * Display or hide the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @return
	 */
	public final JQuery toggle(Duration duration) {
		return toggle(duration.name());
	}

	private final native JQuery toggle(String duration) /*-{
		return this.toggle(duration);
	}-*/;

	/**
	 * Display or hide the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @return
	 */
	public final native JQuery toggle(int duration) /*-{
		return this.toggle(duration);
	}-*/;

	/**
	 * Display or hide the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery toggle(Duration duration, AnimationCompleteHandler callback) {
		return toggle(duration.name(), callback);
	}

	private final native JQuery toggle(String duration, AnimationCompleteHandler callback) /*-{
		return this.toggle(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display or hide the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final native JQuery toggle(int duration, AnimationCompleteHandler callback) /*-{
		return this.toggle(duration,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display or hide the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery toggle(int duration, Easing easing, AnimationCompleteHandler callback) {
		return toggle(duration, easing.name(), callback);
	}

	private final native JQuery toggle(int duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.toggle(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Display or hide the matched elements.
	 * 
	 * @param duration
	 *            A number determining how long the animation will run eg. 300 , 600
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery toggle(int duration, Easing easing) {
		return toggle(duration, easing.name());
	}

	private final native JQuery toggle(int duration, String easing) /*-{
		return this.toggle(duration, easing);
	}-*/;

	/**
	 * Display or hide the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @return
	 */
	public final JQuery toggle(Duration duration, Easing easing) {
		return toggle(duration.name(), easing.name());
	}

	private final native JQuery toggle(String duration, String easing) /*-{
		return this.toggle(duration, easing);
	}-*/;

	/**
	 * Display or hide the matched elements.
	 * 
	 * @param duration
	 *            A string determining how long the animation will run. eg. slow , fast
	 * @param easing
	 *            A string indicating which easing function to use for the transition. (swing or linear)
	 * @param callback
	 *            once the show is completed
	 * @return
	 */
	public final JQuery toggle(Duration duration, Easing easing, AnimationCompleteHandler callback) {
		return toggle(duration.name(), easing.name(), callback);
	}

	private final native JQuery toggle(String duration, String easing, AnimationCompleteHandler callback) /*-{
		return this.toggle(duration,easing,function() {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
						});
	}-*/;

	/**
	 * Bind two or more handlers to the matched elements, to be executed on alternate clicks.
	 * 
	 * @param evenHandler
	 *            : A function to execute every even time the element is clicked.
	 * @param oddHandler
	 *            : A function to execute every odd time the element is clicked.
	 * @return
	 */
	public final native JQuery toggle(EventHandler evenHandler, EventHandler oddHandler) /*-{
		return this.toggle(
		  function (event) {
		    @com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(evenHandler,event,$wnd.jQuery(this));
		  },
		  function (event) {
		    @com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(oddHandler,event,$wnd.jQuery(this));
		  }
		);
	}-*/;

	/**
	 * Bind two or more handlers to the matched elements, to be executed on alternate clicks.
	 * 
	 * @param evenHandler
	 *            : A function to execute every even time the element is clicked.
	 * @param oddHandler
	 *            : A function to execute every odd time the element is clicked.
	 * @param additionalHandler
	 *            : Additional handlers to cycle through after clicks.
	 * @return
	 */
	public final native JQuery toggle(EventHandler evenHandler, EventHandler oddHandler, EventHandler additionalHandler) /*-{
		return this.toggle(
		  function (event) {
		    @com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(evenHandler,event,$wnd.jQuery(this));
		  },
		  function (event) {
		    @com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(oddHandler,event,$wnd.jQuery(this));
		  },
		  function (event) {
		    @com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(additionalHandler,event,$wnd.jQuery(this));
		  }
		);
	}-*/;

	/**
	 * Add or remove one or more classes from each element in the set of matched elements, depending on the class's presence
	 * 
	 * @param className
	 *            : One or more class names (separated by spaces) to be toggled for each element in the matched set.
	 * @return
	 */
	public final native JQuery toggleClass(String className) /*-{
		return this.toggleClass(className);
	}-*/;

	/**
	 * Add or remove one or more classes from each element in the set of matched elements, depending on the value of the add argument.
	 * 
	 * @param className
	 *            : One or more class names (separated by spaces) to be toggled for each element in the matched set.
	 * @param add
	 *            : A boolean value to determine whether the class should be added or removed.
	 * @return
	 */
	public final native JQuery toggleClass(String className, boolean add) /*-{
		return this.toggleClass(className, add);
	}-*/;

	/**
	 * Add or remove one or more classes from each element in the set of matched elements, depending on the class's presence
	 * 
	 * @param callback
	 *            : A function that returns class names to be toggled in the class attribute of each element in the matched set. Receives the index position of the element in the set and the old class value as arguments.
	 * @return
	 */
	public final native JQuery toggleClass(ReturnStringGetIndexValueHandler callback) /*-{
		return this.toggleClass(function(index, className) {
					return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,className);
				});
	}-*/;

	/**
	 * Add or remove one or more classes from each element in the set of matched elements, depending on the value of the add argument.
	 * 
	 * @param callback
	 *            : A function that returns class names to be toggled in the class attribute of each element in the matched set. Receives the index position of the element in the set and the old class value as arguments.
	 * @param add
	 *            : A boolean value to determine whether the class should be added or removed.
	 * @return
	 */
	public final native JQuery toggleClass(ReturnStringGetIndexValueHandler callback, boolean add) /*-{
		return this.toggleClass(function(index, className) {
							return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,className);
						}, add);
	}-*/;

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event type.
	 * 
	 * @param eventType
	 *            : A string containing a JavaScript event type, such as click or submit.
	 * @return
	 */
	public final JQuery trigger(EventType eventType) {
		return trigger(eventType.name());
	}

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event types.
	 * 
	 * @param eventType
	 *            : A list of JavaScript event types, such as click or submit.
	 * @return
	 */
	public final JQuery trigger(EventType[] eventTypes) {
		return trigger(getEventTypes(eventTypes));
	}

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given custom event type.
	 * 
	 * @param eventType
	 *            : A string containing a custom JavaScript event type.
	 * @return
	 */
	public final JQuery triggerCustomEvent(String eventType) {
		return trigger(eventType);
	}

	private final native JQuery trigger(String eventType) /*-{
		return this.trigger(eventType);
	}-*/;

	/**
	 * Execute all handlers and behaviors attached to the matched elements for the given event.
	 * 
	 * @param event
	 * @return
	 */
	public final native JQuery trigger(JQEvent event) /*-{
		return this.trigger(event);
	}-*/;

	/**
	 * Execute all handlers attached to an element for an event.
	 * 
	 * @param eventType
	 *            : A JavaScript event type, such as click or submit.
	 * @return
	 */
	public final JavaScriptObject triggerHandler(EventType eventType) {
		return triggerHandler(eventType.name());
	}

	/**
	 * Execute all handlers attached to an element for events.
	 * 
	 * @param eventTypes
	 *            : A list of JavaScript event types, such as click or submit.
	 * @return
	 */
	public final JavaScriptObject triggerHandler(EventType[] eventTypes) {
		return triggerHandler(getEventTypes(eventTypes));
	}

	/**
	 * Execute all handlers attached to an element for custom events.
	 * 
	 * @param eventType
	 *            : Custom JavaScript event types.
	 * @return
	 */
	public final JavaScriptObject triggerHandlerCustomEvent(String eventType) {
		return triggerHandler(eventType);
	}

	private final native JavaScriptObject triggerHandler(String eventType) /*-{
		return this.triggerHandler(eventType);
	}-*/;

	/**
	 * Remove the whitespace from the beginning and end of a string.
	 * 
	 * @param value
	 * @return
	 */
	public static final native String trim(String value) /*-{
		return $wnd.jQuery.trim(value);
	}-*/;

	/**
	 * Determine the internal JavaScript [[Class]] of an object.
	 * 
	 * @param obj
	 * @return
	 */
	public static final native String type(JavaScriptObject obj) /*-{
		return $wnd.jQuery.type(obj);
	}-*/;

	/**
	 * Remove all previously-attached event handler from the elements.
	 * 
	 * @return
	 */
	public final native JQuery unbind() /*-{
		return this.unbind();
	}-*/;

	/**
	 * Remove a previously-attached event handler from the elements.
	 * 
	 * @param eventType
	 *            : A string containing a JavaScript event type, such as click or submit.
	 * @return
	 */
	public final JQuery unbind(EventType eventType) {
		return unbind(eventType.name());
	}

	/**
	 * Remove previously-attached event handlers from the elements.
	 * 
	 * @param eventType
	 *            : A list of JavaScript event types, such as click or submit.
	 * @return
	 */
	public final JQuery unbind(EventType[] eventTypes) {
		return unbind(getEventTypes(eventTypes));
	}

	/**
	 * Remove a previously-attached custom event handler from the elements.
	 * 
	 * @param eventType
	 *            : A string containing custom JavaScript event types.
	 * @return
	 */
	public final JQuery unbindCustomEvent(String eventType) {
		return unbind(eventType);
	}

	private final native JQuery unbind(String eventType) /*-{
		return this.unbind(eventType);
	}-*/;

	/**
	 * Remove a previously-attached event handler from the elements.
	 * 
	 * @param event
	 *            : A event object as passed to the event handler.
	 * @return
	 */
	public final native JQuery unbind(JQEvent event) /*-{
		return this.unbind(event);
	}-*/;

	/**
	 * Remove all handlers from the event for all elements which match the current selector, now or in the future, based upon a specific set of root elements.
	 * 
	 * @return
	 */
	public final native JQuery undelegate() /*-{
		return this.undelegate();
	}-*/;

	/**
	 * Remove a handler from the event for all elements which match the current selector, now or in the future, based upon a specific set of root elements.
	 * 
	 * @param selector
	 *            : A selector which will be used to filter the event results.
	 * @param eventType
	 *            : A JavaScript event type, such as "click" or "keydown"
	 * @return
	 */
	public final JQuery undelegate(String selector, EventType eventType) {
		return undelegate(selector, eventType.name());
	}

	/**
	 * Remove handlers from the event for all elements which match the current selector, now or in the future, based upon a specific set of root elements.
	 * 
	 * @param selector
	 *            : A selector which will be used to filter the event results.
	 * @param eventType
	 *            : A list of JavaScript event types, such as "click" or "keydown"
	 * @return
	 */
	public final JQuery undelegate(String selector, EventType[] eventTypes) {
		return undelegate(selector, getEventTypes(eventTypes));
	}

	/**
	 * Remove a handler from the custom event for all elements which match the current selector, now or in the future, based upon a specific set of root elements.
	 * 
	 * @param selector
	 *            : A selector which will be used to filter the event results.
	 * @param eventType
	 *            : A string containing custom JavaScript event types
	 * @return
	 */
	public final JQuery undelegateCustomEvent(String selector, String eventType) {
		return undelegate(selector, eventType);
	}

	private final native JQuery undelegate(String selector, String eventType) /*-{
		return this.undelegate(selector, eventType);
	}-*/;

	private static final native JavaScriptObjectArray<Element> unique(JavaScriptObjectArray<Element> elementArray) /*-{
	return $wnd.jQuery.unique(elementArray);
}-*/;

/**
 * Sorts an array of DOM elements, in place, with the duplicates removed.
 * 
 * @param elementArray
 *            : The Array of DOM elements.
 * @return
 */
public static final List<Element> unique(List<Element> elementArray) {
	return JSHelper.convertJSArrayToObjectList(unique(JSHelper.convertObjectListToJSArray(elementArray)));
}

/**
 * Bind an event handler to the unload JavaScript event.
 * 
 * @param callback
 *            A function to execute each time the event is triggered.
 * @return
 */
public final static native JQuery unload(EventHandler callback) /*-{
	return $wnd.jQuery($wnd).unload(function(event) {
						var currentJQuery = $wnd.jQuery(this);
						@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
					});
}-*/;

private final static native JQuery unload(JavaScriptObject eventData, EventHandler callback) /*-{
	return $wnd.jQuery($wnd).unload(eventData,function(event) {
						var currentJQuery = $wnd.jQuery(this);
						@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
					});
}-*/;

/**
 * Bind an event handler to the unload JavaScript event
 * 
 * @param eventData
 *            A map of data that will be passed to the event handler via event.data
 * @param callback
 *            A function to execute each time the event is triggered.
 * @return
 */
public final static JQuery unload(Map<String, String> eventData, EventHandler callback) {
	return unload(JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(), callback);
}

/**
 * Remove the parents of the set of matched elements from the DOM, leaving the matched elements in their place.
 */
public final native JQuery unwrap() /*-{
	return this.unwrap();
}-*/;

/**
 * Get the current value of the first element in the set of matched elements.
 */
public final native String val() /*-{
	return this.val();
}-*/;

/**
 * Set the value of each element in the set of matched elements.
 * 
 * @param value
 *            A value to set
 * @return
 */
public final native JQuery val(String value) /*-{
	return this.val(value);
}-*/;

/**
 * Set the value of each element in the set of matched elements.
 * 
 * @param callback
 *            A callback returning the value to set. Receives the index position of the element in the set and the old value as arguments.
 * @return
 */
public final native JQuery val(ReturnStringGetIndexValueHandler callback) /*-{
	return this.val(function(index, value) {
				return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,value);
			});
}-*/;

/**
 * Get the current computed width for the first element in the set of matched elements.
 */
public final native int width() /*-{
	return this.width();
}-*/;

/**
 * Set the CSS width of each element in the set of matched elements.
 * 
 * @param value
 *            : An integer representing the number of pixels
 * @return
 */
public final native JQuery width(int value) /*-{
	return this.width(value);
}-*/;

/**
 * Set the CSS width of each element in the set of matched elements.
 * 
 * @param value
 *            : A number with an optional unit of measure appended. "px" is the default
 * @return
 */
public final native JQuery width(String value) /*-{
	return this.width(value);
}-*/;

/**
 * Set the CSS width of each element in the set of matched elements.
 * 
 * @param callback
 *            : A function returning the width to set. Receives the index position of the element in the set and the old width as arguments.
 * @return
 */
public final native JQuery width(ReturnIntegerGetIndexValueHandler callback) /*-{
	return this.width(function(index, height) {
				return @com.xedge.jquery.client.handlers.ReturnIntegerGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnIntegerGetIndexValueHandler;II)(callback,index,height);
			});
}-*/;

/**
 * Wrap an HTML structure around each element in the set of matched elements.
 * 
 * @param html
 *            HTML fragment.
 * @return
 */
public final native JQuery wrap(String html) /*-{
	return this.wrap(html);
}-*/;

/**
 * Wrap an HTML structure around each element in the set of matched elements.
 * 
 * @param element
 *            An element to wrap around each element in the set of matched elements.
 * @return
 */
public final native JQuery wrap(Element element) /*-{
	return this.wrap(element);
}-*/;

/**
 * Wrap an HTML structure around each element in the set of matched elements.
 * 
 * @param jquery
 *            A JQuery object to wrap around each element in the set of matched elements.
 * @return
 */
public final native JQuery wrap(JQuery jquery) /*-{
	return this.wrap(jquery);
}-*/;

/**
 * Wrap an HTML structure around each element in the set of matched elements.
 * 
 * @param callback
 *            A function that returns an HTML string to wrap around each element in the set of matched elements. Receives the index position of the element in the set and the old HTML value of the element as arguments.
 * @return
 */

public final native JQuery wrap(ReturnStringGetIndexValueHandler callback) /*-{
	return this.wrap(function(index, html) {
				return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,html);
			});
}-*/;

/**
 * Wrap an HTML structure around all elements in the set of matched elements.
 * 
 * @param html
 *            HTML fragment.
 * @return
 */
public final native JQuery wrapAll(String html) /*-{
	return this.wrapAll(html);
}-*/;

/**
 * Wrap an HTML structure around all elements in the set of matched elements.
 * 
 * @param element
 *            An element to wrap around all elements in the set of matched elements.
 * @return
 */
public final native JQuery wrapAll(Element element) /*-{
	return this.wrapAll(element);
}-*/;

/**
 * Wrap an HTML structure around all elements in the set of matched elements.
 * 
 * @param jquery
 *            A JQuery object to wrap around all elements in the set of matched elements.
 * @return
 */
public final native JQuery wrapAll(JQuery jquery) /*-{
	return this.wrapAll(jquery);
}-*/;


/**
 * Wrap an HTML structure around the content of each element in the set of matched elements.
 * 
 * @param html
 *            HTML fragment.
 * @return
 */
public final native JQuery wrapInner(String html) /*-{
	return this.wrapInner(html);
}-*/;

/**
 * Wrap an HTML structure around the content of each element in the set of matched elements.
 * 
 * @param element
 *            An element to wrap around the content of each element in the set of matched elements.
 * @return
 */
public final native JQuery wrapInner(Element element) /*-{
	return this.wrapInner(element);
}-*/;

/**
 * Wrap an HTML structure around the content of each element in the set of matched elements.
 * 
 * @param jquery
 *            A JQuery object to wrap around the content of each element in the set of matched elements.
 * @return
 */
public final native JQuery wrapInner(JQuery jquery) /*-{
	return this.wrapInner(jquery);
}-*/;

/**
 * Wrap an HTML structure around the content of each element in the set of matched elements.
 * 
 * @param callback
 *            A function that returns an HTML string to wrap around the content of each element in the set of matched elements. Receives the index position of the element in the set and the old HTML value of the element as arguments.
 * @return
 */

public final native JQuery wrapInner(ReturnStringGetIndexValueHandler callback) /*-{
	return this.wrapInner(function(index, html) {
				return @com.xedge.jquery.client.handlers.ReturnStringGetIndexValueHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetIndexValueHandler;ILjava/lang/String;)(callback,index,html);
			});
}-*/;



/**
 * Display or hide the matched elements by animating their opacity.
 * 
 * @return
 */
public final native JQuery fadeToggle() /*-{
	return this.fadeToggle();
}-*/;

/**
 * Display or hide the matched elements by animating their opacity.
 * 
 * @param duration
 *            A string determining how long the animation will run. eg. slow , fast
 * @return
 */
public final JQuery fadeToggle(Duration duration) {
	return fadeToggle(duration.name());
}

private final native JQuery fadeToggle(String duration) /*-{
	return this.fadeToggle(duration);
}-*/;

/**
 * Display or hide the matched elements by animating their opacity.
 * 
 * @param duration
 *            A number determining how long the animation will run eg. 300 , 600
 * @return
 */
public final native JQuery fadeToggle(int duration) /*-{
	return this.fadeToggle(duration);
}-*/;

/**
 * Display or hide the matched elements by animating their opacity.
 * 
 * @param duration
 *            A string determining how long the animation will run. eg. slow , fast
 * @param callback
 *            once the show is completed
 * @return
 */
public final JQuery fadeToggle(Duration duration, AnimationCompleteHandler callback) {
	return fadeToggle(duration.name(), callback);
}

private final native JQuery fadeToggle(String duration, AnimationCompleteHandler callback) /*-{
	return this.fadeToggle(duration,function() {
						var currentJQuery = $wnd.jQuery(this);
						@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
					});
}-*/;

/**
 * Display or hide the matched elements by animating their opacity.
 * 
 * @param duration
 *            A number determining how long the animation will run eg. 300 , 600
 * @param callback
 *            once the show is completed
 * @return
 */
public final native JQuery fadeToggle(int duration, AnimationCompleteHandler callback) /*-{
	return this.fadeToggle(duration,function() {
						var currentJQuery = $wnd.jQuery(this);
						@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
					});
}-*/;

/**
 * Display or hide the matched elements by animating their opacity.
 * 
 * @param duration
 *            A number determining how long the animation will run eg. 300 , 600
 * @param easing
 *            A string indicating which easing function to use for the transition. (swing or linear)
 * @param callback
 *            once the show is completed
 * @return
 */
public final JQuery fadeToggle(int duration, Easing easing, AnimationCompleteHandler callback) {
	return fadeToggle(duration, easing.name(), callback);
}

private final native JQuery fadeToggle(int duration, String easing, AnimationCompleteHandler callback) /*-{
	return this.fadeToggle(duration,easing,function() {
						var currentJQuery = $wnd.jQuery(this);
						@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
					});
}-*/;

/**
 * Display or hide the matched elements by animating their opacity.
 * 
 * @param duration
 *            A number determining how long the animation will run eg. 300 , 600
 * @param easing
 *            A string indicating which easing function to use for the transition. (swing or linear)
 * @return
 */
public final JQuery fadeToggle(int duration, Easing easing) {
	return fadeToggle(duration, easing.name());
}

private final native JQuery fadeToggle(int duration, String easing) /*-{
	return this.fadeToggle(duration, easing);
}-*/;

/**
 * Display or hide the matched elements by animating their opacity.
 * 
 * @param duration
 *            A string determining how long the animation will run. eg. slow , fast
 * @param easing
 *            A string indicating which easing function to use for the transition. (swing or linear)
 * @return
 */
public final JQuery fadeToggle(Duration duration, Easing easing) {
	return fadeToggle(duration.name(), easing.name());
}

private final native JQuery fadeToggle(String duration, String easing) /*-{
	return this.fadeToggle(duration, easing);
}-*/;

/**
 * Display or hide the matched elements by animating their opacity.
 * 
 * @param duration
 *            A string determining how long the animation will run. eg. slow , fast
 * @param easing
 *            A string indicating which easing function to use for the transition. (swing or linear)
 * @param callback
 *            once the show is completed
 * @return
 */
public final JQuery fadeToggle(Duration duration, Easing easing, AnimationCompleteHandler callback) {
	return fadeToggle(duration.name(), easing.name(), callback);
}

private final native JQuery fadeToggle(String duration, String easing, AnimationCompleteHandler callback) /*-{
	return this.fadeToggle(duration,easing,function() {
						var currentJQuery = $wnd.jQuery(this);
						@com.xedge.jquery.client.handlers.AnimationCompleteHandler::fire(Lcom/xedge/jquery/client/handlers/AnimationCompleteHandler;Lcom/xedge/jquery/client/JQuery;)(callback,currentJQuery);
					});
}-*/;





/**
 * Creates a new copy of jQuery whose properties and methods can be modified without affecting the original jQuery object.
 * 
 * @return
 */
// !!!JOE Not required for GWT apps
// public static final native JQuery sub() /*-{
// return $wnd.jQuery.sub();
// }-*/;

/**
 * Provides a way to execute callback functions based on a Deferred object that represent asynchronous events.
 * 
 * @param deferred
 * @return
 */
public static final native Deferred when(Deferred deferred) /*-{
	return $wnd.jQuery.when(deferred);
}-*/;

/**
 * Provides a way to execute callback functions based on a object that represent asynchronous events.
 * 
 * @param deferred
 * @return
 */
public static final native Deferred when(JavaScriptObject deferred) /*-{
	return $wnd.jQuery.when(deferred);
}-*/;

private static final native Deferred when(JavaScriptObjectArray<Deferred> deferreds) /*-{
	return $wnd.jQuery.when(deferreds);
}-*/;

/**
 * Provides a way to execute callback functions based on a list of Deferred objects that represent asynchronous events.
 * 
 * @param deferreds
 * @return
 */
public static final Deferred when(List<Deferred> deferreds) {
	return when(JSHelper.convertObjectListToJSArray(deferreds));
}

/**
 * Return a Promise/Deferred object to observe when all actions have finished.
 * 
 * @return
 */
public final native Deferred promise() /*-{
	return this.promise();
}-*/;

/**
 * Holds or releases the execution of jQuery's ready event.
 * 
 * @param hold
 */
public static final native void holdReady(boolean hold) /*-{
$wnd.jQuery.holdReady(hold);
}-*/;



/**
* Attach an event handler for an event.
* @param eventType
* @param callback
* @return
*/
public final JQuery on(EventType eventType,EventHandler callback) {
return on(eventType.name(),callback);
}

/**
* Attach an event handler for a list of events.
* @param eventTypes
* @param callback
* @return
*/
public final JQuery on(EventType[] eventTypes,EventHandler callback) {
return on(getEventTypes(eventTypes),callback);
}

/**
* Attach an event handler for an event.
* @param eventType
* @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
* @param callback
* @return
*/
public final JQuery on(EventType eventType,String selector,EventHandler callback) {
return on(eventType.name(),selector,callback);
}

/**
* Attach an event handler for a list of events.
* @param eventTypes
* @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
* @param callback
* @return
*/
public final JQuery on(EventType[] eventTypes,String selector,EventHandler callback) {
return on(getEventTypes(eventTypes),selector,callback);
}

/**
* Attach an event handler for an event.
* @param eventType
* @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
* @param eventData Data to be passed to the handler in event.data when an event is triggered.
* @param callback
* @return
*/
public final JQuery on(EventType eventType,String selector,Map<String, String> eventData,EventHandler callback) {
return on(eventType.name(),selector,JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(),callback);
}

/**
* Attach an event handler for a list of events.
* @param eventTypes
* @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
* @param eventData Data to be passed to the handler in event.data when an event is triggered.

* @param callback
* @return
*/
public final JQuery on(EventType[] eventTypes,String selector,Map<String, String> eventData,EventHandler callback) {
return on(getEventTypes(eventTypes),selector,JSHelper.convertStringMapToJSONObject(eventData).getJavaScriptObject(),callback);
}

private final native JQuery on(String eventType,EventHandler callback) /*-{
return this.on(eventType,function(event) {
		var currentJQuery = $wnd.jQuery(this);
		@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
});
}-*/;

private final native JQuery on(String eventType,String selector,EventHandler callback) /*-{
return this.on(eventType,selector,function(event) {
		var currentJQuery = $wnd.jQuery(this);
		@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
});
}-*/;

private final native JQuery on(String eventType,String selector, JavaScriptObject eventData,EventHandler callback) /*-{
return this.on(eventType,selector,eventData,function(event) {
		var currentJQuery = $wnd.jQuery(this);
		@com.xedge.jquery.client.handlers.EventHandler::fire(Lcom/xedge/jquery/client/handlers/EventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
});
}-*/;




/**
* Remove  an event handler for an event.
* @param eventType
* @return
*/
public final JQuery off(EventType eventType) {
return off(eventType.name());
}

/**
* Remove  an event handler for a list of events.
* @param eventTypes
* @return
*/
public final JQuery off(EventType[] eventTypes) {
return off(getEventTypes(eventTypes));
}

/**
* Remove  an event handler for an event.
* @param eventType
* @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
* @return
*/
public final JQuery off(EventType eventType,String selector) {
return off(eventType.name(),selector);
}

/**
* Remove  an event handler for a list of events.
* @param eventTypes
* @param selector A selector string to filter the descendants of the selected elements that trigger the event. If the selector is null or omitted, the event is always triggered when it reaches the selected element.
* @return
*/
public final JQuery off(EventType[] eventTypes,String selector) {
return off(getEventTypes(eventTypes),selector);
}



private final native JQuery off(String eventType) /*-{
return this.off(eventType);
}-*/;

private final native JQuery off(String eventType,String selector) /*-{
return this.off(eventType,selector);
}-*/;

/**
 * Utility script for positioning any widget relative to the window, document, a particular element, or the cursor/mouse.
 * 
 * @param options
 * @return
 */
public final native JQuery position(PositionOptions options) /*-{
	return this.position(options);
}-*/;



}