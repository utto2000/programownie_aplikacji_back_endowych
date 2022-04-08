package com.wator.lab2;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static java.util.Map.entry;

@RestController
public class UsersController {
//private  Map<Integer, UserEntity> map = Map.ofEntries(entry(0, new UserEntity("Kamil")),entry(1, new UserEntity("Radek")));
private  Map<Integer, UserEntity> map = new HashMap<Integer, UserEntity>();



    @GetMapping("/users")
    public Map<Integer, UserEntity>  getUsers(){
        map.put(0,new UserEntity("Radek"));
        map.put(1,new UserEntity("WhoAsked"));

        return  map;
    }


    @GetMapping("/users/{id}/get")
    UserEntity getUser(@PathVariable int id){
        return map.get(id);
    }

    @GetMapping("/users/{id}/remove")
    UserEntity  removeUser(@PathVariable int id) {
        return  map.remove(id);
    }

    @GetMapping("/users/add")
    @ResponseBody
    UserEntity addNewUser(@RequestParam String name) {
        UserEntity user = new UserEntity(name);
//        Map.Entry<Integer, UserEntity> entry = new AbstractMap.SimpleEntry<Integer,UserEntity>(map.size(),user);
        map.put(map.size(), user);
        return user;
    }

}

