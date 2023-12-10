package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        boolean exit = false;
        int sum = 0;
        while (console.hasNextInt()) {
            int number = console.nextInt();
            if (!exit) {
                sum = number + sum;
             } else {
                exit = console.equals("ENTER");
            }


        }
        System.out.println(sum);

    }
}