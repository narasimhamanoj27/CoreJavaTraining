package com.demo.freshertraining.loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int input = 5;
        multiplication(input);
    }

    private static void multiplication(int input) {
        for (int i = input; i <= input; i--) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i+" * "+j+" = "+(i*j));
            }
            if(i == 1){
                break;
            }
        }
    }
}
