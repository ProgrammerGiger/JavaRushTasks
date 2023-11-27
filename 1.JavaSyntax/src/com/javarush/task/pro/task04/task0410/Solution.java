package com.javarush.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int min = scan.nextInt();
        int secondMin = scan.nextInt();
        if (min > secondMin) {
            int tmp = min;
            min = secondMin;
            secondMin = tmp;
        }
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            if (num == secondMin && num > min) {
                secondMin = num;
            } else if (num < min) {
                secondMin = min;
                min = num;
            } else if (num < secondMin && num > min) {
                secondMin = num;

            }


        }
        System.out.println(secondMin);
    }
}