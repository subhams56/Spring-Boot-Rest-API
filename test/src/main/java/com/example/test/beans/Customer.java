package com.example.test.beans;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import jakarta.persistence.OneToMany;
@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int customerId;
	@Column(name="CustomerName")
	private String customerName;


	@OneToMany
	private List<Item> itemToPurchase;
	
	public List<Item> getItemToPurchase() {
		return itemToPurchase;
	}
	public void setItemToPurchase(List<Item> itemToPurchase) {
		this.itemToPurchase = itemToPurchase;
	}
	public int getCustomerId() {
		return customerId;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", itemToPurchase="
				+ itemToPurchase + "]";
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	
}
