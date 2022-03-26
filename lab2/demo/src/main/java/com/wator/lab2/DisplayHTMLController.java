package com.wator.lab2;

import org.springframework.boot.Banner;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

@Controller
public class DisplayHTMLController {
    @GetMapping("/example")
    public String index(){
        return "html";

    }

}
