package com.javarush.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Минимум из введенных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = scan.nextInt();
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            if (num < min) {
                min = num;
            }

        }
        System.out.println(min);

    }
}
