package com.example.test.beans;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;


@Entity
public class Bill {
	
	
    
    @Id
    @GeneratedValue
    private int billId;
    
    private String purchasedItem;
    private String customerName;
    public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	private int quantity;
    private double totalAmount;
    

    
    
	

	

	public int getBillId() {
		return billId;
	}

	public void setBillId(int billId) {
		this.billId = billId;
	}

	public String getPurchasedItem() {
		return purchasedItem;
	}

	public void setPurchasedItem(String purchasedItem) {
		this.purchasedItem = purchasedItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}



	@Override
	public String toString() {
		return "Purchase [billId=" + billId + ", purchasedItem=" + purchasedItem + ", quantity=" + quantity
				+ ", totalAmount=" + totalAmount + "]";
	}
    
    
  


}
