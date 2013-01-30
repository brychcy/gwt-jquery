package com.xedge.jquery.mobile.client;

import java.util.Map;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.ScriptElement;
import com.google.gwt.json.client.JSONObject;
import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.client.handlers.CommandHandler;
import com.xedge.jquery.client.handlers.ValidateHandler;
import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.client.js.JavaScriptIntegerArray;
import com.xedge.jquery.mobile.client.handlers.PageBeforeLoadEventHandler;
import com.xedge.jquery.mobile.client.handlers.PageChangeEventHandler;
import com.xedge.jquery.mobile.client.handlers.PageHideEventHandler;
import com.xedge.jquery.mobile.client.handlers.PageLoadEventHandler;
import com.xedge.jquery.mobile.client.handlers.PageLoadFailedEventHandler;
import com.xedge.jquery.mobile.client.handlers.PageShowEventHandler;
import com.xedge.jquery.mobile.client.model.ChangePageOptions;
import com.xedge.jquery.mobile.client.model.LoadPageOptions;
import com.xedge.jquery.mobile.client.model.URLSettings;
public class JQueryMobile extends JQuery {
	//public static String SCRIPT_SRC = "http://code.jquery.com/mobile/1.0/jquery.mobile-1.0.min.js";
	  public static String SCRIPT_SRC = "http://code.jquery.com/mobile/1.1.0/jquery.mobile-1.1.0.min.js";
	
	public enum Transition {
		none, fade, slide, slideup, slidedown, pop, flip
	}

	public enum Orientation {
		portrait, landscape
	}
	
	public enum Theme {
		a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z
	}

	protected JQueryMobile() {
	}

	/**
	 * Register a listener for the mobileinit event and then load the jQuery Mobile library.
	 * 
	 * @param callback
	 */
	public static final void init(CommandHandler callback) {
		mobileinit(callback);
		loadLibrary();
	}
	
	/**
	 * Get the JQuery mobile Plugin
	 * 
	 * @return
	 */
	public final static JQueryMobile getJQueryMobile(JQuery jquery) {
		return jquery.cast();
	}

	/**
	 * When the jQuery Mobile starts to execute, it triggers a mobileinit event on the document object, to which you can bind to apply overrides to jQuery Mobile's defaults.
	 * 
	 * @param callback
	 */
	private static final native void mobileinit(CommandHandler callback) /*-{
		$wnd.jQuery($doc).bind("mobileinit",function() {
							@com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(callback);
						});
	}-*/;

	public static final native JQueryMobile instance() /*-{
		return $wnd.jQuery.mobile;
	}-*/;

	/**
	 * Load the jQuery Mobile library.
	 */
	public static final void loadLibrary() {
		if (!isLoaded()) {
			ScriptElement script = Document.get().createScriptElement();
			script.setSrc(SCRIPT_SRC);
			Document.get().getElementsByTagName("head").getItem(0).appendChild(script);
		}
	}

	/**
	 * Check if the jQuery Mobile library has been loaded.
	 * 
	 * @return
	 */
	public static final native boolean isLoaded() /*-{
		return !!$wnd.jQuery.mobile;
	}-*/;

	/**
	 * Get the namespace used in data- attributes.
	 * 
	 * @return
	 */
	public static final native String getNS() /*-{
		return $wnd.jQuery.mobile.ns;
	}-*/;

	/**
	 * Set the namespace used in data- attributes, for example, data-role. Can be set to anything, including a blank string which is the default.
	 * 
	 * @param ns
	 */
	public static final native void setNS(String ns) /*-{
		$wnd.jQuery.mobile.ns = ns;
	}-*/;

	/**
	 * When the DOM is ready, the framework should automatically initialize the page. If false, page will not initialize, and will be visually hidden until initializePage is manually called. default : true
	 * 
	 * @return
	 */
	public static final native boolean isAutoInitializePage() /*-{
		return $wnd.jQuery.mobile.autoInitializePage;
	}-*/;

	/**
	 * When the DOM is ready, the framework should automatically initialize the page. If false, page will not initialize, and will be visually hidden until initializePage is manually called. default : true
	 * 
	 * @param autoInitializePage
	 */
	public static final native void setAutoInitializePage(boolean autoInitializePage) /*-{
		$wnd.jQuery.mobile.autoInitializePage = autoInitializePage;
	}-*/;
	
	
	
	/**
	 * Set the delay for touch devices to add the hover and down classes on touch interactions for buttons throughout the framework. Reducing the delay here results in a more responsive feeling ui, but will often result in the downstate being applied during page scrolling. default : 200 
	 * @param hoverDelay
	 */
	public static final native void setButtonMarkupHoverDelay(int hoverDelay) /*-{
		$wnd.jQuery.mobile.buttonMarkup.hoverDelay = hoverDelay;
	}-*/;
	
	/**
	 * Set the delay for touch devices to add the hover and down classes on touch interactions for buttons throughout the framework. Reducing the delay here results in a more responsive feeling ui, but will often result in the downstate being applied during page scrolling. default : 200
	 * @return
	 */
	public static final native int getButtonMarkupHoverDelay() /*-{
	return $wnd.jQuery.mobile.buttonMarkup.hoverDelay;
}-*/;

