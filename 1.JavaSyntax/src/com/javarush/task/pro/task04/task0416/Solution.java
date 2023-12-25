package com.javarush.task.pro.task04.task0416;

import java.util.Scanner;

/* 
Share a Coke
*/

public class Solution {
    public static void main(String[] args) {
       Scanner console = new Scanner(System.in);

       int number1 = console.nextInt();
       int number2 = console.nextInt();
       double separation = (number1 * 1.0 / number2);
        System.out.println(separation);

    }
}