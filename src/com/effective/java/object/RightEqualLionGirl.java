package com.effective.java.object;

public class RightEqualLionGirl {
	
	private String name;
	private String color;
	private Integer age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public RightEqualLionGirl(){
		
	}
	
	@Override
	public boolean equals(Object obj){
		if(obj==this){
			return true;
		}
		if(!(obj instanceof RightEqualLionGirl)){
			return false;
		}
		RightEqualLionGirl  rightEqualLionGirl = (RightEqualLionGirl) obj;
		return rightEqualLionGirl.age==this.age&&rightEqualLionGirl.color==this.color&&rightEqualLionGirl.name==this.name;
	}
	
}
