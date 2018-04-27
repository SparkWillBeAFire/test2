package com.zhouji.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PageController {

    @RequestMapping(value = {"/", "/index"})
    public String indexJspString() {
        return "index";
    }

    @RequestMapping("/demo")
    public String demoJspString() {
        return "demo";
    }
}
