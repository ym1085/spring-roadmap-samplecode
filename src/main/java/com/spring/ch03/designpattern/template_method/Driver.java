package com.spring.ch03.designpattern.template_method;

/**
 * Template method 패턴 적용 후 호출 부
 *
 * @desc : Implement Proxy pattern
 * @since : 2022-03-19 Sat 22:46
 */
public class Driver {

    public static void main(String[] args) {
        System.out.println("========================================================");

        // abstract class Animal
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        bolt.playWithOwner();

        System.out.println();
        System.out.println();

        kitty.playWithOwner();

        System.out.println("========================================================");
    }
}
