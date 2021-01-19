package com.yagudza.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping(value="/")
    public String index() {
        return "index";
    }
}