package com.livecoding;

public class CallByValue {
    public static void main(String[] args) {
        int i = 10;
        Integer j = 30;
        add(i);
        System.out.println("After call : "+ i);
        addition(j);
        System.out.println("After primitive : " + j);
    }

    public static void add(int i) {
        i = 30;
        System.out.println(i);
    }

    public static void addition(Integer i) {
        i = 40;
        System.out.println(i);
    }
}
