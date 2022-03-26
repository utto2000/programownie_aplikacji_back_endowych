package com.wator.lab2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
    @GetMapping("/")
    @ResponseBody
    public static String index (){
        return "HelloWordl";
    }
}
