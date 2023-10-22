package com.example.test.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.beans.Bill;

@Repository
public interface BillRepository extends JpaRepository<Bill,Integer> {

}
