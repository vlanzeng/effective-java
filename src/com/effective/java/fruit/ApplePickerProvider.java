package com.effective.java.fruit;

class ApplePickerProvider implements FruitPickerProvider {
	
	static{
		FruitPickerServiceRegister.registe("cool.apple", new ApplePickerProvider());
	}
	
	@Override
	public FruitPicker getService() {
		return new ApplePicker();
	}

}
