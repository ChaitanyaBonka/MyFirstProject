package com.niit.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class CustomerOrder implements Serializable{


    private static final long serialVersionUID = -1546649310334411202L;

    @Id
    @GeneratedValue
    private int customerOrderId;

    @OneToOne
    @JoinColumn(name = "cartId")
    private Cart cart;

    @OneToOne
    @JoinColumn(name = "id")
    private Register register;

    @OneToOne
    @JoinColumn(name = "billingAddressId")
    private BillingAddress billingAddress;

    @OneToOne
    @JoinColumn(name="shippingAddressId")
    private ShippingAddress shippingAddress;

	public int getCustomerOrderId() {
		return customerOrderId;
	}

	public void setCustomerOrderId(int customerOrderId) {
		this.customerOrderId = customerOrderId;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Register getRegister() {
		return register;
	}

	public void setRegister(Register register) {
		this.register = register;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

   
} // The End of Class;
