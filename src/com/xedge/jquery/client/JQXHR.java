package com.xedge.jquery.client;

import com.xedge.jquery.client.handlers.CompleteHandler;
import com.xedge.jquery.client.handlers.ErrorHandler;
import com.xedge.jquery.client.handlers.SuccessHandlerWithDataStatusJQXHR;

public class JQXHR extends Deferred {

	protected JQXHR() {
	}

	  /**
	   * Gets all the HTTP response headers, as a single string.
	   * <p>
	   * See <a href="http://www.w3.org/TR/XMLHttpRequest/#getallresponseheaders"
	   * >http://www.w3.org/TR/XMLHttpRequest/#getallresponseheaders</a>.
	   * 
	   * @return the response headers.
	   */
	  public final native String getAllResponseHeaders() /*-{
	    return this.getAllResponseHeaders();
	  }-*/;

	  /**
	   * Gets an HTTP response header.
	   * <p>
	   * See <a href="http://www.w3.org/TR/XMLHttpRequest/#getresponseheader"
	   * >http://www.w3.org/TR/XMLHttpRequest/#getresponseheader</a>.
	   * 
	   * @param header the response header to be retrieved
	   * @return the header value
	   */
	  public final native String getResponseHeader(String header) /*-{
	    return this.getResponseHeader(header);
	  }-*/;

	  /**
	   * Gets the response text.
	   * <p>
	   * See <a href="http://www.w3.org/TR/XMLHttpRequest/#responsetext"
	   * >http://www.w3.org/TR/XMLHttpRequest/#responsetext</a>.
	   * 
	   * @return the response text
	   */
	  public final native String getResponseText() /*-{
	    return this.responseText;
	  }-*/;
	  
	  /**
	   * Gets the response xml.
	   * @return
	   */
	  public final native String getResponseXML() /*-{
	    return this.responseXML;
	  }-*/;
	   

	  /**
	   * Get's the current ready-state.
	   * <p>
	   * See <a href="http://www.w3.org/TR/XMLHttpRequest/#readystate"
	   * >http://www.w3.org/TR/XMLHttpRequest/#readystate</a>.
	   * 
	   * @return the ready-state constant
	   */
	  public final native int getReadyState() /*-{
	    return this.readyState;
	  }-*/;

	  /**
	   * Gets the status code.
	   * <p>
	   * See <a href="http://www.w3.org/TR/XMLHttpRequest/#status"
	   * >http://www.w3.org/TR/XMLHttpRequest/#status</a>.
	   * 
	   * @return the status code
	   */
	  public final native int getStatus() /*-{
	    return this.status;
	  }-*/;

	  /**
	   * Gets the status text.
	   * <p>
	   * See <a href="http://www.w3.org/TR/XMLHttpRequest/#statustext"
	   * >http://www.w3.org/TR/XMLHttpRequest/#statustext</a>.
	   * 
	   * @return the status text
	   */
	  public final native String getStatusText() /*-{
	    return this.statusText;
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
	 * A function to be called if the request fails. The arguments: The JQXHR object, a string describing the type of error that occurred. Possible values for the second argument (besides null) are "timeout", "error", "notmodified" and "parsererror
	 * 
	 * @param callback
	 */
	public final native void setErrorHandler(ErrorHandler callback) /*-{
		this.error = function(jqXHR,textStatus) {
			return @com.xedge.jquery.client.handlers.ErrorHandler::fire(Lcom/xedge/jquery/client/handlers/ErrorHandler;Ljava/lang/String;Lcom/xedge/jquery/client/JQXHR;)(callback,textStatus,jqXHR);
		};
	}-*/;
	
	  /**
	   * Aborts the current request.
	   * <p>
	   * See <a href="http://www.w3.org/TR/XMLHttpRequest/#abort"
	   * >http://www.w3.org/TR/XMLHttpRequest/#abort</a>.
	   */
	  public final native void abort() /*-{
	    this.abort();
	  }-*/;
	  
	  /**
	   * Sets a request header.
	   * <p>
	   * See <a href="http://www.w3.org/TR/XMLHttpRequest/#setrequestheader"
	   * >http://www.w3.org/TR/XMLHttpRequest/#setrequestheader</a>.
	   * 
	   * @param header the header to be set
	   * @param value the header's value
	   */
	  public final native void setRequestHeader(String header, String value) /*-{
	    this.setRequestHeader(header, value);
	  }-*/;
	  
}
