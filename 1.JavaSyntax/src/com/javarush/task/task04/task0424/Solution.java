package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        int thirdDigit = scanner.nextInt();

        String result = equalityDetermination(firstDigit, secondDigit, thirdDigit);
        System.out.print(result);
    }

    private static String equalityDetermination(int firstDigit, int secondDigit, int thirdDigit) {
        int[] inputNumbers = new int[]{firstDigit, secondDigit, thirdDigit};
        if (inputNumbers[0] == inputNumbers[1] & inputNumbers[0] != inputNumbers[2]) {
            return "3";
        } else if (inputNumbers[0] == inputNumbers[2] & inputNumbers[0] != inputNumbers[1]) {
            return "2";
        } else if (inputNumbers[1] == inputNumbers[2] & inputNumbers[1] != inputNumbers[0]) {
            return "1";
        }
        return "";
    }
}
