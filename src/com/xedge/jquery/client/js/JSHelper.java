package com.xedge.jquery.client.js;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsDate;
import com.google.gwt.json.client.JSONObject;
import com.google.gwt.json.client.JSONString;
import com.xedge.jquery.client.model.XYCoOrdinates;
public class JSHelper {

	public static final JSONObject convertStringMapToJSONObject(Map<String,String> map){
		JSONObject parameter = new JSONObject();
		if(map!=null){
		for (String key : map.keySet()) {
			String value = map.get(key);
			parameter.put(key, new JSONString(value));
		}
		}
		return parameter;
	}
	
	public static final <T extends JavaScriptObject> JavaScriptObjectArray<T> convertObjectListToJSArray(List<T> list){
		JavaScriptObjectArray<T> array = JavaScriptObjectArray.create();
		if(list!=null){
		for (T t : list) {
			array.push(t);
		}
		}
		return array;
	}
	
	public static final <T extends JavaScriptObject> JavaScriptObjectArray<T> convertObjectArrayToJSArray(T[] list){
		JavaScriptObjectArray<T> array = JavaScriptObjectArray.create();
		if(list!=null){
		for (T t : list) {
			array.push(t);
		}
		}
		return array;
	}
	
	public static final <T extends JavaScriptObject> List<T> convertJSArrayToObjectList(JavaScriptObjectArray<T> array){
		List<T> list = new ArrayList<T>();
		if(array!=null){
		for (int i = 0; i < array.length(); i++) {
			T t = array.get(i);
			list.add(t);
		}
		}
		return list;
	}
	
	public static final JavaScriptStringArray convertStringListToJSArray(List<String> list){
		JavaScriptStringArray array = JavaScriptStringArray.create();
		if(list!=null){
		for (String t : list) {
			array.push(t);
		}
		}
		return array;
	}
	
	public static final List<String> convertJSArrayToStringList(JavaScriptStringArray array){
		List<String> list = new ArrayList<String>();
		if(array!=null){
		for (int i = 0; i < array.length(); i++) {
			String t = array.get(i);
			list.add(t);
		}
		}
		return list;
	}
	
	
	public static final Map<String,String> convertJSONObjectToStringMap(JSONObject jsonObject){
		Map<String,String> parameter = new HashMap<String, String>();
		if(jsonObject!=null){
		for (String key : jsonObject.keySet()) {
			String value = jsonObject.get(key).toString();
			parameter.put(key,value);
		}
		}
		return parameter;
	}
	
	


public static final JavaScriptIntegerArray convertIntegerListToJSArray(List<Integer> list){
	JavaScriptIntegerArray array = JavaScriptIntegerArray.create();
	if(list!=null){
	for (Integer t : list) {
		array.push(t);
	}
	}
	return array;
}

public static final JavaScriptIntegerArray convertIntegerArrayToJSArray(Integer[] list){
	JavaScriptIntegerArray array = JavaScriptIntegerArray.create();
	if(list!=null){
	for (Integer t : list) {
		array.push(t);
	}
	}
	return array;
}

public static final JavaScriptStringArray convertStringArrayToJSArray(String[] list){
	JavaScriptStringArray array = JavaScriptStringArray.create();
	if(list!=null){
	for (String t : list) {
		array.push(t);
	}
	}
	return array;
}

public static final List<Integer> convertJSArrayToIntegerList(JavaScriptIntegerArray array){
	List<Integer> list = new ArrayList<Integer>();
	if(array!=null){
	for (int i = 0; i < array.length(); i++) {
		Integer t = array.get(i);
		list.add(t);
	}
	}
	return list;
}
	

 public static final JavaScriptIntegerArray convertXYCoOrdinatesToJSArray(XYCoOrdinates xyCoOrdinates){
	JavaScriptIntegerArray array = JavaScriptIntegerArray.create();
	if(xyCoOrdinates!=null){
	if(xyCoOrdinates.getX()>=0){
		array.push(xyCoOrdinates.getX());
	}
	if(xyCoOrdinates.getY()>=0){
		array.push(xyCoOrdinates.getY());
	}
	}
	return array;
}

public static final XYCoOrdinates convertJSArrayToXYCoOrdinates(JavaScriptIntegerArray array){
	XYCoOrdinates xyCoOrdinates = null;
	if(array!=null){
	if(array.length()>=2){
		xyCoOrdinates = new XYCoOrdinates(array.get(0), array.get(1));
	}
	}
	return xyCoOrdinates;
}



public static final Date convertJsDateToDate(JsDate jsDate){
	Date date = null;
	if(jsDate!=null){
	long longValue = Double.valueOf(jsDate.getTime()).longValue();
	date = new Date(longValue);
	}
    return date;
}

public static final JsDate convertDateToJsDate(Date date){
	JsDate jsDate = null;
	if(date!=null){
	double doubleValue = Long.valueOf(date.getTime()).doubleValue();
	jsDate = JsDate.create(doubleValue);
	}
    return jsDate;
}

public static String convertStringArrayToString(String[] array) {
	StringBuffer result = new StringBuffer();
	for (String value : array) {
		result.append(value);
		result.append(" ");
	}
	return result.toString();
}
}
