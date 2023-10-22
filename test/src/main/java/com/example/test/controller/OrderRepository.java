package com.example.test.controller;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.test.beans.Orders;

public interface OrderRepository extends JpaRepository<Orders,Integer> {

}
