package com.example.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.test.beans.Orders;
import com.example.test.controller.OrderRepository;
import com.example.test.exception.OrderIdNotFound;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public List<Orders> fetchAllOrders() {
        return orderRepository.findAll();
    }

    public Orders fetchOrderById(int orderId) {
        Optional<Orders> op = orderRepository.findById(orderId);
        if (op.isPresent())
            return op.get();
        else
            throw new OrderIdNotFound("No Record found for order with id: " + orderId);
    }

    public String addOrder(Orders order) {
        Orders orderDB = orderRepository.save(order);
        if (orderDB != null)
            return "Inserted";
        else
            return null;
    }

    public String updateOrder(Orders order, int orderId) {
        if (orderRepository.existsById(orderId)) {
            Orders orderDB = orderRepository.save(order);
            if (orderDB != null) {
                return "Updated";
            } else
                return null;
        }
        throw new OrderIdNotFound("No Record found for order with id: " + orderId);
    }

    public String deleteOrder(int orderId) {
        if (orderRepository.existsById(orderId)) {
            orderRepository.deleteById(orderId);
            return "Deleted";
        } else
            return "Record not found for id:" + orderId;
    }
}
