package com.demo.freshertraining.loops;

/**
 * Printing Even numbers using Do-While Loop
 */
public class DoWhileLoop {
    public static void main(String[] args) {

        int max = 20;
        int i = 0;
        do {
            System.out.print(i + " ");
            i += 2;
        } while (i <= max);
    }
}
