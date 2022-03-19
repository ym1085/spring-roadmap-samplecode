package com.spring.ch03.designpattern.decorate.after;

public class Decorator implements IService {
    IService service;

    @Override
    public String runSomething() {
        // System.out.println("호출에 대한 흐름 제어가 주목적, 반환 결과를 그대로 전달") // Proxy 에서의 print
        System.out.println("호출에 대한 장식이 목적, 클라이언트에게 반환 결과에 장식을 더하여 전달");

        service = new Service();
        return "정말 이렇게 해야만 하는가??, " + service.runSomething();
    }
}
