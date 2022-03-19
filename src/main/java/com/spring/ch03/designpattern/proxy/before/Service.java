package com.spring.ch03.designpattern.proxy.before;

import com.spring.ch03.designpattern.proxy.after.IService;

public class Service implements IService  {

    public String runSomething() {
        return "서비스를 실행합니다.";
    }
}
