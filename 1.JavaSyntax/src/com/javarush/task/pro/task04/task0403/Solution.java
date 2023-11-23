package com.javarush.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int sum = 0;
        while (sc.hasNextInt()) {
            int number = sc.nextInt();
            if (!exit) {
                sum = number + sum;
             } else {
                exit = sc.equals("ENTER");
            }


        }
        System.out.println(sum);

    }
}