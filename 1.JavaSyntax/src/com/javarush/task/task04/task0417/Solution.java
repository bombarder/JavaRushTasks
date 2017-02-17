package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        int thirdDigit = scanner.nextInt();

        String result = pairDetermination(firstDigit, secondDigit, thirdDigit);
        System.out.print(result);
    }

    private static String pairDetermination(int firstDigit, int secondDigit, int thirdDigit) {
        if (firstDigit == secondDigit & firstDigit == thirdDigit) {
            return firstDigit + " " + secondDigit + " " + thirdDigit;
        } else if (firstDigit == secondDigit & firstDigit != thirdDigit) {
            return firstDigit + " " + secondDigit;
        } else if (firstDigit == thirdDigit & firstDigit != secondDigit) {
            return firstDigit + " " + thirdDigit;
        } else if (secondDigit == thirdDigit & secondDigit != firstDigit){
            return secondDigit + " " + thirdDigit;
        }
        return "";
    }
}