	/**
	 * Enhancement to use history.replaceState in supported browsers, to convert the hash-based Ajax URL into the full document path. Note that we recommend disabling this feature if Ajax is disabled or if extensive use of external links are used.
	 * @return
	 */
	public static final native boolean isPushStateEnabled() /*-{
		return $wnd.jQuery.mobile.pushStateEnabled;
	}-*/;

	
	/**
	 * Enhancement to use history.replaceState in supported browsers, to convert the hash-based Ajax URL into the full document path. Note that we recommend disabling this feature if Ajax is disabled or if extensive use of external links are used.
	 * @param pushStateEnabled
	 */
	public static final native void setPushStateEnabled(boolean pushStateEnabled) /*-{
		$wnd.jQuery.mobile.pushStateEnabled = pushStateEnabled;
	}-*/;

	
	/**
	 * Warning: Setting this property to true will cause performance degradation on enhancement. Once set, all automatic enhancements made by the framework to each enhanceable element of the user's markup will first check for a data-enhance=false parent node. If one is found the markup will be ignored. This setting and the accompanying data attribute provide a mechanism through which users can prevent enhancement over large sections of markup. default: false 
	 * @return
	 */
	public static final native boolean isIgnoreContentEnabled() /*-{
		return $wnd.jQuery.mobile.ignoreContentEnabled;
	}-*/;

	
	/**
	 * Warning: Setting this property to true will cause performance degradation on enhancement. Once set, all automatic enhancements made by the framework to each enhanceable element of the user's markup will first check for a data-enhance=false parent node. If one is found the markup will be ignored. This setting and the accompanying data attribute provide a mechanism through which users can prevent enhancement over large sections of markup. default: false 
	 * @param pushStateEnabled
	 */
	public static final native void setIgnoreContentEnabled(boolean ignoreContentEnabled) /*-{
		$wnd.jQuery.mobile.ignoreContentEnabled = ignoreContentEnabled;
	}-*/;

	
	/**
	 * Manually initialise page
	 */
	public static final native void initializePage() /*-{
		$wnd.jQuery.mobile.initializePage();
	}-*/;

	/**
	 * The url parameter used for referencing widget-generated sub-pages (such as those generated by nested listviews). Translates to to example.html&ui-page=subpageIdentifier. The hash segment before &ui-page= is used by the framework for making an Ajax request to the URL where the sub-page exists. default : ui-page
	 * 
	 * @return
	 */
	public static final native String getSubPageUrlKey() /*-{
		return $wnd.jQuery.mobile.subPageUrlKey;
	}-*/;

	/**
	 * The url parameter used for referencing widget-generated sub-pages (such as those generated by nested listviews). Translates to to example.html&ui-page=subpageIdentifier. The hash segment before &ui-page= is used by the framework for making an Ajax request to the URL where the sub-page exists. default : ui-page
	 * 
	 * @param subPageUrlKey
	 */
	public static final native void setSubPageUrlKey(String subPageUrlKey) /*-{
		$wnd.jQuery.mobile.subPageUrlKey = subPageUrlKey;
	}-*/;

	/**
	 * The class assigned to page currently in view, and during transitions default : ui-page-active
	 * 
	 * @return
	 */
	public static final native String getActivePageClass() /*-{
		return $wnd.jQuery.mobile.activePageClass;
	}-*/;

	/**
	 * The class assigned to page currently in view, and during transitions default : ui-page-active
	 * 
	 * @param activePageClass
	 */
	public static final native void setActivePageClass(String activePageClass) /*-{
		$wnd.jQuery.mobile.activePageClass = activePageClass;
	}-*/;

	/**
	 * The class used for "active" button state, from CSS framework. default: ui-btn-active
	 * 
	 * @return
	 */
	public static final native String getActiveBtnClass() /*-{
		return $wnd.jQuery.mobile.activeBtnClass;
	}-*/;

	/**
	 * The class used for "active" button state, from CSS framework. default: ui-btn-active
	 * 
	 * @param activeBtnClass
	 */
	public static final native void setActiveBtnClass(String activeBtnClass) /*-{
		$wnd.jQuery.mobile.activeBtnClass = activeBtnClass;
	}-*/;

	/**
	 * jQuery Mobile will automatically handle link clicks and form submissions through Ajax, when possible. If false, url hash listening will be disabled as well, and urls will load as regular http requests. default: true
	 * 
	 * @return
	 */
	public static final native boolean isAjaxEnabled() /*-{
		return $wnd.jQuery.mobile.ajaxEnabled;
	}-*/;

	/**
	 * jQuery Mobile will automatically handle link clicks and form submissions through Ajax, when possible. If false, url hash listening will be disabled as well, and urls will load as regular http requests. default: true
	 * 
	 * @param ajaxEnabled
	 */
	public static final native void setAjaxEnabled(boolean ajaxEnabled) /*-{
		$wnd.jQuery.mobile.ajaxEnabled = ajaxEnabled;
	}-*/;

	
	
	
	/**
	 * Only allow cross-domain requests if allowCrossDomainPages is true. default: false
	 * 
	 * @return
	 */
	public static final native boolean isAllowCrossDomainPages() /*-{
		return $wnd.jQuery.mobile.allowCrossDomainPages;
	}-*/;

	/**
	 * Only allow cross-domain requests if allowCrossDomainPages is true. default: false
	 * 
	 * @param allowCrossDomainPages
	 */
	public static final native void setAllowCrossDomainPages(boolean allowCrossDomainPages) /*-{
		$wnd.jQuery.mobile.allowCrossDomainPages = allowCrossDomainPages;
	}-*/;
	
	
	/**
	 * jQuery Mobile will automatically bind the clicks on anchor tags in your document. Setting this options to false will prevent all anchor click handling including the addition of active button state and alternate link bluring. This should only be used when attempting to delegate the click management to another library or custom code.
	 * @return
	 */
	public static final native boolean isLinkBindingEnabled() /*-{
	return $wnd.jQuery.mobile.linkBindingEnabled;
}-*/;
	
	


