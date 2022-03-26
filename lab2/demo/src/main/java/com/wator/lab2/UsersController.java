package com.wator.lab2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.Map;

@Controller
public class UsersController {
private Map<Integer, UserEntity> map;

    @GetMapping("/users")
    @ResponseBody
    public Collection<UserEntity> index(){
        return map.values();
    }

}

