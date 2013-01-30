package com.xedge.jquery.client.handlers;

public abstract class CommandHandler {
	public abstract void execute();
	static public void fire(CommandHandler callback) {
		 callback.execute();
	}
}