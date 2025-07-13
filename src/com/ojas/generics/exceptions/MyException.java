package com.ojas.generics.exceptions;

public class MyException extends Exception{

    private String message;
    private Integer value;

    public <T> MyException(T value){
        super("Exception caught : " +
                value.toString() +
                " with class : " +
                value.getClass().getName()
        );
    }

    MyException(String message, Integer value){
        super(message);
        this.value = value;
    }
}
