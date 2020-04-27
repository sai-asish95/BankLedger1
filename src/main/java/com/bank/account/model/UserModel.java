package com.bank.account.model;

import java.util.List;

public class UserModel {
	private String firstName;
    private String lastName;
    private String address;
    private List<Integer> phnum;
    private String loginName;
	
    
    public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public List<Integer> getPhnum() {
		return phnum;
	}
	public void setPhnum(List<Integer> phnum) {
		this.phnum = phnum;
	}
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	@Override
	public String toString() {
		return "UserModel [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", phnum="
				+ phnum + ", loginName=" + loginName + "]";
	}
	
	
	

}