	/**
	 * jQuery Mobile will automatically bind the clicks on anchor tags in your document. Setting this options to false will prevent all anchor click handling including the addition of active button state and alternate link bluring. This should only be used when attempting to delegate the click management to another library or custom code.
	 * @param linkBindingEnabled
	 */
public static final native void setLinkBindingEnabled(boolean linkBindingEnabled) /*-{
	$wnd.jQuery.mobile.linkBindingEnabled = linkBindingEnabled;
}-*/;


 
public static final native boolean isOrientationChangeEnabled() /*-{
return $wnd.jQuery.mobile.orientationChangeEnabled;
}-*/;


public static final native void setOrientationChangeEnabled(boolean orientationChangeEnabled) /*-{
$wnd.jQuery.mobile.orientationChangeEnabled = orientationChangeEnabled;
}-*/;
	/**
	 * Query Mobile will automatically listen and handle changes to the location.hash. Disabling this will prevent jQuery Mobile from handling hash changes, which allows you to handle them yourself, or simply to use simple deep-links within a document that scroll to a particular ID. default: true
	 * 
	 * @return
	 */
	public static final native boolean isHashListeningEnabled() /*-{
		return $wnd.jQuery.mobile.hashListeningEnabled;
	}-*/;

	/**
	 * Query Mobile will automatically listen and handle changes to the location.hash. Disabling this will prevent jQuery Mobile from handling hash changes, which allows you to handle them yourself, or simply to use simple deep-links within a document that scroll to a particular ID. default: true
	 * 
	 * @param hashListeningEnabled
	 */
	public static final native void setHashListeningEnabled(boolean hashListeningEnabled) /*-{
		$wnd.jQuery.mobile.hashListeningEnabled = hashListeningEnabled;
	}-*/;

	/**
	 * The default transition for page changes that use Ajax. Set to 'none' for no transitions. default: slide
	 * 
	 * @param transition
	 */
	public static final void setDefaultPageTransition(Transition transition) {
		setDefaultPageTransition(transition.name());
	}

	private static final native void setDefaultPageTransition(String defaultPageTransition) /*-{
		$wnd.jQuery.mobile.defaultPageTransition = defaultPageTransition;
	}-*/;

	/**
	 * The default transition for page changes that use Ajax. Set to 'none' for no transitions. default: slide
	 * 
	 * @return
	 */
	public static final Transition getDefaultPageTransition() {
		return Transition.valueOf(getDefaultPageTransitionJS());
	}

	private static final native String getDefaultPageTransitionJS() /*-{
		return $wnd.jQuery.mobile.defaultPageTransition;
	}-*/;

	/**
	 * Enable pages to have self-contained native scrolling and fixed toolbars in devices that support the overflow-scrolling: touch; property. default: false
	 * @deprecated 1.1.0
	 * @return
	 */
	public static final native boolean isTouchOverflowEnabled() /*-{
		return $wnd.jQuery.mobile.touchOverflowEnabled;
	}-*/;

	/**
	 * Enable pages to have self-contained native scrolling and fixed toolbars in devices that support the overflow-scrolling: touch; property. default: false
	 * @deprecated 1.1.0
	 * @param touchOverflowEnabled
	 */
	public static final native void setTouchOverflowEnabled(boolean touchOverflowEnabled) /*-{
		$wnd.jQuery.mobile.touchOverflowEnabled = touchOverflowEnabled;
	}-*/;

	/**
	 * Set the default transition for dialog changes that use Ajax. Set to 'none' for no transitions. default: pop
	 * 
	 * @param transition
	 */
	public static final void setDefaultDialogTransition(Transition transition) {
		setDefaultDialogTransition(transition.name());
	}

	private static final native void setDefaultDialogTransition(String defaultDialogTransition) /*-{
		$wnd.jQuery.mobile.defaultDialogTransition = defaultDialogTransition;
	}-*/;

	/**
	 * Set the default transition for dialog changes that use Ajax. Set to 'none' for no transitions. default: pop
	 * 
	 * @return
	 */
	public static final Transition getDefaultDialogTransition() {
		return Transition.valueOf(getDefaultDialogTransitionJS());
	}

	private static final native String getDefaultDialogTransitionJS() /*-{
		return $wnd.jQuery.mobile.defaultDialogTransition;
	}-*/;

	/**
	 * Minimum scroll distance that will be remembered when returning to a page. default: 150
	 * 
	 * @return
	 */
	public static final native String getMinScrollBack() /*-{
		return $wnd.jQuery.mobile.minScrollBack;
	}-*/;

	/**
	 * Minimum scroll distance that will be remembered when returning to a page. default: 150
	 * 
	 * @param minScrollBack
	 */
	public static final native void setMinScrollBack(String minScrollBack) /*-{
		$wnd.jQuery.mobile.minScrollBack = minScrollBack;
	}-*/;

	/**
	 * The text that appears when a page is loading. If set to false, the message will not appear at all. default: "loading"
	 * 
	 * @return
	 */
	public static final native String getLoadingMessage() /*-{
		return $wnd.jQuery.mobile.loadingMessage;
	}-*/;

	/**
	 * The text that appears when a page is loading. If set to false, the message will not appear at all. default: "loading"
	 * 
	 * @param loadingMessage
	 */
	public static final native void setLoadingMessage(String loadingMessage) /*-{
		$wnd.jQuery.mobile.loadingMessage = loadingMessage;
	}-*/;

	
	
	/**
	 * The theme that the loading message box uses when text is visible. default: "a"
	 */
	public static final Theme getLoadingMessageTheme() {
		return Theme.valueOf(getLoadingMessageThemeJS());
	}
	
	private static final native String getLoadingMessageThemeJS() /*-{
	return $wnd.jQuery.mobile.loadingMessageTheme;
}-*/;


