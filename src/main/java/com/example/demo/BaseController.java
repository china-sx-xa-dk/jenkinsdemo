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
}
