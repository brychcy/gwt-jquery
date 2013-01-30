package com.xedge.jquery.client.handlers;

import com.xedge.jquery.client.JQuery;


public abstract class ValidateItemHandler {
	public abstract boolean validate(int index,JQuery currentJQuery);
	static public boolean fire(ValidateItemHandler callback,int index,JQuery currentJQuery) {
		 return callback.validate(index,currentJQuery);
	}
}

