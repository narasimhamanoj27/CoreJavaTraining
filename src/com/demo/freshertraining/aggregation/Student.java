package com.demo.freshertraining.aggregation;

public class Student implements Comparable<Student> {
    String name;
    int age;
    String department;

    Student(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }

    @Override
    public int compareTo(Student o) {
        return 0;
    }
}
