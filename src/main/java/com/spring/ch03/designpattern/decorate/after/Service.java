package com.spring.ch03.designpattern.decorate.after;

public class Service implements IService {

    @Override
    public String runSomething() {
        return "추상 메서드 runSomething 호출!";
    }
}
