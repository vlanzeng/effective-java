package com.effective.java.generic;

import java.util.List;
import java.util.ArrayList;

public class OriginalArrayWithCompareTest {
	
	
	public static void main(String[] args) {
		Object[]  originalArray = new Object[20];
		originalArray[0]   =  "hello,world";
		// won't compile
		List<Object>   genericList = new ArrayList<Long>();//Incompatible types
		genericList.add("hello,i was wrong");
	}
	
}
