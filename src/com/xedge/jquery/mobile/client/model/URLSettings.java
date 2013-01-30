package com.xedge.jquery.mobile.client.model;

import com.google.gwt.core.client.JavaScriptObject;

public class URLSettings extends JavaScriptObject {

	protected URLSettings() {
	}
	
	public static native URLSettings create() /*-{
	return {};
}-*/;

	/**
	 * The fragment conponent of the URL, including the leading '#' character.
	 * @return
	 */
	public final native String getHash() /*-{
	return this.hash;
}-*/;
	
	/**
	 * The host and port number of the URL.
	 * @return
	 */
	public final native String getHost() /*-{
	return this.host;
}-*/;
	
	/**
	 * The name of the host within the URL.
	 * @return
	 */
	public final native String getHostname() /*-{
	return this.hostname;
}-*/;
	
	
	/**
	 * The original URL that was parsed.
	 * @return
	 */
	public final native String getHref() /*-{
	return this.href;
}-*/;
	
	
	/**
	 * The path of the file or directory referenced by the URL.
	 * @return
	 */
	public final native String getPathname() /*-{
	return this.pathname;
}-*/;
	
	/**
	 * The port specified within the URL. Most URLs rely on the default port for the protocol used, so this may be an empty string most of the time.
	 * @return
	 */
	public final native String getPort() /*-{
	return this.port;
}-*/;
	
	
	/**
	 * The protocol for the URL including the trailing ':' character.
	 * @return
	 */
	public final native String getProtocol() /*-{
	return this.protocol;
}-*/;
	
	/**
	 * The query component of the URL including the leading '?' character.
	 * @return
	 */
	public final native String getSearch() /*-{
	return this.search;
}-*/;
	
	
	
	/**
	 * The username, password, and host components of the URL
	 * @return
	 */
	public final native String getAuthority() /*-{
	return this.authority;
}-*/;
	
	/**
	 * The directory component of the pathname, minus any filename.
	 * @return
	 */
	public final native String getDirectory() /*-{
	return this.directory;
}-*/;
	
	/**
	 * The protocol and authority components of the URL.
	 * @return
	 */
	public final native String getDomain() /*-{
	return this.domain;
}-*/;
	
	/**
	 * The filename within the pathname component, minus the directory.
	 * @return
	 */
	public final native String getFilename() /*-{
	return this.filename;
}-*/;
	
	/**
	 * The original URL minus the fragment (hash) components.
	 * @return
	 */
	public final native String getHrefNoHash() /*-{
	return this.hrefNoHash;
}-*/;
	
	/**
	 * The original URL minus the query (search) and fragment (hash) components.
	 * @return
	 */
	public final native String getHrefNoSearch() /*-{
	return this.hrefNoSearch;
}-*/;
	
	/**
	 * The password contained within the authority component.
	 * @return
	 */
	public final native String getPassword() /*-{
	return this.password;
}-*/;
	
	/**
	 * the username contained within the authority component.
	 * @return
	 */
	public final native String getUsername() /*-{
	return this.username;
}-*/;
	
}
