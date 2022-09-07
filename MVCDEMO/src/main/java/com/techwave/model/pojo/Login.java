package com.techwave.model.pojo;

import javax.validation.constraints.NotBlank;

public class Login {
@NotBlank(message = "required")
private String username;
@NotBlank(message = "required")
private String password;
private String type;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Login(String username, String password, String type) {
	super();
	this.username = username;
	this.password = password;
	this.type = type;
}
public Login()
{}
}
