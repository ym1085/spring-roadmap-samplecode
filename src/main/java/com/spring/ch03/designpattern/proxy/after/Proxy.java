package com.spring.ch03.designpattern.proxy.after;

import com.spring.ch03.designpattern.proxy.before.Service;

// After : Class Proxy
// @desc : 중간 대리자의 역할을 수행, 호출에 대한 변경이 아닌 제어가 주 목적
public class Proxy implements IService {
    IService service; // 인터페이스 IService의 참조 변수를 맴버로 갖는다

    @Override
    public String runSomething() { // Service 객체와 동일한 이름을 가진다
        System.out.println("호출에 대한 제어가 주목적, 반환 결과를 그대로 전달");

//        TODO : writer business logic here

        service = new Service();
        return service.runSomething();
    }
}
