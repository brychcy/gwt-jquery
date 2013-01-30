package com.xedge.jquery.client.handlers;
public abstract class ValidateHandler {
	public abstract boolean validate();

	static public boolean fire(ValidateHandler callback) {
		return callback.validate();
	}
}
