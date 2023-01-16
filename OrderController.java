package com.confluxsys.demo.controller;

import com.confluxsys.demo.model.Orders;
import com.confluxsys.demo.spring.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@CrossOrigin(origins = "http://localhost:8088")
@RestController
@RequestMapping("/oapi")
public class OrderController {
    @Autowired
    OrderDao orderDao;

    @GetMapping("/orders")
    public ResponseEntity<List<Orders>> getAllCustomers(@RequestParam(required = false) String name){
        //Find all Customers which name contains string ‘?’:
        try {
            List<Orders> customers = new ArrayList<Orders>();

            if (name == null)
                orderDao.getAllOrders().forEach(customers::add);
            if (customers.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(customers, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping("/orders")
    public ResponseEntity<String> createCustomer(@RequestBody Orders orders) {
        try {
            orderDao.addOrder(new Orders(orders.getOrdereditems()));
            return new ResponseEntity<>("Customer was created successfully.", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
