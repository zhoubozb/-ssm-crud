package com.atguigu.crud.dao;

import com.atguigu.crud.bean.Book;

import java.util.List;

public interface BookDao extends BaseDao<Book> {

    public List<Book> test();
}
