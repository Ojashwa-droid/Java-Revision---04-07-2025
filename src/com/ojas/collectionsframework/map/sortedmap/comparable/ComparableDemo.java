package com.ojas.collectionsframework.map.sortedmap.comparable;

import com.ojas.collectionsframework.list.arraylist.Student;

import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ojashwa", 9.2));
        students.add(new Student("Krishna", 8.9));
        students.add(new Student("Apeksha", 9.0));
        students.add(new Student("Meenal", 9.4));
        students.add(new Student("Sumit", 8.2));

        students.sort(null); // we want default or natural ordering of the list of students
       for (Student student: students){
           System.out.println("Name: " + student.getName() + ", GPA: " + student.getGpa());
       }
    }
}
