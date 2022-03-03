package com.livecoding;

public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Manoj");
        StringBuilder name1 = new StringBuilder("Manoj2");
        System.out.println(name == name1);
        System.out.println(name.equals(name1));
        // System.out.println(name.compareTo(name1));
    }
}
