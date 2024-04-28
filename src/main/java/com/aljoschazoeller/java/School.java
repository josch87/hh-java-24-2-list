package com.aljoschazoeller.java;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private List<Student> students = new ArrayList<>();

    public School(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void printStudents() {
        System.out.println("Students of " + name + " school:");
        this.students.forEach(student -> {
            System.out.println(student.firstName + " " + student.lastName + " (" + student.studentID + ")");
        });
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
