package org.example.avarage;
/*
    Write a method that returns the average of a list of integers using streams
*/

import java.util.List;

public class AvarageStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,2,4,9);
        System.out.println("Avarage pf list using Stream is: " + calculateAvgStream(list));
        System.out.println("Avarage pf list using for  is: " + calculateAvgFor(list));
    }

    private static Double calculateAvgStream(List<Integer> list) {
        double sum = 0;
        for (int i = 0; i <list.size() ; i++) {
            sum += list.get(i);

        }
        return sum/list.size();
    }

    private static Double calculateAvgFor(List<Integer> list) {
        return list
                .stream()
                .mapToDouble(it -> it.doubleValue())//Double::doubleValue
                .average()
                .orElse(0.0);

    }


}
