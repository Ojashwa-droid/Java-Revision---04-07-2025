package com.ojas.collectionsframework.list.arraylist;

public class Student implements Comparable<Student> {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }


    // this.compareTo(otherObject)
    @Override
    public int compareTo(Student o) {   // for natural ordering
/*        if (o.getGpa() - this.gpa > 0)
            return 1;
        else if (o.getGpa() - this.gpa < 0)
            return -1;
        else
            return 0;
*/
        return Double.compare(o.getGpa(), this.getGpa());

    }
}
