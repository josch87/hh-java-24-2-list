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
        if (this.students.isEmpty()) {
            System.out.println("There are currently no students in " + name + " school.");
        } else {
            System.out.println("Students of " + name + " school:");
            this.students.forEach(student -> {
                System.out.println(student.firstName + " " + student.lastName + " (" + student.studentID + ")");
            });
        }
    }

    public Student findByID(String targetID) {
        for (Student student : students) {
            if (student.studentID.equals(targetID)) {
                return student;
            }
        }
        return null;
    }

    public void removeStudent(Student studentToRemove) {
        Student isInSchool = findByID(studentToRemove.studentID);
        if (isInSchool == null) {
            throw new IllegalArgumentException("Student not found in school");
        }
        this.students.remove(studentToRemove);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", students=" + students +
                '}';
    }
}
