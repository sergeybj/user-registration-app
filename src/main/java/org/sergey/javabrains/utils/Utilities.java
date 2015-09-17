package org.sergey.javabrains.utils;

import java.util.Map;

public class Utilities {

	public static String getParamValue(String paramName, Map<String, Object> map) {
		String[]array = (String[])map.get(paramName);
		return array[0];
	}

}
