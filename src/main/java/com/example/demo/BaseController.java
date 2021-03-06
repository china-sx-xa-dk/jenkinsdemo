package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

    @GetMapping(value = "")
    public String HelloWord(){
        return "Hello Word!!!";
    }

    @GetMapping(value = "demo")
    public String HelloWordDemo(){
        return "Hello Word Demo!!!";
    }

    @GetMapping(value = "demo1")
    public String HelloWordDemo1(){
        return "Hello Word Demo111!!!";
    }

    @GetMapping(value = "demo2")
    public String HelloWordDemo2(){
        return "Hello Word Demo222!!!";
    }
}
