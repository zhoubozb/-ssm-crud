package com.atguigu.crud.service;

import com.atguigu.crud.bean.Book;
import com.atguigu.crud.dao.BookDao;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BookServiceImpl extends  BaseServiceImpl<BookDao,Book>{
    public List<Book> test(){
      return  d.test();
    }
}
