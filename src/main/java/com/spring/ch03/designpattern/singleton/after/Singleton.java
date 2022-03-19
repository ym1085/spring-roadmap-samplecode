package com.spring.ch03.designpattern.singleton.after;

public class Singleton {
    static Singleton singleton; // static reference variable

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}