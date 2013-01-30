package com.xedge.jquery.mobile.client.model;

import com.xedge.jquery.mobile.client.JQueryMobile.Transition;

public class ChangePageOptions extends PageOptions {

	protected ChangePageOptions() {
	}

	public static native ChangePageOptions create() /*-{
		return {};
	}-*/;

	/**
	 * The transition to use when showing the page. default: $.mobile.defaultPageTransition
	 * @param transition
	 */
	public final void setTransition(Transition transition) {
		setTransition(transition.name());
	}

	private final native void setTransition(String transition) /*-{
		this.transition=transition;
		
	}-*/;
	
	/**
	 * The transition to use when showing the page. default: $.mobile.defaultPageTransition
	 * @return
	 */
	public final Transition getTransition() {
		return Transition.valueOf(getTransitionJS());
	}
	private final native String getTransitionJS() /*-{
	return this.transition;
    }-*/;

	/**
	 * Decides what direction the transition will run when showing the page.  default: false
	 * @param reverse
	 */
	public final native void setReverse(boolean reverse) /*-{
	this.reverse=reverse;
}-*/;
	 
   /**
    * Decides what direction the transition will run when showing the page.  default: false
    * @return
    */
	public  final native boolean isReverse() /*-{
	return this.reverse;
}-*/;
	
	/**
	 * Decides if the hash in the location bar should be updated.   default: true
	 * @param changeHash
	 */
	public final native void setChangeHash(boolean changeHash) /*-{
	this.changeHash=changeHash;
}-*/;
	
	/**
	 * Decides if the hash in the location bar should be updated.   default: true
	 * @return
	 */
	public  final native boolean isChangeHash() /*-{
	return this.changeHash;
}-*/;
	
	/**
	 * By default, changePage() ignores requests to change to the current active page. Setting this option to true, allows the request to execute.
	 * default:	false
	 * @return
	 */
	public  final native boolean isAllowSamePageTransition() /*-{
	return this.allowSamePageTransition;
}-*/;

	/**
	 * By default, changePage() ignores requests to change to the current active page. Setting this option to true, allows the request to execute.
	 * default:	false
	 * @param allowSamePageTransition
	 */
public  final native void setAllowSamePageTransition(boolean allowSamePageTransition) /*-{
	this.allowSamePageTransition = allowSamePageTransition;
}-*/;
	 

/**
 * The URL to use when updating the browser location upon changePage completion. If not specified, the value of the data-url attribute of the page element is used. 	default: undefined
 * @return
 */
public  final native String getDataUrl() /*-{
return this.dataUrl;
}-*/;


/**
 * The URL to use when updating the browser location upon changePage completion. If not specified, the value of the data-url attribute of the page element is used. 	default: undefined
 * @param dataUrl
 */
public  final native void setDataUrl(String dataUrl) /*-{
this.dataUrl = dataUrl;
}-*/;

 
}

