package com.confluxsys.demo.spring.dao;

import com.confluxsys.demo.model.Orders;

import java.util.List;

public interface OrderDao {
    List<Orders> getAllOrders(); //read
    int addOrder(Orders order); //post



}
