package com.effective.java.basictype;

public class BaseTypeOverflowTest {
	
	public static void main(String[] args) {
		/*char是无符号数，16位存储，表示范围是0～2^16-1（即0～65535）*/
		char ch = Character.MAX_VALUE; // ch为65535
		System.out.println(ch);
		ch += (char) 1; // 加1后，引起数据溢出，则ch为0
		System.out.println(ch);
		/*int是有符号数，32位存储，表示范围是－2^31~2^31-1（即－2147483648～2147483647）*/
		int i = Integer.MAX_VALUE; // i为2147483647
		System.out.println(i);
		i += 1; // 加1后，引起数据溢出，则i为－2147483648
		System.out.println(i);
		int negativeNum = -1;
		System.out.println(Integer.toBinaryString(negativeNum));
		int positiveNum = 1;
		System.out.println(Integer.toBinaryString(positiveNum));
		
		
	}
	
}
