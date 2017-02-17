package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(5469));
    }

    public static int sumDigitsInNumber(int number) {
        int result  = 0;
        char[] chars = ("" + number).toCharArray();
        for (char ch:chars){
            result += Integer.parseInt("" + ch);
        }
        return result;
        //напишите тут ваш код
    }
}