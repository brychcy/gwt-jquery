package com.xedge.jquery.ui.client.handlers;
import com.xedge.jquery.ui.client.JQueryUI;
	public abstract class ExecuteCurrentUIHandler {
		public abstract void execute(JQueryUI currentJQuery);
		
		static public void fire(ExecuteCurrentUIHandler callback,JQueryUI currentJQuery) {
			 callback.execute(currentJQuery);
		}
	}