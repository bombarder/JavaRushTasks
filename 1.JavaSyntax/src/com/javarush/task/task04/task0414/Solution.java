package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer i = scanner.nextInt();
        int x;

        if (((i % 4 == 0)&(i % 100 != 0))|(i % 400 == 0))
            x = 366;
        else
            x = 365;
        System.out.println("количество дней в году: " + x);
    }
}