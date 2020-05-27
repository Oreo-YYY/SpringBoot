package com.example.demo.entity;

import java.io.Serializable;

/**
 * (Account)实体类
 *
 * @author makejava
 * @since 2020-05-26 22:53:26
 */
public class Account implements Serializable {
    private static final long serialVersionUID = 110052277357159406L;
    
    private Integer id;
    
    private String name;
    
    private Object money;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getMoney() {
        return money;
    }

    public void setMoney(Object money) {
        this.money = money;
    }

}