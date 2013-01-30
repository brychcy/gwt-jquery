package com.xedge.jquery.ui.client.handlers;

import com.google.gwt.dom.client.Element;
	public abstract class ReturnElementHandler {
		public  abstract Element getValue();
		
		static public Element fire(ReturnElementHandler callback) {
			return callback.getValue();
		}
	}
