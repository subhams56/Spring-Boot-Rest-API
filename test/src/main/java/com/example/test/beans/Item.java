package com.example.test.beans;





import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Item {
	@Id
	@GeneratedValue
	private int itemId;
	@Column(name="ItemName")
	private String itemName;
	@Column(name="ItemPrice")
	private int itemPrice;
	@Column(name="Available")
	private boolean itemStock;

	public boolean isItemStock() {
		return itemStock;
	}
	public void setItemStock(boolean itemStock) {
		this.itemStock = itemStock;
	}
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	

}
