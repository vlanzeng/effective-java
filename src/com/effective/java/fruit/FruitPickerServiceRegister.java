package com.effective.java.fruit;

import java.util.Map;
import java.util.HashMap;

/**
 *
 * 水果采摘器注册服务
 *
 */
public class FruitPickerServiceRegister {
	
	private static final Map<String,FruitPickerProvider> registedServices = new HashMap<String,FruitPickerProvider>();
	
	private  FruitPickerServiceRegister(){
		
	}
	
	public static void  registe(String serviceName,FruitPickerProvider fruitPicker) {
		registedServices.put(serviceName, fruitPicker);
	}
	
	public static  FruitPicker  getService(String serviceName) {
		FruitPickerProvider  fruitPickerProvider = registedServices.get(serviceName);
		if(fruitPickerProvider == null){
			throw new IllegalArgumentException("No provider registered with name:" + serviceName);
		}
		return (fruitPickerProvider.getService());
	}
	
	
}
