package com.xedge.jquery.client.model;

import java.util.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;
import com.xedge.jquery.client.handlers.BeforeSendHandler;
import com.xedge.jquery.client.handlers.CompleteHandler;
import com.xedge.jquery.client.handlers.ErrorHandler;
import com.xedge.jquery.client.handlers.ReturnStringGetDataAndTypeHandler;
import com.xedge.jquery.client.handlers.ReturnStringHandler;
import com.xedge.jquery.client.handlers.SuccessHandlerWithData;
import com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatus;
import com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR;
import com.xedge.jquery.client.handlers.XHRHandler;
import com.xedge.jquery.client.js.JSHelper;

/**
 * A set of key/value pairs that configure the Ajax request. All options are optional. A default can be set for any option with ajaxSetup().
 * 
 * @author osaharri
 * 
 */
public class AjaxSettings extends JavaScriptObject {
	public enum AjaxStatus {
		success, notmodified, error, timeout, parsererror, unknown
	}

	public enum AjaxDataType {
		xml, html, script, json, jsonp, text
	}

	public enum AjaxSubmitType {
		POST, GET
	}

	protected AjaxSettings() {
	}

	public static native AjaxSettings create() /*-{
		return {};
	}-*/;

	public final native boolean getAsync() /*-{
		return this.async;
	}-*/;

	/**
	 * By default, all requests are sent asynchronous (i.e. this is set to true by default)
	 * 
	 * @param async
	 */
	public final native void setAsync(boolean async) /*-{
		this.async=async;
	}-*/;

	/**
	 * A pre-callback to modify the XMLHttpRequest object before it is sent. Use this to set custom headers etc. You may return false in function to cancel the request.
	 * 
	 * @param callback
	 */
	public final native void setBeforeSendHandler(BeforeSendHandler callback) /*-{
		this.beforeSend = function(jqXHR,settings) {
			return @com.xedge.jquery.client.handlers.BeforeSendHandler::fire(Lcom/xedge/jquery/client/handlers/BeforeSendHandler;Lcom/xedge/jquery/client/JQXHR;Lcom/xedge/jquery/client/model/AjaxSettings;)(callback,jqXHR,settings);
		};
	}-*/;

	/**
	 * A function to be called when the request finishes (after success and error callbacks are executed). The function gets passed two arguments: The JQXHR object and a string categorizing the status of the request ("success", "notmodified", "error", "timeout", or "parsererror")
	 * 
	 * @param callback
	 */
	public final native void setCompleteHandler(CompleteHandler callback) /*-{
		this.complete = function(jqXHR,textStatus) {
			return @com.xedge.jquery.client.handlers.CompleteHandler::fire(Lcom/xedge/jquery/client/handlers/CompleteHandler;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,textStatus,jqXHR);
		};
	}-*/;

	/**
	 * If set to false it will force the pages that you request to not be cached by the browser. Default true, false for dataType 'script' and 'jsonp'
	 * 
	 * @param async
	 */
	public final native void setCache(boolean cache) /*-{
		this.cache=cache;
	}-*/;

	public final native String getContentType() /*-{
		return this.contentType;
	}-*/;

	/**
	 * When sending data to the server, use this content-type. Default is "application/x-www-form-urlencoded"
	 * 
	 * @param contentType
	 */
	public final native void setContentType(String contentType) /*-{
		this.contentType=contentType;
	}-*/;

	public final native String getData() /*-{
		return this.data;
	}-*/;

	/**
	 * Data to be sent to the server.It's appended to the url as parameters. See processData option to prevent this automatic processing.
	 * 
	 * @param data
	 *            eg. name1=value1&name2=value2
	 */
	public final native void setData(String data) /*-{
		this.data=data;
	}-*/;

	private final native JavaScriptObject getDataJSObject() /*-{
		return this.data;
	}-*/;

	private final native void setDataJSObject(JavaScriptObject data) /*-{
		this.data=data;
	}-*/;

	/**
	 * Data to be sent to the server.Object must be Key/Value pairs. It's appended to the url as parameters. See processData option to prevent this automatic processing.
	 * 
	 * @param propertValuePairs
	 */
	public final void setDataObject(Map<String, String> data) {
		this.setDataJSObject(JSHelper.convertStringMapToJSONObject(data).getJavaScriptObject());
	}

