package com.example.test.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.test.beans.Bill;
import com.example.test.controller.BillRepository;
import com.example.test.exception.BillIdNotFound;

@Service
public class BillService {
	@Autowired
    BillRepository billRepository;

    public List<Bill> fetchAllBills() {
        return billRepository.findAll();
    }

    public Bill fetchBillById(int billId) {
        Optional<Bill> op = billRepository.findById(billId);
        if (op.isPresent())
            return op.get();
        else
            throw new BillIdNotFound("No Record found for bill with id: " + billId);
    }

    public String addBill(Bill bill) {
        Bill billDB = billRepository.save(bill);
        if (billDB != null)
            return "Inserted";
        else
            return null;
    }

    public String updateBill(Bill bill, int billId) {
        if (billRepository.existsById(billId)) {
            Bill billDB = billRepository.save(bill);
            if (billDB != null) {
                return "Updated";
            } else
                return null;
        }
        throw new BillIdNotFound("No Record found for bill with id: " + billId);
    }

    public String deleteBill(int billId) {
        if (billRepository.existsById(billId)) {
            billRepository.deleteById(billId);
            return "Deleted";
        } else
            return "Record not found for id:" + billId;
    }

}
