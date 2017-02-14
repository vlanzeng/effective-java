package com.effective.java.concurrency;


public class TryFinallyReturnTest {
	
	@SuppressWarnings("finally")
	public int   tryTest() {
		int result = 0;
		try{
			result =1;
			return result;
		}catch(Exception e) {
			result =2;
			return result;
		}finally{
			result =3;
			return result;
		}
	}
	
	public static void main(String[] args) {
		TryFinallyReturnTest  tryTest = new TryFinallyReturnTest();
		int result = tryTest.tryTest();
		System.out.println(result);
	}
	
}
