package com.spring.ch03.designpattern.strategy.after;

public class StrategySword implements Strategy {

    // 전략 메서드 오버라이딩, 하위 클래스에서 재정의
    @Override
    public void runStrategy() {
        System.out.println("챙! 챙! 챙!, 검을 휘두르는 전략!");
    }
}
