package com.confluxsys.demo.spring.dao;

import com.confluxsys.demo.model.OrderMapper;
import com.confluxsys.demo.model.Orders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class OrderDaoImpl implements OrderDao{
    JdbcTemplate jdbcTemplate;

    @Autowired
    public OrderDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public List<Orders> getAllOrders() {
        return jdbcTemplate.query("SELECT * FROM orders", new OrderMapper());

    }
    @Override
    public int addOrder(Orders order) {
        return jdbcTemplate.update("INSERT INTO orders(ordereditems)VALUES(ARRAY[(?)", order.getOrdereditems());

    }
}