	public final Map<String, String> getDataObject() {
		return JSHelper.convertJSONObjectToStringMap(new JSONObject(getDataJSObject()));
	}

	/**
	 * A function to be used to handle the raw responsed data.This is a pre-filtering function to sanitize the response.You should return the sanitized data. The returned data is received by the success handler. The function gets passed two arguments: The raw data returned from the server, and the 'dataType' parameter.
	 * 
	 * @param callback
	 */
	public final native void setDataFilterHandler(ReturnStringGetDataAndTypeHandler callback) /*-{
		this.dataFilter = function(data,dataType) {
			return @com.xedge.jquery.client.handlers.ReturnStringGetDataAndTypeHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringGetDataAndTypeHandler;Ljava/lang/String;Ljava/lang/String;)(callback,data,dataType);
		};
	}-*/;

	public final native String getDataType() /*-{
		return this.dataType;
	}-*/;

	/**
	 * The type of data that you're expecting back from the server. Default: Intelligent Guess (xml, json, script, or html) xml: Returns a XML document that can be processed via jQuery. html: Returns HTML as plain text; included script tags are evaluated when inserted in the DOM. script: Evaluates the response as JavaScript and returns it as plain text. Disables caching unless option "cache" is used. Note: This will turn POSTs into GETs for remote-domain requests. json: Evaluates the response as JSON and returns a JavaScript object. jsonp: Loads in a JSON block using JSONP. Will add an extra "?callback=?" to the end of your URL to specify the callback. text: A plain text string.
	 * 
	 * @param dataType
	 */
	public final void setDataType(AjaxDataType dataType) {
		setDataType(dataType.name());
	}
	
	/**
	 * multiple, space-separated values: jQuery can convert a dataType from what it received in the Content-Type header to what you require. For example, if you want a text response to be treated as XML, use "text xml" for the dataType. You can also make a JSONP request, have it received as text, and interpreted by jQuery as XML: "jsonp text xml." Similarly, a shorthand string such as "jsonp xml" will first attempt to convert from jsonp to xml, and, failing that, convert from jsonp to text, and then from text to xml.
	 * @param dataTypes
	 */
	public final void setDataType(AjaxDataType[] dataTypes) {
		String dataType = "";
		for (AjaxDataType ajaxDataType : dataTypes) {
			dataType=dataType+" "+ajaxDataType;
		}
		setDataType(dataType.trim());
	}

	private final native void setDataType(String dataType) /*-{
		this.dataType=dataType;
	}-*/;

	/**
	 * A function to be called if the request fails. The arguments: The JQXHR object, a string describing the type of error that occurred. Possible values for the second argument (besides null) are "timeout", "error", "notmodified" and "parsererror
	 * 
	 * @param callback
	 */
	public final native void setErrorHandler(ErrorHandler callback) /*-{
		this.error = function(jqXHR,textStatus) {
			return @com.xedge.jquery.client.handlers.ErrorHandler::fire(Lcom/xedge/jquery/client/handlers/ErrorHandler;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,textStatus,jqXHR);
		};
	}-*/;

	public final native boolean getGlobal() /*-{
		return this.global;
	}-*/;

	/**
	 * Whether to trigger global Ajax event handlers for this request. The default is true. Set to false to prevent the global handlers like ajaxStart or ajaxStop from being triggered.
	 * 
	 * @param global
	 */
	public final native void setGlobal(boolean global) /*-{
		this.global=global;
	}-*/;

	public final native boolean getIfModified() /*-{
		return this.ifModified;
	}-*/;

	/**
	 * Allow the request to be successful only if the response has changed since the last request. The default is false.
	 * 
	 * @param ifModified
	 */
	public final native void setIfModified(boolean ifModified) /*-{
		this.ifModified=ifModified;
	}-*/;

	public final native String getJsonp() /*-{
		return this.jsonp;
	}-*/;

	/**
	 * Override the callback function name in a jsonp request. This value will be used instead of 'callback' in the 'callback=?' part of the query string in the url. So {jsonp:'onJsonPLoad'} would result in 'onJsonPLoad=?' passed to the server
	 * 
	 * @param jsonp
	 */
	public final native void setJsonp(String jsonp) /*-{
		this.jsonp=jsonp;
	}-*/;

