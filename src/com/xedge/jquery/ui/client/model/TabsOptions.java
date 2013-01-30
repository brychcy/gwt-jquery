package com.xedge.jquery.ui.client.model;
import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.JQuery.EventType;
import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.client.js.JavaScriptIntegerArray;
import com.xedge.jquery.client.js.JavaScriptObjectArray;
import com.xedge.jquery.client.model.AjaxSettings;
import com.xedge.jquery.ui.client.handlers.TabsUIEventHandler;

/**
 * Tabs are generally used to break content into multiple sections that can be swapped to save space, much like an accordion. NOTE: Tabs created dynamically using "add" are given an id of ui-tabs-NUM, where NUM is an auto-incrementing id. If you use this naming convention for your own elements, you may encounter problems.
 * 
 * Theme : ui-tabs , ui-tabs-nav , ui-tabs-panel
 * 
 * @author osaharri
 * 
 */
public class TabsOptions extends JavaScriptObject {
	public enum TabsOptionParameters {
		destroy, abort,
	}
	
	public enum TabsIndexedOptionParameters {
		remove, enable , select , load
	}
	
	public enum TabsBooleanOption {
		cache,collapsible
	}

	public enum TabsStringOption {
		event,idPrefix,panelTemplate,spinner ,tabTemplate
	}
	
	public enum TabsIntegerOption {
		selected 
	}
	
	protected TabsOptions() {
	}

	public static native TabsOptions create() /*-{
		return {};
	}-*/;

	/**
	 * Disables (true) or enables (false) the tabs. Can be set when initialising (first creating) the tabs. Default:false
	 * 
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
		this.disabled=disabled;
	}-*/;

	/**
	 * Additional Ajax options to consider when loading tab content. Default:null
	 * 
	 * @param ajaxOptions
	 */
	public final native void setAjaxOptions(AjaxSettings ajaxOptions) /*-{
		this.ajaxOptions=ajaxOptions;
	}-*/;

	/**
	 * Whether or not to cache remote tabs content, e.g. load only once or with every click. Cached content is being lazy loaded, e.g once and only once for the first click. Note that to prevent the actual Ajax requests from being cached by the browser you need to provide an extra cache: false flag to ajaxOptions. Default:false
	 * 
	 * @param cache
	 */
	public final native void setCache(boolean cache) /*-{
		this.cache=cache;
	}-*/;

	/**
	 * Set to true to allow an already selected tab to become unselected again upon reselection. Default:false
	 * 
	 * @param collapsible
	 */
	public final native void setCollapsible(boolean collapsible) /*-{
		this.collapsible=collapsible;
	}-*/;

	/**
	 * Store the latest selected tab in a cookie. The cookie is then used to determine the initially selected tab if the selected option is not defined. Requires cookie plugin. Default:null
	 * 
	 * @param cookie
	 */
	public final native void setCookie(CookieOptions cookie) /*-{
		this.cookie=cookie;
	}-*/;

	/**
	 * An array containing the position of the tabs (zero-based index) that should be disabled on initialization. : Default:[]
	 * 
	 * @param disabled
	 */
	public final void setDisabled(Integer[] disabled) {
		setDisabled(JSHelper.convertIntegerArrayToJSArray(disabled));
	}

	private final native void setDisabled(JavaScriptIntegerArray disabled) /*-{
		this.disabled=disabled;
	}-*/;

	/**
	 * The type of event to be used for selecting a tab. Default:'click'
	 * 
	 * @param eventType
	 */
	public final void setEvent(EventType eventType) {
		setEvent(eventType.name());
	}

	private final native void setEvent(String event) /*-{
		this.event=event;
	}-*/;

	/**
	 * Enable animations for hiding and showing tab panels. eg. { height: 'toggle', opacity: 'toggle', duration: 200 } Default : null
	 * 
	 * @param fx
	 */
	public final native void setFx(TabsFX fx) /*-{
		this.fx=fx;
	}-*/;

