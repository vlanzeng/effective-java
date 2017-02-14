package com.effective.java.constant;

public enum Operation {
	
	PLUS {double apply(double x,double y){return x+y;}},
	MINUS {double apply(double x,double y){return x-y;}},
	TIMES {double apply(double x,double y){return x*y;}},
	DIVIDE {double apply(double x,double y){return x*y;}};
	
	abstract double apply(double x,double y);
	
	public static void main(String[] args) {
		double x =1;
		double y=3;
		double plusResult  = Operation.PLUS.apply(x, y);
		double minusResult = Operation.MINUS.apply(x, y);
		double timeResult  = Operation.TIMES.apply(x, y);
		double divideResult = Operation.DIVIDE.apply(x, y);
		System.out.println(plusResult);
		System.out.println(minusResult);
		System.out.println(timeResult);
		System.out.println(divideResult);
	}
	
}
