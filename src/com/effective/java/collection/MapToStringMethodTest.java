package com.effective.java.collection;

import java.util.Map;
import java.util.HashMap;

public class MapToStringMethodTest {
	
	public static void main(String[] args) {
		Map<Object,Object> map = new HashMap<Object, Object>();
		map.put(map, map);
		System.out.println(map);
	}
	
}