	/**
	 * The theme that the loading message box uses when text is visible. default: "a"
	 * @param loadingMessageTheme
	 */
	public static final void setLoadingMessageTheme(Theme theme) {
		setLoadingMessageTheme(theme.name());
	}

	
	private static final native void setLoadingMessageTheme(String loadingMessageTheme) /*-{
	$wnd.jQuery.mobile.loadingMessageTheme = loadingMessageTheme;
}-*/;




	/**
	 * Whether the text should be visible when a loading message is shown. The text is always visible for loading errors. default: false
	 * @return
	 */
	public static final native boolean isLoadingMessageTextVisible() /*-{
	return $wnd.jQuery.mobile.loadingMessageTextVisible;
}-*/;

/**
 * Whether the text should be visible when a loading message is shown. The text is always visible for loading errors. default: false
 * @param loadingMessageTextVisible
 */
public static final native void setLoadingMessageTextVisible(boolean loadingMessageTextVisible) /*-{
	$wnd.jQuery.mobile.loadingMessageTextVisible = loadingMessageTextVisible;
}-*/;

	/**
	 * The text that appears when a page fails to load through Ajax. default: "Error Loading Page"
	 * 
	 * @return
	 */
	public static final native String getPageLoadErrorMessage() /*-{
		return $wnd.jQuery.mobile.pageLoadErrorMessage;
	}-*/;

	/**
	 * The text that appears when a page fails to load through Ajax. default: "Error Loading Page"
	 * 
	 * @param pageLoadErrorMessage
	 */
	public static final native void setPageLoadErrorMessage(String pageLoadErrorMessage) /*-{
		$wnd.jQuery.mobile.pageLoadErrorMessage = pageLoadErrorMessage;
	}-*/;
	
	/**
	 * Set the theme that the error message box uses. default: "e"
	 */
	public static final Theme getPageLoadErrorMessageTheme() {
		return Theme.valueOf(getPageLoadErrorMessageThemeJS());
	}
	
	private static final native String getPageLoadErrorMessageThemeJS() /*-{
	return $wnd.jQuery.mobile.pageLoadErrorMessageTheme;
}-*/;


	/**
	 * Set the theme that the error message box uses. default: "e"
	 * @param loadingMessageTheme
	 */
	public static final void setPageLoadErrorMessageTheme(Theme theme) {
		setPageLoadErrorMessageTheme(theme.name());
	}

	
	private static final native void setPageLoadErrorMessageTheme(String pageLoadErrorMessageTheme) /*-{
	$wnd.jQuery.mobile.pageLoadErrorMessageTheme = pageLoadErrorMessageTheme;
}-*/;


	/**
	 * Any support conditions that must be met in order to proceed. default: a function returning the value of $.support.mediaquery
	 * 
	 * @return
	 */
	public static final native boolean isGradeA() /*-{
		return $wnd.jQuery.mobile.gradeA();
	}-*/;

	/**
	 * Any support conditions that must be met in order to proceed.
	 * 
	 * @param callback
	 */
	public static final native void setGradeA(ValidateHandler callback) /*-{
		$wnd.jQuery.mobile.gradeA = function() {
			return @com.xedge.jquery.client.handlers.ValidateHandler::fire(Lcom/xedge/jquery/client/handlers/ValidateHandler;)(callback);
		};
	}-*/;

	/**
	 * More than this horizontal displacement, and we will suppress scrolling. default: 10px
	 * 
	 * @return
	 */
	public static final native int getScrollSupressionThreshold() /*-{
		return $wnd.jQuery.event.special.swipe.scrollSupressionThreshold;
	}-*/;

	/**
	 * More than this horizontal displacement, and we will suppress scrolling. default: 10px
	 * 
	 * @param scrollSupressionThreshold
	 */
	public static final native void setScrollSupressionThreshold(int scrollSupressionThreshold) /*-{
		$wnd.jQuery.event.special.swipe.scrollSupressionThreshold = scrollSupressionThreshold;
	}-*/;

	/**
	 * More time than this, and it isn’t a swipe. default: 1000ms
	 * 
	 * @return
	 */
	public static final native int getDurationThreshold() /*-{
		return $wnd.jQuery.event.special.swipe.durationThreshold;
	}-*/;

	/**
	 * More time than this, and it isn’t a swipe. default: 1000ms
	 * 
	 * @param durationThreshold
	 */
	public static final native void setDurationThreshold(int durationThreshold) /*-{
		$wnd.jQuery.event.special.swipe.durationThreshold = durationThreshold;
	}-*/;

	/**
	 * Swipe horizontal displacement must be more than this. default: 30px
	 * 
	 * @return
	 */
	public static final native int getHorizontalDistanceThreshold() /*-{
		return $wnd.jQuery.event.special.swipe.horizontalDistanceThreshold;
	}-*/;

	/**
	 * Swipe horizontal displacement must be more than this. default: 30px
	 * 
	 * @param horizontalDistanceThreshold
	 */
	public static final native void setHorizontalDistanceThreshold(int horizontalDistanceThreshold) /*-{
		$wnd.jQuery.event.special.swipe.horizontalDistanceThreshold = horizontalDistanceThreshold;
	}-*/;

	/**
	 * Swipe vertical displacement must be less than this. default: 75px
	 * 
	 * @return
	 */
	public static final native int getVerticalDistanceThreshold() /*-{
		return $wnd.jQuery.event.special.swipe.verticalDistanceThreshold;
	}-*/;

