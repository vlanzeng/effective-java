package com.effective.java.create;

public class WrongLongObjectCreateTest {
	
	public static void main(String[] args) {
		Long sum =0L;
		for(long i =0L;i<Integer.MAX_VALUE;i++){
			sum+=i;
		}
		System.out.println(sum);
	}
	
}
