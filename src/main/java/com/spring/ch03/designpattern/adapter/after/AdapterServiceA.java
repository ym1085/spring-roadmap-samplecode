package com.spring.ch03.designpattern.adapter.after;

import com.spring.ch03.designpattern.adapter.before.ServiceA;

public class AdapterServiceA {
    ServiceA sa1 = new ServiceA();

    // 프록시 역할, 참조 변수를 통해 해당 메서드를 호출
    void runService() {
        System.out.println("ServiceA의 중간 미들웨어 역할!!");
        sa1.runServiceA();
    }
}
