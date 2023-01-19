package com.vasavi.app.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorController {

    @GetMapping("/add")
    public long add(@RequestParam("a") long a, @RequestParam("b") long b){
        return a+b;
    }

}
