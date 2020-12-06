package com.atguigu.crud.service;

import com.atguigu.crud.bean.Book;
import com.atguigu.crud.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public class BaseServiceImpl<D extends BaseDao<T>,T> implements BaseService<T>{

    @Autowired
    D d;
    @Override
    public List<T> getList(T t) {
        return d.list(t);
    }
}
