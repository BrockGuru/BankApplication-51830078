package com.bookapp.webcontroller;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class UserFormBean {
	@NotEmpty(message="email should not be blank")
	@Email(message="enter the valid maid id")
private String email;
	@NotEmpty(message="password should not be blank")
private String password;
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

}
