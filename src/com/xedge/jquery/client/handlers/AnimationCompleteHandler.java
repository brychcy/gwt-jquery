package com.xedge.jquery.client.handlers;

import com.xedge.jquery.client.JQuery;

public abstract class AnimationCompleteHandler {
	public abstract void complete(JQuery currentJQuery);
	static public void fire(AnimationCompleteHandler callback,JQuery currentJQuery) {
		 callback.complete(currentJQuery);
	}
}


