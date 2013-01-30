package com.xedge.jquery.client;

import java.util.List;

import com.google.gwt.core.client.JavaScriptObject;
import com.xedge.jquery.client.handlers.CommandFunction;
import com.xedge.jquery.client.handlers.CommandHandler;
import com.xedge.jquery.client.js.JSHelper;

/**
 * Chainable utility object that can register multiple callbacks into callback queues, invoke callback queues, and relay the success or failure state of any synchronous or asynchronous function.
 * Note that a Deferred object can be in one of three states: unresolved, resolved, or rejected; use deferred.isResolved() to determine whether the Deferred object is in the resolved state.
 * @author osaharri
 * 
 */
public class Deferred extends JavaScriptObject {
	
	public enum DeferredState {
		pending, resolved, rejected
	}

	protected Deferred() {
	}

	public static native Deferred create() /*-{
		return $wnd.jQuery.Deferred();
	}-*/;
	
	/**
	 * Add a handler to be called when the Deferred object is either resolved or rejected.
	 * @param callback
	 * @return
	 */
	public final native Deferred setAlwaysHandler(CommandHandler callback) /*-{
		return this.always(function() {
			    @com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(callback);
			 });
	}-*/;
	
	private final native JQuery setAlwaysHandlers(JavaScriptObject handlers) /*-{
	return this.always(handlers);
}-*/;
	
	/**
	 * Add handlers to be called when the Deferred object is either resolved or rejected.
	 * @param callback
	 * @return
	 */
	public final JQuery setAlwaysHandlers(List<CommandFunction> handlers) {
		return setAlwaysHandlers(JSHelper.convertObjectListToJSArray(handlers));
	}
	 
	/**
	 * Add a handler to be called when the Deferred object is resolved.
	 * @param callback
	 * @return
	 */
	public final native Deferred setDoneHandler(CommandHandler callback) /*-{
		return this.done(function() {
			    @com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(callback);
			 });
	}-*/;
	
	private final native JQuery setDoneHandlers(JavaScriptObject handlers) /*-{
	return this.done(handlers);
}-*/;
	
	/**
	 * Add handlers to be called when the Deferred object is resolved.
	 * @param callback
	 * @return
	 */
	public final JQuery setDoneHandlers(List<CommandFunction> handlers) {
		return setDoneHandlers(JSHelper.convertObjectListToJSArray(handlers));
	}
	

private final native JQuery setProgressHandlers(JavaScriptObject handlers) /*-{
	return this.progress(handlers);
}-*/;
	
	/**
	 * Add handlers to be called when the Deferred object generates progress notifications.
	 * @param callback
	 * @return
	 */
	public final JQuery setProgressHandlers(List<CommandFunction> handlers) {
		return setProgressHandlers(JSHelper.convertObjectListToJSArray(handlers));
	}
	
	/**
	 * Add a handler to be called when the Deferred object is rejected.
	 * @param callback
	 * @return
	 */
	public final native Deferred setFailHandler(CommandHandler callback) /*-{
	return this.fail(function() {
		    @com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(callback);
		 });
}-*/;
	
	private final native JQuery setFailHandlers(JavaScriptObject handlers) /*-{
	return this.fail(handlers);
}-*/;
	/**
	 * Add handlers to be called when the Deferred object is rejected.
	 * @param callback
	 * @return
	 */
	public final JQuery setFailHandlers(List<CommandFunction> handlers) {
		return setFailHandlers(JSHelper.convertObjectListToJSArray(handlers));
	}
	/**
	 * Determine whether a Deferred object has been rejected.
	 * Returns true if the Deferred object is in the rejected state, meaning that either deferred.reject() or deferred.rejectWith() has been called for the object and the failCallbacks have been called (or are in the process of being called).
	 * @return
	 */
	public final native boolean isRejected() /*-{
	return this.isRejected();
}-*/;
	
	/**
	 * Determine whether a Deferred object has been resolved.
	 * Returns true if the Deferred object is in the resolved state, meaning that either deferred.resolve() or deferred.resolveWith() has been called for the object and the doneCallbacks have been called (or are in the process of being called).
	 * @return
	 */
	public final native boolean isResolved() /*-{
	return this.isResolved();
}-*/;
	
	/**
	 * Reject a Deferred object and call any failCallbacks.
	 * @return
	 */
	public final native Deferred reject() /*-{
	return this.reject();
}-*/;
	
