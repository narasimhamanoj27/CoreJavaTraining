package org;

public class ConstructorTest {
    public static void main(String[] args) {
        ConstructorMain cm = new ConstructorMain(10, "Manoj", "Class");
        System.out.print(cm.toString());
        
        ConstructorMain cm1 = new ChildConstructor("Married");
        System.out.println(cm1.getClassName());
    }
}