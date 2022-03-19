package com.spring.ch03.designpattern.template_method;

public class Cat extends Animal {

    // 추상 메서드
    @Override
    void play() {
        System.out.println("Class Cat play() => 야옹~ 야옹~");
    }

    // 훅(Hook) 메서드
    @Override
    void runSomething() {
        System.out.println("Class Cat runSomething() => 야옹~ 야옹~ 꼬리 살랑 살랑~");
    }
}
