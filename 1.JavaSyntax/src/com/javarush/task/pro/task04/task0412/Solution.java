package com.javarush.task.pro.task04.task0412;

import java.util.Scanner;

/* 
Сумма кратных чисел
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int start = console.nextInt();
        int end = console.nextInt();
        int multiple = console.nextInt();

        int sum = 0;
        for (int i = start; i <= end ; i++) {
            if ((i % multiple) != 0) continue;
            sum = sum + i;

        }
        System.out.println(sum);
    }
}