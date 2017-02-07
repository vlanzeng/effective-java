package com.effective.java.fruit;

public class GrapePickerProvider implements FruitPickerProvider {
    
	static{
		FruitPickerServiceRegister.registe("cool.Grape", new GrapePickerProvider());
	}
	
	@Override
	public FruitPicker getService() {
		return new GrapePicker();
	}

}
