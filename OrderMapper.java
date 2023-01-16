package com.confluxsys.demo.model;

import org.postgresql.jdbc.PgArray;
import org.springframework.jdbc.core.RowMapper;
import java.sql.Connection;
import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.fasterxml.jackson.databind.type.LogicalType.Map;

public class OrderMapper implements RowMapper<Orders> {

    @Override
    public Orders mapRow(ResultSet rs, int rowNum) throws SQLException {
        Orders order=new Orders();
        order.setOrderid(rs.getInt("orderid"));
        order.setOrdereditems(new String[]{rs.getString("ordereditems")});
        return order;
    }
}
