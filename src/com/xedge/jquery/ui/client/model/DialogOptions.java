package com.xedge.jquery.ui.client.model;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.JQuery.Easing;
import com.xedge.jquery.client.js.JSHelper;
import com.xedge.jquery.client.js.JavaScriptStringArray;
import com.xedge.jquery.ui.client.JQueryUI.Effect;
import com.xedge.jquery.client.JQuery.ElementPosition;
import com.xedge.jquery.ui.client.handlers.DialogUIEventHandler;
import com.xedge.jquery.ui.client.handlers.DialogUIEventResultHandler;
import com.xedge.jquery.ui.client.handlers.DialogUIEventWithUIItemHandler;
import com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler;

/**
 * A dialog is a floating window that contains a title bar and a content area. The dialog window can be moved, resized and closed with the 'x' icon by default. If the content length exceeds the maximum height, a scrollbar will automatically appear. A bottom button bar and semi-transparent modal overlay layer are common options that can be added. Theme : ui-dialog , ui-dialog-titlebar , ui-dialog-title-dialog , ui-dialog-titlebar-close ui-dialog-content
 * 
 * @author joe
 * 
 */
public class DialogOptions extends JavaScriptObject {
	protected DialogOptions() {
	}
	
	public enum DialogOptionParameters {
		destroy, disable, enable, close,moveToTop,open
	}
	
	public enum DialogBooleanOption {
		disabled,autoOpen,closeOnEscape,draggable,modal,resizable,stack,
	}

	public enum DialogStringOption {
		closeText,dialogClass,hide,position,show,title,
	}
	
	public enum DialogIntegerOption {
		height,maxHeight,maxWidth,minHeight,minWidth,width,zIndex
	}
	

	
	public static native DialogOptions create() /*-{
		return {};
	}-*/;

	/**
	 * Disables (true) or enables (false) the dialog. Can be set when initialising (first creating) the dialog. Default:false
	 * 
	 * @param disabled
	 */
	public final native void setDisabled(boolean disabled) /*-{
		this.disabled=disabled;
	}-*/;

	/**
	 * When autoOpen is true the dialog will open automatically when dialog is called. If false it will stay hidden until .dialog("open") is called on it. Default:true
	 * 
	 * @param autoOpen
	 */
	public final native void setAutoOpen(boolean autoOpen) /*-{
		this.autoOpen=autoOpen;
	}-*/;

    /**
     * Add a button which should be displayed on the dialog.
     * @param text1
     * @param callback
     */
	public final native void addButton(String text1,ExecuteCurrentUIHandler callback) /*-{
	this.buttons = this.buttons || [];
	this.buttons[this.buttons.length] = {  text: text1 ,
		click: function() { 
		var currentJQuery = $wnd.jQuery(this);
		@com.xedge.jquery.ui.client.handlers.ExecuteCurrentUIHandler::fire(Lcom/xedge/jquery/ui/client/handlers/ExecuteCurrentUIHandler;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,currentJQuery);
		} 
		};
}-*/;
	
	/**
	 * Specifies whether the dialog should close when it has focus and the user presses the esacpe (ESC) key. Default:true
	 * 
	 * @param closeOnEscape
	 */
	public final native void setCloseOnEscape(boolean closeOnEscape) /*-{
		this.closeOnEscape=closeOnEscape;
	}-*/;

	/**
	 * Specifies the text for the close button. Note that the close text is visibly hidden when using a standard theme. : Default:'close'
	 * 
	 * @param closeText
	 */
	public final native void setCloseText(String closeText) /*-{
		this.closeText=closeText;
	}-*/;

	/**
	 * The specified class name will be added to the dialog, for additional theming. Default:''
	 * 
	 * @param dialogClass
	 */
	public final native void setDialogClass(String dialogClass) /*-{
		this.dialogClass=dialogClass;
	}-*/;

	/**
	 * The specified class names will be added to the dialog, for additional theming. Default:''
	 * @param dialogClasses
	 */
	public final void setDialogClassList(String[] dialogClasses) {
		setDialogClasses(JSHelper.convertStringArrayToJSArray(dialogClasses));
	}

	private final native void setDialogClasses(JavaScriptStringArray dialogClass) /*-{
		this.dialogClass=dialogClass;
	}-*/;

	
	/**
	 * If set to true, the dialog will be draggable will be draggable by the titlebar. Default:true
	 * @param draggable
	 */
	public final native void setDraggable(boolean draggable) /*-{
	this.draggable=draggable;
}-*/;
	
