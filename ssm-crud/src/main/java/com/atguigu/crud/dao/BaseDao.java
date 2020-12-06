package com.atguigu.crud.dao;

import java.util.List;


public interface BaseDao<T>	{
    public List<T> list(T entity);
}