	/**
	 * Swipe vertical displacement must be less than this. default: 75px
	 * 
	 * @param verticalDistanceThreshold
	 */
	public static final native void setVerticalDistanceThreshold(int verticalDistanceThreshold) /*-{
		$wnd.jQuery.event.special.swipe.verticalDistanceThreshold = verticalDistanceThreshold;
	}-*/;

	/**
	 * Get device orientation ie. portrait or landscape
	 * 
	 * @return
	 */
	public static final Orientation getOrientation() {
		return Orientation.valueOf(getOrientationJS());
	}

	private static final native String getOrientationJS() /*-{
		return $wnd.jQuery.event.special.orientationchange.orientation();
	}-*/;

	public final JQueryMobile addPagehideHandler(PageHideEventHandler callback) {
		return addPagehideHandler(EventType.pagehide.name(), callback);
	}

	/**
	 * Triggered on the page being hidden, before its transition begins.
	 * 
	 * @param callback
	 * @return
	 */
	public final JQueryMobile addPagebeforehideHandler(PageHideEventHandler callback) {
		return addPagehideHandler(EventType.pagebeforehide.name(), callback);
	}

	/**
	 * Triggered on the page being hidden, after its transition completes.
	 * 
	 * @param eventType
	 * @param callback
	 * @return
	 */
	private final native JQueryMobile addPagehideHandler(String eventType, PageHideEventHandler callback) /*-{
		return this.bind(eventType,function(event, ui) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.mobile.client.handlers.PageHideEventHandler::fire(Lcom/xedge/jquery/mobile/client/handlers/PageHideEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/mobile/client/model/PageHideEventValues;)(callback,event,currentJQuery,ui);
						});
	}-*/;

	/**
	 * Triggered on the page being shown, after its transition completes.
	 * 
	 * @param callback
	 * @return
	 */
	public final JQueryMobile addPageshowHandler(PageShowEventHandler callback) {
		return addPageshowHandler(EventType.pageshow.name(), callback);
	}

	/**
	 * Triggered on the page being shown, before its transition begins.
	 * 
	 * @param callback
	 * @return
	 */
	public final JQueryMobile addPagebeforeshowHandler(PageShowEventHandler callback) {
		return addPageshowHandler(EventType.pagebeforeshow.name(), callback);
	}

	private final native JQueryMobile addPageshowHandler(String eventType, PageShowEventHandler callback) /*-{
		return this.bind(eventType,function(event, ui) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.mobile.client.handlers.PageShowEventHandler::fire(Lcom/xedge/jquery/mobile/client/handlers/PageShowEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/mobile/client/model/PageShowEventValues;)(callback,event,currentJQuery,ui);
						});
	}-*/;

	/**
	 * Programmatically change from one page to another.
	 * 
	 * @param to
	 *            url of page to load eg. "about/us.html"
	 */
	public static final native void changePage(String to) /*-{
		$wnd.jQuery.mobile.changePage(to);
	}-*/;

	/**
	 * Programmatically change from one page to another.
	 * 
	 * @param to
	 *            url of page to load eg. "about/us.html"
	 * @param options
	 */
	public static final native void changePage(String to, ChangePageOptions options) /*-{
		$wnd.jQuery.mobile.changePage(to, options);
	}-*/;

	/**
	 * Programmatically change from one page to another.
	 * 
	 * @param to
	 *            JQuery Collection eg. $("#about")
	 */
	public static final native void changePage(JQuery to) /*-{
		$wnd.jQuery.mobile.changePage(to);
	}-*/;

	/**
	 * Programmatically change from one page to another.
	 * 
	 * @param to
	 *            JQuery Collection eg. $("#about")
	 * @param options
	 */
	public static final native void changePage(JQuery to, ChangePageOptions options) /*-{
		$wnd.jQuery.mobile.changePage(to, options);
	}-*/;

	/**
	 * Programmatically load an external page, enhance its content, and insert it into the DOM. This function does not affect the current active page so it can be used to load pages in the background.
	 * 
	 * @param to
	 *            url of page to load eg. "about/us.html"
	 */
	public static final native void loadPage(String to) /*-{
		$wnd.jQuery.mobile.loadPage(to);
	}-*/;

	/**
	 * Programmatically load an external page, enhance its content, and insert it into the DOM. This function does not affect the current active page so it can be used to load pages in the background.
	 * 
	 * @param to
	 *            url of page to load eg. "about/us.html"
	 * @param options
	 */
	public static final native void loadPage(String to, LoadPageOptions options) /*-{
		$wnd.jQuery.mobile.loadPage(to, options);
	}-*/;

	/**
	 * Programmatically load an external page, enhance its content, and insert it into the DOM. This function does not affect the current active page so it can be used to load pages in the background.
	 * 
	 * @param to
	 *            JQuery Collection eg. $("#about")
	 */
	public static final native void loadPage(JQuery to) /*-{
		$wnd.jQuery.mobile.loadPage(to);
	}-*/;

	/**
	 * Programmatically load an external page, enhance its content, and insert it into the DOM. This function does not affect the current active page so it can be used to load pages in the background.
	 * 
	 * @param to
	 *            JQuery Collection eg. $("#about")
	 * @param options
	 */
	public static final native void loadPage(JQuery to, LoadPageOptions options) /*-{
		$wnd.jQuery.mobile.loadPage(to, options);
	}-*/;

	/**
	 * Store arbitrary data associated with the matched elements.
	 * 
	 * @param key
	 *            : A string naming the piece of data to set.
	 * @param value
	 *            : The new data value as a string
	 */
	public final native void jqmData(String key, String value) /*-{
		this.jqmData(key, value);
	}-*/;

