package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int result = coordinatesDetermination(first, second);
        System.out.println(result);
    }

    private static int coordinatesDetermination(int first, int second) {

        if (first > 0 & second > 0){
            return 1;
        }
        if (first < 0 & second > 0){
            return 2;
        }
        if (first < 0 & second < 0){
            return 3;
        }
        if (first > 0 & second < 0){
            return 4;
        }
        return 0;
    }
}
