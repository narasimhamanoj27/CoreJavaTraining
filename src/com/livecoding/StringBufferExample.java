package com.livecoding;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer name = new StringBuffer("Manoj");
        StringBuffer name1 = new StringBuffer("Shivani");
        System.out.println(name == name1);
        System.out.println(name.equals(name1));
        name.append(" Garimella").append(" Akella").append(" adkfaldf");
        System.out.println(name);
    }
}