	/**
	 * The height of the dialog, in pixels. Default is 'auto' to make the dialog adjust based on its content. 
	 * @param height
	 */
	public final native void setHeight(int height) /*-{
	this.height=height;
}-*/;
	
	/**
	 * The Easing effect to be used when the dialog is closed.  Default:null
	 * @param easing
	 */
	public final void setHide(Easing easing) {
		setHide(easing.name());
	}

	/**
	 * The effect to be used when the dialog is closed.  Default:null
	 * @param effect
	 */
	public final void setHide(Effect effect) {
		setHide(effect.name());
	}
	
	private final native void setHide(String hide) /*-{
	this.hide=hide;
}-*/;
	
	/**
	 * The maximum height to which the dialog can be resized, in pixels.   Default:false
	 * @param maxHeight
	 */
	public final native void setMaxHeight(int maxHeight) /*-{
	this.maxHeight=maxHeight;
}-*/;
	
	/**
	 * The maximum width to which the dialog can be resized, in pixels.  Default:false
	 * @param maxWidth
	 */
	public final native void setMaxWidth(int maxWidth) /*-{
	this.maxWidth=maxWidth;
}-*/;
	
	/**
	 * The minimum height to which the dialog can be resized, in pixels.  Default:150
	 * @param minHeight
	 */
	public final native void setMinHeight(int minHeight) /*-{
	this.minHeight=minHeight;
}-*/;
	
	/**
	 * The minimum width to which the dialog can be resized, in pixels. Default:150
	 * @param minWidth
	 */
	public final native void setMinWidth(int minWidth) /*-{
	this.minWidth=minWidth;
}-*/;
	
	/**
	 * If set to true, the dialog will have modal behavior; other items on the page will be disabled (i.e. cannot be interacted with). Modal dialogs create an overlay below the dialog but above other page elements.  Default:false
	 * @param modal
	 */
	public final native void setModal(boolean modal) /*-{
	this.modal=modal;
}-*/;
	
	/**
	 * Specifies where the dialog should be displayed using 'center', 'left', 'right', 'top', 'bottom'.    Default:'center'
	 * @param position
	 */
	public final void setPosition(ElementPosition position) {
		setPosition(position.name());
	}
	
	private final native void setPosition(String position) /*-{
	this.position=position;
}-*/;
	
	/**
	 * Specifies where the dialog should be displayed using x,y coordinate pair in pixel offset from left, top corner of viewport (e.g. [350,100])  Default:'center'
	 * @param left
	 * @param top
	 */
	public final native void setPosition(int left,int top) /*-{
	    this.position=[left,top];
}-*/;

	/**
	 * Specifies where the dialog should be displayed using x,y position string values (e.g. ['right','top'] for top right corner). Default:'center'
	 * @param firstPosition
	 * @param secondPosition
	 */
	public final void setPosition(ElementPosition firstPosition,ElementPosition secondPosition) {
		setPosition(firstPosition.name(),secondPosition.name());
	}
	
	private final native void setPosition(String firstPosition,String secondPosition) /*-{
	    this.position=[firstPosition,secondPosition];
}-*/;
	
	
	/**
	 * If set to true, the dialog will be resizeable. Default:true
	 * @param resizable
	 */
	public final native void setResizable(boolean resizable) /*-{
	this.resizable=resizable;
}-*/;
	
	/**
	 * The Easing effect to be used when the dialog is opened. Default:null
	 * @param easing
	 */
	public final void setShow(Easing easing) {
		setShow(easing.name());
	}

	/**
	 * The effect to be used when the dialog is opened. Default:null
	 * @param effect
	 */
	public final void setShow(Effect effect) {
		setShow(effect.name());
	}
	
	private final native void setShow(String show) /*-{
	this.show=show;
}-*/;
	
	/**
	 * Specifies whether the dialog will stack on top of other dialogs. This will cause the dialog to move to the front of other dialogs when it gains focus.  Default:true
	 * @param stack
	 */
	public final native void setStack(boolean stack) /*-{
	this.stack=stack;
}-*/;
	
	/**
	 * Specifies the title of the dialog. Any valid HTML may be set as the title. The title can also be specified by the title attribute on the dialog source element.  Default:''
	 * @param title
	 */
	public final native void setTitle(String title) /*-{
	this.title=title;
}-*/;
	
