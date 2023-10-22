package com.example.test.controller;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.beans.Customer;


@Repository
public interface CustomerRepository extends JpaRepository <Customer,Integer> {
	
	Optional<Customer>findByCustomerName(String name);

}
