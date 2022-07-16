package com.example.loggingCheck.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @RequestMapping("/hi")
    public String getHi()
    {
        return  "Hi";
    }
}