	/**
	 * Store arbitrary data associated with the matched elements.
	 * 
	 * @param key
	 *            : A string naming the piece of data to set.
	 * @param value
	 *            : The new data value; it can be any Javascript type including Array or Object.
	 */
	public final native void jqmData(String key, JavaScriptObject value) /*-{
		this.jqmData(key, value);
	}-*/;

	/**
	 * * Store arbitrary data associated with the matched elements.
	 * 
	 * @param keyValuePairs
	 *            : A JavaScriptObject of key-value pairs of data to update
	 */
	public final native void jqmData(JavaScriptObject keyValuePairs) /*-{
		this.jqmData(keyValuePairs);
	}-*/;

	/**
	 * Store arbitrary data associated with the matched elements.
	 * 
	 * @param keyValuePairs
	 *            : A map of key-value pairs of data to update
	 * @return
	 */
	public final void jqmData(Map<String, String> keyValuePairs) {
		this.jqmData(JSHelper.convertStringMapToJSONObject(keyValuePairs).getJavaScriptObject());
	}

	/**
	 * Returns object at key data store for the first element in the jQuery collection, as set by data(key, value).
	 * 
	 * @param key
	 *            :Name of the data stored.
	 * @return
	 */
	public final native JavaScriptObject jqmData(String key) /*-{
		return this.jqmData(key);
	}-*/;

	/**
	 * Returns string at key data store for the first element in the jQuery collection, as set by data(key, value).
	 * 
	 * @param key
	 *            :Name of the data stored.
	 * @param key
	 * @return
	 */
	public final native String jqmDataString(String key) /*-{
		return this.jqmData(key);
	}-*/;

	/**
	 * Returns all data as a object
	 * 
	 * @return
	 */
	public final native JavaScriptObject jqmData() /*-{
		return this.jqmData();
	}-*/;

	/**
	 * Returns all data as a Map
	 * 
	 * @return
	 */
	public final Map<String, String> jqmDataMap() {
		return JSHelper.convertJSONObjectToStringMap(new JSONObject(jqmData()));
	}

	/**
	 * Store arbitrary data associated with the specified element.
	 * 
	 * @param element
	 *            : The DOM element to associate with the data.
	 * @param key
	 *            : A string naming the piece of data to set.
	 * @param value
	 *            : The new data value as a string
	 */
	public static final native void jqmData(Element element, String key, String value) /*-{
		$wnd.jQuery.jqmData(element, key, value);
	}-*/;

	/**
	 * Store arbitrary data associated with the specified element.
	 * 
	 * @param element
	 *            : The DOM element to associate with the data.
	 * @param key
	 *            : A string naming the piece of data to set.
	 * @param value
	 *            : The new data value as an object
	 */
	public static final native void jqmData(Element element, String key, JavaScriptObject value) /*-{
		$wnd.jQuery.jqmData(element, key, value);
	}-*/;

	/**
	 * Returns string at named data store for the element, as set by jQuery.data(element, name, value), or the full data store for the element.
	 * 
	 * @param element
	 *            : The DOM element to associate with the data.
	 * @param key
	 *            : A string naming the piece of data to set.
	 * @return
	 */
	public static final native String jqmDataString(Element element, String key) /*-{
		return $wnd.jQuery.jqmData(element, key);
	}-*/;

	/**
	 * Returns object at named data store for the element, as set by jQuery.data(element, name, value), or the full data store for the element.
	 * 
	 * @param element
	 *            : The DOM element to associate with the data.
	 * @param key
	 *            : A string naming the piece of data to set.
	 * @return
	 */
	public static final native JavaScriptObject jqmData(Element element, String key) /*-{
		return $wnd.jQuery.jqmData(element, key);
	}-*/;

	/**
	 * Returns all data as a object for the element
	 * 
	 * @param element
	 * @return
	 */
	public static final native JavaScriptObject jqmData(Element element) /*-{
		return $wnd.jQuery.jqmData(element);
	}-*/;

	/**
	 * Returns all data as a Map for the element
	 * 
	 * @param element
	 * @return
	 */
	public static final Map<String, String> jqmDataMap(Element element) {
		return JSHelper.convertJSONObjectToStringMap(new JSONObject(jqmData(element)));
	}

	/**
	 * Remove a previously-stored piece of data.
	 * 
	 * @param key
	 *            : A string naming the piece of data to delete.
	 */
	public final native void jqmRemoveData(String key) /*-{
		this.jqmRemoveData(key);
	}-*/;

	/**
	 * Remove a previously-stored piece of data.
	 * 
	 * @param element
	 *            : A DOM element from which to remove data.
	 * @param key
	 */
	public static final native void jqmRemoveData(Element element, String key) /*-{
		$wnd.jQuery.jqmRemoveData(element, key);
	}-*/;

	/**
	 * Check if data is stored
	 * 
	 * @param key
	 * @return
	 */
	public final native boolean jqmHasData(String key) /*-{
		return this.jqmHasData(key);
	}-*/;

	/**
	 * Check if data is stored
	 * 
	 * @param element
	 *            : A DOM element from which to check data.
	 * @param key
	 */
	public static final native boolean jqmHasData(Element element, String key) /*-{
		return $wnd.jQuery.jqmHasData(element, key);
	}-*/;
	
	
	/**
	 * Filter method for users that wish to respect data-enhance=false parent elements during manual enhancement or custom plugin authoring.
	 * Setting : If, and only if, $.mobile.ignoreContentEnabled is set to true, this method will traverse the parent nodes for each DOM element in the jQuery object and where it finds a data-enhance=false parent the child will be removed from the set.
	 * Warning : The operation of traversing all parent elements can be expensive for even small jQuery object sets
	 * @return
	 */
	public final native JavaScriptObject jqmEnhanceable() /*-{
	return this.jqmEnhanceable();
}-*/;
	