	public final native String getJsonpCallback() /*-{
		return this.jsonpCallback;
	}-*/;

	/**
	 * Specify the callback function name for a jsonp request. This value will be used instead of the random name automatically generated by jQuery. It is preferable to let jQuery generate a unique name as it'll make it easier to manage the requests and provide callbacks and error handling. You may want to specify the callback when you want to enable better browser caching of GET requests.
	 * 
	 * @param jsonpCallback
	 */
	public final native void setJsonpCallback(String jsonpCallback) /*-{
		this.jsonpCallback=jsonpCallback;
	}-*/;
	
	/**
	 * The value of jsonpCallback is set to the return value of that function.
	 * @param jsonpCallback
	 */
	public final native void setJsonpCallback(ReturnStringHandler jsonpCallback) /*-{
	this.jsonpCallback = function() {
		    return @com.xedge.jquery.client.handlers.ReturnStringHandler::fire(Lcom/xedge/jquery/client/handlers/ReturnStringHandler;)(jsonpCallback);
		};
	}-*/;

	public final native String getPassword() /*-{
		return this.password;
	}-*/;

	/**
	 * A password to be used in response to an HTTP access authentication request.
	 * 
	 * @param password
	 */
	public final native void setPassword(String password) /*-{
		this.password=password;
	}-*/;

	public final native boolean getProcessData() /*-{
		return this.processData;
	}-*/;

	/**
	 * By default, data passed in to the data option as an object (technically, anything other than a string) will be processed and transformed into a query string, fitting to the default content-type "application/x-www-form-urlencoded". If you want to send a DOMDocument, or other non-processed data, set this option to false.
	 * 
	 * @param processData
	 */
	public final native void setProcessData(boolean processData) /*-{
		this.processData=processData;
	}-*/;

	public final native String getScriptCharset() /*-{
		return this.scriptCharset;
	}-*/;

	/**
	 * Only for requests with "jsonp" or "script" dataType and "GET" type. Forces the request to be interpreted as a certain charset. Only needed for charset differences between the remote and local content.
	 * 
	 * @param scriptCharset
	 */
	public final native void setScriptCharset(String scriptCharset) /*-{
		this.scriptCharset=scriptCharset;
	}-*/;

	/**
	 * A function to be called if the request succeeds. The function gets passed three arguments: The data returned from the server, formatted according to the 'dataType' parameter; a string describing the status; and the JQXHR object
	 * 
	 * @param callback
	 */
	public final native void setSuccessHandler(SuccessHandlerWithDataStatusJQXHR callback) /*-{
		this.success = function(data,textStatus,jqXHR) {
			@com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataStatusJQXHR;Ljava/lang/String;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,data,textStatus,jqXHR);
		};
	}-*/;

	/**
	 * A function to be called if the request succeeds. The function gets passed two arguments: The data returned from the server, formatted according to the 'dataType' parameter; a string describing the status
	 * 
	 * @param callback
	 */
	public final native void setSuccessHandler(SuccessHandlerWithDataStatus callback) /*-{
		this.success = function(data,textStatus) {
		    @com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatus::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithDataStatus;Ljava/lang/String;Ljava/lang/String;)(callback,data,textStatus);
		};
	}-*/;

	/**
	 * A function to be called if the request succeeds. The function gets passed one arguments: The data returned from the server, formatted according to the 'dataType' parameter
	 * 
	 * @param callback
	 */
	public final native void setSuccessHandler(SuccessHandlerWithData callback) /*-{
		this.success = function(data) {
		    @com.xedge.jquery.client.handlers.SuccessHandlerWithData::fire(Lcom/xedge/jquery/client/handlers/SuccessHandlerWithData;Ljava/lang/String;)(callback,data);
		};
	}-*/;

	public final native double getTimeout() /*-{
		return this.timeout;
	}-*/;

	/**
	 * Set a local timeout (in milliseconds) for the request. This will override the global timeout, if one is set
	 * 
	 * @param timeout
	 */
	public final native void setTimeout(double timeout) /*-{
		this.timeout=timeout;
	}-*/;

	public final native boolean getTraditional() /*-{
		return this.traditional;
	}-*/;

