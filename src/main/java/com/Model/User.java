package com.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;





@Entity
@Component
public class User implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	private String email;
	@Column
	private String name;
	@Column
	private String phone;
	@Column
	private String address;
	@Column
	private String password;
	@Column
	private String country;
	@Column
	private String gender;
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "User [email=" + email + ", name=" + name + ", phone=" + phone + ", address=" + address + ", password="
				+ password + ", country=" + country + ", gender=" + gender + "]";
	}
	
	
	
	
	}
	
