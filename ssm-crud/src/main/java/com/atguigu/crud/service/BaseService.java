package com.atguigu.crud.service;

import java.util.List;

public interface BaseService<T> {

     List<T> getList(T t);
}
