package com.chaitanya.corejava.day2;

public class ExceptionThrowKeyword {

    static ArithmeticException arithmeticException=new ArithmeticException("Divide by zero");

    public static void main(String[] args)  {
        throw arithmeticException;
    }
}
