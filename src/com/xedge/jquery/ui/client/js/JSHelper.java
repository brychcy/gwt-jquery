package com.xedge.jquery.ui.client.js;

import com.xedge.jquery.client.js.JavaScriptIntegerArray;
import com.xedge.jquery.ui.client.model.RegionCoOrdinates;

public class JSHelper extends com.xedge.jquery.client.js.JSHelper {

	
	public static final JavaScriptIntegerArray convertRegionCoOrdinatesToJSArray(RegionCoOrdinates regionCoOrdinates){
		JavaScriptIntegerArray array = JavaScriptIntegerArray.create();
		if(regionCoOrdinates!=null){
		if(regionCoOrdinates.getX1()>=0){
			array.push(regionCoOrdinates.getX1());
		}
		if(regionCoOrdinates.getY1()>=0){
			array.push(regionCoOrdinates.getY1());
		}	
		
		if(regionCoOrdinates.getX2()>=0){
			array.push(regionCoOrdinates.getX2());
		}
		if(regionCoOrdinates.getY2()>=0){
			array.push(regionCoOrdinates.getY2());
		}		
		}
		return array;
	}

	public static final RegionCoOrdinates convertJSArrayToRegionCoOrdinates(JavaScriptIntegerArray array){
		RegionCoOrdinates regionCoOrdinates = null;
		if(array!=null){
		if(array.length()>=2){
			regionCoOrdinates = new RegionCoOrdinates(array.get(0), array.get(1), array.get(2), array.get(3));
		}
		}
		return regionCoOrdinates;
	}
}
