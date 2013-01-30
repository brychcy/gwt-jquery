package com.xedge.jquery.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.xedge.jquery.client.JQEvent;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.client.JQuery.ElementPosition;
import com.xedge.jquery.client.handlers.PositionHandler;

public class PositionOptions extends JavaScriptObject {

	public enum PositionCollision {
		flip, fit, none
	}
	
	protected PositionOptions() {
	}
	
	public static native PositionOptions create() /*-{
		return {};
	}-*/;
	
	/**
	 * Defines which position on the element being positioned to align with the target element: "horizontal vertical" alignment.
	 * eg. "left top" or "center center"
	 * @param horizontalPosition
	 * @param verticalPosition
	 */
	public final void setMy(ElementPosition horizontalPosition,ElementPosition verticalPosition) {
		setMy(horizontalPosition.name()+" "+verticalPosition.name());
	}
	
	/**
	 * Defines which position on the element being positioned to align with the target element:
	 * A single value such as "right" will default to "right center", "top" will default to "center top" (following CSS convention). 
	 * @param position
	 */
	public final void setMy(ElementPosition position) {
		setMy(position.name());
	}
	private final native void setMy(String my) /*-{
	    this.my=my;
}-*/;
	
	
	/**
	 * Defines which position on the target element to align the positioned element against: "horizontal vertical" alignment.
	 * Example: "left top" or "center center"
	 * @param horizontalPosition
	 * @param verticalPosition
	 */
	public final void setAt(ElementPosition horizontalPosition,ElementPosition verticalPosition) {
		setAt(horizontalPosition.name()+" "+verticalPosition.name());
	}
	
	/**
	 * Defines which position on the target element to align the positioned element against: 
	 * A single value such as "right" will default to "right center", "top" will default to "center top" (following CSS convention). 
	 * @param position
	 */
	public final void setAt(ElementPosition position) {
		setAt(position.name());
	}
	private final native void setAt(String at) /*-{
	    this.at=at;
}-*/;
	
	
	/**
	 * Element to position against using the first matching element of a selector
	 * @param of selector
	 */
public final native void setOf(String of) /*-{
	 this.of=of;
}-*/;


/**
 * Element to position against using the first matching element of a JQuery object
 * @param of
 */
public final native  void setOf(JQuery of) /*-{
	 this.of=of;
}-*/;

/**
 * Element to position against
 * @param of
 */
public final native void setOf(Element of) /*-{
	 this.of=of;
}-*/;

/**
 * Element to position against using the pageX and pageY properties of the event object
 * @param of
 */
public final native void setOf(JQEvent of) /*-{
this.of=of;
}-*/;




/**
 * Add these left-top values to the calculated position, eg. "50 50" (left top)
 * @param left
 * @param top
 */
public final void setOffset(int left,int top) {
	setOffset(left+" "+top);
}

/**
 * Add these left-top values to the calculated position, A single value such as "50" will apply to both.
 * @param offset
 */
public final void setOffset(int offset) {
	setOffset(offset+"");
}

private final native void setOffset(String offset) /*-{
this.offset=offset;
}-*/;


/**
 * When the positioned element overflows the window in some direction, move it to an alternative position.
 * Accepts a horizontal/vertical pair eg. "fit flip", "fit none".
 * flip: to the opposite side and the collision detection is run again to see if it will fit. If it won't fit in either position, the center option should be used as a fall back.
 * fit: so the element keeps in the desired direction, but is re-positioned so it fits.
 * none: not do collision detection.
 * @param horizontalPosition
 * @param verticalPosition
 */
public final void setCollision(PositionCollision horizontalPosition,PositionCollision verticalPosition) {
	setCollision(horizontalPosition.name()+" "+verticalPosition.name());
}

/**
 * When the positioned element overflows the window in some direction, move it to an alternative position.
 * Accepts a single value.
 * flip: to the opposite side and the collision detection is run again to see if it will fit. If it won't fit in either position, the center option should be used as a fall back.
 * fit: so the element keeps in the desired direction, but is re-positioned so it fits.
 * none: not do collision detection.
 * @param position
 */
public final void setCollision(PositionCollision position) {
	setCollision(position.name());
}

private final native void setCollision(String collision) /*-{
    this.collision=collision;
}-*/;

/**
 * When specified the actual property setting is delegated to this callback. Receives a single CoOrdinates parameter which has the top and left values for the position that should be set.
 * @param callback
 */
public final native void setUsingHandler(PositionHandler callback) /*-{
this.using = function(coOrdinates){
	    var currentJQuery = $wnd.jQuery(this);
	    @com.xedge.jquery.client.handlers.PositionHandler::fire(Lcom/xedge/jquery/client/handlers/PositionHandler;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/client/model/CoOrdinates;)(callback,currentJQuery,coOrdinates);
	    
};
}-*/;

}
