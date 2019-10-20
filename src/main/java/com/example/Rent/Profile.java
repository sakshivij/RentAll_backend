package com.example.Rent;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
 

@Document(collection = "test")
public class Profile {
 
@Id
 private String id;
 private String name;
 private String address;
 private String dob;
 private String contact;
 
  
 private String email;
 
 public Profile(String name, String address, String dob , String contact, String email) {
 this.name = name;
 this.address = address;
 this.dob = dob;
 this.contact = contact;
 this.email = email;
 

 }

public String getId() {
	return id;
}


public void setId(String id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getDob() {
	return dob;
}


public void setDob(String dob) {
	this.dob = dob;
}


public String getContact() {
	return contact;
}


public void setContact(String contact) {
	this.contact = contact;
}


public String getEmail() {
	return email;
}


public void setEmail(String email) {
	this.email = email;
}


public String getAddress() {
	return address;
}


public void setAddress(String address) {
	this.address = address;
}
 
}
