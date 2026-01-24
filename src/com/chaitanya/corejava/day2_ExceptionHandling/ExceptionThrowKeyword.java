package com.chaitanya.corejava.day2_ExceptionHandling;

public class ExceptionThrowKeyword {

    static ArithmeticException arithmeticException=new ArithmeticException("Divide by zero");

    public static void main(String[] args)  {
        throw arithmeticException;
    }
}
