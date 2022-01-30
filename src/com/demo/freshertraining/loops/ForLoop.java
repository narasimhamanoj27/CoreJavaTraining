package com.demo.freshertraining.loops;

/**
 * Printing Prime Numbers using FOR LOOP
 */
public class ForLoop {
    public static void main(String[] args) {
        int max = 100;
        for (int i = 1; i <= max; i++) {
            if(isPrime(i))
                System.out.print(i + " ");
        }
    }

    private static boolean isPrime(int max) {

        if (max == 1 || max == 0)
            return false;
        for (int i = 2; i < max; i++) {
            if(max%i == 0) {
                return false;
            }
        }
        return true;
    }


}
