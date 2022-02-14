package com.livecoding.aggregation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AggregationExample {
    public static void main(String[] args) {
        /*Student s1 = new Student("Manoj", 30, "CSE");
        Student s2 = new Student("Hemalatha", 22, "CSE");
        Student s3 = new Student("Praveen", 23, "ECE");
        Student s4 = new Student("Madhuri", 23, "ECE");

        List<Student> cse_students = new ArrayList<>();
        cse_students.add(s1);
        cse_students.add(s2);

        List<Student> ece_students = new ArrayList<>();
        ece_students.add(s3);
        ece_students.add(s4);
        Department cse_department = new Department("CSE", cse_students);
        Department ece_department = new Department("ECE", ece_students);
        List<Department> departments = new ArrayList<>();
        departments.add(ece_department);
        departments.add(cse_department);

        Institute institute = new Institute("MIT", departments);

        System.out.print(institute.getSumOfStudentsFromCollege());*/
        Student s = new Student("Manoj", 30, "CSE");
       // System.out.print(s instanceof Student);
        Department d = new Department("CES", Arrays.asList(s));
       // System.out.print(d instanceof Department);

        AggregationExample ae = new AggregationExample();
        System.out.println(ae instanceof Object);
    }
}
