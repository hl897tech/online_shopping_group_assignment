package com.hengliu.onlineshopping_01.Module;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class UserDemo {
    public int id;
    public String name;
    public String email;
}
