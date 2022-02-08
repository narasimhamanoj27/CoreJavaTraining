package com.livecoding;

public interface IMathUtility {

    default int addition(int a, int b) {
        return a + b;
    }

    public int add();

}
