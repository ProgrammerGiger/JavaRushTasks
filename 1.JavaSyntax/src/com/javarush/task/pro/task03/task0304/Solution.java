package com.javarush.task.pro.task03.task0304;

import java.util.Scanner;

/* 
Измерим температуру тела
*/

public class Solution {
    private static boolean isHigh;
    private static boolean isLow;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double bodyTemperature = console.nextDouble();

        if (bodyTemperature > 37) {
            System.out.println("температура тела высокая");
        } else if (bodyTemperature < 36){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}
