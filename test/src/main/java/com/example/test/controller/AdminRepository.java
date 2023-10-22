package com.example.test.controller;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.beans.AdminMarket;


@Repository
public interface AdminRepository extends JpaRepository<AdminMarket,Integer> {
	
	

}
