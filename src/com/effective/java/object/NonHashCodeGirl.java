package com.effective.java.object;

public class NonHashCodeGirl {
	
	private String name;
	private Integer age;
	private String  color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj==this){
			return true;
		}
		if(!(obj instanceof NonHashCodeGirl)){
			return false;
		}
		NonHashCodeGirl  nonHashCodeGirl = (NonHashCodeGirl) obj;
		return nonHashCodeGirl.age==this.age&&nonHashCodeGirl.color==this.color&&nonHashCodeGirl.name==this.name;
	}
	
	
}
