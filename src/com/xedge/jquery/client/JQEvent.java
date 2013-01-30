package com.xedge.jquery.client;

import java.util.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.user.client.Event;
import com.xedge.jquery.client.js.JSHelper;

/**
 * 
 * Event Types
 * blur, focus, focusin, focusout, load, resize, scroll, unload, click, 
 * dblclick, mousedown, mouseup, mousemove, mouseover, mouseout, mouseenter, 
 * mouseleave, change, select, submit, keydown, keypress, keyup, error
 * @author osaharri
 *
 */
public class JQEvent extends Event {
	protected JQEvent() {
		
	}
	/**
	 * 
	 * @param eventType eg. click
	 * @return
	 */
	public static final native JQEvent create(String eventType) /*-{
    return $wnd.jQuery.Event(eventType); 
}-*/;
	
	 /**
	  * The mouse position relative to the left edge of the document.
	  * @return
	  */
	  public final native int pageX() /*-{
	  	    return this.pageX || 0;
	  }-*/;

	  /**
	   * The mouse position relative to the top edge of the document.
	   * @return
	   */
	  public final native int pageY() /*-{
	      return this.pageY || 0;
	  }-*/;


	  /**
	   * For key or button events, this attribute indicates the specific button or key that was pressed.
	   * @return
	   */
	  public final native int which() /*-{
	      return this.which || 0;	  	 	
	  }-*/;
	  
	  /**
	   * Returns whether event.preventDefault() was ever called on this event object.
	   * @return
	   */
	  public final native boolean isDefaultPrevented() /*-{
	    return this.isDefaultPrevented();
	  }-*/;
	  
	  /**
	   * Returns whether event.stopImmediatePropagation() was ever called on this event object.
	   * @return
	   */
	  public final native boolean isImmediatePropagationStopped() /*-{
	    return this.isImmediatePropagationStopped();
	  }-*/;
	  
	  /**
	   * Returns whether event.stopPropagation() was ever called on this event object.
	   * @return
	   */
	  public final native boolean isPropagationStopped() /*-{
	    return this.isPropagationStopped();
	  }-*/;
	  
	  /**
	   * This attribute contains the namespace specified when the event was triggered.
	   * @return
	   */
	  public final native String namespace() /*-{
	    return this.namespace;
	  }-*/;
	  
	  /**
	   * his attribute contains the last value returned by an event handler that was triggered by this event, 
	   * unless the value was undefined.
	   * @return
	   */
	  public final native String result() /*-{
	    return this.result;
	  }-*/;
	   
	  /**
	   * Keeps the rest of the handlers from being executed and prevents 
	   * the event from bubbling up the DOM tree.
	   */
	  public final native void stopImmediatePropagation() /*-{
	    return this.stopImmediatePropagation();
	  }-*/;
	  
	  /**
	   * This attribute returns the number of milliseconds since January 1, 1970, when the event is triggered.
	   * @return
	   */
	  public final native double timeStamp() /*-{
	    return this.timeStamp;
	  }-*/;
	   

	  private final native JavaScriptObject dataJS() /*-{
	    return this.data;
	  }-*/;
	  
	  /**
	   * Contains the optional data passed to when the current executing handler was bound.
	   * @return
	   */
	  public final Map<String, String> data(){
		  return JSHelper.convertJSONObjectToStringMap(new JSONObject(dataJS()));
	  }

	  /**
	   * The element where the currently-called jQuery event handler was attached.
	   * @return
	   */
	  public final Element getDelegateTarget() {
	    return getDelegateTargetJS().cast();
	  }
	  
	  private final native JavaScriptObject getDelegateTargetJS() /*-{
	    return this.delegateTarget;
	  }-*/;
	  
}
