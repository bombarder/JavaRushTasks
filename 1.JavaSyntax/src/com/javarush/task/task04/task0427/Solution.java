package com.javarush.task.task04.task0427;

/* 
Описываем числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next();
        String result = digitDescription(userInput);
        System.out.print(result);
    }

    private static String digitDescription(String userInput) {
        int diapason = Integer.parseInt(userInput);
        if (diapason < 1 | diapason > 999) {
            return "";
        } else if (diapason % 2 == 0) {
            if (userInput.length() == 3) {
                return "четное трехзначное число";
            } else if (userInput.length() == 2) {
                return "четное двузначное число";
            } else {
                return "четное однозначное число";
            }
        } else {
            if (userInput.length() == 3) {
                return "нечетное трехзначное число";
            } else if (userInput.length() == 2) {
                return "нечетное двузначное число";
            } else {
                return "нечетное однозначное число";
            }
        }
    }
}
