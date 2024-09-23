package org.example.ex4_Uppercase;

import java.util.List;

/*
    Write a method that converts all strings in a list to their upper case using streams.
*/
public class UpperCaseStream {
    public static void main(String[] args) {
        String abc = "abs" , "adc"
        abc.toUpperCase();

        List<String> texts = List.of("ana" , "are " , "mere");

        System.out.println(texts);

    }
}
