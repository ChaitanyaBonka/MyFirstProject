package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;
@Entity
@Table(name="register",uniqueConstraints = {
		@UniqueConstraint(columnNames = "username") })
@Component
public class Register 
{
	
				 @Id
				 @GeneratedValue(strategy=GenerationType.AUTO)
				 @Column(name="id")
			     private int id;	
				 
				 @NotNull
				 @Size(min=3,max=50,message="UserName Must be more than 2 letters")
				 @Column(name="username", unique=true)
			     private String username;
				 
				 @NotNull
				 @Size(min=3,max=50,message="MailId Must be more than 2 letters")
				 @Column(name="mailid")
			     private String mailid;
				 
				 @NotNull
				 @Size(min=11,max=120,message="Address at least more than 10 Characters")
				 @Column(name="Address")
				 private String Address;
				 
				 @NotNull
				 @Size(min=10,max=12)
				 @Column(name="phone")
			     private String phone;
				 
				 @NotNull
				 @Size(min=7,max=25)
				 @Column(name="password")
			     private String password;
				 
				 @NotNull
				 @Size(min=7,max=25)
				 @Column(name="confirmpassword")
			     private String confirmpassword;

				 /*@NotNull
				 @Column(name="Gender")
			     private String Gender;*/
				 
			   	 private boolean status=true;

				public int getId() {
					return id;
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

				public String getMailid() {
					return mailid;
				}

				public void setMailid(String mailid) {
					this.mailid = mailid;
				}

				public String getAddress() {
					return Address;
				}

				public void setAddress(String address) {
					Address = address;
				}

				public String getPhone() {
					return phone;
				}

				public void setPhone(String phone) {
					this.phone = phone;
				}

				public String getPassword() {
					return password;
				}

				public void setPassword(String password) {
					this.password = password;
				}

				public String getConfirmpassword() {
					return confirmpassword;
				}

				public void setConfirmpassword(String confirmpassword) {
					this.confirmpassword = confirmpassword;
				}

				public boolean isStatus() {
					return status;
				}

				public void setStatus(boolean status) {
					this.status = status;
				}
			   	 
			   	 
}