package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Parent;
import com.example.demo.service.HelloService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class HelloController {

    private final HelloService helloService;

    @RequestMapping("/hello")
    public String test() {
        
        return helloService.execute();
    }
}
