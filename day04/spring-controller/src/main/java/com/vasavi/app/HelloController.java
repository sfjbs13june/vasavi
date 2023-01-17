package com.vasavi.app;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")

    public String SayHello(){
        return "Hello from App";
    }


    @RequestMapping("/request/hello")
    public String requestHello(){
        return "Hello from Request mapping";
    }

    @GetMapping("/welcome")
    public String welcome(@RequestParam("name") String name){ return "Welcome to "+name;}
    @GetMapping("/send/{message}")
    public String SendMessage(@PathVariable String message){ return "Send message "+message;}


}
