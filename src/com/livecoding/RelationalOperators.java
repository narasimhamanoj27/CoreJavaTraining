package com.livecoding;

public class RelationalOperators {
    public static void main(String[] args) {
        int a = 50;
        int b = 40;
        b += 10; // b = b + 10; = 50
        a -= 5; // a = a - 5; = 45
        b *= 2; // b = b * 2; = 100
        b %= 5; // b = b % 5; = 0
        if (!(a == 50 && b == 30)) { // Decision making Statement
            System.out.print("False");
        }
    }
}
