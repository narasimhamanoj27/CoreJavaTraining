package com.demo.freshertraining.loops;

/**
 * Example break statement
 */
public class BreakStatement {
    public static void main(String[] args) {
        int max = 10;
        for (int j = 0; j <= max; j++) {
            System.out.print(j + " "); // Printing until i equals 6.
            if(j == 6){
                break;
            }
        }
    }
}
