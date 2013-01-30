package com.xedge.jquery.ui.client.model;

import java.util.Date;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * Option used by the Cookie Plugin for managing cookies.
 * @author osaharri
 *
 */
public class CookieOptions extends JavaScriptObject {
	protected CookieOptions() {
	}
	
	public static native CookieOptions create() /*-{
	return {};
}-*/;
	
	/**
	 * An integer specifying the expiration date from now on in days.
	 * If a negative value is specified the cookie will be deleted.
	 * If set to null or omitted, the cookie will be a session cookie and will not be retained when the the browser exits.
	 * @param expires
	 */
	public final native void setExpires(int expires) /*-{
	this.expires=expires;
}-*/;
	
	/**
	 * A date specifying when the cookie expires.
	 * If a date in the past is specified the cookie will be deleted.
	 * If set to null or omitted, the cookie will be a session cookie and will not be retained when the the browser exits.
	 * @param expires
	 */
	public final native void setExpires(Date expires) /*-{
	this.expires=expires;
}-*/;
	
	/**
	 * The value of the path atribute of the cookie (default: path of page that created the cookie). 
	 * @param path
	 */
	public final native void setPath(String path) /*-{
	this.path=path;
}-*/;
	
	/**
	 * The value of the domain attribute of the cookie (default: domain of page that created the cookie).`
	 * @param domain
	 */
	public final native void setDomain (String domain ) /*-{
	this.domain =domain ;
}-*/;
	
	/**
	 * If true, the secure attribute of the cookie will be set and the cookie transmission will require a secure protocol (like HTTPS).
	 * @param secure
	 */
	public final native void setSecure(boolean secure) /*-{
	this.secure=secure;
}-*/;
	 
}
