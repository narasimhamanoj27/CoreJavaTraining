package com.livecoding;

public class StringExample {
    public static void main(String[] args) {
        String name = "Manoj";
        String name1 = "Manoj";
        name = name.concat(" Garimella");
        name1 = name1 + " Akella";
        //System.out.println(name);
        //System.out.println(name1);
        System.out.println(name.substring(1, 9).length());
    }
}
