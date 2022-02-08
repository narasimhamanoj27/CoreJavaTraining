package com.livecoding;
import com.livecoding.IMathUtility;
public class HelloWorld {

    static public final String URL = "Manoj";

    static public void main(String args[]) {
        MathUtility math = new MathUtility(10);
        final int age = 10; // Local variable
        System.out.println(age);
        // math.setAge(20);
        System.out.println(math.getAge());
    }

}
