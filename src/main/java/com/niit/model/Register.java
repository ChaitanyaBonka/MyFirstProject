package com.niit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="register",uniqueConstraints = {
		@UniqueConstraint(columnNames = "username") })
@Component
public class Register implements Serializable
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
				 
				 
				 @Size(min=2,max=30)
				 @Column(name="streetName")
				    private String streetName;
				 
				 @Size(min=2,max=30)
				 @Column(name="apartmentNumber")
				    private String apartmentNumber;
				 
				 @Size(min=2,max=30)
				 @Column(name="city")
				    private String city;
				 
				 @Size(min=2,max=30)
				 @Column(name="state")
				    private String state;
				
				 @Size(min=2,max=30)
				 @Column(name="country")
				    private String country;
				 
				 @Size(min=2,max=30)
				 @Column(name="zipCode")
				    private String zipCode;
				 
				 	@OneToOne
				    @JoinColumn(name = "billingAddressId")
				    private BillingAddress billingAddress;

				    @OneToOne
				    @JoinColumn(name = "shippingAddressId")
				    private ShippingAddress shippingAddress;

				    @OneToOne
				    @JoinColumn(name = "cartId")
				    @JsonIgnore
				    private Cart cart;

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

				public String getStreetName() {
					return streetName;
				}

				public void setStreetName(String streetName) {
					this.streetName = streetName;
				}

				public String getApartmentNumber() {
					return apartmentNumber;
				}

				public void setApartmentNumber(String apartmentNumber) {
					this.apartmentNumber = apartmentNumber;
				}

				public String getCity() {
					return city;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public String getState() {
					return state;
				}

				public void setState(String state) {
					this.state = state;
				}

				public String getCountry() {
					return country;
				}

				public void setCountry(String country) {
					this.country = country;
				}

				public String getZipCode() {
					return zipCode;
				}

				public void setZipCode(String zipCode) {
					this.zipCode = zipCode;
				}

				public BillingAddress getBillingAddress() {
					return billingAddress;
				}

				public void setBillingAddress(BillingAddress billingAddress) {
					this.billingAddress = billingAddress;
				}

				public ShippingAddress getShippingAddress() {
					return shippingAddress;
				}

				public void setShippingAddress(ShippingAddress shippingAddress) {
					this.shippingAddress = shippingAddress;
				}

				public Cart getCart() {
					return cart;
				}

				public void setCart(Cart cart) {
					this.cart = cart;
				}

				public boolean isStatus() {
					return status;
				}

				public void setStatus(boolean status) {
					this.status = status;
				}

				
			   	 
}