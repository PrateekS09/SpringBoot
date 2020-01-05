package com.restservice.model;

public class Student {
	
	
	String name;
	Integer age;
	String registrationNumber;
	
	public Student(String name, Integer age, String registrationNumber) {
		super();
		this.name = name;
		this.age = age;
		this.registrationNumber = registrationNumber;
	}
	
	
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
	public String getRegistrationNumber() {
		return registrationNumber;
	}
	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

}
