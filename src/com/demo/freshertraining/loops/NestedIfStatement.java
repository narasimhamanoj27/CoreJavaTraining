package com.demo.freshertraining.loops;

public class NestedIfStatement {
    public static void main(String[] args) {

        int age = 20;
        int weight = 80;

        if (age >= 18) {
            if (weight > 50) {
                System.out.println("You are eligible to donate blood");
            } else {
                System.out.println("You are eligible to donate blood");
            }
        } else {
            System.out.println("You are eligible to donate blood");
        }
    }
}