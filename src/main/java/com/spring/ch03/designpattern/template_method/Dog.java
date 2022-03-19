package com.spring.ch03.designpattern.template_method;

public class Dog extends Animal {

    // 추상 메서드
    @Override
    void play() {
        System.out.println("Class Dog play() => 멍! 멍! 멍!");
    }

    // 훅(Hook) 메서드
    @Override
    void runSomething() {
        System.out.println("Class Dog runSomething() => 멍! 멍! 꼬리 살랑 살랑~");
    }
}
