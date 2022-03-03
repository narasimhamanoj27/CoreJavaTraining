package com.livecoding;

public interface GenericAddition<T extends Integer, E extends Integer> {

    default void add(T t, E e) {
        System.out.println();
    }
}
