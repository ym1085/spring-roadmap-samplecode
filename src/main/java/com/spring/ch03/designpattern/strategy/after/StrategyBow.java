package com.spring.ch03.designpattern.strategy.after;

public class StrategyBow implements Strategy {

    // 전략 메서드 오버라이딩, 하위 클래스에서 재정의
    @Override
    public void runStrategy() {
        System.out.println("슝! 슝! 슝!, 활을 쏘는 전략!");
    }
}
