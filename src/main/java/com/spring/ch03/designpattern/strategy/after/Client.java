package com.spring.ch03.designpattern.strategy.after;

// 전략 패턴의 Client 역할
public class Client {

    public static void main(String[] args) {
        System.out.println("========================================================");
        Strategy strategy = null;
        Soldier rambo = new Soldier();

        // 총을 람보에게 전달, 전투 수행
        strategy = new StrategyGun();
        rambo.runContext(strategy);

        System.out.println();

        // 검을 람보에게 전달, 전투 수행
        strategy = new StrategySword();
        rambo.runContext(strategy);

        System.out.println();

        // 활을 람보에게 전달, 전투 수행
        strategy = new StrategyBow();
        rambo.runContext(strategy);
        System.out.println("========================================================");
    }
}
