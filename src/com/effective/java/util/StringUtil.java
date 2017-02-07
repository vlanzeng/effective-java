package com.effective.java.util;

public class StringUtil {
	
	private  StringUtil() {
		throw new AssertionError("do not allowed instance");
	}
	
	public static String  structureString() {
		return "com.apple.com";
	}
	
	public static void main(String[] args) {
		String appleString = StringUtil.structureString();
		System.out.println(appleString);
		StringUtil stringUtil = new StringUtil();
		System.out.println(stringUtil);
	}
	
}
