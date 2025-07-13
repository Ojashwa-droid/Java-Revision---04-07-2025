package com.ojas.oops.introduction;

public class Main {
    public static void main(String[] args) {

        // store data of 5 students : {rollNo, name, marks}
//        int[] rollNo = new int[5];
//        String[] name = new String[5];
//        double[] marks = new double[5];

        /* But the problem in above method is that we have created 3
         different data structures to store the 3 properties of a student */

        // utilizing a class (template)

        Student student1 = new Student();
//        student1.name = "Ojashwa";
//        student1.rollNo = 20;
//        student1.marks = 99.9;

        System.out.println(student1.marks);
        student1.changeName("Tripathi");
        student1.greeting();

        Student student2 = new Student(13, "Tejashwa", 67.89);
        System.out.println(student2.name);

        Student student3 = new Student(student2);
        System.out.println(student3.name);

        Student one = new Student();
        Student two = one;

        two.name = "Dadhich";
        System.out.println(one.name);

        final int SALARY = 100000000;
//        SALARY = 33333334;  not allowed in java as the variable is set to final

//        Student random = new Student();
//        for (int i = 0; i < 10000000; i++) {
//            random = new Student();
//        }


    }


}

// create a class that does the above-mentioned task for us

class Student {
    int rollNo;
    String name;
    double marks;


    // We need a way to add the values of the above properties (rollNo, name, marks)
    // object by object

    // We need one word to access every object - "this" keyword

    /*Student() {
//        student1.rollNo = 203; this is specific to a single instance so are we going to create a constructor
                for every object that we create ? the ans is no
//        student1.name = "Ojash";
//        student1.marks = 89.9;

        this.rollNo = 203;
        this.name = "Ojashwa Tripathi";
        this.marks = 89.95;
    }*/

    Student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    Student (Student other){
        this.rollNo = other.rollNo;
        this.name = other.name;
        this.marks = other.marks;
    }

    // this is how you call a constructor from another constructor

    Student (){
        this(15, "Apeksha", 98.0);
    }



    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

    void changeName(String name){
        this.name = name;
    }

    // Garbage collector

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is being destroyed!");
//    }
}
