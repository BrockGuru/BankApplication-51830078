package com.bookapp.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="customer1_table")
public class Customer {
	@Id
	@GeneratedValue
	private int id;
	@NotEmpty(message="pls Enter the firstName")
	private String firstname;
	@NotEmpty(message="pls Enter the LastName")
	private String lastname;
	@NotEmpty(message="pls Enter the Address")
	private String address;
	@NotEmpty(message="pls Enter the Phone")
	private String phone;
	@Column(unique=true)
	@Email
	private String email;
	private String salary;
	public Customer(String firstname, String lastname, String address, String phone, String email, String salary) {
		
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.phone = phone;
		this.email = email;
		this.salary = salary;
	}
	public Customer() {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	
	

}
