package com.effective.java.collection;

import java.util.HashMap;

public class MapCreater {
	
	public static <K,V> HashMap<K,V> newInstance() {
		return new HashMap<K,V>();
	}
	
}
