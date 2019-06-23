package com.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_acc")

public class CustomerMetaData {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	private String name;
	private String gender;
	private long mobileNo;
	private Address user_add;
	
	
public CustomerMetaData() {
}
	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public long getMobileNo() {
		return mobileNo;
	}


	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public Address getUser_add() {
		return user_add;
	}
	public void setUser_add(Address user_add) {
		this.user_add = user_add;
	}


	@Override
	public String toString() {
		return "UserAccount [id=" + id + ", name=" + name + ", gender=" + gender + ", mobileNo=" + mobileNo
				+ ", user_add=" + user_add + "]";
	}


	public class Address {
		String buildingNo;
		String apartmentName;
		String StreetName;
		String pincode;
		String city;
		String State;

		public Address(String buildingNo, String apartmentName, String streetName, String pincode, String city,
				String state) {
			this.buildingNo = buildingNo;
			this.apartmentName = apartmentName;
			StreetName = streetName;
			this.pincode = pincode;
			this.city = city;
			State = state;
		}

	}
}
