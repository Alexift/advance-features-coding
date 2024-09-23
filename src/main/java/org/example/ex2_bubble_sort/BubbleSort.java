package org.example.ex2_bubble_sort;
/*
    Write a program that receives array size (n) from user (System.in). Next, receive n
    numbers from user and put them in the array.

    Implement bubble sort algorithm to sort this array in ascending order.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        //Citire
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the siye of the List:");
        int size = scanner.nextInt();

        List<Integer> number = new ArrayList<>(size);
        System.out.println("Enter the elementes of the list : ");
        for (int i = 0; i < size; i++) {
            int tmp = scanner.nextInt();
            number.add(tmp);

        }


        //Sortare
        bubbleSort(number);

        //Afisare
        System.out.println("Sorted List :");
        for (Integer it : number) {
            System.out.println(it + " ");
        }
    }

    private static void bubbleSort(List<Integer> number) {
        int n = number.size();
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (number.get(j) > number.get(j + 1)) {
                    swapped = true;
                    int tmp = number.get(j);
                    number.set(j, number.get(j + 1));
                    number.set(j + 1, tmp);
                }

            }
            if (!swapped) {
                break;
            }
        }
    }
}

//    private static void bubbleSortDoWhile(List<Integer> number) {
//        int n = number.size();
//        boolean swapped;
//        do {
//            swapped = false;
//            for (int j = 0; j < n - 1; j++) {
//                if (number.get(j) > number.get(j + 1)) {
//                    swapped = true;
//                    int tmp = number.get(j);
//                    number.set(j, number.get(j + 1));
//                    number.set(j + 1, tmp);
//                }
//
//            }
//
//        } while (swapped);
//        {};}


