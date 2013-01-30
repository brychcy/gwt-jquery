package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
/**
 * Button enhances standard form elements like button, input of type submit or reset or anchors to themable buttons with appropiate mouseover and active styles.
 * In addition to basic push buttons, radio buttons and checkboxes (inputs of type radio and checkbox) can be converted to buttons: Their associated label is styled to appear as the button, while the underlying input is updated on click.
 * 
 * Theme : button = ui-button ui-button-text-only  ,  span for label = ui-button-text
 * @author osaharri
 *
 */
public class ButtonOptions extends JavaScriptObject {

	public enum ButtonOptionParameters {
		destroy, disable, enable, refresh
	}
	
	public enum ButtonBooleanOption {
		disabled,text
	}

	public enum ButtonStringOption {
		label
	}
	
	protected ButtonOptions() {
	}
	
	public static native ButtonOptions create() /*-{
		return {};
	}-*/;
	
	/**
	 * Disables (true) or enables (false) the button. Can be set when initialising (first creating) the button. Default:false
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
	this.disabled=disabled;
}-*/;	

	/**
	 * Whether to show any text - when set to false (display no text), icons (see icons option) must be enabled, otherwise it'll be ignored. Default:true
	 * @param text
	 */
	public final native void setText(boolean text) /*-{
	this.text=text;
}-*/;		
	
	/**
	 * Icons to display, with or without text.  Default:{ primary: null, secondary: null }
	 * @param icons
	 */
	public final native void setIcons(ButtonIcons icons) /*-{
	this.icons=icons;
}-*/;

	/**
	 * Text to show on the button. When not specified (null), the element's html content is used, or its value attribute when it's an input element of type submit or reset; or the html content of the associated label element if its an input of type radio or checkbox
	 * Default:HTML content of the button, or value attribute
	 * @param label
	 */
	public final native void setLabel(String label) /*-{
	this.label=label;
}-*/;
	
}