	/**
	 * Filter method for users that wish to respect data-ajax=false parent elements during custom form and link binding.
	 * Setting : If, and only if, $.mobile.ignoreContentEnabled is set to true, this method will traverse the parent nodes for each DOM element in the jQuery object and where it finds a data-ajax=false parent the child form or link will be removed from the set.
	 * Warning : The operation of traversing all parent elements can be expensive for even small jQuery object sets
	 * @return
	 */
	public final native JavaScriptObject jqmHijackable() /*-{
	return this.jqmHijackable();
}-*/;
	

	/**
	 * Show the page loading message, which is configurable via $.mobile.loadingMessage.
	 */
	public static final native void showPageLoadingMsg() /*-{
		$wnd.jQuery.mobile.showPageLoadingMsg();
	}-*/;

	/**
	 * Show the page loading message
	 * @param theme : The theme swatch for the message.  default: "a"
	 */
	public static final void showPageLoadingMsg(Theme theme) {
		showPageLoadingMsg(theme.name());
	}

	private static final native void showPageLoadingMsg(String loadingMessageTheme) /*-{
	$wnd.jQuery.mobile.showPageLoadingMsg(loadingMessageTheme);
}-*/;
	
	
	/**
	 * Show the page loading message
	 * @param theme : The theme swatch for the message.  default: "a"
	 * @param msgTex : The text of the message. default: "loading"
	 */
	public static final void showPageLoadingMsg(Theme theme,String msgTex) {
		showPageLoadingMsg(theme.name(),msgTex);
	}

	private static final native void showPageLoadingMsg(String loadingMessageTheme,String msgText) /*-{
	$wnd.jQuery.mobile.showPageLoadingMsg(loadingMessageTheme,msgText);
}-*/;
	
	/**
	 * Show the page loading message
	 * @param theme : The theme swatch for the message.  default: "a"
	 * @param msgTex : The text of the message. default: "loading"
	 * @param textonly :  If true, the "spinner" image will be hidden when the message is shown. default: false
	 */
	public static final void showPageLoadingMsg(Theme theme,String msgTex,boolean textonly) {
		showPageLoadingMsg(theme.name(),msgTex,textonly);
	}

	private static final native void showPageLoadingMsg(String loadingMessageTheme,String msgText,boolean textonly) /*-{
	$wnd.jQuery.mobile.showPageLoadingMsg(loadingMessageTheme,msgText,textonly);
}-*/;
	
	/**
	 * Hide the page loading message, which is configurable via $.mobile.loadingMessage.
	 */
	public static final native void hidePageLoadingMsg() /*-{
		$wnd.jQuery.mobile.hidePageLoadingMsg();
	}-*/;
	
	/**
	 * Utility method for displaying the fixed header and/or footer of the current active page within the viewport. 
	 * Show fixed header/footer with a fade animation. 	
	 */
	public static final native void showFixedToolbars() /*-{
	$wnd.jQuery.mobile.fixedToolbars.show();
}-*/;

	/**
	 * Utility method for displaying the fixed header and/or footer of the current active page within the viewport. 
	 * @param immediately  If true, any fixed header or footer for the current active page is displayed immediately within the viewport. If false or unspecified, the fixed header/footer will fade-in after a 100 millisecond delay. 
	 */
	public static final native void showFixedToolbars(boolean immediately) /*-{
	$wnd.jQuery.mobile.fixedToolbars.show(immediately);
}-*/;

	/**
	 * Utility method for hiding the fixed header and/or footer of the current active page.
	 * Hide fixed header/footer with a fade animation. 
	 */
	public static final native void hideFixedToolbars() /*-{
	$wnd.jQuery.mobile.fixedToolbars.hide();
}-*/;

    /**
     * Utility method for hiding the fixed header and/or footer of the current active page. 
     * @param immediately If true, any fixed header or footer for the current active page is immediately placed inline (back in flow) with the page content. If false or unspecified, the fixed header/footer will fade-out after a 100 millisecond delay
     */
	public static final native void hideFixedToolbars(boolean immediately) /*-{
	$wnd.jQuery.mobile.fixedToolbars.hide(immediately);
}-*/;
	/**
	 * Utility method for parsing a URL and its relative variants into an object that makes accessing the components of the URL easy. When parsing relative variants, the resulting object will contain empty string values for missing components (like protocol, host, etc). Also, when parsing URLs that have no authority, such as tel: urls, the pathname property of the object will contain the data after the protocol/scheme colon.
	 * 
	 * @param url
	 *            : A relative or absolute URL.
	 * @return
	 */
	public static final native URLSettings parseUrl(String url) /*-{
		return $wnd.jQuery.mobile.path.parseUrl(url);
	}-*/;

	/**
	 * Utility method for converting a relative file or directory path into an absolute path.
	 * 
	 * @param relPath
	 *            : A relative file or directory path.
	 * @param absPath
	 *            : An absolute file or relative path to resolve against.
	 * @return
	 */
	public static final native String makePathAbsolute(String relPath, String absPath) /*-{
		return $wnd.jQuery.mobile.path.makePathAbsolute(relPath, absPath);
	}-*/;

	/**
	 * Utility method for converting a relative URL to an absolute URL.
	 * 
	 * @param relUrl
	 *            : A relative URL.
	 * @param absUrl
	 *            : An absolute URL to resolve against.
	 * @return
	 */
	public static final native String makeUrlAbsolute(String relUrl, String absUrl) /*-{
		return $wnd.jQuery.mobile.path.makeUrlAbsolute(relUrl, absUrl);
	}-*/;

