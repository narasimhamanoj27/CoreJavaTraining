package com.demo.freshertraining.loops;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        String name = "Ma:noj";
        String[] chars = name.split(":");

        for (String intNum : chars) {
            System.out.println(intNum);
        }
    }
}
