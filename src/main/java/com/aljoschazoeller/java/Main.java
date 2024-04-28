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
    }
}
