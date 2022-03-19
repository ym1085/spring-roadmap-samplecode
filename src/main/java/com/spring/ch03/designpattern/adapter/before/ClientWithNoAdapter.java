package com.spring.ch03.designpattern.adapter.before;

/**
 * Adapter pattern 적용 전, 호출 부
 * @since : 2022-03-19 Sat 21:13
 * @desc  : Before Implement Adapter Pattern
 */
public class ClientWithNoAdapter {

    public static void main(String[] args) {
        System.out.println("========================================================");

        ServiceA serviceA = new ServiceA();
        ServiceB serviceB = new ServiceB();

        serviceA.runServiceA();
        serviceB.runServiceB();

        System.out.println("========================================================");
    }
}
