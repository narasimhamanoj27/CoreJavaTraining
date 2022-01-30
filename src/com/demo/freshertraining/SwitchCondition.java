package com.demo.freshertraining;

import java.util.Scanner;

public class SwitchCondition {

    /**
     * Switch case
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String var =  sc.nextLine();
        switchCase(var);
    }

    private static void switchCase(String var) {

        switch (var) {
            case "Honda":
                System.out.print("This is for Honda");
                break;
            case "Hyundai":
                System.out.print("This is for Hyundai");
                break;
            case "Mazda":
                System.out.print("This is for Mazda");
                break;
            default:
                System.out.print("There is no default car preference");
        }
    }


}
