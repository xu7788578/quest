package com.test.entity;

import java.io.Serializable;

public class UserEntity implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5564043738023640919L;
	private int id;
	private int userName;
	private int sex;
	private int age;
	private int address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserName() {
		return userName;
	}

	public void setUserName(int userName) {
		this.userName = userName;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}

}
