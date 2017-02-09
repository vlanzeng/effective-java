package com.effective.java.object;

import java.util.HashMap;
import java.util.Map;

public class NonHashCodeGirlTest {
	
	public static void main(String[] args) {
		NonHashCodeGirl  nonHashCodeGirl = new NonHashCodeGirl();
		NonHashCodeGirl  sameNonHashCodeGirl = new NonHashCodeGirl();
		Map<NonHashCodeGirl, String> nonHashCodeGirls = new HashMap<NonHashCodeGirl,String>();
		nonHashCodeGirls.put(nonHashCodeGirl, "nonHashCodeGirl");
		System.out.println(nonHashCodeGirls.get(sameNonHashCodeGirl));
	}
	
}
