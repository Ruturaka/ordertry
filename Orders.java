package com.confluxsys.demo.model;

import java.sql.Array;

public class Orders {
    Integer orderid;
    String[] ordereditems;

    public Orders(){
    }

    public Orders(String[] ordereditems) {
        this.ordereditems = ordereditems;
    }

    public Integer getOrderid() {
        return orderid;
    }

    public void setOrderid(Integer orderid) {
        this.orderid = orderid;
    }

    public String[] getOrdereditems() {
        return ordereditems;
    }

    public void setOrdereditems(String[] ordereditems) {
        this.ordereditems = ordereditems;
    }
}
