package com.example.test.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Orders {
	
	@Id
	@GeneratedValue
	private int orderId;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	private String orderItem;
	private double orderQuantity;
	
	
	
	@Override
	public String toString() {
		return "Orders [orderId=" + orderId + ", orderItem=" + orderItem + ", orderQuantity=" + orderQuantity + "]";
	}
	public String getOrderItem() {
		return orderItem;
	}
	public void setOrderItem(String orderItem) {
		this.orderItem = orderItem;
	}
	public double getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(double orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	
	

}
