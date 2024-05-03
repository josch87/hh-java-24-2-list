package com.aljoschazoeller.java;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("12641872648", "Benjamin", "Blümchen"));
        students.add(new Student("12648725382", "Mickey", "Mouse"));
        students.add(new Student("68263487232", "Donald", "Duck"));
        students.add(new Student("34769823562", "Alfred Jodokus", "Quack"));

        System.out.println(students);

        School berthaVonSuttner = new School("Bertha von Suttner");
        System.out.println(berthaVonSuttner);

        Student benjamin = students.getFirst();
        System.out.println(benjamin);

        berthaVonSuttner.addStudent(students.getFirst());
        berthaVonSuttner.addStudent(students.get(3));
        System.out.println(berthaVonSuttner);

        berthaVonSuttner.printStudents();

        System.out.println(berthaVonSuttner.findByID("34769823562"));
        benjamin.addCourse(new Course("Biology", "Prof. Snape", "Darkroom"));
        System.out.println(benjamin);

        berthaVonSuttner.removeStudent(berthaVonSuttner.findByID("34769823562"));
        berthaVonSuttner.removeStudent(students.getFirst());
        berthaVonSuttner.printStudents();
    }
}
