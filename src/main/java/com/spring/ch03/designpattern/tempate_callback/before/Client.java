package com.spring.ch03.designpattern.tempate_callback.before;

public class Client {

    public static void main(String[] args) {
        System.out.println("========================================================");
        Soldier rambo = new Soldier();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("총! 총! 총! 총을 발사한다!");
            }
        });

        System.out.println();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("검! 검! 검! 검을 휘두른다!");
            }
        });

        System.out.println();

        rambo.runContext(new Strategy() {
            @Override
            public void runStrategy() {
                System.out.println("도끼! 도끼! 도끼! 도끼를 휘두른다!");
            }
        });

        System.out.println();
        System.out.println("Lambda 사용");

        // lambda 사용
        rambo.runContext(() -> System.out.println("총! 총! 총! 총을 발사한다! \n"));
        rambo.runContext(() -> System.out.println("검! 검! 검! 검을 휘두른다! \n"));
        rambo.runContext(() -> System.out.println("도끼! 도끼! 도끼! 도끼를 휘두른다! \n"));

        System.out.println("========================================================");
    }
}
