package com.dvsapp.login.dto;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class UserJsonPojo {

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Long getPhNumber() {
		return phNumber;
	}

	public void setPhNumber(Long phNumber) {
		this.phNumber = phNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	private Integer id;
	private String name;
	private String address;
	private Long phNumber;
	private String email;
	private String password;
	private String confirmPassword;

	@Value("${input.json.obj}")
	private String jsonProperties ;
	
	
	
	public String getJsonProperties() {
		return jsonProperties;
	}

	public void setJsonProperties(String jsonProperties) {
		this.jsonProperties = jsonProperties;
	}

	@Override
	public String toString() {
		return "UserJsonPojo [id=" + id + ", name=" + name + ", address=" + address + ", phNumber=" + phNumber
				+ ", email=" + email + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}

	
	
}
