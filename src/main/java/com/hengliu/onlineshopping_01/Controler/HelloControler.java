package com.hengliu.onlineshopping_01.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloControler {
    @GetMapping("/hello")
    public String HelloWorld(){
        return "test";
    }
}
