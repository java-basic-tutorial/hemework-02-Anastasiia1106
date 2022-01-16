package com.softserveinc;
import java.util.Arrays;
/*
    Write a program that calculates the average annual temperature.
    Also, you need to find months with the lowest and highest temperature in a year.

    Month          |  I   | II   | III |  IV  |  V   |  VI  | VII  | VIII | IX   |  X   | XI  | XII
    ---------------|------|------|-----|------|------|------|------|------|------|------|-----|------
    Temperature    | -1.7 | -1,0 | 2,6 |  9,0 | 15,1 | 19,4 | 21,4 | 21,2 | 17,1 | 11,1 | 5,9 |  1,4

    The example below shows how your output might look:

    Average annual temperature: 10.125
    Month with the lowest temperature in a year: I
    The month with the highest temperatures in a year: VII
 */
public class Task01 {
    private static int min;
//
    public static void main(String[] args) {
//                              I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
        double[] temperature = new double[] {-1.7, -1.0, 2.6, 9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9, 1.4};
//         TODO: Write your code here
//        double sum = -1.7 + -1.0 + 2.6 + 9.0 + 15.1 + 19.4 + 21.4 + 21.2 + 17.1 + 11.1 + 5.9 + 1.4;
        double sum = Arrays.stream(temperature).sum();
        double avr = sum / temperature.length;
        System.out.println("Average annual temperature: " + avr);


    }
}