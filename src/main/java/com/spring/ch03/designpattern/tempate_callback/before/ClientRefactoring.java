package com.spring.ch03.designpattern.tempate_callback.before;

public class ClientRefactoring {

    public static void main(String[] args) {
        Soldier rambo = new Soldier();

        rambo.runContext("총! 발사!");
        rambo.runContext("검! 찌르기!");
        rambo.runContext("활! 발사!");
    }
}
