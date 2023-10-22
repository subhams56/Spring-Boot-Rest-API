package com.example.test.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.beans.Customer;
import com.example.test.beans.Item;
import com.example.test.service.CustomerService;
import com.example.test.service.ItemService;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@Autowired
	ItemService itemService;
	
	@GetMapping("/items")  //View All Items
	public List<Item> findAllItems(){
		return itemService.fetchAllItems();
		}
	
	@GetMapping("/items/{itemId}") //View Item By Id
	public Item findItemById(@PathVariable("itemId")int itemId)
	{
		return itemService.fetchItemById(itemId);
		
	}
	
	@PostMapping("/registerCustomer")  //Create Customer
	public ResponseEntity<String> addCustomer(@RequestBody Customer customer) {
		String message = customerService.addCustomer(customer);
		ResponseEntity<String> re = new ResponseEntity<String>(message,HttpStatus.CREATED);
		return re;
	}
	@GetMapping("/customers/{customerId}") //View Customer By Id
	public Customer getCustomerById(@PathVariable("customerId") int customerId){
		return customerService.fetchCustomerById(customerId);
		
	}
	
	
	@PostMapping("/addPurchase") // Add Purchase of the Customer
	public ResponseEntity<String> addPurchase(@RequestBody Customer customer) {
		String message = customerService.addPurchase(customer);
		ResponseEntity<String> re = new ResponseEntity<String>(message,HttpStatus.CREATED);
		return re;
	}
	
	@PutMapping("/customers/{customerId}") //Update Customer
	public String updateCustomer(@RequestBody Customer customer, @PathVariable("customerId") int customerId)
	{
		return customerService.updateCustomer(customer,customerId);
	}
	
	
}
