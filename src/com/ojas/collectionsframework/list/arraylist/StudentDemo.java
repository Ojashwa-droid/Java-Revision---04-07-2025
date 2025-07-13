package com.ojas.collectionsframework.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class MyStudentComparator implements Comparator<Student>{

    @Override
    public int compare(Student o1, Student o2) {
        if (o2.getGpa() - o1.getGpa() > 0)
            return 1;
        else if (o2.getGpa() - o1.getGpa() < 0)
            return -1;
        else
            return o1.getName().compareTo(o2.getName());
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ojashwa", 9.2));
        students.add(new Student("Apeksha", 9.0));
        students.add(new Student("Krishna", 8.7));
        students.add(new Student("Tejashwa", 8.89));

//        students.sort(null); // can not use natural ordering as we don't know what might be the natural order

//        students.sort((o1, o2) -> (int) (o2.getGpa() - o1.getGpa()));
//        students.sort((o1, o2) -> {
//            if (o2.getGpa() - o1.getGpa() > 0)
//                return 1;
//            else if (o2.getGpa() - o1.getGpa() < 0)
//                return -1;
//            else
//                return o1.getName().compareTo(o2.getName());
//        });
//        System.out.println(students); can not use it as we haven't given our toString()
//        for (Student student: students){
//            System.out.println(student.getName() + ": " + student.getGpa());
//        }


        // WE CAN USE METHOD REFERENCE AS WELL USING COMPARATOR
        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed()
                .thenComparing(Student::getName);

        students.sort(comparator);
        for (Student student: students){
            System.out.println(student.getName() + ": " + student.getGpa());
        }

    }
}
