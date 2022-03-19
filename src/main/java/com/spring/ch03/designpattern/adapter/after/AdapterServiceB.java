package com.spring.ch03.designpattern.adapter.after;

import com.spring.ch03.designpattern.adapter.before.ServiceB;

public class AdapterServiceB {
    ServiceB sb1 = new ServiceB();

    // 프록시 역할, 참조 변수를 통해 해당 메서드를 호출
    void runService() {
        System.out.println("ServiceB의 중간 미들웨어 역할!!");
        sb1.runServiceB();
    }
}
