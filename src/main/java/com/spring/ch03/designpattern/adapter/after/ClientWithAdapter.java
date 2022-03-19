package com.spring.ch03.designpattern.adapter.after;

/**
 * Adapter pattern 적용 후 호출 부
 * @since : 2022-03-19 Sat 21:17
 * @desc  : After Implement Adapter Pattern
 */
public class ClientWithAdapter {

    /**
     * 메서드명을 동일하게 가져갈 수 있으며, 직접 서비스 객체에 접근하지 않는다.
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("========================================================");
        AdapterServiceA adapterServiceA = new AdapterServiceA();
        AdapterServiceB adapterServiceB = new AdapterServiceB();

        adapterServiceA.runService();
        adapterServiceB.runService();
        System.out.println("========================================================");
    }
}
