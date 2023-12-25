package com.javarush.task.pro.task04.task0417;

import java.util.Scanner;

/* 
Скорость ветра
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int windSpeed = console.nextInt();
        double converter = windSpeed * 3.6;
        int rounding = (int)Math.round(converter);
        System.out.println(rounding);

    }
}