package com.javarush.task.pro.task03.task0311;

import java.util.Locale;
import java.util.Scanner;

/* 
Высокая точность
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        double number1 = console.nextDouble();
        double number2 = console.nextDouble();

        if (Math.abs(number1 - number2) < 0.000001)
            System.out.println("числа равны");
        else
            System.out.println("числа не равны");
    }
}
