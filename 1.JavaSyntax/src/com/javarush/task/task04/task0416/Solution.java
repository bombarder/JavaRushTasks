package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.util.Locale;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        Double minutes = scanner.nextDouble();
        String result = colorDetermination(minutes);
        System.out.println(result);
    }

    private static String colorDetermination(double minutes) {
        int cycle = (int)minutes / 5;
        int ourCycle = (int)minutes - cycle * 5;
        if (ourCycle > 0 & ourCycle < 3) {
            return "зелёный";
        } else if (ourCycle == 3) {
            return "желтый";
        } else return "красный";
    }
}