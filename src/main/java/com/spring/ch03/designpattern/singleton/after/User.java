package com.spring.ch03.designpattern.singleton.after;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private String getInfo() {
        return "이름은 = " + this.name + ", 나이는 = " + this.age;
    }
}
