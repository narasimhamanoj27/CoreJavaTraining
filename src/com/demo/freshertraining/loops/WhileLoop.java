package com.demo.freshertraining.loops;

/**
 * Printing Fibonacci Series using WHILE LOOP
 */
public class WhileLoop {
    public static void main(String[] args) {
        int a, b, c, i = 1;
        int n = 10;
        a = b = 1;
        System.out.print(a + " " + b);

        while(i < n) {
            c = a + b;
            System.out.print(" ");
            System.out.print(c);
            a = b;
            b = c;
            i++;
        }
    }
}
