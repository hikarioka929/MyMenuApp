package com.example.mma.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    // GET /
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
