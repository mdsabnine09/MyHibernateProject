package com.caps.dev.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person_info")
public class Person {
	@Id @Column(name="person_id")
	private int perId;
	
	@Column(name="person_name")
	private String name;
	
	@Column(name="person_email")
	private String email;
	
	@Column(name="person_age")
	private int age;
	
	@Column(name="person_add")
	private String address;
	
	public int getPerId() {
		return perId;
	}
	public void setPerId(int perId) {
		this.perId = perId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Person [empId=" + perId + ", name=" + name + ", email=" + email + ", address=" + address + ", age="
				+ age + "]";
	}
	
	
}