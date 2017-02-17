package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int firstDigit = scanner.nextInt();
        int secondDigit = scanner.nextInt();
        int thirdDigit = scanner.nextInt();

        int[] array = {firstDigit, secondDigit, thirdDigit};
        signDetermination(array);
    }

    private static void signDetermination(int[] array) {
        int plus = 0;
        int minus = 0;
        for (int anArray : array) {
            if (anArray > 0) {
                plus++;
            } else if (anArray < 0){
                minus++;
            }
        }
        System.out.println("количество положительных чисел: " + plus);
        System.out.println("количество отрицательных чисел: " + minus);
    }
}
