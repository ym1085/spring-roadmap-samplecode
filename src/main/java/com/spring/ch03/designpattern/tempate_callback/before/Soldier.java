package com.spring.ch03.designpattern.tempate_callback.before;

public class Soldier {

    void runContext(Strategy strategy) {
        System.out.println("소환사의 협곡에 오신것을 환영합니다.");
        strategy.runStrategy();
        System.out.println("전투가 종료되었습니다.");
    }

    void runContext(String weaponSound) {
        System.out.println("소환사의 협곡에 오신것을 환영합니다.");
        executeWeapon(weaponSound).runStrategy();
        System.out.println("전투가 종료되었습니다. \n");
    }

    private Strategy executeWeapon(final String weaponSound) {
        return new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println(weaponSound);
            }
        };
    }
}
