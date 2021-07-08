package com.joshi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_data")
public class User {
	@Id
	@Column(name="use_id")
	@GeneratedValue
	private int id;
	@Column(name="user_name")
	private String name;
	@Column(name="user_address")
	private String address;
	@Column(name="user_mobNo")
	private long mobNo;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String address, long mobNo) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.mobNo = mobNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
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

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}
	
	
	
	

}
