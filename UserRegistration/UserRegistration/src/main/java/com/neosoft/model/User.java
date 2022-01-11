package com.neosoft.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.lang.NonNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="user")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	@NonNull
	@Column(name="firstName")
	private String firstName;
	
	@NonNull
	@Column(name="surname")
	private String surname;
	
	@NonNull
	@Column(name="address")
	private String address;
	
	@NonNull
	@Column(name="pinCode")
	private String pinCode;
	
	@NonNull
	@Column(name="dob")
	private Date dob;
	
	@NonNull
	@Column(name="doj")
	private Date doj;
	
	@Column(name="deleted")
	private int deleted;

	/**
	 * @param userId
	 * @param firstName
	 * @param surname
	 * @param address
	 * @param pinCode
	 * @param dob
	 * @param doj
	 */
	public User(int userId, String firstName, String surname, String address, String pinCode, Date dob, Date doj) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.surname = surname;
		this.address = address;
		this.pinCode = pinCode;
		this.dob = dob;
		this.doj = doj;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}


   
	
}
