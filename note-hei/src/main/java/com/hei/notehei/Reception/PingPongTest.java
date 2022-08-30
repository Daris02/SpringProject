package com.hei.notehei.Reception;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingPongTest {

    @GetMapping("/ping")
    public String pingPong(){
        return "pong";
    }
}
