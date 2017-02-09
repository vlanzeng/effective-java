package com.effective.java.object;

public class InstanceOfTest {
	
	class Shape {
		
	}
	
	class Square extends Shape{
		
	}
	
	class Rectangle extends Square {
		
	}
	
	public static void main(String args[]) {
		InstanceOfTest instanceOfTest = new InstanceOfTest();
		InstanceOfTest.Rectangle  rectangle =  instanceOfTest.new Rectangle();
		boolean isShape = rectangle instanceof Shape;
		boolean isSquare = rectangle instanceof Square;
		boolean isRectangle = rectangle instanceof Rectangle;
		System.out.println("我属于几何类吗:"+isShape);
		System.out.println("我属于正方形吗:"+isSquare);
		System.out.println("我属于长方形吗:"+isRectangle);
	}
	
}
