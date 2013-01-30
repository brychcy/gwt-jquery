package com.xedge.jquery.ui.client.model;

import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.client.js.JavaScriptStringArray;
import com.xedge.jquery.ui.client.handlers.AutoCompleteObjectListHandler;
import com.xedge.jquery.ui.client.handlers.AutoCompleteStringListHandler;
import com.xedge.jquery.ui.client.handlers.AutoCompleteUIEventHandler;
import com.xedge.jquery.ui.client.handlers.AutoCompleteUIEventResultHandler;
import com.xedge.jquery.ui.client.handlers.AutoCompleteUIEventResultWithItemHandler;
import com.xedge.jquery.ui.client.handlers.AutoCompleteUIEventWithItemHandler;
/**
 * Autocomplete, when added to an input field, enables users to quickly find and select from a pre-populated list of values as they type, leveraging searching and filtering.
 * 
 * Theme : main input = ui-autocomplete-input
 * 
 * @author osaharri
 * 
 */
public class AutoCompleteOptions extends JavaScriptObject {
	
	public enum AutoCompleteOptionParameters {
		destroy, disable, enable, close
	}
	
	public enum AutoCompleteBooleanOption {
		disabled
	}

	public enum AutoCompleteStringOption {
		source
	}
	
	public enum AutoCompleteIntegerOption {
		delay,minLength
	}
	
	protected AutoCompleteOptions() {
	}

	public static native AutoCompleteOptions create() /*-{
		return {};
	}-*/;

	/**
	 * Disables (true) or enables (false) the autocomplete. Can be set when initialising (first creating) the autocomplete. Default:false
	 * 
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
		this.disabled=disabled;
	}-*/;

	/**
	 * The delay in milliseconds the Autocomplete waits after a keystroke to activate itself. A zero-delay makes sense for local data (more responsive), but can produce a lot of load for remote data, while being less responsive. Default:300
	 * 
	 * @param delay
	 */
	public final native void setDelay(int delay) /*-{
		this.delay=delay;
	}-*/;

	/**
	 * The minimum number of characters a user has to type before the Autocomplete activates. Zero is useful for local data with just a few items. Should be increased when there are a lot of items, where a single character would match a few thousand items. Default:1
	 * 
	 * @param minLength
	 */
	public final native void setMinLength(int minLength) /*-{
		this.minLength=minLength;
	}-*/;

	/**
	 * Defines the data to use as a List of strings
	 * @param source
	 */
	public final void setSourceStringList(String[] source) {
		setSource(JSHelper.convertStringArrayToJSArray(source));
	}

	private final native void setSource(JavaScriptStringArray source) /*-{
		this.source=source;
	}-*/;

	/**
	 * Defines the data to use as a List of LabelValuePairs 
	 * @param labelValuePairs
	 */
	public final void setSourceObjectList(List<LabelValuePair> labelValuePairs) {
		setSource(JSHelper.convertObjectListToJSArray(labelValuePairs));
	}
	
	/**
	 * Defines the data to use as a Array of LabelValuePairs 
	 * @param labelValuePairs
	 */
	public final void setSourceObjectList(LabelValuePair[] labelValuePairs) {
		setSource(JSHelper.convertObjectArrayToJSArray(labelValuePairs));
	}

	private final native void setSource(JavaScriptObject source) /*-{
		this.source=source;
	}-*/;

	/**
	 * Defines the data to use as a url that returns a List of Strings or LabelValuePairs as JSON
	 * @param url
	 */
	public final native void setSourceURL(String url) /*-{
		this.source=url;
	}-*/;
	
