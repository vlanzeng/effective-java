package com.effective.java.object;

import java.util.List;
import java.util.ArrayList;

public class LionGirlNonEqualsTest {
	
	public static void main(String[] args) {
		NonSelfEqualLionGirl  lionGirl = new NonSelfEqualLionGirl();
		List<NonSelfEqualLionGirl> lionGirls = new ArrayList<>();
		lionGirls.add(lionGirl);
		System.out.println(lionGirls.contains(lionGirl));
	}
	
}
