package com.example.taskTracker.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("/{name}")
    public String SayHello(@PathVariable String name){
        return "hello %s at %d".formatted(name, LocalDateTime.now().toString());
    }
}
