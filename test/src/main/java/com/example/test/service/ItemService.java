package com.example.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.beans.Customer;
import com.example.test.beans.Item;

import com.example.test.controller.ItemRepository;
import com.example.test.exception.CustomerIdNotFound;
import com.example.test.exception.ItemIdNotFound;

@Service
public class ItemService {
	@Autowired
	ItemRepository itemRepository;
	
	
	
	public List<Item> fetchAllItems(){
		return itemRepository.findAll();
		
	}
	
	public Item fetchItemById(int itemId) {
		Optional<Item> op = itemRepository.findById(itemId);
		if(op.isPresent())
			return op.get();
		else
			throw new CustomerIdNotFound("No Record found for customer with id: "+itemId);
	}
		
	
	
	public String addItem(Item item) {
		Item itemDB = itemRepository.save(item);
		
		if(itemDB!=null)
			return "Inserted";
		else
			return null;
	}
	
	public String updateItem(Item item, int itemId) {
		if(itemRepository.existsById(itemId))
		{
			
			Item itemDB = itemRepository.save(item);
			if(itemDB!= null)
			{
				return "Updated";
			}
			else
				return null;
		}
		throw new ItemIdNotFound("No Record found for customer with id: "+itemId);
	}
	
	public String deleteItem(int itemId) {
		if(itemRepository.existsById(itemId))
		{
			itemRepository.deleteById(itemId);
			return "Deleted";
		}
		else
			return "Record not found for id:"+itemId;
	}
	
	

}
