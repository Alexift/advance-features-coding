package org.example.ex1_recerse_number;

/*
    Reverse a number using while Loop.
    The program will prompt user to input the number,
    and then it will reverse the same number using while loop.

    Metoda 1
    While (??)


    Metoda 2
    8765 -> Array ?
    array = {8,7,6,5}
    parcurs invers

    Metoda 3
    8765 -> toString -> List<Character>

    Ce e complexitatea ? de ce alegem varianta 1 in locul lui 2 si 3 ?

*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        // Scanner - citire
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println("Solution 1 " + getReverseNumberM1(number));
        System.out.println("Solution 2 " + getReverseNumberM2(number));
        System.out.println("Solution 3 " + getReverseNumberM3(number));

    }

    private static int getReverseNumberM3(int number) {
        int reversedNumber = 0;
        String reversedStr ="";
        String numberStr = Integer.toString(number);
        int index = Integer.toString(number).length() -1; // genul acesta de metoda e utilizat pentru conversia tipului de date intre wrappere

        while (index >= 0 ) {
          reversedStr = reversedStr +numberStr.charAt(index);
          index--;

        }
        reversedNumber = Integer.parseInt(reversedStr);

        return reversedNumber;
    }

    private static int getReverseNumberM2(int number) {
        List<Integer> numberDigits = new ArrayList<>();
        int reversedNumber = 0;
        for (int i = 0;number > 0 ; i++) {
            numberDigits.add(number%10);
            number /= 10;


        }

        System.out.println("Number Digits: " + numberDigits);
        for (Integer it: numberDigits){
            reversedNumber = reversedNumber * 10 + it;
        }
        return reversedNumber;
    }

    private static int getReverseNumberM1(int number) {
        /*
        8765 - while (8765 > 0 ){
            - extragem restul cu number %10             -> 5
            - Elimincam cifra unitatiler cu number /10  -> 876
            - Reconstruim numaru                        ->Revesenumber*10 + rest

         */
        int reverseNumber = 0;
        while (number > 0) {
            int rest = number %10;
            number = number /10 ;
            reverseNumber = reverseNumber * 10 +rest;
        }

        return reverseNumber;
    }

    /*
    daca numarul are zerouri in extremitati ? 1990
    S1: recostituire inversa sub forma de string -> Seamana cu m3 alterat
    s2: Salvarea ifrelor intr-o Lista si parcurgerea ei dar in modul asa nu von avea o valoare individuala -> seamana cu cu m2

    //todo:  aplicarea acelasi algoritm de reconstructie de numere intregi ( similar cu M1 ) in mod recursiv
    //todo: aplicatii notiunile de streamuri pentru prelucrarea inversa a cifrelor si reductia rezulltatlului final intr-und Integer .
     */
}
