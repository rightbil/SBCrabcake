package com.bili.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/menu")
    public String index(){
        return "Crabcake";
    }
}
