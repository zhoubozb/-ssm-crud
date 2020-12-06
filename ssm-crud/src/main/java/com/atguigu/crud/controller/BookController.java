package com.atguigu.crud.controller;

import com.atguigu.crud.bean.Book;
import com.atguigu.crud.bean.Department;
import com.atguigu.crud.bean.Msg;
import com.atguigu.crud.service.BookServiceImpl;
import com.atguigu.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 处理和部门有关的请求
 * @author lfy
 *
 */
@Controller
public class BookController {
	
	@Autowired
	private BookServiceImpl bookServiceImpl;
	
	/**
	 * 返回所有的部门信息
	 */
	@RequestMapping("/book")
	@ResponseBody
	public Msg getDepts(){
		//查出的所有部门信息
		List<Book> list = bookServiceImpl.test();
		return Msg.success().add("book", list);
	}

}
