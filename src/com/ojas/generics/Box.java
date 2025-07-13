package com.ojas.generics;

// NOW THIS CLASS HAS BECOME A GENERIC TYPE
// meaning we will provide a type as well for the 'T' placeholder at the time of object creation
// It's nothing but a placeholder of what datatype the class will work with


// Bounded type parameter, now T can only be a class that extends Number class in java
public class Box<T extends Number> {
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
