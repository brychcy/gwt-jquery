package com.xedge.jquery.ui.client.handlers;

import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.ui.client.JQueryUI;

public abstract class ValidateDraggableHandler {
	public abstract boolean validate(JQuery droppableJQuery, JQueryUI draggableJQuery);

	static public boolean fire(ValidateDraggableHandler callback, JQueryUI droppableJQuery, JQueryUI draggableJQuery) {
		return callback.validate(droppableJQuery, draggableJQuery);
	}
}
