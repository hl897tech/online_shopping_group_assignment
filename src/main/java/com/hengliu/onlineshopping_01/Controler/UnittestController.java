package com.hengliu.onlineshopping_01.Controler;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service

public class UnittestController {
    @Resource
    FKdependency fk;
    public UnittestController(FKdependency fk){
        this.fk = fk;
    }
    public int add5(int a, int b){
        return fk.add(a,b)+5;
    }
}
