package com.javarush.task.task04.task0426;

/* 
Ярлыки и числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String result = oddOrEven(input);
        System.out.println(result);
    }

    private static String oddOrEven(int input) {
        if (input == 0) {
            return "ноль";
        } else if (input > 0 & input % 2 == 0) {
            return "положительное четное число";
        } else if (input < 0 & input % 2 == 0) {
            return "отрицательное четное число";
        } else if (input > 0 & input % 2 != 0) {
            return "положительное нечетное число";
        } else return "отрицательное нечетное число";
    }
}
