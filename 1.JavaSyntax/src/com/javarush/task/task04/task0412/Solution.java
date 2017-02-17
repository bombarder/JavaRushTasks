package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();
        if (input == 0){
            System.out.println(0);
        } else {
            System.out.println(input > 0 ? input * 2 : input + 1);
        }
    }
}