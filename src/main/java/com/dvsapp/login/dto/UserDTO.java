package com.dvsapp.login.dto;

import java.io.Serializable;

public class UserDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name;
	private String address;
	private Long phNumber;
	private String email;
	private String password;
	private String confirmPassword;

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

	@Override
	public String toString() {
		return "UserDTO [id=" + id + ", name=" + name + ", address=" + address + ", phNumber=" + phNumber + ", email="
				+ email + ", password=" + password + ", confirmPassword=" + confirmPassword + "]";
	}

}
