package com.atguigu.crud.bean;

public class TestVo {

    private Emp e;

    private Dept d;

    public Emp getE() {
        return e;
    }

    public void setE(Emp e) {
        this.e = e;
    }

    public Dept getD() {
        return d;
    }

    public void setD(Dept d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "TestVo{" +
                "e=" + e +
                ", d=" + d +
                '}';
    }
}
