package com.spring.ch03.designpattern.singleton.after;

import java.util.ArrayList;
import java.util.List;

/**
 * Singleton 패턴 적용 후 호출 부
 *
 * @desc : Implement Proxy pattern
 * @since : 2022-03-19 Sat 22:19
 */
public class Client {

    public static void main(String[] args) {
        System.out.println("========================================================");
        // 'Singleton()' has private access
        // Singleton singleton = new Singleton(); // error!

        List<Singleton> singletonList = new ArrayList<>();
        singletonList.add(Singleton.getInstance());
        singletonList.add(Singleton.getInstance());
        singletonList.add(Singleton.getInstance());
        singletonList.add(Singleton.getInstance());
        singletonList.add(Singleton.getInstance());

        for (Singleton s : singletonList) {
            System.out.println("After Impl Singleton = " + s); // print memory address
        }

        System.out.println();

        List<User> userList = new ArrayList<>();
        userList.add(new User("하연수", 10));
        userList.add(new User("한지민", 20));
        userList.add(new User("오연수", 30));
        userList.add(new User("김종국", 40));
        userList.add(new User("유재석", 50));

        for (User user : userList) {
            System.out.println("After Impl Singleton None = " + user);
        }

        System.out.println("========================================================");
    }
}
