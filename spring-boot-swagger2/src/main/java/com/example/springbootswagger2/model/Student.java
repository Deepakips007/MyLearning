package com.example.springbootswagger2.model;

import org.springframework.beans.factory.annotation.Value;

import io.swagger.annotations.ApiModelProperty;

public class Student {
	@ApiModelProperty(notes = "Name of the Student by dkss",name="name",required=true,value="test name")
	private String name;
	@ApiModelProperty(notes = "Class of the Student",name="cls",required=true,value="test class")
	private String cls;
	@ApiModelProperty(notes = "Country of the Student",name="country",required=true,value="test country")
	private String country;


	@Value("${custom.value}")
	private  String customVal;
	
	public Student(String name, String cls, String country) {
		super();
		this.name = name;
		this.cls = cls;
		this.country = country;
		System.out.println("Reading value from property file  : - "+customVal);
	}

	public String getName() {
		return name;
	}

	public String getCls() {
		return cls;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", cls=" + cls + ", country=" + country + "]";
	}
	
}
