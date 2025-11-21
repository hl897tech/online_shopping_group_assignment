package com.hengliu.onlineshopping_01.Controler;

import com.hengliu.onlineshopping_01.Module.UserDemo;
import com.hengliu.onlineshopping_01.Service.JWTService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

@Controller
public class UserTestController {

    Map<Integer, UserDemo> users = new HashMap<>();
    @Resource(name = "l4")
    UserDemo defaultUser;
    @Resource
    JWTService jwtService;
    @PostMapping("/users")
    @ResponseBody
    public String createUser(
            @RequestParam("id") int id,
            @RequestParam("name") String name,
            @RequestParam("email") String email) {

        UserDemo userDemo = new UserDemo(id, name, email);
        UserDemo userDemo2 = UserDemo.builder()
                            .id(id).
                            name(name).
                            email(email).
                            build();
        users.put(id,userDemo2);
        return "Success";
    }
    @GetMapping("/users/{id}")
    public String getUser(@PathVariable("id") int id,
                          Map<String, Object> resultMap) {
        UserDemo userDemo = users.getOrDefault(id, defaultUser);
        String token = jwtService.generateToken(userDemo);
        String jwtUserName = jwtService.extractUsername(token);

        resultMap.put("jwtToken", token);
        resultMap.put("jwtUserName", jwtUserName);
        resultMap.put("user", userDemo);
        return "user_detail";
    }
}
