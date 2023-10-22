package com.example.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.test.beans.AdminMarket;
import com.example.test.beans.Bill;
import com.example.test.beans.Customer;
import com.example.test.beans.Item;
import com.example.test.beans.Orders;
import com.example.test.service.AdminService;
import com.example.test.service.BillService;
import com.example.test.service.CustomerService;
import com.example.test.service.ItemService;
import com.example.test.service.OrderService;

@RestController
public class AdminController {
	
	@Autowired
    private ItemService itemService;
	@Autowired
	private BillService billService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private AdminService adminService;

	@GetMapping("/admin/viewItems")  //View All Items
	public List<Item> findAllItems(){
		return itemService.fetchAllItems();
		}
	
	@GetMapping("/admin/viewItemById/{itemId}") //View Item By Id
	public Item findItemById(@PathVariable("itemId")int itemId)
	{
		return itemService.fetchItemById(itemId);
		
	}
	
	@PostMapping("/admin/addItem")  //Create Item
	public ResponseEntity<String> addItem(@RequestBody Item item) {
		String message = itemService.addItem(item);
		ResponseEntity<String> re = new ResponseEntity<String>(message,HttpStatus.CREATED);
		return re;
	}
	@PutMapping("/admin/updateItem/{itemId}") //Update Item
	public String updateItem(@RequestBody Item item, @PathVariable("itemId") int itemId)
	{
		return itemService.updateItem(item,itemId);
	}
	
	@DeleteMapping("/admin/deleteItem/{itemId}") //Delete Item
	public String deleteitem(@PathVariable("itemId") int itemId)
	{
		return itemService.deleteItem(itemId);
	}
	@GetMapping("/admin/viewBills") // View All Bills
    public List<Bill> getAllBills() {
        return billService.fetchAllBills();
    }

    @GetMapping("/admin/getBillById/{billId}") // View Bill By Id
    public Bill getBillById(@PathVariable("billId") int billId) {
        return billService.fetchBillById(billId);
    }

    @PostMapping("/admin/addBill") // Create Bill
    public ResponseEntity<String> addBill(@RequestBody Bill bill) {
        String message = billService.addBill(bill);
        ResponseEntity<String> re = new ResponseEntity<String>(message, HttpStatus.CREATED);
        return re;
    }

    @PutMapping("/admin/updateBill/{billId}") // Update Bill
    public String updateBill(@RequestBody Bill bill, @PathVariable("billId") int billId) {
        return billService.updateBill(bill, billId);
    }

    @DeleteMapping("/admin/deleteBill/{billId}") // Delete Bill
    public String deleteBill(@PathVariable("billId") int billId) {
        return billService.deleteBill(billId);
    }
    @GetMapping("/admin/viewOrders") // View All Orders
    public List<Orders> getAllOrders() {
        return orderService.fetchAllOrders();
    }

    @GetMapping("/admin/viewOrderById/{orderId}") // View Order By Id
    public Orders getOrderById(@PathVariable("orderId") int orderId) {
        return orderService.fetchOrderById(orderId);
    }

    @PostMapping("/admin/placeOrder") // Create Order
    public ResponseEntity<String> addOrder(@RequestBody Orders order) {
        String message = orderService.addOrder(order);
        ResponseEntity<String> re = new ResponseEntity<String>(message, HttpStatus.CREATED);
        return re;
    }

    @PutMapping("/admin/updateOrder/{orderId}") // Update Order
    public String updateOrder(@RequestBody Orders order, @PathVariable("orderId") int orderId) {
        return orderService.updateOrder(order, orderId);
    }

    @DeleteMapping("/admin/deleteOrder/{orderId}") // Delete Order
    public String deleteOrder(@PathVariable("orderId") int orderId) {
        return orderService.deleteOrder(orderId);
    }
    
    @GetMapping("/admin/viewCustomers")  //View All Customers
	public List<Customer> getAllCustomers(){
		return customerService.fetchAllCustomers();
		
	}
	
	@GetMapping("/admin/viewCustomerById/{customerId}") //View Customer By Id
	public Customer getCustomerById(@PathVariable("customerId") int customerId){
		return customerService.fetchCustomerById(customerId);
		
	}
	@GetMapping("/admin/viewCustomerByName/byName/{customerName}")
	public Customer getCustomerByName(@PathVariable("customerName") String name)
	{
		return customerService.fetchCustomerByName(name);
	}
	@PutMapping("/admin/updateCustomer/{customerId}") //Update Customer
	public String updateCustomer(@RequestBody Customer customer, @PathVariable("customerId") int customerId)
	{
		return customerService.updateCustomer(customer,customerId);
	}
	
	@DeleteMapping("/admin/deleteCustomer/{customerId}") //Delete Customer
	public String deleteCustomer(@PathVariable("customerId") int customerId)
	{
		return customerService.deleteCustomer(customerId);
	}
	
	@GetMapping("/admins")  //View All Admins
	public List<AdminMarket> findAllAdmins(){
		return adminService.fetchAllAdmins();
		}
	
	@GetMapping("/admins/{adminId}") //View Admin By Id
	public AdminMarket findAdminById(@PathVariable("adminId")int adminId)
	{
		return adminService.fetchAdminById(adminId);
		
	}
	
	@PostMapping("/addAdmin")  //Create Admin
	public ResponseEntity<String> addAdmin(@RequestBody AdminMarket admin) {
		String message = adminService.addAdmin(admin);
		ResponseEntity<String> re = new ResponseEntity<String>(message,HttpStatus.CREATED);
		return re;
	}
	@PutMapping("/admins/{adminId}") //Update Admin
	public String updateAdmin(@RequestBody AdminMarket admin, @PathVariable("adminId") int adminId)
	{
		return adminService.updateAdmin(admin,adminId);
	}
	
	@DeleteMapping("/admins/{adminId}") //Delete Admin
	public String deleteAdmin(@PathVariable("adminId") int adminId)
	{
		return adminService.deleteAdmin(adminId);
	}
}
