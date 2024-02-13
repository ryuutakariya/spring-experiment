package com.example.demo.service.impl;

import java.io.Console;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Parent;
import com.example.demo.mapper.HogeRepositoryMapper;
import com.example.demo.service.HelloService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class HelloServiceImpl implements HelloService {

    private final HogeRepositoryMapper hogeRepositoryMapper;

    @Override
    public String execute() {
        var res = hogeRepositoryMapper.selectTest();
        return res.toString();
    }    
}
