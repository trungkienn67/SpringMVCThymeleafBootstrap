package com.example.thymeleafdemo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;

@Controller
@SpringBootApplication

public class DemoController {
    //crate a mapping for "/hello"

    @GetMapping("/hello")
    public String seyhello(Model theModel) {

        theModel.addAttribute("theDate", new java.util.Date());

        return "helloworld";
    }
}
