package com.example.test.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.test.beans.Item;


@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {

}
