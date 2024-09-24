package org.example.ex4_Uppercase;

import java.util.ArrayList;
import java.util.List;

/*
    Write a method that converts all strings in a list to their upper case using streams.
*/
public class UpperCaseStream {
    public static void main(String[] args) {
        String abc = "ana Are MerRe si Pere ";



        List<String> texts = List.of("ana" , "are " , "mere");



        System.out.println("original " + texts );
        List<String> textsUpper1 = convertStringListToUpperCaseFor(texts);
        displayTexts(textsUpper1);

        List<String> textsUpper2 = convertStringListToUpperCaseStream(texts);
        displayTexts(textsUpper2);

        System.out.println(texts);
        System.out.println(abc.toUpperCase());

        convertStringListToUpperCaseReplace(texts);
        displayTexts(texts);

    }

    private static void convertStringListToUpperCaseReplace(List<String> texts) {
        texts.replaceAll(it -> it.toUpperCase());
    }

    private static void displayTexts(List<String> listOfTexts) {
        for(String it: listOfTexts){
            System.out.print(it + " ");
        }
        System.out.println();
    }

    private static List<String> convertStringListToUpperCaseStream(List<String> texts) {
        return texts
                .stream()
                .map(it -> it.toUpperCase()) // String::toUpperCase()
                .toList();
    }

    private static List<String> convertStringListToUpperCaseFor(List<String> texts) {
            List<String> result = new ArrayList<>();

            for (String it: texts){
                result.add(it.toUpperCase());
            }
            return result;
    }

}
