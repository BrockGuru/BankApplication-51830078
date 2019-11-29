package com.bookapp.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user1_table")
public class User {
	@Id
	@GeneratedValue
	private int id;
	private String username;
	@Column(unique=true)
	private String email;
	private String password;
	private String profile;
	private boolean active;
	
	
	public User(String username, String email, String password, String profile, boolean active) {
		
		this.username = username;
		this.email = email;
		this.password = password;
		this.profile = profile;
		this.active = active;
	}
	public int getId() {
		return id;
	}
	public User() {
		
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
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
	public String getProfile() {
		return profile;
	}
	public void setProfile(String profile) {
		this.profile = profile;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	

}
