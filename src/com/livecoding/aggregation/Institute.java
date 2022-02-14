package com.livecoding.aggregation;

import java.util.List;

public class Institute {

    String instituteName;
    private List<Department> departments;

    public Institute(String instituteName, List<Department> departments) {
        this.instituteName = instituteName;
        this.departments = departments;
    }

    public int getSumOfStudentsFromCollege() {
        int totalStudents = 0;
        List<Student> students;
        for (Department dept : departments) {
            students = dept.getStudents();
            for(Student student : students) {
                totalStudents++;
            }
        }
        return totalStudents;
    }
}
