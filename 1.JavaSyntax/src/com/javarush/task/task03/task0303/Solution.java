package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(convertEurToUsd(15,0.8));
        System.out.println(convertEurToUsd(40,0.8));
        //напишите тут ваш код
    }

    public static double convertEurToUsd(int eur, double course) {
        double result = eur*course;
        return result;
        //напишите тут ваш код
    }
}
