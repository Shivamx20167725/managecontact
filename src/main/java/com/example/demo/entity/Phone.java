package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PHONE_TBL")
public class Phone {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  int id;
	private String phoneId; // is a UUID
	private String phoneName; 
	private String phoneNumber;
	private String phoneModel;	
	@ManyToOne()
	private User user;	

	

	public Phone() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneId() {
		return phoneId;
	}

	public void setPhoneId(String phoneId) {
		this.phoneId = phoneId;
	}

	public String getPhoneName() {
		return phoneName;
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPhoneModel() {
		return phoneModel;
	}	

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Phone [id=" + id + ", phoneId=" + phoneId + ", phoneName=" + phoneName + ", phoneNumber=" + phoneNumber
				+ ", phoneModel=" + phoneModel + ", user=" + user + "]";
	}
	

}
