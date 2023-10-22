package com.example.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;

import com.example.test.beans.AdminMarket;
import com.example.test.beans.Customer;
import com.example.test.controller.AdminRepository;
import com.example.test.exception.AdminIdNotFound;
import com.example.test.exception.AdminNameNotFound;
import com.example.test.exception.CustomerIdNotFound;


@Service
public class AdminService {
	
	@Autowired
	private AdminRepository adminRepository;
	
	public List<AdminMarket> fetchAllAdmins(){
		return adminRepository.findAll();
		
	}
	public AdminMarket fetchAdminById(int adminId) {
		Optional<AdminMarket> op = adminRepository.findById(adminId);
		if(op.isPresent())
			return op.get();
		else
			throw new AdminIdNotFound("No Record found for admin with id: "+adminId);
	}
	

	
	public String addAdmin(AdminMarket admin) {
		AdminMarket adminDB = adminRepository.save(admin);
		
		if(adminDB!=null)
			return "Inserted";
		else
			return null;
	}
	


	public String updateAdmin(AdminMarket admin, int adminId) {
		if(adminRepository.existsById(adminId))
		{
			
			AdminMarket adminDB = adminRepository.save(admin);
			if(adminDB!= null)
			{
				return "Updated";
			}
			else
				return null;
		}
		throw new AdminIdNotFound("No Record found for admin with id: "+adminId);
	}
	
	public String deleteAdmin(int adminId) {
		if(adminRepository.existsById(adminId))
		{
			adminRepository.deleteById(adminId);
			return "Deleted";
		}
		else
			return "Record not found for admin with id:"+adminId;
	}

}
