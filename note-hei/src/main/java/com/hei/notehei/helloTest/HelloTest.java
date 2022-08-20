package com.hei.notehei.helloTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloTest {
    
    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/hello/{write}")
    public String helloWorld(@PathVariable(required = false) String write){
        return "Hello" + write;
    }
}
