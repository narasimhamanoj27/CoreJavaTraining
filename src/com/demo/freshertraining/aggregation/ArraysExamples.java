package com.demo.freshertraining.aggregation;

public class ArraysExamples {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        students[0] = new Student("Shivani", 22, "CSE");
        students[1] = new Student("Sravani", 22, "CSE");
        students[2] = new Student("Manoj", 22, "CSE");
        students[3] = new Student("Praveen", 22, "CSE");
        students[4] = new Student("Shyam", 22, "CSE");

        for (int i = 0; i < students.length; i++) {
            System.out.println("Name : "+students[i].name+", Age : "+students[i].age);
        }
    }
}
