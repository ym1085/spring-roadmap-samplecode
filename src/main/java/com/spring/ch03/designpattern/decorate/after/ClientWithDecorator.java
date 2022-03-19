package com.spring.ch03.designpattern.decorate.after;

/**
 * Decorator pattern 적용 후 호출 부
 * @since : 2022-03-19 Sat 22:13
 * @desc  : After Implement Decorator Pattern
 */
public class ClientWithDecorator {

    public static void main(String[] args) {
        System.out.println("========================================================");

        IService decorator = new Decorator();
        System.out.println("After Impl decorate pattern = " + decorator.runSomething());

        System.out.println("========================================================");
    }
}
