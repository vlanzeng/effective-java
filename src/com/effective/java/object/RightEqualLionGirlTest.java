package com.effective.java.object;

public class RightEqualLionGirlTest {
	
	public static void main(String[] args) {
		RightEqualLionGirl  emptyGirl = new RightEqualLionGirl(); 
		RightEqualLionGirl  fullGirl  = new RightEqualLionGirl();
		System.out.println(emptyGirl.equals(fullGirl));
		System.out.println(fullGirl.equals(emptyGirl));
		fullGirl.setName("Ana");
		fullGirl.setColor("green");
		fullGirl.setAge(14);
		System.out.println(emptyGirl.equals(fullGirl));
		System.out.println(fullGirl.equals(emptyGirl));
		RightEqualLionGirl  thirtyYearsOldAna  = new RightEqualLionGirl();
		thirtyYearsOldAna.setName("Ana");
		thirtyYearsOldAna.setAge(14);
		thirtyYearsOldAna.setColor("green");
		System.out.println(thirtyYearsOldAna.equals(fullGirl));
		System.out.println(fullGirl.equals(thirtyYearsOldAna));
	}
	
}
