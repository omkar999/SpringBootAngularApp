package com.myapp.entities;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "user")
public class User {

	String name;
	String city;

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
