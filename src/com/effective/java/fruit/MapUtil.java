package com.effective.java.fruit;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class MapUtil {
		
	public static <K,V> HashMap<K,V> newInstance() {
		return new HashMap<K,V>();
	}
	
	public static void main(String[] args) {
		Map<String,List<String>> map = MapUtil.newInstance();
		List<String>  goList = new ArrayList<String>();
		map.put("go", goList);
	}
	
}
