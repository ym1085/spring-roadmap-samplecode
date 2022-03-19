package com.spring.ch03.designpattern.strategy.after;

// 전략 패턴의 Context 역할
public class Soldier {

    void runContext(Strategy strategy) {
        System.out.println("소환사의 협곡에 오신것을 환영합니다.");
        strategy.runStrategy();
        System.out.println("전투가 종료되었습니다.");
    }
}
