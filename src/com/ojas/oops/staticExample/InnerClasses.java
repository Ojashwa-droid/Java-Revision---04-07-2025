package com.ojas.oops.staticExample;

public class InnerClasses {

    // This static inner class is independent of the outer class
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }
    }

    // Whereas this non-static inner class is dependent on the outer class's instance
    class TestB {
        String name;

        public TestB(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Ojashwa");
        Test b = new Test("Tejashwa");

        InnerClasses innerClasses = new InnerClasses();
        InnerClasses.TestB b1 = innerClasses.new TestB("sth sth");
        System.out.println(b1.name);
    }
}
