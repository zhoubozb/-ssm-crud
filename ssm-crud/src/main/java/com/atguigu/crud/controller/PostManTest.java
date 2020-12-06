package com.atguigu.crud.controller;

import com.atguigu.crud.bean.*;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostManTest {


    @RequestMapping("/testpm")
    public Dept getEmpsWithJson(
             Dept dept, Emp emp) {


        System.out.println(dept+"....................."+emp);
        return dept;
    }


    @RequestMapping("/testpm1")
    public Dept getEmpsWithJson1(
            @RequestBody Dept dept,@RequestBody Emp emp) {


        System.out.println(dept+"....................."+emp);
        return dept;
    }


    @RequestMapping("/testpm2")
    public TestVo getEmpsWithJson2(
            @RequestBody TestVo testVo) {


        System.out.println(testVo+"....................."+testVo);
        return testVo;
    }


    @RequestMapping("/testpm3")
    public List<String> getEmpsWithJson2(
            @RequestBody List<String> userIds) {


        System.out.println(userIds+"....................."+userIds);
        return userIds;
    }


    @RequestMapping("/testpm4")
    public String  getEmpsWithJson3(
            @RequestParam(value="id")  String id, @RequestParam(value="name") String name) {
        System.out.println(id+"....................."+name);
        return id+",,,,,,,,,,,,"+name;
    }


    @RequestMapping("/testpm5")
    public String  getEmpsWithJson3(
            @RequestParam(value="id")  String id) {
        System.out.println(id+"....................."+id);
        return id+",,,,,,,,,,,,"+id;
    }


    @RequestMapping("/testpm6")
    public String  getEmpsWithJson5(
            @RequestBody   List<Emp> e) {
        System.out.println(e+"....................."+e);
        return e+",,,,,,,,,,,,"+e;
    }

    @RequestMapping("/testpm7")
    public String  getEmpsWithJson5(
            @RequestBody   List<Emp> e, @RequestParam String s) {
        System.out.println(e+"....................."+s);
        return e+",,,,,,,,,,,,"+s;
    }


}