	/**
	 * Utility method for comparing the domain of 2 URLs.
	 * 
	 * @param url1
	 * @param url2
	 * @return
	 */
	public static final native boolean isSameDomain(String url1, String url2) /*-{
		return $wnd.jQuery.mobile.path.isSameDomain(url1, url2);
	}-*/;

	/**
	 * Utility method for determining if a URL is a relative variant.
	 * 
	 * @param url
	 * @return
	 */
	public static final native boolean isRelativeUrl(String url) /*-{
		return $wnd.jQuery.mobile.path.isRelativeUrl(url);
	}-*/;

	/**
	 * Utility method for determining if a URL is absolute.
	 * 
	 * @param url
	 * @return
	 */
	public static final native boolean isAbsoluteUrl(String url) /*-{
		return $wnd.jQuery.mobile.path.isAbsoluteUrl(url);
	}-*/;

	/**
	 * Scroll to a particular Y position without triggering scroll event listeners.
	 * 
	 * @param yPos
	 *            : Pass any number to scroll to that Y location. defaults to 0
	 */
	public static final native void silentScroll(int yPos) /*-{
  $wnd.jQuery.mobile.silentScroll(yPos)
}-*/;

	/**
	 * Add width breakpoints to the min/max width classes that are added to the HTML element.
	 * 
	 * @param values
	 *            : Pass any number or array of numbers to add to the resolution classes.
	 */
	public static final void addResolutionBreakpoints(Integer[] values) {
		addResolutionBreakpoints(JSHelper.convertIntegerArrayToJSArray(values));
	}

	private static final native void addResolutionBreakpoints(JavaScriptIntegerArray values) /*-{
 $wnd.jQuery.mobile.addResolutionBreakpoints(values);
}-*/;

	public static final native JQuery getActivePage() /*-{
	return $wnd.jQuery.mobile.activePage;
}-*/;
	
	
    /**
     * Triggered before any load request is made
     * @param callback
     * @return
     */
	public final JQueryMobile addPagebeforeloadHandler(PageBeforeLoadEventHandler callback) {
		return addPagebeforeloadHandler(EventType.pagebeforeload.name(), callback);
	}


	private final native JQueryMobile addPagebeforeloadHandler(String eventType, PageBeforeLoadEventHandler callback) /*-{
		return this.bind(eventType,function(event, ui) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.mobile.client.handlers.PageBeforeLoadEventHandler::fire(Lcom/xedge/jquery/mobile/client/handlers/PageBeforeLoadEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/mobile/client/model/PageBeforeLoadEventValues;)(callback,event,currentJQuery,ui);
	    });				
	}-*/;


    /**
     * Triggered after the page is successfully loaded and inserted into the DOM.
     * @param callback
     * @return
     */
	public final JQueryMobile addPageloadHandler(PageLoadEventHandler callback) {
		return addPageloadHandler(EventType.pageload.name(), callback);
	}

	private final native JQueryMobile addPageloadHandler(String eventType, PageLoadEventHandler callback) /*-{
		return this.bind(eventType,function(event, ui) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.mobile.client.handlers.PageLoadEventHandler::fire(Lcom/xedge/jquery/mobile/client/handlers/PageLoadEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/mobile/client/model/PageLoadEventValues;)(callback,event,currentJQuery,ui);
	    });				
	}-*/;
	
    /**
     * Triggered if the page load request failed.
     * @param callback
     * @return
     */
	public final JQueryMobile addPageloadfailedHandler(PageLoadFailedEventHandler callback) {
		return addPageloadfailedHandler(EventType.pageloadfailed.name(), callback);
	}

	private final native JQueryMobile addPageloadfailedHandler(String eventType, PageLoadFailedEventHandler callback) /*-{
		return this.bind(eventType,function(event, ui) {
							var currentJQuery = $wnd.jQuery(this);
							@com.xedge.jquery.mobile.client.handlers.PageLoadFailedEventHandler::fire(Lcom/xedge/jquery/mobile/client/handlers/PageLoadFailedEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/mobile/client/model/PageLoadFailedEventValues;)(callback,event,currentJQuery,ui);
	    });				
	}-*/;
	
	
    /**
     * This event is triggered prior to any page loading or transition. Callbacks can prevent execution of the changePage() function by calling preventDefault on the event object passed into the callback. 
     * @param callback
     * @return
     */
	public final JQueryMobile addPagebeforechangeHandler(PageChangeEventHandler callback) {
		return addPagechangeHandler(EventType.pagebeforechange.name(), callback);
	}
	
	/**
	 * This event is triggered after the changePage() request has finished loading the page into the DOM and all page transition animations have completed. Note that any pageshow or pagehide events will have fired *BEFORE* this event is triggered.
	 * @param callback
	 * @return
	 */
	public final JQueryMobile addPagechangeHandler(PageChangeEventHandler callback) {
		return addPagechangeHandler(EventType.pagechange.name(), callback);
	}
	
	/**
	 * This event is triggered when the changePage() request fails to load the page.  
	 * @param callback
	 * @return
	 */
	public final JQueryMobile addPagechangeFailedHandler(PageChangeEventHandler callback) {
		return addPagechangeHandler(EventType.pagechangefailed.name(), callback);
	}
	
	private final native JQueryMobile addPagechangeHandler(String eventType, PageChangeEventHandler callback) /*-{
	return this.bind(eventType,function(event, ui) {
						var currentJQuery = $wnd.jQuery(this);
						@com.xedge.jquery.mobile.client.handlers.PageChangeEventHandler::fire(Lcom/xedge/jquery/mobile/client/handlers/PageChangeEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/client/JQuery;Lcom/xedge/jquery/mobile/client/model/PageChangeEventValues;)(callback,event,currentJQuery,ui);
    });				
}-*/;
}
