package com.effective.java.fruit.test;

import com.effective.java.fruit.FruitPicker;
import com.effective.java.fruit.FruitPickerServiceRegister;

public class FruitPickerTest {
	
	
	public static void main(String[] args) {
		try {
			Class.forName("com.effective.java.fruit.GrapePickerProvider");
			Class.forName("com.effective.java.fruit.ApplePickerProvider");
			FruitPicker fruitPicker = FruitPickerServiceRegister.getService("cool.Grape");
			fruitPicker.pick();
			fruitPicker = FruitPickerServiceRegister.getService("cool.apple");
			fruitPicker.pick();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
}
