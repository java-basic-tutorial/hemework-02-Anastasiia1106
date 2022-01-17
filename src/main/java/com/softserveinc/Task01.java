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
//public class Task01 {
//    private static int min;

    //
//    public static void main(String[] args) {
//                              I  | II | III | IV |  V  |  VI | VII | VIII | IX  |  X  | XI |  XII
//        double[] temperature = new double[]{-1.7, -1.0, 2.6, 9.0, 15.1, 19.4, 21.4, 21.2, 17.1, 11.1, 5.9, 1.4};
//         TODO: Write your code here
//        double avr = temperature[0];
//        double min = 0;
//        double max = 0;
//        for (double i = 1; i < temperature.length; i++) {
//            avr += temperature [i];
//            if (temperature[i] < temperature [min]) {
//                min = i;
//            }
//            if (temperature[i] > temperature[max]) {
//                max = i;
//            }
//        }
//        if (temperature[i] > temperature[max]) {
//            max = i;
//        }
//        avr = temperature[i] / temperature.length;
//        System.out.println("Average annual temperature: " + avr);
//        System.out.println("Month with the lowest temperature in a year: " + min);
//        switch (min) {
//            case 0:
//                System.out.println("I");
//                break;
//            case 1:
//                System.out.println("II");
//                break;
//            case 2:
//                System.out.println("III");
//                break;
//            case 3:
//                System.out.println("IV");
//                break;
//            case 4:
//                System.out.println("V");
//                break;
//            case 5:
//                System.out.println("VI");
//                break;
//            case 6:
//                System.out.println("VII");
//                break;
//            case 7:
//                System.out.println("VIII");
//                break;
//            case 8:
//                System.out.println("IX");
//                break;
//            case 9:
//                System.out.println("X");
//                break;
//            case 10:
//                System.out.println("XI");
//                break;
//            case 11:
//                System.out.println("XII");
//                break;
//        }
//        System.out.println("The month with the highest temperatures in a year: " + max);
//        switch (max) {
//            case 0:
//                System.out.println("I");
//                break;
//            case 1:
//                System.out.println("II");
//                break;
//            case 2:
//                System.out.println("III");
//                break;
//            case 3:
//                System.out.println("IV");
//                break;
//            case 4:
//                System.out.println("V");
//                break;
//            case 5:
//                System.out.println("VI");
//                break;
//            case 6:
//                System.out.println("VII");
//                break;
//            case 7:
//                System.out.println("VIII");
//                break;
//            case 8:
//                System.out.println("IX");
//                break;
//            case 9:
//                System.out.println("X");
//                break;
//            case 10:
//                System.out.println("XI");
//                break;
//            case 11:
//                System.out.println("XII");
//                break;
//        }
//    }
//
//}