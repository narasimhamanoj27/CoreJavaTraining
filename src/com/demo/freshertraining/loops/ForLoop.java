package com.demo.freshertraining.loops;

/**
 * Printing Prime Numbers using FOR LOOP
 */
public class ForLoop {
    public static void main(String[] args) {
        int max = 100;
        for (int i = 1; i <= max; i++) { // 1 <= 100, 2 <= 100, 3 ..... 100 <= 100, 101 <= 100
            if(isPrime(i)) // TRUE
                System.out.print(i + " ");
        }
    }

    private static boolean isPrime(int max) { // MAX = 1, 2, 3, 4, 5

        if (max == 1 || max == 0)
            return false;
        for (int i = 2; i < max; i++) { // 2 < 2 3 < 3
            if(max % i == 0) {
                return false;
            }
        }
        return true;
    }


}