	/**
	 * Enable different animations for hiding and showing tab panels. eg. { height: 'toggle', opacity: 'toggle', duration: 200 }
	 * 
	 * @param hideFx
	 * @param showFx
	 */
	public final void setFx(TabsFX hideFx, TabsFX showFx) {
		JavaScriptObjectArray<TabsFX> array = JavaScriptObjectArray.create();
		array.push(hideFx);
		array.push(showFx);
		setFx(array);
	};

	private final native void setFx(JavaScriptObjectArray<TabsFX> fx) /*-{
		this.fx=fx;
	}-*/;

	/**
	 * If the remote tab, its anchor element that is, has no title attribute to generate an id from, an id/fragment identifier is created from this prefix and a unique id .
	 * Default:'ui-tabs-'
	 * @param idPrefix
	 */
	public final native void setIdPrefix(String idPrefix) /*-{
	this.idPrefix=idPrefix;
}-*/;

	/**
	 * HTML template from which a new tab panel is created in case of adding a tab with the add method or when creating a panel for a remote tab on the fly. eg. '<li></li>'
	 * Default:'<div></div>'  
	 * @param panelTemplate
	 */
	public final native void setPanelTemplate(String panelTemplate) /*-{
	this.panelTemplate=panelTemplate;
}-*/;
	
	
	/**
	 * Zero-based index of the tab to be selected on initialization. To set all tabs to unselected pass -1 as value.  Default:0
	 * @param selected
	 */
	public final native void setSelected(int selected) /*-{
	this.selected=selected;
}-*/;
	
	/**
	 * The HTML content of this string is shown in a tab title while remote content is loading. Pass in empty string to deactivate that behavior. An span element must be present in the A tag of the title, for the spinner content to be visible.  eg. Retrieving data... 
	 * Default:'<em>Loading&#8230;</em>'
	 * @param spinner
	 */
	public final native void setSpinner(String spinner) /*-{
	this.spinner=spinner;
}-*/;
	
	/**
	 * HTML template from which a new tab is created and added. The placeholders #{href} and #{label} are replaced with the url and tab label that are passed as arguments to the add method.  
	 * Default:'<li><a href="#{href}"><span>#{label}</span></a></li>'
	 * @param tabTemplate
	 */
	public final native void setTabTemplate(String tabTemplate) /*-{
	this.tabTemplate=tabTemplate;
}-*/;
	
	/**
	 * This event is triggered when clicking a tab. Event type : tabsselect
	 * @param callback
	 */
	public final native void setSelectHandler(TabsUIEventHandler callback) /*-{
	this.select = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.TabsUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/TabsUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/TabsUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
	/**
	 * This event is triggered after the content of a remote tab has been loaded.  Event type : tabsload
	 * @param callback
	 */
	public final native void setLoadHandler(TabsUIEventHandler callback) /*-{
	this.load = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.TabsUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/TabsUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/TabsUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;		
	

	/**
	 * his event is triggered when a tab is shown. Event type : tabsshow
	 * @param callback
	 */
	public final native void setShowHandler(TabsUIEventHandler callback) /*-{
	this.show = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.TabsUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/TabsUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/TabsUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
	/**
	 * This event is triggered when a tab is added.  Event type : tabsadd
	 * @param callback
	 */
	public final native void setAddHandler(TabsUIEventHandler callback) /*-{
	this.add = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.TabsUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/TabsUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/TabsUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
	/**
	 * This event is triggered when a tab is removed. Event type : tabsremove
	 * @param callback
	 */
	public final native void setRemoveHandler(TabsUIEventHandler callback) /*-{
	this.remove = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.TabsUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/TabsUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/TabsUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
	/**
	 * This event is triggered when a tab is enabled.  Event type : tabsenable
	 * @param callback
	 */
	public final native void setEnableHandler(TabsUIEventHandler callback) /*-{
	this.enable = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.TabsUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/TabsUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/TabsUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
	/**
	 * This event is triggered when a tab is disabled.  Event type : tabsdisable
	 * @param callback
	 */
	public final native void setDisableHandler(TabsUIEventHandler callback) /*-{
	this.disable = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.TabsUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/TabsUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/TabsUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
}
