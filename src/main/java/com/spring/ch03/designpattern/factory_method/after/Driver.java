package com.spring.ch03.designpattern.factory_method.after;

/**
 * Factory method 패턴 적용 후 호출 부
 *
 * @desc : Implement Proxy pattern
 * @since : 2022-03-19 Sat 23:03
 */
public class Driver {

    public static void main(String[] args) {
        // 팩터리 메서드를 보유한 객체를 생성
        Animal bolt = new Dog();
        Animal kitty = new Cat();

        // 팩터리 메서드가 반환하는 객체들
        AnimalToy boltBall = bolt.getToy();
        AnimalToy kittyTower = kitty.getToy();

        // 팩터리 메서드가 반환한 객체들을 사용
        boltBall.identify();
        kittyTower.identify();
    }
}