	/**
	 * Set this to true if you wish to use the traditional style of param serialization
	 * 
	 * @param traditional
	 */
	public final native void setTraditional(boolean traditional) /*-{
		this.traditional=traditional;
	}-*/;

	public final native String getType() /*-{
		return this.type;
	}-*/;

	/**
	 * The type of request to make ("POST" or "GET"), default is "GET". Note: Other HTTP request methods, such as PUT and DELETE, can also be used here, but they are not supported by all browsers.
	 * 
	 * @param type
	 */

	public final void setType(AjaxSubmitType type) {
		setType(type.name());
	}

	private final native void setType(String type) /*-{
		this.type=type;
	}-*/;

	public final native String getURL() /*-{
		return this.url;
	}-*/;

	/**
	 * A string containing the URL to which the request is sent. Default: The current page
	 * 
	 * @param url
	 */
	public final native void setURL(String url) /*-{
		this.url=url;
	}-*/;

	public final native String getUsername() /*-{
		return this.username;
	}-*/;

	/**
	 * A username to be used in response to an HTTP access authentication request.
	 * 
	 * @param username
	 */
	public final native void setUsername(String username) /*-{
		this.username=username;
	}-*/;

	/**
	 * Callback for creating the XMLHttpRequest object. Defaults to the ActiveXObject when available (IE), the XMLHttpRequest otherwise. Override to provide your own implementation for XMLHttpRequest or enhancements to the factory.
	 * 
	 * @param callback
	 */
	public final native void setXHRHandler(XHRHandler callback) /*-{
		this.xhr = function() {
			 return @com.xedge.jquery.client.handlers.XHRHandler::fire(Lcom/xedge/jquery/client/handlers/XHRHandler;)(callback);
		};
	}-*/;

	private final native JavaScriptObject getContentsJS() /*-{
		return this.contents;
	}-*/;

	/**
	 * A map of string/regular-expression pairs that determine how jQuery will parse the response, given its content type.
	 * 
	 * @return
	 */
	public final Map<String, String> getContent() {
		return JSHelper.convertJSONObjectToStringMap(new JSONObject(getContentsJS()));
	}

	/**
	 * A map of string/regular-expression pairs that determine how jQuery will parse the response, given its content type. 
	 * @param contents
	 */
	public final void setContent(Map<String, String> contents) {
		setContentsJS(JSHelper.convertStringMapToJSONObject(contents).getJavaScriptObject());
	}
	
	private final native void setContentsJS(JavaScriptObject contents) /*-{
		this.contents=contents;
}-*/;
	
	/**
	 * A map of dataType-to-dataType converters. Each converter's value is a function that returns the transformed value of the response.
	 * Default: {"* text": window.String, "text html": true, "text json": jQuery.parseJSON, "text xml": jQuery.parseXML}
	 * @param converterHolder
	 * @return
	 */
	public final native void setConverters(ConverterHolder converterHolder) /*-{
		 this.converters=converterHolder;
	}-*/;
	
	
	/**
	 * If you wish to force a crossDomain request (such as JSONP) on the same domain, set the value of crossDomain to true. This allows, for example, server-side redirection to another domain.
	 * Default: false for same-domain requests, true for cross-domain requests
	 * @param crossDomain
	 */
	public final native void setCrossDomain(boolean crossDomain) /*-{
	this.crossDomain=crossDomain;
}-*/;
	
	public final native boolean getCrossDomain() /*-{
	return this.crossDomain;
}-*/;


	private final native void setHeaders(JavaScriptObject headerValues) /*-{
	 this.headers=headerValues;
}-*/;

	/**
	 * A map of additional header key/value pairs to send along with the request. This setting is set before the beforeSend function is called; therefore, any values in the headers setting can be overwritten from within the beforeSend function.
	 * @param headerValues
	 * @return
	 */
public final void setHeaders(Map<String, String> headerValues) {
	 this.setHeaders(JSHelper.convertStringMapToJSONObject(headerValues).getJavaScriptObject());
}

/**
 * A map of numeric HTTP codes and functions to be called when the response has the corresponding code.
 * @param statusCodeHolder
 * @return
 */
public final native void setStatusCodeHolder(StatusCodeHolder statusCodeHolder) /*-{
    this.statusCode=statusCodeHolder;
}-*/;


}
