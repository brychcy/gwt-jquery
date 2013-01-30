package com.xedge.jquery.mobile.client.model;

import java.util.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.json.client.JSONObject;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.client.js.JSHelper;

public abstract class PageOptions extends JavaScriptObject {

	protected PageOptions() {
	}
	
	public enum SubmitType {
		post,get
	}
	
	public static native PageOptions create() /*-{
		return {};
	}-*/;

	
	/**
	 * The data-role value to be used when displaying the page.  By default this is undefined which means rely on the value of the @data-role attribute defined on the element.
	 * @param role
	 */
	public final native void setRole(String role) /*-{
	this.role=role;
}-*/;
	
	/**
	 * The data-role value to be used when displaying the page.  By default this is undefined which means rely on the value of the @data-role attribute defined on the element. 
	 * @return
	 */
	public  final native String getRole() /*-{
	return this.role || null;
	}-*/;
	
	/**
	 * Specifies the element that should contain the page. default:	$.mobile.pageContainer
	 * @param pageContainer
	 */
	public final native void setPageContainer(JQuery pageContainer) /*-{
	this.pageContainer=pageContainer;
}-*/;
	 
	/**
	 * The element that should contain the page. default:	$.mobile.pageContainer
	 * @return
	 */
	public  final native JQuery getPageContainer() /*-{
	return this.pageContainer;
	}-*/;
	
	/**
	 * Specifies the method ("get" or "post") to use when making a page request.Used only when the 'to' argument of changePage() is a URL. default: "get"
	 * @param type
	 */
	public final void setType(SubmitType type) {
		setType(type.name());
	}

	private final native void setType(String type) /*-{
		this.type=type;
	}-*/;
	
    /**
     * Specifies the method ("get" or "post") to use when making a page request.Used only when the 'to' argument of changePage() is a URL. default: "get"	
     * @return
     */
	public final SubmitType getType() {
		return SubmitType.valueOf(getTypeJS());
	}
	
	private  final native String getTypeJS() /*-{
	return this.type;
	}-*/;
	
	/**
	 * Data to be sent to the server.It's appended to the url as parameters. Used only when the 'to' argument of changePage() is a URL.
	 * 
	 * @param data
	 *            eg. name1=value1&name2=value2
	 */
	public final native void setData(String data) /*-{
		this.data=data;
	}-*/;
	
	/**
	 * Data to be sent to the server.It's appended to the url as parameters. Used only when the 'to' argument of changePage() is a URL.
	 * @return
	 */
	public  final native String getData() /*-{
	return this.data;
	}-*/;

	private final native void setDataJSObject(JavaScriptObject data) /*-{
		this.data=data;
	}-*/;

	/**
	 * Data to be sent to the server.Object must be Key/Value pairs. It's appended to the url as parameters. Used only when the 'to' argument of changePage() is a URL.
	 * 
	 * @param propertValuePairs
	 */
	public final void setDataObject(Map<String, String> data) {
		this.setDataJSObject(JSHelper.convertStringMapToJSONObject(data).getJavaScriptObject());
	}
	
	private final native JavaScriptObject getDataJSObject() /*-{
	  return this.data;
}-*/;
	
	/**
	 * Data to be sent to the server.Object must be Key/Value pairs. It's appended to the url as parameters. Used only when the 'to' argument of changePage() is a URL.
	 * @return
	 */
	public final Map<String, String> getDataObject(){
		return JSHelper.convertJSONObjectToStringMap(new JSONObject(getDataJSObject()));
	}
	/**
	 * Forces a reload of a page, even if it is already in the DOM of the page container. default: false
	 * @param reloadPage
	 */
	public final native void setReloadPage(boolean reloadPage) /*-{
	this.reloadPage=reloadPage;
}-*/;
	
	/**
	 * Forces a reload of a page, even if it is already in the DOM of the page container. default: false
	 * @return
	 */
	public  final native boolean isReloadPage() /*-{
	return this.reloadPage;
}-*/;
	
	/**
	 * Decides whether or not to show the loading message when loading external pages.   	default:true
	 * @param showLoadMsg
	 */
	public  final native void setShowLoadMsg(boolean showLoadMsg) /*-{
	this.showLoadMsg = showLoadMsg;
}-*/;

	/**
	 * Decides whether or not to show the loading message when loading external pages.   	default:true
	 * @return
	 */
public  final native boolean isShowLoadMsg() /*-{
return this.showLoadMsg;
}-*/;
}




