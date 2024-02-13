package com.example.demo.service.impl;

import java.io.Console;
import java.util.List;

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
    public List<Parent> execute() {
        var res = hogeRepositoryMapper.selectTest();
        return res;
    }    
}
