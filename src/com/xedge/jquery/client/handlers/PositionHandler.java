package com.xedge.jquery.client.handlers;

import com.xedge.jquery.client.JQuery;
import com.xedge.jquery.client.model.CoOrdinates;

	public abstract class PositionHandler {
		public abstract void setPosition(JQuery currentJQuery, CoOrdinates coOrdinates);
		
		static public void fire(PositionHandler callback,JQuery currentJQuery,CoOrdinates coOrdinates) {
			 callback.setPosition(currentJQuery,coOrdinates);
		}
	}
	