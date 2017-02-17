package com.javarush.task.task04.task0428;

/* 
Положительное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        int thirdDigit = scanner.nextInt();

        int result = odDetermination(firstDigit, secondDigit, thirdDigit);
        System.out.println(result);
    }

    private static int odDetermination(int firstDigit, int secondDigit, int thirdDigit) {
        int count = 0;
        int[] array = {firstDigit, secondDigit, thirdDigit};
        for (int anArray : array) {
            if (anArray > 0) {
                count++;
            }
        }
        return count;
    }
}