	/**
	 * Reject a Deferred object and call any failCallbacks with the given context.
	 * @return
	 */
	public final native Deferred rejectWith() /*-{
	return this.rejectWith(this);
}-*/;
	
	/**
	 * Resolve a Deferred object and call any doneCallbacks.
	 * @return
	 */
	public final native Deferred resolve() /*-{
	return this.resolve();
}-*/;
	
	/**
	 * Resolve a Deferred object and call any doneCallbacks with the given context.
	 * @return
	 */
	public final native Deferred resolveWith() /*-{
	return this.resolveWith(this);
}-*/;
	
	/**
	 * Add handlers to be called when the Deferred object is resolved or rejected.
	 * @param doneCallback
	 * @param failCallback
	 * @return
	 */
	public final native Deferred setThenHandler(CommandHandler doneCallback, CommandHandler failCallback) /*-{
	return this.then(
	  function () {
	  	@com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(doneCallback);
	  },
	  function () {
	  	@com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(failCallback);
	  }
	);
}-*/;
	
	
	/**
	 * Add handlers to be called when the Deferred object is resolved or rejected.
	 * @param doneCallback  An optional function that is called when the Deferred is resolved.
	 * @param failCallback  An optional function that is called when the Deferred is rejected.
	 * @param progressCallback An optional function that is called when the Deferred notifies progress.
	 * @return
	 */
	public final native Deferred setThenHandler(CommandHandler doneCallback, CommandHandler failCallback,CommandHandler progressCallback) /*-{
	return this.then(
	  function () {
	    @com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(doneCallback);
	  },
	  function () {
	    @com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(failCallback);
	  },
	  function () {
	    @com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(progressCallback);
	  }
	);
}-*/;
	
	/**
	 * Utility method to filter and/or chain Deferreds.
	 * @param doneCallback  An optional function that is called when the Deferred is resolved.
	 * @param failCallback  An optional function that is called when the Deferred is rejected.
	 * @return
	 */
	public final native Deferred setPipeHandler(CommandHandler doneCallback, CommandHandler failCallback) /*-{
	return this.pipe(
	  function () {
	    @com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(doneCallback);
	  },
	  function () {
	    @com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(failCallback);
	  }
	);
}-*/;

	/**
	 * Utility method to filter and/or chain Deferreds.
	 * @param doneCallback  An optional function that is called when the Deferred is resolved.
	 * @param failCallback  An optional function that is called when the Deferred is rejected.
	 * @param progressCallback An optional function that is called when the Deferred notifies progress.
	 * @return
	 */
	public final native Deferred setPipeHandler(CommandHandler doneCallback, CommandHandler failCallback, CommandHandler progressCallback) /*-{
	return this.pipe(
	  function () {
	    @com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(doneCallback);
	  },
	  function () {
	  	@com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(failCallback);
	  },
	  function () {
	  	@com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(progressCallback);
	  }
	);
}-*/;
	
	/**
	 * Utility method to filter and/or chain Deferreds.
	 * @param doneCallback
	 * @return
	 */
	public final native Deferred setPipeHandler(CommandHandler doneCallback) /*-{
	return this.pipe(
	  function () {
	    @com.xedge.jquery.client.handlers.CommandHandler::fire(Lcom/xedge/jquery/client/handlers/CommandHandler;)(doneCallback);
	  }
	);
}-*/;
	
	/**
	 * Call the progressCallbacks on a Deferred object with the given args.
	 */
	public final native Deferred notify1() /*-{
	return this.notify();
}-*/;
	

	/**
	 * Call the progressCallbacks on a Deferred object.
	 * 
	 * @param args Optional arguments that are passed to the progressCallbacks.
	 * @return
	 */
	public final native Deferred notify(JavaScriptObject args) /*-{
	return this.notify(args);
}-*/;
	
	
	
	/**
	 * Call the progressCallbacks on a Deferred object with the given context.
	 */
	public final native Deferred notifyWith() /*-{
	return this.notifyWith(this);
}-*/;
	

	/**
	 * Call the progressCallbacks on a Deferred object with the given context and args.
	 * @param args Optional arguments that are passed to the progressCallbacks.
	 * @return
	 */
	public final native Deferred notifyWith(JavaScriptObject args) /*-{
	return this.notifyWith(this,args);
}-*/;
	

	/**
	 * Determine the current state of a Deferred object.
	 * @return "pending","resolved","rejected"
	 */
	public final DeferredState state(){
	return DeferredState.valueOf(this.stateJS());
    };
	
	private final native String stateJS() /*-{
	return this.state();
}-*/;

}
