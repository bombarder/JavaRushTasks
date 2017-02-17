package com.javarush.task.task03.task0304;

/* 
Задача на проценты
*/

public class Solution {
    public static double addTenPercent(int i) {
        double tenPercent = i * 0.1;
        double result = i + tenPercent;
        return result;
        //напишите тут ваш код
    }

    public static void main(String[] args) {
        System.out.println(addTenPercent(9));
    }
}
