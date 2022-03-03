package com.livecoding;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListGenerics {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,0,4,5,6,7);
        System.out.println(numbers);
        List<Integer> newList = numbers.stream().sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(newList);
    }
}
