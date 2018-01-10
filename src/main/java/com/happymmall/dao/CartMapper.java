package com.happymmall.dao;

import com.happymmall.pojo.Cart;

public interface CartMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cart record);

    int insertSelective(Cart record);
    int updateByPrimaryKeySelective(Cart record);

    Cart selectByPrimaryKey(Integer id);


    int updateByPrimaryKey(Cart record);
}