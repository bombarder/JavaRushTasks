package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int firstSide = scanner.nextInt();
        int secondSide = scanner.nextInt();
        int thirdSide = scanner.nextInt();

        String result = triangleDetermination(firstSide, secondSide, thirdSide);
        System.out.println(result);
        //напишите тут ваш код
    }

    private static String triangleDetermination(int firstSide, int secondSide, int thirdSide) {
        if (firstSide + secondSide > thirdSide & firstSide + thirdSide > secondSide & secondSide + thirdSide > firstSide) {
            return "Треугольник существует.";
        } else return "Треугольник не существует.";
    }
}