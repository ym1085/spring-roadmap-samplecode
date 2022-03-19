package com.spring.ch03.designpattern.proxy.after;

import com.spring.ch03.designpattern.proxy.before.Service;

/**
 * Proxy 패턴 적용 후 호출 부
 * @since : 2022-03-19 Sat 21:56
 * @desc  : Before Implement Proxy pattern
 */
public class ClientWithProxy {

    public static void main(String[] args) {
        System.out.println("========================================================");

        // 01. 중간 프록시를 두고 프록시에서 호출
        IService proxy = new Proxy();
        System.out.println("01. After Proxy Impl = " + proxy.runSomething());

        System.out.println();

        // 02. 중간 프록시 없이 바로 접근, 흐름 제어가 불가능
        IService proxySecond = new Service();
        System.out.println("02. After Proxy Impl with Service = " + proxy.runSomething());

        System.out.println("========================================================");
    }
}
