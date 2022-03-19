package com.spring.ch03.designpattern.template_method;

public abstract class Animal {

    public void playWithOwner() {
        System.out.println("Class Animal playWithOwner => 귀염둥이 이리온...");
        play();
        runSomething();
        System.out.println("Class Animal playWithOwner => 잘했어!!");
    }

    abstract void play();

    void runSomething() {
        System.out.println("꼬리 살랑 살랑~");
    }
}
