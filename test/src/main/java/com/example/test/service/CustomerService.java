package com.example.test.service;

import java.util.List;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.test.beans.Customer;
import com.example.test.controller.CustomerRepository;
import com.example.test.exception.CustomerIdNotFound;
import com.example.test.exception.CustomerNameNotFound;

@Service
public class CustomerService {
	
	@Autowired
	CustomerRepository customerRepository;
	
	
	
	public List<Customer> fetchAllCustomers(){
		return customerRepository.findAll();
		
	}
	
	public Customer fetchCustomerById(int customerId) {
		Optional<Customer> op = customerRepository.findById(customerId);
		if(op.isPresent())
			return op.get();
		else
			throw new CustomerIdNotFound("No Record found for customer with id: "+customerId);
	}
	
	public Customer fetchCustomerByName(String name) {
		

		Optional<Customer> op = customerRepository.findByCustomerName(name);
		if(op.isPresent())
			return op.get();
		else
			throw new CustomerNameNotFound("No Record found for customer with name: "+name);
	}
	
	public String addCustomer(Customer customer) {
		Customer cusDB = customerRepository.save(customer);
		
		if(cusDB!=null)
			return "Inserted "+"ID = "+customer.getCustomerId()+"\t"+"Name = "+customer.getCustomerName();
		else
			return null;
	}
	
	public String addPurchase(Customer customer) {
		
		Customer c=customerRepository.findById(customer.getCustomerId()).get();
		c.setItemToPurchase(customer.getItemToPurchase());
			
		Customer cusDB = customerRepository.save(c);
		
		 
		
		
		if(cusDB != null)
			return "Purchased Successfully";
		else
			return "Purchase Failed";
	}

	public String updateCustomer(Customer customer, int customerId) {
		if(customerRepository.existsById(customerId))
		{
			
			Customer customerDB = customerRepository.save(customer);
			if(customerDB!= null)
			{
				return "Updated "+"ID = "+customer.getCustomerId()+"\t"+"Name = "+customer.getCustomerName();
			}
			else
				return null;
		}
		throw new CustomerIdNotFound("No Record found for customer with id: "+customerId);
	}
	
	public String deleteCustomer(int customerId) {
		if(customerRepository.existsById(customerId))
		{
			customerRepository.deleteById(customerId);
			return "Deleted Customer with ID "+customerId;
		}
		else
			return "Record not found for id:"+customerId;
	}
	
	

}