	/**
	 * Defines the data using a function that returns a List of Strings
	 * @param callback
	 */
	public final native void setSourceStringListHandler(AutoCompleteStringListHandler callback) /*-{
	this.source = function( request, response ) {
		    var result =  @com.xedge.jquery.ui.client.handlers.AutoCompleteStringListHandler::fire(Lcom/xedge/jquery/ui/client/handlers/AutoCompleteStringListHandler;Ljava/lang/String;)(callback,request.term);
	        response(result);
	};
}-*/;	
	/**
	 * Defines the data using a function that returns a List of LabelValuePairs
	 * @param callback
	 */	
	public final native void setSourceObjectListHandler(AutoCompleteObjectListHandler callback) /*-{
	this.source = function( request, response ) {
		    var result =  @com.xedge.jquery.ui.client.handlers.AutoCompleteObjectListHandler::fire(Lcom/xedge/jquery/ui/client/handlers/AutoCompleteObjectListHandler;Ljava/lang/String;)(callback,request.term); 
	        response(result);
	};
}-*/;	
	
	
	/**
	 * Before a request (source-option) is started, after minLength and delay are met. Can be canceled (return false), then no request will be started and no items suggested.
	 * EvenType : autocompletesearch
	 * @param callback
	 */
	public final native void setSearchHandler(AutoCompleteUIEventResultHandler callback) /*-{
	this.search = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    return @com.xedge.jquery.ui.client.handlers.AutoCompleteUIEventResultHandler::fire(Lcom/xedge/jquery/ui/client/handlers/AutoCompleteUIEventResultHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
	};
}-*/;	
	
	/**
	 * Triggered when the suggestion menu is opened.
	 * EvenType : autocompleteopen
	 * @param callback
	 */
	public final native void setOpenHandler(AutoCompleteUIEventHandler callback) /*-{
	this.open = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.AutoCompleteUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/AutoCompleteUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
	};
}-*/;		
	/**
	 * Before focus is moved to an item (not selecting), ui.item refers to the focused item. The default action
	 * of focus is to replace the text field's value with the value of the focused item, though only if the 
	 * focus event was triggered by a keyboard interaction. Canceling this event prevents the value from 
	 * being updated, but does not prevent the menu item from being focused.
	 * EvenType : autocompletefocus
	 * @param callback
	 */
	public final native void setFocusHandler(AutoCompleteUIEventResultWithItemHandler callback) /*-{
	this.focus = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    return @com.xedge.jquery.ui.client.handlers.AutoCompleteUIEventResultWithItemHandler::fire(Lcom/xedge/jquery/ui/client/handlers/AutoCompleteUIEventResultWithItemHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/ui/client/model/LabelValuePair;)(callback,event,currentJQuery,ui.item);
	};
}-*/;	
	
	/**
	 * Triggered when an item is selected from the menu; ui.item refers to the selected item. 
	 * The default action of select is to replace the text field's value with the value of the selected item. 
	 * Canceling this event prevents the value from being updated, but does not prevent the menu from closing.
	 * EvenType : autocompleteselect
	 * @param callback
	 */
	public final native void setSelectHandler(AutoCompleteUIEventResultWithItemHandler callback) /*-{
	this.select = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    return @com.xedge.jquery.ui.client.handlers.AutoCompleteUIEventResultWithItemHandler::fire(Lcom/xedge/jquery/ui/client/handlers/AutoCompleteUIEventResultWithItemHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/ui/client/model/LabelValuePair;)(callback,event,currentJQuery,ui.item);
	};
}-*/;	
	
	/**
	 * When the list is hidden - doesn't have to occur together with a change.
	 * EvenType : autocompleteclose
	 * @param callback
	 */
	public final native void setCloseHandler(AutoCompleteUIEventHandler callback) /*-{
	this.close = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.AutoCompleteUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/AutoCompleteUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;)(callback,event,currentJQuery);
	};
}-*/;	
	
	/**
	 * After an item was selected; ui.item refers to the selected item. Always triggered after the close event.
	 * EvenType : autocompletechange
	 * @param callback
	 */
	public final native void setChangeHandler(AutoCompleteUIEventWithItemHandler callback) /*-{
	this.change = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.AutoCompleteUIEventWithItemHandler::fire(Lcom/xedge/jquery/ui/client/handlers/AutoCompleteUIEventWithItemHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/ui/client/model/LabelValuePair;)(callback,event,currentJQuery,ui.item);
	};
}-*/;	
	
}