	/**
	 * The width of the dialog, in pixels. Default:300
	 * @param width
	 */
	public final native void setWidth(int width) /*-{
	this.width=width;
}-*/;
	
	public final native void setAutoWidth() /*-{
	this.width="auto";
}-*/;
	/**
	 * The starting z-index for the dialog.  Default:1000
	 * @param zIndex
	 */
	public final native void setZIndex(int zIndex) /*-{
	this.zIndex=zIndex;
}-*/;

	/**
	 * This event is triggered when a dialog attempts to close. If the beforeClose event handler (callback function) returns false, the close will be prevented.  Event type : dialogbeforeclose
	 * @param callback
	 */
	public final native void setBeforeCloseHandler(DialogUIEventResultHandler callback) /*-{
	this.beforeClose = function(event){
		    var currentJQuery = $wnd.jQuery(this);
		    return @com.xedge.jquery.ui.client.handlers.DialogUIEventResultHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DialogUIEventResultHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,event,currentJQuery);
	};
}-*/;	
	
	/**
	 * This event is triggered when dialog is opened. Event type : dialogopen
	 * @param callback
	 */
	public final native void setOpenHandler(DialogUIEventHandler callback) /*-{
	this.open = function(event){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.DialogUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DialogUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,event,currentJQuery);
	};
}-*/;	
	
	/**
	 * This event is triggered when the dialog gains focus. Event type : dialogfocus
	 * @param callback
	 */
	public final native void setFocusHandler(DialogUIEventHandler callback) /*-{
	this.focus = function(event){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.DialogUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DialogUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,event,currentJQuery);
	};
}-*/;	
	
	/**
	 * This event is triggered at the beginning of the dialog being dragged. Event type : dialogdragstart
	 * @param callback
	 */
	public final native void setDragStartHandler(DialogUIEventWithUIItemHandler callback) /*-{
	this.dragStart = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.DialogUIEventWithUIItemHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DialogUIEventWithUIItemHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DialogUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
	/**
	 * This event is triggered when the dialog is dragged. Event type : dialogdrag
	 * @param callback
	 */
	public final native void setDragHandler(DialogUIEventWithUIItemHandler callback) /*-{
	this.drag = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.DialogUIEventWithUIItemHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DialogUIEventWithUIItemHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DialogUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
	/**
	 * This event is triggered after the dialog has been dragged. Event type : dialogdragstop
	 * @param callback
	 */
	public final native void setDragStopHandler(DialogUIEventWithUIItemHandler callback) /*-{
	this.dragStop = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.DialogUIEventWithUIItemHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DialogUIEventWithUIItemHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DialogUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;	
	
	/**
	 * This event is triggered at the beginning of the dialog being resized.  Event type : dialogresizestart
	 * @param callback
	 */
	public final native void setResizeStartHandler(DialogUIEventWithUIItemHandler callback) /*-{
	this.resizeStart = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.DialogUIEventWithUIItemHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DialogUIEventWithUIItemHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DialogUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
	/**
	 * This event is triggered when the dialog is resized.  Event type : dialogresize
	 * @param callback
	 */
	public final native void setResizeHandler(DialogUIEventWithUIItemHandler callback) /*-{
	this.resize = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.DialogUIEventWithUIItemHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DialogUIEventWithUIItemHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DialogUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
	/**
	 * This event is triggered after the dialog has been resized. Event type : dialogresizestop
	 * @param callback
	 */
	public final native void setResizeStopHandler(DialogUIEventWithUIItemHandler callback) /*-{
	this.resizeStop = function(event,ui){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.DialogUIEventWithUIItemHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DialogUIEventWithUIItemHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;Lcom/xedge/jquery/ui/client/model/DialogUIEventValues;)(callback,event,currentJQuery,ui);
	};
}-*/;
	
	/**
	 * his event is triggered when the dialog is closed. Event type : dialogclose 
	 * @param callback
	 */
	public final native void setCloseHandler(DialogUIEventHandler callback) /*-{
	this.close = function(event){
		    var currentJQuery = $wnd.jQuery(this);
		    @com.xedge.jquery.ui.client.handlers.DialogUIEventHandler::fire(Lcom/xedge/jquery/ui/client/handlers/DialogUIEventHandler;Lcom/xedge/jquery/client/JQEvent;Lcom/xedge/jquery/ui/client/JQueryUI;)(callback,event,currentJQuery);
	};
}-*/;	
	
	
}
