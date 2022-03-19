package com.spring.ch03.designpattern.proxy.before;

/**
 * Proxy 패턴 적용 전 호출 부
 * @since : 2022-03-19 Sat 21:48
 * @desc  : Before Implement Proxy pattern
 */
public class ClientWithNoProxy {

    public static void main(String[] args) {
        System.out.println("========================================================");

        Service service = new Service();
        System.out.println("Before Impl Proxy = " + service.runSomething());

        System.out.println("========================================================");
    }
}
