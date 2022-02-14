package com.livecoding.aggregation;

import com.livecoding.aggregation.Student;

import java.util.List;

public class Department {
    String name;
    private List<Student> students;

    Department(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    // Getter
    public List<Student> getStudents() {
        return students;
    }
}
