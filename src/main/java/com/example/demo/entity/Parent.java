package com.example.demo.entity;

import java.util.List;

import lombok.Data;

@Data
public class Parent {

    private Long parentId;

    private String parentName;

    // private Long childFirstId;

    // private String childFirstName;

    // private Long childSecondId;

    // private String childSecondName;

    private List<ChildFirst> childFirstList;

    private List<ChildSecond> childSecondList;
}