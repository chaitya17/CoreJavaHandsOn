package com.chaitanya.corejava.day2;

import static java.lang.Thread.sleep;

public class ExceptionThrowsKeyword {

    static void m2()throws InterruptedException{
        m1();
    }
    static void m1()throws InterruptedException{
        sleep(200);
    }
    public static void main(String[] args) throws InterruptedException {
        m2();
    }
}
