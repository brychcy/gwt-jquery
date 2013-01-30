package com.xedge.jquery.client.handlers;

import com.xedge.jquery.client.model.CoOrdinates;


	public abstract class OffsetHandler {
		public  abstract CoOrdinates getValue(int index,CoOrdinates originalCoOrdinates);
		
		static public CoOrdinates fire(OffsetHandler callback,int index,CoOrdinates originalCoOrdinates){
			return callback.getValue(index, originalCoOrdinates);
		}
	}
